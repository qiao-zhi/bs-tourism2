package cn.qs.controller.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.user.Blog;
import cn.qs.bean.user.User;
import cn.qs.service.user.BlogService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.ValidateCheck;

@Controller
@RequestMapping("blog")
public class BlogController {

	private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

	@Autowired
	private BlogService blogService;

	@RequestMapping("addBlog")
	public String addBlog() {
		return "addBlog";
	}

	@RequestMapping("doAddBlog")
	@ResponseBody
	public JSONResultUtil doAddBlog(Blog blog, HttpServletRequest request) {
		blog.setCreatetime(new Date());
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		blog.setBlogblank(username);

		blogService.insert(blog);
		return JSONResultUtil.ok();
	}

	@RequestMapping("blog_list")
	public String blog_list() {
		return "blog-list";
	}

	@RequestMapping("getBlogs")
	@ResponseBody
	public PageInfo<Blog> getBlogs(@RequestParam Map condition, HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		condition.put("username", username);

		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<Blog> blogs = new ArrayList<Blog>();
		try {
			blogs = blogService.getBlogs(condition);
		} catch (Exception e) {
			logger.error("getBlogs error！", e);
		}
		PageInfo<Blog> pageInfo = new PageInfo<Blog>(blogs);

		return pageInfo;
	}

	@RequestMapping("/getBlogdetail/{blogId}")
	public String getBlogdetail(ModelMap map, @PathVariable() Integer blogId, HttpServletRequest request) {
		Blog blog = blogService.getBlogdetail(blogId);

		// 获取当前用户
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		String blogUsername = StringUtils.defaultIfBlank(blog.getBlogblank(), "admin");

		if (blogUsername.equals(username)) {
			map.put("blog", blog);
		} else {
			map.put("blog", new Blog());
		}

		return "blogDetail";
	}

	@RequestMapping("deleteBlog")
	@ResponseBody
	public JSONResultUtil deleteBlog(int id) {
		blogService.deleteBlog(id);
		return JSONResultUtil.ok();
	}

	@RequestMapping("updateBlog")
	public String updateBlog(Integer id, ModelMap map, HttpServletRequest request) {
		Blog blog = blogService.getBlogdetail(id);
		map.addAttribute("blog", blog);
		return "updateBlog";
	}

	@RequestMapping("doUpdateBlog")
	@ResponseBody
	public JSONResultUtil doUpdateBlog(Blog blog) {
		logger.info("user -> {}", blog);
		blogService.updateBlog(blog);
		return JSONResultUtil.ok();
	}
}