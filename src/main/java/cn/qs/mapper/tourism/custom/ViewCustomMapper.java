package cn.qs.mapper.tourism.custom;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViewCustomMapper {

	List<Map> getViewInfosByCondition(Map condition);

}
