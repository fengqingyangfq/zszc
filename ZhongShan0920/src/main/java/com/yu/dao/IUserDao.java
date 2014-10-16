package com.yu.dao;

import com.yu.mod.ZszcUserInfoMod;

import java.util.List;

/**
 * Created by Administrator on 2014/8/12.
 */
public interface IUserDao {
    public int insert(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass);
    public int updatebyid(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass);
    public int deletebyid(Integer userId);
    public ZszcUserInfoMod selectbyid(Integer userId);
    public List<ZszcUserInfoMod> selectall();
}
