package com.yu.controller;

import com.yu.serv.IDiscloseServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2014/8/13.
 */
@Controller
@RequestMapping("/disclose")
public class DiscloseContr {

    @Autowired
    private IDiscloseServ iDiscloseServ;

    @RequestMapping("/insert.do")
    @ResponseBody
    public Map<String,Object> insert(Integer discId, Integer proId, Integer riserId, String discTime, String discAddress, String discTitle, Double discMoney, String discPic){
        Map<String,Object> map = new HashMap<String, Object>();
        iDiscloseServ.insert(discId, proId, riserId, discTime, discAddress, discTitle, discMoney, discPic);
        map.put("status","ok");
        return map;
    }

    @RequestMapping("/updatebyid.do")
    @ResponseBody
    public Map<String,Object> updatebyid(Integer discId, Integer proId, Integer riserId, String discTime, String discAddress, String discTitle, Double discMoney, String discPic){
        Map<String,Object> map = new HashMap<String, Object>();
        iDiscloseServ.updatebyid(discId, proId, riserId, discTime, discAddress, discTitle, discMoney, discPic);
        map.put("status","ok");
        return map;
    }

    @RequestMapping("/deletebyid.do")
    @ResponseBody
    public Map<String,Object> deletebyid(Integer discId){
        Map<String,Object> map = new HashMap<String, Object>();
        iDiscloseServ.deletebyid(discId);
        map.put("status","ok");
        return map;
    }

    @RequestMapping("/selectbyid.do")
    @ResponseBody
    public Map<String,Object> selectbyid(Integer discId){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iDiscloseServ.selectbyid(discId));
        map.put("status","ok");
        return map;
    }

    @RequestMapping("/selectall.do")
    @ResponseBody
    public Map<String,Object> selectall(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iDiscloseServ.selectall());
        map.put("status","ok");
        return map;
    }

}
