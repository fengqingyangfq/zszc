package com.yu.mod;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "zszc_finace", schema = "", catalog = "zszc")
public class ZszcFinaceMod {
    private Integer id;
    private Integer userId;
    private Integer proId;
    private Double money;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @javax.persistence.Column(name = "money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZszcFinaceMod that = (ZszcFinaceMod) o;

        if (id != that.id) return false;
        if (money != that.money) return false;
        if (proId != that.proId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + proId;
        result = 31 * result + money.hashCode();
        return result;
    }
}
