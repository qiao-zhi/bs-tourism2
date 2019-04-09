package cn.qs.controller.tourism;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.qs.bean.tourism.Picture;
import cn.qs.bean.tourism.View;
import cn.qs.service.tourism.PictureService;
import cn.qs.service.tourism.ViewService;
import cn.qs.utils.FileHandleUtil;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.UUIDUtil;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("picture")
public class PictureController {

	private static final Logger logger = LoggerFactory.getLogger(PictureController.class);

	@Autowired
	private ViewService viewService;

	@Autowired
	private PictureService pictureService;

	@RequestMapping("/showPicture")
	public String showPicture(Integer viewId, ModelMap map) {
		View view = viewService.getView(viewId);
		map.put("view", view);

		return "showPicture";
	}

	@RequestMapping("/getPicture")
	public void getPicture(HttpServletRequest request, HttpServletResponse response, String path) {
		FileInputStream in = null;
		ServletOutputStream outputStream = null;
		try {
			File fileByName = FileHandleUtil.getFileByName(path);
			in = new FileInputStream(fileByName);
			outputStream = response.getOutputStream();
			IOUtils.copyLarge(in, outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(in);
			IOUtils.closeQuietly(outputStream);
		}
	}

	@RequestMapping("/uploadPicture")
	@ResponseBody
	public JSONResultUtil uploadPicture(MultipartFile file, Integer viewId) {
		if (file == null) {
			return JSONResultUtil.error("文件没接到");
		}
		logger.debug("file -> {},viewId ->{}", file.getOriginalFilename(), viewId);

		String fileOriName = file.getOriginalFilename();// 获取原名称
		String fileNowName = UUIDUtil.getUUID2() + "." + FilenameUtils.getExtension(fileOriName);// 生成唯一的名字
		try {
			FileHandleUtil.uploadSpringMVCFile(file, fileNowName);

			Picture picture = new Picture();
			picture.setCreatetime(new Date());
			picture.setName(fileOriName);
			picture.setPath(fileNowName);
			picture.setViewid(viewId);
			pictureService.addPicture(picture);
		} catch (Exception e) {
			logger.error("uploadPicture error", e);
			return JSONResultUtil.error("添加景点图片出错");
		}

		return JSONResultUtil.ok();
	}

}
