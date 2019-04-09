package cn.qs.mapper.tourism;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.qs.bean.tourism.View;
import cn.qs.bean.tourism.ViewExample;
@Mapper
public interface ViewMapper {
    int countByExample(ViewExample example);

    int deleteByExample(ViewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(View record);

    int insertSelective(View record);

    List<View> selectByExampleWithBLOBs(ViewExample example);

    List<View> selectByExample(ViewExample example);

    View selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") View record, @Param("example") ViewExample example);

    int updateByExampleWithBLOBs(@Param("record") View record, @Param("example") ViewExample example);

    int updateByExample(@Param("record") View record, @Param("example") ViewExample example);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKeyWithBLOBs(View record);

    int updateByPrimaryKey(View record);
}