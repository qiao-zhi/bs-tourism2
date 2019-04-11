package cn.qs.service.impl.user;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.user.Blog;
import cn.qs.bean.user.BlogExample;
import cn.qs.bean.user.BlogExample.Criteria;
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

	@Override
	public List<Blog> getBlogs(Map condition) {
		BlogExample blogExample = new BlogExample();
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "username"))) {
			Criteria createCriteria = blogExample.createCriteria();
			createCriteria.andBlogblankLike("%" + MapUtils.getString(condition, "username") + "%");
		}
		List<Blog> list = blogMapper.selectByExample(blogExample);
		return list;
	}

	@Override
	public Blog getBlogdetail(Integer blogId) {
		return blogMapper.selectByPrimaryKey(blogId);
	}

	@Override
	public void deleteBlog(int id) {
		blogMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateBlog(Blog blog) {
		blogMapper.updateByPrimaryKeySelective(blog);
	}

}
