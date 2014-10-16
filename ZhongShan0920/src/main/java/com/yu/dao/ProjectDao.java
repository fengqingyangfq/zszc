package com.yu.dao;

import com.yu.mod.ZszcProInfoMod;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Repository
public class ProjectDao implements IProjectDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int insert(Integer proId, String proTitle, Integer proStatus, String proPic, Double proGoal, Timestamp proStart, Timestamp proEnd, Integer proRemark) {
        ZszcProInfoMod zszcProInfoMod = new ZszcProInfoMod();
        zszcProInfoMod.setProId(proId);
        zszcProInfoMod.setProTitle(proTitle);
        zszcProInfoMod.setProStatus(proStatus.byteValue());
        zszcProInfoMod.setProPic(proPic);
        zszcProInfoMod.setProGoal(proGoal);
        zszcProInfoMod.setProStart(proStart);
        zszcProInfoMod.setProEnd(proEnd);
        zszcProInfoMod.setProRemark(proRemark.byteValue());
        sessionFactory.getCurrentSession().save(zszcProInfoMod);
        return 1;
    }

    @Override
    public int updatebyid(Integer proId, String proTitle, Integer proStatus, String proPic, Double proGoal, Timestamp proStart, Timestamp proEnd, Integer proRemark) {
        ZszcProInfoMod zszcProInfoMod = new ZszcProInfoMod();
        zszcProInfoMod.setProId(proId);
        zszcProInfoMod.setProTitle(proTitle);
        zszcProInfoMod.setProStatus(proStatus.byteValue());
        zszcProInfoMod.setProPic(proPic);
        zszcProInfoMod.setProGoal(proGoal);
        zszcProInfoMod.setProStart(proStart);
        zszcProInfoMod.setProEnd(proEnd);
        zszcProInfoMod.setProRemark(proRemark.byteValue());
        sessionFactory.getCurrentSession().update(zszcProInfoMod);
        return 1;
    }

    @Override
    public int deletebyid(Integer proId) {
        ZszcProInfoMod zszcProInfoMod = new ZszcProInfoMod();
        zszcProInfoMod.setProId(proId);
        sessionFactory.getCurrentSession().delete(zszcProInfoMod);
        return 1;
    }

    @Override
    public ZszcProInfoMod selectbyid(Integer proId) {
        return (ZszcProInfoMod)sessionFactory.getCurrentSession().get(ZszcProInfoMod.class,proId);
    }

    @Override
    public List<ZszcProInfoMod> selectall() {
        String hql = "select zszcProInfoMod from ZszcProInfoMod zszcProInfoMod";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
