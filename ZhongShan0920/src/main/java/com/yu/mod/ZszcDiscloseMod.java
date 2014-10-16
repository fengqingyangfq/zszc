package com.yu.mod;

import com.yu.util.DateUtil;
import com.yu.util.SpringJson;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "zszc_disclose", schema = "", catalog = "zszc")
public class ZszcDiscloseMod {
    private Integer discId;
    private Integer proId;
    private Integer riserId;
    private Timestamp discTime;
    private String discAddress;
    private String discTitle;
    private Double discMoney;
    private String discPic;

    public String toString(){
        return null;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "disc_id")
    public Integer getDiscId() {
        return discId;
    }

    public void setDiscId(Integer discId) {
        this.discId = discId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pro_id")
    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "riser_id")
    public Integer getRiserId() {
        return riserId;
    }

    public void setRiserId(Integer riserId) {
        this.riserId = riserId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "disc_time")
    @JsonSerialize(using = SpringJson.class)
    public Timestamp getDiscTime() {
        return discTime;
    }

    public void setDiscTime(Timestamp discTime) {
        this.discTime = discTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "disc_address")
    public String getDiscAddress() {
        return discAddress;
    }

    public void setDiscAddress(String discAddress) {
        this.discAddress = discAddress;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "disc_title")
    public String getDiscTitle() {
        return discTitle;
    }

    public void setDiscTitle(String discTitle) {
        this.discTitle = discTitle;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "disc_money")
    public Double getDiscMoney() {
        return discMoney;
    }

    public void setDiscMoney(Double discMoney) {
        this.discMoney = discMoney;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "disc_pic")
    public String getDiscPic() {
        return discPic;
    }

    public void setDiscPic(String discPic) {
        this.discPic = discPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZszcDiscloseMod that = (ZszcDiscloseMod) o;

        if (discMoney != that.discMoney) return false;
        if (discPic != that.discPic) return false;
        if (proId != that.proId) return false;
        if (riserId != that.riserId) return false;
        if (discAddress != null ? !discAddress.equals(that.discAddress) : that.discAddress != null) return false;
        if (discId != null ? !discId.equals(that.discId) : that.discId != null) return false;
        if (discTime != null ? !discTime.equals(that.discTime) : that.discTime != null) return false;
        if (discTitle != null ? !discTitle.equals(that.discTitle) : that.discTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = discId != null ? discId.hashCode() : 0;
        result = 31 * result + (discTime != null ? proId.hashCode() : 0);
        result = 31 * result + (discTime != null ? riserId.hashCode() : 0);
        result = 31 * result + (discTime != null ? discTime.hashCode() : 0);
        result = 31 * result + (discAddress != null ? discAddress.hashCode() : 0);
        result = 31 * result + (discTitle != null ? discTitle.hashCode() : 0);
        result = 31 * result + (discTitle != null ? discMoney.hashCode() : 0);
        result = 31 * result + (discTitle != null ? discPic.hashCode() : 0);
        return result;
    }
}
