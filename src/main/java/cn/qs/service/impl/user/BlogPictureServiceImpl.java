package cn.qs.service.impl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.user.Blog;
import cn.qs.mapper.user.BlogMapper;
import cn.qs.service.user.BlogService;

@Service
public class BlogPictureServiceImpl implements BlogService {

	@Autowired
	private BlogMapper blogMapper;

	@Override
	public int insert(Blog blog) {
		return blogMapper.insert(blog);
	}

}
