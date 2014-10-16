package com.yu.mod;

import com.yu.util.SpringJson;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "zszc_picture", schema = "", catalog = "zszc")
public class ZszcPictureMod {
    private Integer picId;
    private Timestamp picName;
    private Integer picRemark;
    private String url;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "pic_id")
    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pic_name")
    @JsonSerialize(using = SpringJson.class)
    public Timestamp getPicName() {
        return picName;
    }

    public void setPicName(Timestamp picName) {
        this.picName = picName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pic_remark")
    public Integer getPicRemark() {
        return picRemark;
    }

    public void setPicRemark(Integer picRemark) {
        this.picRemark = picRemark;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZszcPictureMod that = (ZszcPictureMod) o;

        if (picId != that.picId) return false;
        if (picName != null ? !picName.equals(that.picName) : that.picName != null) return false;
        if (picRemark != null ? !picRemark.equals(that.picRemark) : that.picRemark != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = picId;
        result = 31 * result + (picName != null ? picName.hashCode() : 0);
        result = 31 * result + (picRemark != null ? picRemark.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
