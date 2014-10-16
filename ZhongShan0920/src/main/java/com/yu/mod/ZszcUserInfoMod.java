package com.yu.mod;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "zszc_user_info", schema = "", catalog = "zszc")
public class ZszcUserInfoMod {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    private Integer userAvatar;
    private Byte userStatus;
    private Byte userClass;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_avatar")
    public Integer getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(Integer userAvatar) {
        this.userAvatar = userAvatar;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_status")
    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_class")
    public Byte getUserClass() {
        return userClass;
    }

    public void setUserClass(Byte userClass) {
        this.userClass = userClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZszcUserInfoMod that = (ZszcUserInfoMod) o;

        if (userAvatar != that.userAvatar) return false;
        if (userClass != that.userClass) return false;
        if (userId != that.userId) return false;
        if (userStatus != that.userStatus) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + userAvatar;
        result = 31 * result + (int) userStatus;
        result = 31 * result + (int) userClass;
        return result;
    }
}
