package cn.qs.service.tourism;

import java.util.List;
import java.util.Map;

import cn.qs.bean.tourism.Food;
import cn.qs.bean.tourism.View;

public interface FoodService {
	
	public List<Food> findAllFood();
	
	public void addFood(Food food);
	
	public void updateFood(Food food);
	
    public void deleteFood(int id);
    
    public List<Food> getFoods(Map condition);
    
    public Food getFood(int id);
    
}
