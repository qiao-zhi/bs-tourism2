package cn.qs.service.impl.tourism;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.tourism.Picture;
import cn.qs.bean.tourism.PictureExample;
import cn.qs.bean.tourism.PictureExample.Criteria;
import cn.qs.mapper.tourism.PictureMapper;
import cn.qs.service.tourism.PictureService;

@Service
public class PictureServiceImpl implements PictureService {
	@Autowired
	private PictureMapper pictureMapper;

	@Override
	public void addPicture(Picture picture) {
		pictureMapper.insert(picture);
	}

	@Override
	public List<Picture> getPicturesByViewId(int viewId) {
		PictureExample example = new PictureExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andViewidEqualTo(viewId);
		createCriteria.andTypeEqualTo("1");
		return pictureMapper.selectByExample(example);
	}

}
