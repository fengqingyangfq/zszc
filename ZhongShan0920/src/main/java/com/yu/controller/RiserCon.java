package com.yu.controller;

import com.yu.mod.ZszcRiserInfoMod;
import com.yu.serv.IRiserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/17.
 */
@Controller
@RequestMapping("/riser")
public class RiserCon {

    @Autowired
    private IRiserServ iRiserServ;

    @RequestMapping("/selectbyriserid.do")
    @ResponseBody
    public Map<String,Object> selectbyriserid(Integer riserId){
        return iRiserServ.selectbyriserid(riserId);
    }

    @RequestMapping("/selectbyproid.do")
    @ResponseBody
    public Map<String,Object> selectbyproid(Integer proId){
        return iRiserServ.selectbyproid(proId);
    }

}
