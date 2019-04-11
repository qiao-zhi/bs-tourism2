package cn.qs.controller.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.common.Message;
import cn.qs.bean.user.User;
import cn.qs.service.common.MessageService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.ValidateCheck;

@Controller
@RequestMapping("message")
public class MessageController {

	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

	@Autowired
	private MessageService messageService;

	@RequestMapping("addMessage")
	public String addMessage() {
		return "message/addMessage";
	}

	@RequestMapping("doAddMessage")
	@ResponseBody
	public JSONResultUtil doAddMessage(Message message, HttpServletRequest request) {
		message.setCreatetime(new Date());

		messageService.insert(message);
		return JSONResultUtil.ok();
	}

	@RequestMapping("message_list")
	public String message_list() {
		return "message/message-list";
	}

	@RequestMapping("getMessages")
	@ResponseBody
	public PageInfo<Message> getMessages(@RequestParam Map condition, HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		condition.put("username", username);

		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<Message> messages = new ArrayList<Message>();
		try {
			messages = messageService.getMessages(condition);
		} catch (Exception e) {
			logger.error("getmessages error！", e);
		}
		PageInfo<Message> pageInfo = new PageInfo<Message>(messages);

		return pageInfo;
	}

	@RequestMapping("/getMessagedetail/{messageId}")
	public String getMessagedetail(ModelMap map, @PathVariable() Integer messageId, HttpServletRequest request) {
		Message message = messageService.getMessageDetail(messageId);
		// 获取当前用户
		map.put("message", message);

		return "message/messageDetail";
	}

	@RequestMapping("deleteMessage")
	@ResponseBody
	public JSONResultUtil deleteMessage(int id) {
		messageService.deleteMessage(id);
		return JSONResultUtil.ok();
	}

	@RequestMapping("updateMessage")
	public String updateMessage(Integer id, ModelMap map, HttpServletRequest request) {
		Message message = messageService.getMessageDetail(id);
		map.addAttribute("message", message);
		return "message/updateMessage";
	}

	@RequestMapping("doUpdateMessage")
	@ResponseBody
	public JSONResultUtil doUpdateMessage(Message message) {
		logger.info("user -> {}", message);
		messageService.updateMessage(message);
		return JSONResultUtil.ok();
	}
}
