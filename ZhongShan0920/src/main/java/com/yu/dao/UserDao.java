package com.yu.dao;

import com.yu.mod.ZszcUserInfoMod;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Repository
public class UserDao implements IUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int insert(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus, Byte userClass) {
        ZszcUserInfoMod zszcUserInfoMod = new ZszcUserInfoMod();
        zszcUserInfoMod.setUserId(userId);
        zszcUserInfoMod.setUserName(userName);
        zszcUserInfoMod.setUserPassword(userPassword);
        zszcUserInfoMod.setUserEmail(userEmail);
        zszcUserInfoMod.setUserAvatar(userAvatar);
        zszcUserInfoMod.setUserStatus(userStatus);
        zszcUserInfoMod.setUserClass(userClass);
        sessionFactory.getCurrentSession().save(zszcUserInfoMod);
        return 1;
    }

    @Override
    public int updatebyid(Integer userId, String userName, String userPassword, String userEmail, Integer userAvatar, Byte userStatus, Byte userClass) {
        ZszcUserInfoMod zszcUserInfoMod = new ZszcUserInfoMod();
        zszcUserInfoMod.setUserId(userId);
        zszcUserInfoMod.setUserName(userName);
        zszcUserInfoMod.setUserPassword(userPassword);
        zszcUserInfoMod.setUserEmail(userEmail);
        zszcUserInfoMod.setUserAvatar(userAvatar);
        zszcUserInfoMod.setUserStatus(userStatus);
        zszcUserInfoMod.setUserClass(userClass);
        sessionFactory.getCurrentSession().update(zszcUserInfoMod);
        return 1;
    }

    @Override
    public int deletebyid(Integer userId) {
        ZszcUserInfoMod zszcUserInfoMod = new ZszcUserInfoMod();
        zszcUserInfoMod.setUserId(userId);
        sessionFactory.getCurrentSession().delete(zszcUserInfoMod);
        return 1;
    }

    @Override
    public ZszcUserInfoMod selectbyid(Integer userId) {
        return (ZszcUserInfoMod)sessionFactory.getCurrentSession().get(ZszcUserInfoMod.class,userId);
    }

    @Override
    public List<ZszcUserInfoMod> selectall() {
        String hql = "select zszcRiserInfoMod from ZszcRiserInfoMod zszcRiserInfoMod";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
