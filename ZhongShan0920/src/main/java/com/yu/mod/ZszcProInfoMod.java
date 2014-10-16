package com.yu.mod;

import com.yu.util.SpringJson;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "zszc_pro_info", schema = "", catalog = "zszc")
public class ZszcProInfoMod {
    private Integer proId;
    private String proTitle;
    private Byte proStatus;
    private String proPic;
    private Double proGoal;
    private Timestamp proStart;
    private Timestamp proEnd;
    private Byte proRemark;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "pro_id")
    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_title")
    public String getProTitle() {
        return proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_status")
    public Byte getProStatus() {
        return proStatus;
    }

    public void setProStatus(Byte proStatus) {
        this.proStatus = proStatus;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_pic_url")
    public String getProPic() {
        return proPic;
    }

    public void setProPic(String proPic) {
        this.proPic = proPic;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_goal")
    public Double getProGoal() {
        return proGoal;
    }

    public void setProGoal(Double proGoal) {
        this.proGoal = proGoal;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_start")
    @JsonSerialize(using = SpringJson.class)
    public Timestamp getProStart() {
        return proStart;
    }

    public void setProStart(Timestamp proStart) {
        this.proStart = proStart;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_end")
    @JsonSerialize(using = SpringJson.class)
    public Timestamp getProEnd() {
        return proEnd;
    }

    public void setProEnd(Timestamp proEnd) {
        this.proEnd = proEnd;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_remark")
    public Byte getProRemark() {
        return proRemark;
    }

    public void setProRemark(Byte proRemark) {
        this.proRemark = proRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZszcProInfoMod that = (ZszcProInfoMod) o;
        if (proId != that.proId) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return proId;
    }
}
