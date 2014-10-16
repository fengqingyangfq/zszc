package com.yu.serv;

import com.yu.dao.IFinaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Service
public class FinaceServ implements IFinaceServ {

    @Autowired
    private IFinaceDao iFinaceDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> insert(Integer id, Integer userId, Integer proId, Double money) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iFinaceDao.insert(id,userId,proId,money));
        map.put("status","ok");
        return map;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> selectbyuserid(Integer userId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iFinaceDao.selectbyuserid(userId));
        map.put("status","ok");
        return map;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> selectbyidproid(Integer proId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iFinaceDao.selectbyproid(proId));
        map.put("status","ok");
        return map;
    }
}
