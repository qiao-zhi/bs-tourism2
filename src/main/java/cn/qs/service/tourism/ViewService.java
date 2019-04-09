package cn.qs.service.tourism;

import java.util.List;
import java.util.Map;

import cn.qs.bean.tourism.View;

public interface ViewService {

	void addView(View view);

	List<Map> getViews(Map condition);

	void deleteView(int id);

	View getView(int id);

	void updateView(View view);

	public View getViewByname(String viewname);
	
	public View getViewById(int id);
}
