package com.yu.serv;

import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
public interface IUserServ {
    public Map<String,Object> register(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass);
    public Map<String,Object> login(Integer userId);
    public Map<String,Object> updatebyid(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass);
}
