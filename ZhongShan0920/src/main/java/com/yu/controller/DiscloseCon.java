package com.yu.controller;

import com.yu.serv.IDiscloseServ;
import com.yu.util.PicUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Controller
@RequestMapping("/disclose")
public class DiscloseCon {

    @Autowired
    private IDiscloseServ iDiscloseServ;

    @RequestMapping("/selectbyproid.do")
    @ResponseBody
    public Map<String,Object> selectbyproid(Integer proId){
        return iDiscloseServ.selectbyproid(proId);
    }

    @RequestMapping("/uppic.do")
    @ResponseBody
    public Map<String,Object> uppic(String pic,String path){
        Map<String,Object> map = new HashMap<String, Object>();
        PicUtil.getImage(pic,path);
        map.put("status","ok");
        return map;
    }

}
