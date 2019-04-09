package cn.qs.bean.tourism;

import java.util.Date;

public class Picture {
    private Integer id;

    private String name;

    private String path;

    private Integer viewid;

    private Date createtime;

    private Date updatetime;

    private String type;

    private String pictureblank;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPictureblank() {
        return pictureblank;
    }

    public void setPictureblank(String pictureblank) {
        this.pictureblank = pictureblank == null ? null : pictureblank.trim();
    }
}