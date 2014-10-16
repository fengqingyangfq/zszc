package com.yu.dao;

import com.yu.mod.ZszcPictureMod;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Repository
public class PictureDao implements IPictureDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int insert(Integer picId, Timestamp picName, Integer picRemark, String url) {
        ZszcPictureMod zszcPictureMod = new ZszcPictureMod();
        zszcPictureMod.setPicId(picId);
        zszcPictureMod.setPicName(picName);
        zszcPictureMod.setPicRemark(picRemark);
        zszcPictureMod.setUrl(url);
        sessionFactory.getCurrentSession().save(zszcPictureMod);
        return 1;
    }

    @Override
    public int updatebyid(Integer picId, Timestamp picName, Integer picRemark, String url) {
        ZszcPictureMod zszcPictureMod = new ZszcPictureMod();
        zszcPictureMod.setPicId(picId);
        zszcPictureMod.setPicName(picName);
        zszcPictureMod.setPicRemark(picRemark);
        zszcPictureMod.setUrl(url);
        sessionFactory.getCurrentSession().update(zszcPictureMod);
        return 1;
    }

    @Override
    public int deletebyid(Integer picId) {
        ZszcPictureMod zszcPictureMod = new ZszcPictureMod();
        zszcPictureMod.setPicId(picId);
        return 1;
    }

    @Override
    public ZszcPictureMod selectbyid(Integer picId) {
        return (ZszcPictureMod)sessionFactory.getCurrentSession().get(ZszcPictureMod.class,picId);
    }

    @Override
    public List<ZszcPictureMod> selectall() {
        String hql = "select zszcPictureMod from ZszcPictureMod zszcPictureMod";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
