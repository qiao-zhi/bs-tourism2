package cn.qs.controller.user;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.bean.user.Blog;
import cn.qs.bean.user.User;
import cn.qs.service.user.BlogService;
import cn.qs.utils.JSONResultUtil;

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

}