package com.yu.controller;

import com.yu.serv.IFinaceServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Controller
@RequestMapping("/finace")
public class FinaceCon {

    @Autowired
    private IFinaceServ iFinaceServ;

    @RequestMapping("/insert.do")
    @ResponseBody
    public Map<String,Object> insert(Integer id, Integer userId, Integer proId, Double money){
        return iFinaceServ.insert(id, userId, proId,  money);
    }

    @RequestMapping("/selectbyuserid.do")
    @ResponseBody
    public Map<String,Object> selectbyuserid(Integer userId){
        return iFinaceServ.selectbyuserid(userId);
    }

    @RequestMapping("/selectbyproid.do")
    @ResponseBody
    public Map<String,Object> selectbyproid(Integer proId){
        return iFinaceServ.selectbyidproid(proId);
    }

}
