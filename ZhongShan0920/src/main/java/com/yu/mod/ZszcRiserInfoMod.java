package com.yu.mod;

import org.hibernate.annotations.DynamicUpdate;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "zszc_riser_info", schema = "", catalog = "zszc")
public class ZszcRiserInfoMod {
    private Integer riserId;
    private Integer proId;
    private String riserName;
    private String riserIdNum;
    private String riserTeamName;
    private String riserBankName;
    private String riserSubBankName;
    private String riserBankHolder;
    private String riserBankNum;

    @javax.persistence.Id
    @javax.persistence.Column(name = "riser_id")
    public Integer getRiserId() {
        return riserId;
    }

    public void setRiserId(Integer riserId) {
        this.riserId = riserId;
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
    @javax.persistence.Column(name = "riser_name")
    public String getRiserName() {
        return riserName;
    }

    public void setRiserName(String riserName) {
        this.riserName = riserName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "riser_ID_num")
    public String getRiserIdNum() {
        return riserIdNum;
    }

    public void setRiserIdNum(String riserIdNum) {
        this.riserIdNum = riserIdNum;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "riser_team_name")
    public String getRiserTeamName() {
        return riserTeamName;
    }

    public void setRiserTeamName(String riserTeamName) {
        this.riserTeamName = riserTeamName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "riser_bank_name")
    public String getRiserBankName() {
        return riserBankName;
    }

    public void setRiserBankName(String riserBankName) {
        this.riserBankName = riserBankName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "riser_sub_bank_name")
    public String getRiserSubBankName() {
        return riserSubBankName;
    }

    public void setRiserSubBankName(String riserSubBankName) {
        this.riserSubBankName = riserSubBankName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "riser_bank_holder")
    public String getRiserBankHolder() {
        return riserBankHolder;
    }

    public void setRiserBankHolder(String riserBankHolder) {
        this.riserBankHolder = riserBankHolder;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "riser_bank_num")
    public String getRiserBankNum() {
        return riserBankNum;
    }

    public void setRiserBankNum(String riserBankNum) {
        this.riserBankNum = riserBankNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZszcRiserInfoMod that = (ZszcRiserInfoMod) o;

        if (proId != that.proId) return false;
        if (riserId != that.riserId) return false;
        if (riserBankHolder != null ? !riserBankHolder.equals(that.riserBankHolder) : that.riserBankHolder != null)
            return false;
        if (riserBankName != null ? !riserBankName.equals(that.riserBankName) : that.riserBankName != null)
            return false;
        if (riserBankNum != null ? !riserBankNum.equals(that.riserBankNum) : that.riserBankNum != null) return false;
        if (riserIdNum != null ? !riserIdNum.equals(that.riserIdNum) : that.riserIdNum != null) return false;
        if (riserName != null ? !riserName.equals(that.riserName) : that.riserName != null) return false;
        if (riserSubBankName != null ? !riserSubBankName.equals(that.riserSubBankName) : that.riserSubBankName != null)
            return false;
        if (riserTeamName != null ? !riserTeamName.equals(that.riserTeamName) : that.riserTeamName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = riserId;
        result = 31 * result + proId;
        result = 31 * result + (riserName != null ? riserName.hashCode() : 0);
        result = 31 * result + (riserIdNum != null ? riserIdNum.hashCode() : 0);
        result = 31 * result + (riserTeamName != null ? riserTeamName.hashCode() : 0);
        result = 31 * result + (riserBankName != null ? riserBankName.hashCode() : 0);
        result = 31 * result + (riserSubBankName != null ? riserSubBankName.hashCode() : 0);
        result = 31 * result + (riserBankHolder != null ? riserBankHolder.hashCode() : 0);
        result = 31 * result + (riserBankNum != null ? riserBankNum.hashCode() : 0);
        return result;
    }
}
