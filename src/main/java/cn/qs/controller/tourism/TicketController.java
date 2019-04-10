package cn.qs.controller.tourism;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.tourism.Ticket;
import cn.qs.bean.tourism.View;
import cn.qs.service.tourism.TicketService;
import cn.qs.service.tourism.ViewService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.ValidateCheck;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("ticket")
public class TicketController {
private static final Logger log = LoggerFactory.getLogger(TicketController.class);
	
	@Autowired
	private TicketService ticketService;
	
	@Autowired
	private ViewService viewService;
	
	
	/**
	 * 分页查询ticket
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("getTickets")
	@ResponseBody
	public PageInfo<Ticket> getTickets(@RequestParam Map condition) {
		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = Integer.parseInt(MapUtils.getString(condition, "pageNum"));
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = Integer.parseInt(MapUtils.getString(condition, "pageSize"));
		}
		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<Ticket> tickets = new ArrayList<Ticket>();
		try {
			tickets = ticketService.getTickets(condition);
		} catch (Exception e) {
			log.error("getTickets error！", e);
		}
		PageInfo<Ticket> pageInfo = new PageInfo<Ticket>(tickets);
		return pageInfo;
	}
	
	/**
	 * 添加ticket
	 * 
	 */
	@RequestMapping("addTicket")
	@ResponseBody
	public JSONResultUtil addTicket(Ticket ticket) {
		ticket.setCreatetime(new Date());
		String stime = ticket.getStrStarttime();
		String etime = ticket.getStrEndtime();
		String viewname = ticket.getViewname();
		
		View view = viewService.getViewByname(viewname);
		if(view == null){
			return JSONResultUtil.error("该景点名称不存在");
		}
		if(StringUtils.isNotBlank(stime) && StringUtils.isNotBlank(etime)){
			 SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //加上时间
		        //必须捕获异常
		        try {
		            Date sdate=sDateFormat.parse(stime);
		            Date edate=sDateFormat.parse(etime);
		            ticket.setStarttime(sdate);
		            ticket.setEndtime(edate);
		            ticket.setViewid(view.getId());
		            if(sdate.compareTo(edate) > 0){
		            	return JSONResultUtil.error("失效日期必须大于生效日期");
		            }
		            
		        } catch(Exception px) {
		        	log.debug("日期转换异常:{}",px);
		        	return JSONResultUtil.error("日期转换异常");
		        }
		}else{
			return JSONResultUtil.error("日期不允许为空");
		}
		log.info("ticket -> {}", ticket);
		ticketService.addTicket(ticket);
		return JSONResultUtil.ok();
	}
	
	/**
	 * 删除ticket
	 * 
	 */
	@RequestMapping("deleteTicket")
	@ResponseBody
	public JSONResultUtil deleteTicket(int id) {
		ticketService.deleteTicket(id);
		return JSONResultUtil.ok();
	}

	/**
	 * 跳转到修改ticket页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("updateTicket")
	public String updateTicket(int id, ModelMap map) {
		Ticket ticket = ticketService.getTicket(id);
		View view = viewService.getViewById(ticket.getViewid());
		ticket.setViewname(view.getViewname());
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String stime = sDateFormat.format(ticket.getStarttime());
		String etime = sDateFormat.format(ticket.getEndtime());
		ticket.setStrStarttime(stime);
		ticket.setStrEndtime(etime);
		map.addAttribute("ticket", ticket);
		return "updateTicket";
	}
	
	/**
	 * 修改ticket
	 */
	@RequestMapping("doUpdateTicket")
	@ResponseBody
	public JSONResultUtil doUpdateTicket(Ticket ticket) {
		log.info("ticket -> {}", ticket);
		ticket.setUpdatetime(new Date());
		String stime = ticket.getStrStarttime();
		String etime = ticket.getStrEndtime();
		String viewname = ticket.getViewname();
		
		View view = viewService.getViewByname(viewname);
		if(view == null){
			return JSONResultUtil.error("该景点名称不存在");
		}
		if(StringUtils.isNotBlank(stime) && StringUtils.isNotBlank(etime)){
			 SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //加上时间
		        //必须捕获异常
		        try {
		            Date sdate=sDateFormat.parse(stime);
		            Date edate=sDateFormat.parse(etime);
		            ticket.setStarttime(sdate);
		            ticket.setEndtime(edate);
		            ticket.setViewid(view.getId());
		            if(sdate.compareTo(edate) > 0){
		            	return JSONResultUtil.error("失效日期必须大于生效日期");
		            }
		            
		        } catch(Exception px) {
		        	log.debug("日期转换异常:{}",px);
		        	return JSONResultUtil.error("日期转换异常");
		        }
		}else{
			return JSONResultUtil.error("日期不允许为空");
		}
		ticketService.updateTicket(ticket);
		return JSONResultUtil.ok();
	}
	
}
