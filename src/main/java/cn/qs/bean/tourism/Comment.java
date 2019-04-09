package cn.qs.bean.tourism;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer viewid;

    private Date createtime;

    private Date updatetime;

    private String commentblank;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getViewid() {
        return viewid;
    }

    public void setViewid(Integer viewid) {
        this.viewid = viewid;
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

    public String getCommentblank() {
        return commentblank;
    }

    public void setCommentblank(String commentblank) {
        this.commentblank = commentblank == null ? null : commentblank.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}