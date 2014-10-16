package com.yu.controller;

import com.yu.mod.ZszcProInfoMod;
import com.yu.serv.IProjectServ;
import com.yu.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Controller
@RequestMapping("/project")
public class ProjectCon {

    @Autowired
    private IProjectServ iProjectServ;

    @RequestMapping("/selectall.do")
    @ResponseBody
    public Map<String,Object> selectall(){
        Map<String,Object> map = new HashMap<String, Object>();
        List<ZszcProInfoMod> ls = iProjectServ.selectall();
        List<Map> res = new LinkedList<Map>();//为了保证顺序，嵌套list
        for(ZszcProInfoMod li : ls){
            Map<String,Object> m = new HashMap<String,Object>();
            long d = (li.getProEnd().getTime()-new Date().getTime())/(36*2400000);
            m.put("mod",li);
            m.put("rest",d);
            res.add(m);
        }
        map.put("result",res);
        map.put("status","ok");
        return map;
    }

    @RequestMapping("/selectbyid.do")
    @ResponseBody
    public Map<String,Object> selectbyid(Integer proId){
        Map<String,Object> map = new HashMap<String, Object>();
        Map<String,Object> m = new HashMap<String,Object>();
        ZszcProInfoMod li = iProjectServ.selectbyid(proId);
        long d = (li.getProEnd().getTime()-new Date().getTime())/(36*2400000);
        m.put("mod",li);
        m.put("rest",d);
        map.put("result",li);
        map.put("status","ok");
        return map;
    }

}
