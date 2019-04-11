package cn.qs.service.user;

import java.util.List;
import java.util.Map;

import cn.qs.bean.user.Blog;
import cn.qs.bean.user.User;

public interface BlogService {
	int insert(Blog blog);

	List<Blog> getBlogs(Map condition);

	Blog getBlogdetail(Integer blogId);

	void deleteBlog(int id);

	void updateBlog(Blog blog);
}
