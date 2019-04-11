package cn.qs.service.impl.tourism;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.bean.tourism.Food;
import cn.qs.bean.tourism.FoodExample;
import cn.qs.bean.tourism.FoodExample.Criteria;
import cn.qs.bean.tourism.View;
import cn.qs.bean.tourism.ViewExample;
import cn.qs.mapper.tourism.FoodMapper;
import cn.qs.mapper.tourism.ViewMapper;
import cn.qs.service.tourism.FoodService;
import cn.qs.service.tourism.ViewService;

@Service
@Transactional
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodMapper foodMapper;

	@Autowired
	private ViewMapper viewMapper;

	@Autowired
	private ViewService viewService;

	@Override
	public List<Food> findAllFood() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFood(Food food) {
		foodMapper.insert(food);
	}

	@Override
	public void updateFood(Food food) {
		foodMapper.updateByPrimaryKeySelective(food);
	}

	@Override
	public void deleteFood(int id) {
		foodMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Food> getFoods(Map condition) {
		String viewname = MapUtils.getString(condition, "viewname");
		if (StringUtils.isBlank(viewname)) {
			FoodExample foodExample = new FoodExample();
			if (StringUtils.isNotBlank(MapUtils.getString(condition, "foodname"))) {
				Criteria createCriteria = foodExample.createCriteria();
				createCriteria.andFoodnameLike("%" + MapUtils.getString(condition, "foodname") + "%");
			}
			List<Food> list = foodMapper.selectByExample(foodExample);
			return list;
		} else {
			View view = viewService.getViewByname(viewname);
			int viewid = view.getId();
			FoodExample foodExample = new FoodExample();
			Criteria createCriteria = foodExample.createCriteria();
			createCriteria.andViewidEqualTo(viewid);
			List<Food> list = foodMapper.selectByExample(foodExample);
			return list;
		}
	}

	@Override
	public Food getFood(int id) {
		return foodMapper.selectByPrimaryKey(id);
	}

}
