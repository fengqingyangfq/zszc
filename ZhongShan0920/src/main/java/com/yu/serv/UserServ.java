package com.yu.serv;

import com.yu.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Service
public class UserServ implements IUserServ {

    @Autowired
    private IUserDao iUserDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> register(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iUserDao.insert(userId, userName, userPassword, userEmail, userAvatar, userStatus,userClass));
        map.put("status","ok");
        return map;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> login(Integer userId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iUserDao.selectbyid(userId));
        map.put("status","ok");
        return map;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> updatebyid(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus,Byte userClass) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iUserDao.updatebyid(userId, userName, userPassword, userEmail, userAvatar, userStatus,userClass));
        map.put("status","ok");
        return map;
    }
}
