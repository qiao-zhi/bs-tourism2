package cn.qs.service.impl.tourism;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.bean.tourism.Ticket;
import cn.qs.bean.tourism.TicketExample;
import cn.qs.bean.tourism.TicketExample.Criteria;
import cn.qs.bean.user.User;
import cn.qs.mapper.tourism.TicketMapper;
import cn.qs.service.tourism.TicketService;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketMapper ticketMapper;

	@Override
	public List<Ticket> findAllTicket() {
		TicketExample ticketExample = new TicketExample();
		List<Ticket> list = ticketMapper.selectByExample(ticketExample);
		return list;
	}

	@Override
	public void addTicket(Ticket ticket) {
		ticketMapper.insert(ticket);
	}

	@Override
	public void updateTicket(Ticket ticket) {
		ticketMapper.updateByPrimaryKeySelective(ticket);
	}

	@Override
	public void deleteTicket(int id) {
		ticketMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Ticket> getTickets(Map condition) {
		TicketExample ticketExample = new TicketExample();
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "ticketname"))) {
			Criteria createCriteria = ticketExample.createCriteria();
			createCriteria.andTicketnameLike("%" + MapUtils.getString(condition, "ticketname") + "%");
		}
		List<Ticket> list = ticketMapper.selectByExample(ticketExample);
		return list;
	}

	@Override
	public Ticket getTicket(int id) {
		return ticketMapper.selectByPrimaryKey(id);
	}

}
