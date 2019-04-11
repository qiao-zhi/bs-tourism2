package cn.qs.service.impl.common;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.bean.common.Message;
import cn.qs.bean.common.MessageExample;
import cn.qs.mapper.common.MessageMapper;
import cn.qs.service.common.MessageService;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;

	@Override
	public int insert(Message message) {
		return messageMapper.insert(message);
	}

	@Override
	public List<Message> getMessages(Map condition) {
		MessageExample messageExample = new MessageExample();
		/*
		 * if (StringUtils.isNotBlank(MapUtils.getString(condition,
		 * "username"))) { Criteria createCriteria =
		 * messageExample.createCriteria(); }
		 */

		List<Message> list = messageMapper.selectByExample(messageExample);
		return list;
	}

	@Override
	public Message getMessageDetail(Integer blogId) {
		return messageMapper.selectByPrimaryKey(blogId);
	}

	@Override
	public void deleteMessage(int id) {
		messageMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateMessage(Message message) {
		messageMapper.updateByPrimaryKeySelective(message);
	}

}
