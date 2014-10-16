package com.yu.serv;

import com.yu.dao.IRiserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/17.
 */
@Service
public class RiserServ implements IRiserServ {

    @Autowired
    private IRiserDao iRiserDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String,Object> selectbyriserid(Integer riserId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iRiserDao.selectbyriserid(riserId));
        map.put("status","ok");
        return map;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String,Object> selectbyproid(Integer proId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iRiserDao.selectbyproid(proId));
        map.put("status","ok");
        return map;
    }
}
