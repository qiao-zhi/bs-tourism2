package cn.qs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.service.tourism.ViewService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.ValidateCheck;

/**
 * 整合layui+thymeleaf
 * 
 * @author Administrator
 *
 */
@Controller
public class Index {

	@Autowired
	private ViewService viewService;

	@RequestMapping("/index")
	public String index(ModelMap map) {
		List<Map> views = viewService.getViews(null);
		map.addAttribute("views", views);

		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome(ModelMap map) {
		return "welcome";
	}

	@RequestMapping("/preIndex")
	public String preIndex(ModelMap map) {
		return "preIndex";
	}

	@RequestMapping("/user-list")
	public String member_list() {
		return "user-list";
	}

	@RequestMapping("/user-add")
	public String member_add() {
		return "user-add";
	}
	
	@RequestMapping("/ticket-list")
	public String ticket_list() {
		return "ticket-list";
	}
	
	@RequestMapping("/ticket-add")
	public String ticket_add() {
		return "ticket-add";
	}
	
	@RequestMapping("/food-list")
	public String food_list() {
		return "food-list";
	}
}
