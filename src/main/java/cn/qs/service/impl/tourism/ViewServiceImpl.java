package cn.qs.service.impl.tourism;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.tourism.View;
import cn.qs.bean.tourism.ViewExample;
import cn.qs.bean.tourism.ViewExample.Criteria;
import cn.qs.mapper.tourism.ViewMapper;
import cn.qs.mapper.tourism.custom.ViewCustomMapper;
import cn.qs.service.tourism.ViewService;

@Service
public class ViewServiceImpl implements ViewService {

	@Autowired
	private ViewMapper viewMapper;
	@Autowired
	private ViewCustomMapper viewCustomMapper;

	@Override
	public void addView(View view) {
		viewMapper.insert(view);
	}

	@Override
	public List<Map> getViews(Map condition) {
		List<Map> list = viewCustomMapper.getViewInfosByCondition(condition);
		return list;
	}

	@Override
	public void deleteView(int id) {
		viewMapper.deleteByPrimaryKey(id);
	}

	@Override
	public View getView(int id) {
		return viewMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateView(View view) {
		viewMapper.updateByPrimaryKeySelective(view);
	}


	@Override
	public View getViewByname(String viewname) {
		ViewExample viewExample = new ViewExample();
		Criteria createCriteria = viewExample.createCriteria();
		createCriteria.andViewnameEqualTo(viewname);

		List<View> selectByExample = viewMapper.selectByExample(viewExample);
		if (CollectionUtils.isNotEmpty(selectByExample)) {
			return selectByExample.get(0);
		}
		return null;
	}

	@Override
	public View getViewById(int id) {
		View view = viewMapper.selectByPrimaryKey(id);
		return view;
	}

}
