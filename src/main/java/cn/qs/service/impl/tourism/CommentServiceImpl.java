package cn.qs.service.impl.tourism;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.tourism.Comment;
import cn.qs.bean.tourism.CommentExample;
import cn.qs.bean.tourism.CommentExample.Criteria;
import cn.qs.mapper.tourism.CommentMapper;
import cn.qs.service.tourism.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;

	@Override
	public void addComment(Comment comment) {
		commentMapper.insert(comment);
	}

	@Override
	public List<Comment> getCommentsByViewId(int viewId) {
		CommentExample example = new CommentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andViewidEqualTo(viewId);
		return commentMapper.selectByExampleWithBLOBs(example);
	}
}