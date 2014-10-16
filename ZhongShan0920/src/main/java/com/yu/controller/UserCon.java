package com.yu.controller;

import com.yu.serv.IUserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Controller
@RequestMapping("/user")
public class UserCon {

    @Autowired
    private IUserServ iUserServ;

    @RequestMapping("/register.do")
    @ResponseBody
    public Map<String,Object> register(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass){
        return iUserServ.register(userId, userName, userPassword, userEmail, userAvatar, userStatus,userClass);
    }

    @RequestMapping("/updatebyid.do")
    @ResponseBody
    public Map<String,Object> updatebyid(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass){
        return iUserServ.updatebyid(userId, userName, userPassword, userEmail, userAvatar, userStatus,userClass);
    }

    @RequestMapping("/login.do")
    @ResponseBody
    public Map<String,Object> login(Integer userId){
        return iUserServ.login(userId);
    }

}
