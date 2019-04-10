package cn.qs.service.impl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.user.Blogpicture;
import cn.qs.mapper.user.BlogpictureMapper;
import cn.qs.service.user.BlogPictureService;

@Service
public class BlogServiceImpl implements BlogPictureService {

	@Autowired
	private BlogpictureMapper blogpictureMapper;

	@Override
	public int insert(Blogpicture blogpicture) {
		int insert = blogpictureMapper.insert(blogpicture);
		return insert;
	}

	@Override
	public String getPicturePathByPictureId(String pictureId) {
		return blogpictureMapper.selectByPrimaryKey(pictureId).getPath();
	}

}
