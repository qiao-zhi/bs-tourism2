package cn.qs.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.qs.bean.user.Blogpicture;
import cn.qs.bean.user.BlogpictureExample;

@Mapper
public interface BlogpictureMapper {
	int countByExample(BlogpictureExample example);

	int deleteByExample(BlogpictureExample example);

	int deleteByPrimaryKey(String id);

	int insert(Blogpicture record);

	int insertSelective(Blogpicture record);

	List<Blogpicture> selectByExample(BlogpictureExample example);

	Blogpicture selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Blogpicture record, @Param("example") BlogpictureExample example);

	int updateByExample(@Param("record") Blogpicture record, @Param("example") BlogpictureExample example);

	int updateByPrimaryKeySelective(Blogpicture record);

	int updateByPrimaryKey(Blogpicture record);
}