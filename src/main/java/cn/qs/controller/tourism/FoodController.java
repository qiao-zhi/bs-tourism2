package cn.qs.controller.tourism;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.tourism.Food;
import cn.qs.bean.tourism.Ticket;
import cn.qs.bean.tourism.View;
import cn.qs.service.tourism.FoodService;
import cn.qs.service.tourism.ViewService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.ValidateCheck;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("food")
public class FoodController {

	private static final Logger log = LoggerFactory.getLogger(FoodController.class);

	@Autowired
	private FoodService foodService;

	@Autowired
	private ViewService viewService;

	/**
	 * 分页查询food
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("getFoods")
	@ResponseBody
	public PageInfo<Food> getFoods(@RequestParam Map condition) {
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
		List<Food> foods = new ArrayList<Food>();
		try {
			foods = foodService.getFoods(condition);
		} catch (Exception e) {
			log.error("getFoods error！", e);
		}
		PageInfo<Food> pageInfo = new PageInfo<Food>(foods);

		return pageInfo;
	}

	/**
	 * 添加food
	 * 
	 */
	@RequestMapping("addFood")
	@ResponseBody
	public JSONResultUtil addFood(Food food) {
		food.setCreatetime(new Date());
		String viewname = food.getViewname();

		View view = viewService.getViewByname(viewname);
		if (view == null) {
			return JSONResultUtil.error("该景点名称不存在");
		}
		food.setViewid(view.getId());
		log.info("ticket -> {}", food);
		foodService.addFood(food);
		return JSONResultUtil.ok();
	}

	/**
	 * 删除food
	 * 
	 */
	@RequestMapping("deleteFood")
	@ResponseBody
	public JSONResultUtil deleteFood(int id) {
		foodService.deleteFood(id);
		return JSONResultUtil.ok();
	}

	/**
	 * 跳转到修改food页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("updateFood")
	public String updateTicket(int id, ModelMap map) {
		Food food = foodService.getFood(id);
		View view = viewService.getViewById(food.getViewid());
		food.setViewname(view.getViewname());
		map.addAttribute("food", food);
		return "updateFood";
	}

	/**
	 * 修改ticket
	 */
	@RequestMapping("doUpdateFood")
	@ResponseBody
	public JSONResultUtil doUpdateFood(Food food) {
		log.info("food -> {}", food);
		food.setUpdatetime(new Date());
		String viewname = food.getViewname();

		View view = viewService.getViewByname(viewname);
		if (view == null) {
			return JSONResultUtil.error("该景点名称不存在");
		}
		food.setViewid(view.getId());
		foodService.updateFood(food);
		return JSONResultUtil.ok();
	}

}
