package cn.qs.service.tourism;

import java.util.List;
import java.util.Map;

import cn.qs.bean.tourism.Ticket;

public interface TicketService {

	/**
	 * 获取所有的门票信息
	 */
	public List<Ticket> findAllTicket();
	
	/**
	 * 添加门票信息
	 * @param ticket
	 */
	public void addTicket(Ticket ticket);
	
	/**
	 * 修改门票信息
	 * @param ticket
	 */
	public void updateTicket(Ticket ticket);
	
	/**
	 * 删除门票信息
	 * @param id
	 */
    public void deleteTicket(int id);
    
    /**
     * 分页查询门票信息
     * @param condition
     * @return
     */
    public List<Ticket> getTickets(Map condition);
    
    /**
     * 根据门票名称查询门票信息
     */
    public Ticket getTicket(int id);
	
}
