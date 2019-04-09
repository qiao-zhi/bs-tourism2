package cn.qs.bean.user;

import java.util.Date;

public class Blog {
    private Integer id;

    private String blogtitle;

    private String blogtype;

    private String blogstatus;

    private Integer userid;

    private String blogblank;

    private Date createtime;

    private Date updatetime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle == null ? null : blogtitle.trim();
    }

    public String getBlogtype() {
        return blogtype;
    }

    public void setBlogtype(String blogtype) {
        this.blogtype = blogtype == null ? null : blogtype.trim();
    }

    public String getBlogstatus() {
        return blogstatus;
    }

    public void setBlogstatus(String blogstatus) {
        this.blogstatus = blogstatus == null ? null : blogstatus.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBlogblank() {
        return blogblank;
    }

    public void setBlogblank(String blogblank) {
        this.blogblank = blogblank == null ? null : blogblank.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}