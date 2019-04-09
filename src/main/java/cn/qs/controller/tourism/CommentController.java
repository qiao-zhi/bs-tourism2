package cn.qs.controller.tourism;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.bean.tourism.Comment;
import cn.qs.bean.user.User;
import cn.qs.service.tourism.CommentService;
import cn.qs.utils.JSONResultUtil;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("comment")
public class CommentController {

	private static final Logger logger = LoggerFactory.getLogger(CommentController.class);

	@Autowired
	private CommentService commentService;

	@RequestMapping("/addComment")
	@ResponseBody
	public JSONResultUtil addComment(Integer viewId, String comment, HttpServletRequest request) {
		Comment comment2 = new Comment();
		try {
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			comment = "[" + user.getFullname() + "]:  " + comment;

			comment2.setContent(comment);
			comment2.setCreatetime(new Date());
			comment2.setViewid(viewId);

			commentService.addComment(comment2);
		} catch (Exception e) {
			logger.error("addComment error", e);
			return JSONResultUtil.error("添加评论出错");
		}

		return JSONResultUtil.ok();
	}

	/*
	 * @RequestMapping("deleteView")
	 * 
	 * @ResponseBody public JSONResultUtil deleteView(int id) {
	 * viewService.deleteView(id); return JSONResultUtil.ok(); }
	 */

}