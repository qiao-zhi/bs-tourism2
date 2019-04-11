package cn.qs.service.common;

import java.util.List;
import java.util.Map;

import cn.qs.bean.common.Message;

public interface MessageService {
	int insert(Message message);

	List<Message> getMessages(Map condition);

	Message getMessageDetail(Integer blogId);

	void deleteMessage(int id);

	void updateMessage(Message message);
}
