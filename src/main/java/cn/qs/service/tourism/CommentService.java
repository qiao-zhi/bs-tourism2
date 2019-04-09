package cn.qs.service.tourism;

import java.util.List;

import cn.qs.bean.tourism.Comment;

public interface CommentService {

	void addComment(Comment comment);

	List<Comment> getCommentsByViewId(int viewId);
}
