package com.yu.dao;

import com.yu.mod.ZszcFinaceMod;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Repository
public class FinaceDao implements IFinaceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int insert(Integer id, Integer userId, Integer proId, Double money) {
        ZszcFinaceMod zszcFinaceMod = new ZszcFinaceMod();
        zszcFinaceMod.setId(id);
        zszcFinaceMod.setUserId(userId);
        zszcFinaceMod.setProId(proId);
        zszcFinaceMod.setMoney(money);
        sessionFactory.getCurrentSession().save(zszcFinaceMod);
        return 1;
    }

    @Override
    public int updatebyid(Integer id, Integer userId, Integer proId, Double money) {
        ZszcFinaceMod zszcFinaceMod = new ZszcFinaceMod();
        zszcFinaceMod.setId(id);
        zszcFinaceMod.setUserId(userId);
        zszcFinaceMod.setProId(proId);
        zszcFinaceMod.setMoney(money);
        sessionFactory.getCurrentSession().update(zszcFinaceMod);
        return 1;
    }

    @Override
    public int deletebyid(Integer id) {
        ZszcFinaceMod zszcFinaceMod = new ZszcFinaceMod();
        zszcFinaceMod.setId(id);
        sessionFactory.getCurrentSession().delete(zszcFinaceMod);
        return 1;
    }

    @Override
    public ZszcFinaceMod selectbyid(Integer id) {
        return (ZszcFinaceMod)sessionFactory.getCurrentSession().get(ZszcFinaceMod.class,id);
    }

    @Override
    public List<ZszcFinaceMod> selectall() {
        String hql = "select zszcFinaceMod from ZszcFinaceMod zszcFinaceMod";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<ZszcFinaceMod> selectbyuserid(Integer userId) {
        String hql = "select zszcFinaceMod from ZszcFinaceMod zszcFinaceMod where zszcFinaceMod.userId = " + userId;
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<ZszcFinaceMod> selectbyproid(Integer proId) {
        String hql = "select zszcFinaceMod from ZszcFinaceMod zszcFinaceMod where zszcFinaceMod.proId = " + proId;
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
