package cn.qs.bean.user;

import java.util.Date;

public class Blogpicture {
    private String id;

    private String path;

    private String originname;

    private String blogpictureblank;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getOriginname() {
        return originname;
    }

    public void setOriginname(String originname) {
        this.originname = originname == null ? null : originname.trim();
    }

    public String getBlogpictureblank() {
        return blogpictureblank;
    }

    public void setBlogpictureblank(String blogpictureblank) {
        this.blogpictureblank = blogpictureblank == null ? null : blogpictureblank.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}