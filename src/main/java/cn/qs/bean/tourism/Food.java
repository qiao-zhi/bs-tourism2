package cn.qs.bean.tourism;

import java.util.Date;

public class Food {
    private Integer id;

    private String foodname;

    private String price;

    private Integer viewid;

    private String foodblank;

    private Date createtime;

    private Date updatetime;
    
    private String viewname;

    public String getViewname() {
		return viewname;
	}

	public void setViewname(String viewname) {
		this.viewname = viewname;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getViewid() {
        return viewid;
    }

    public void setViewid(Integer viewid) {
        this.viewid = viewid;
    }

    public String getFoodblank() {
        return foodblank;
    }

    public void setFoodblank(String foodblank) {
        this.foodblank = foodblank == null ? null : foodblank.trim();
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
}