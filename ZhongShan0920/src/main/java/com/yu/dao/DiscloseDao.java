package com.yu.dao;

import com.yu.mod.ZszcDiscloseMod;
import com.yu.util.DateUtil;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2014/8/12.
 */
@Repository
public class DiscloseDao implements IDiscloseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int insert(Integer discId, Integer proId, Integer riserId, String discTime, String discAddress, String discTitle, Double discMoney, String discPic) {
        ZszcDiscloseMod zszcDiscloseMod = new ZszcDiscloseMod();
        zszcDiscloseMod.setDiscId(discId);
        zszcDiscloseMod.setProId(proId);
        zszcDiscloseMod.setRiserId(riserId);
        zszcDiscloseMod.setDiscTime(DateUtil.str2TS(discTime));
        zszcDiscloseMod.setDiscAddress(discAddress);
        zszcDiscloseMod.setDiscTitle(discTitle);
        zszcDiscloseMod.setDiscMoney(discMoney);
        zszcDiscloseMod.setDiscPic(discPic);
        sessionFactory.getCurrentSession().save(zszcDiscloseMod);
        return 1;
    }

    @Override
    public int updatebyid(Integer discId, Integer proId, Integer riserId, String discTime, String discAddress, String discTitle, Double discMoney, String discPic) {
        ZszcDiscloseMod zszcDiscloseMod = new ZszcDiscloseMod();
        zszcDiscloseMod.setDiscId(discId);
        zszcDiscloseMod.setProId(proId);
        zszcDiscloseMod.setRiserId(riserId);
        zszcDiscloseMod.setDiscTime(DateUtil.str2TS(discTime));
        zszcDiscloseMod.setDiscAddress(discAddress);
        zszcDiscloseMod.setDiscTitle(discTitle);
        zszcDiscloseMod.setDiscMoney(discMoney);
        zszcDiscloseMod.setDiscPic(discPic);
        sessionFactory.getCurrentSession().update(zszcDiscloseMod);
        return 1;
    }

    @Override
    public int deletebyid(Integer discId) {
        ZszcDiscloseMod zszcDiscloseMod = new ZszcDiscloseMod();
        zszcDiscloseMod.setDiscId(discId);
        sessionFactory.getCurrentSession().delete(zszcDiscloseMod);
        return 1;
    }

    @Override
    public ZszcDiscloseMod selectbyid(Integer discId) {
        return (ZszcDiscloseMod)sessionFactory.getCurrentSession().get(ZszcDiscloseMod.class,discId);
    }

    @Override
    public List<ZszcDiscloseMod> selectall() {
        String hql = "select zszcDiscloseMod from ZszcDiscloseMod zszcDiscloseMod";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<ZszcDiscloseMod> selectbyproid(Integer proId) {
        String hql = "select zszcDiscloseMod from ZszcDiscloseMod zszcDiscloseMod where zszcDiscloseMod.proId = " + proId;
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
