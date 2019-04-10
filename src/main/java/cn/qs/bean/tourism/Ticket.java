package cn.qs.bean.tourism;

import java.util.Date;

public class Ticket {
    private Integer id;

    private String ticketname;

    private Date starttime;

    private Date endtime;

    private Integer ticketnum;

    private Integer price;

    private Date createtime;

    private Date updatetime;

    private Integer viewid;

    private String ticketblank;
    
    private String strStarttime;
    
    private String strEndtime; 
    
    private String viewname;

    public String getViewname() {
		return viewname;
	}

	public void setViewname(String viewname) {
		this.viewname = viewname;
	}

	public String getStrStarttime() {
		return strStarttime;
	}

	public void setStrStarttime(String strStarttime) {
		this.strStarttime = strStarttime;
	}

	public String getStrEndtime() {
		return strEndtime;
	}

	public void setStrEndtime(String strEndtime) {
		this.strEndtime = strEndtime;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicketname() {
        return ticketname;
    }

    public void setTicketname(String ticketname) {
        this.ticketname = ticketname == null ? null : ticketname.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(Integer ticketnum) {
        this.ticketnum = ticketnum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getViewid() {
        return viewid;
    }

    public void setViewid(Integer viewid) {
        this.viewid = viewid;
    }

    public String getTicketblank() {
        return ticketblank;
    }

    public void setTicketblank(String ticketblank) {
        this.ticketblank = ticketblank == null ? null : ticketblank.trim();
    }
}