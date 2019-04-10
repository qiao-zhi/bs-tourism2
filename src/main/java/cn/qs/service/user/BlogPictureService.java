package cn.qs.service.user;

import cn.qs.bean.user.Blogpicture;

public interface BlogPictureService {
	int insert(Blogpicture blogpicture);

	String getPicturePathByPictureId(String pictureId);
}
