package cn.qs.service.tourism;

import java.util.List;

import cn.qs.bean.tourism.Picture;

public interface PictureService {

	void addPicture(Picture picture);

	List<Picture> getPicturesByViewId(int viewId);

}
