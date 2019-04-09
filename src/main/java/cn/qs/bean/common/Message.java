package cn.qs.bean.common;

import java.util.Date;

public class Message {
    private Integer id;

    private String name;

    private Date createtime;

    private Date updatetime;

    private String messageblank;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getMessageblank() {
        return messageblank;
    }

    public void setMessageblank(String messageblank) {
        this.messageblank = messageblank == null ? null : messageblank.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}