package com.yu.dao;

import com.yu.mod.ZszcRiserInfoMod;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Repository
public class RiserDao implements IRiserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int insert(Integer riserId, Integer proId, String riserName, String riserIdNum, String riserTeamName, String riserBankName, String riserSubBankName, String riserBankHolder, String riserBankNum) {
        ZszcRiserInfoMod zszcRiserInfoMod = new ZszcRiserInfoMod();
        zszcRiserInfoMod.setRiserId(riserId);
        zszcRiserInfoMod.setProId(proId);
        zszcRiserInfoMod.setRiserName(riserName);
        zszcRiserInfoMod.setRiserIdNum(riserIdNum);
        zszcRiserInfoMod.setRiserTeamName(riserTeamName);
        zszcRiserInfoMod.setRiserBankName(riserBankName);
        zszcRiserInfoMod.setRiserSubBankName(riserSubBankName);
        zszcRiserInfoMod.setRiserBankHolder(riserBankHolder);
        zszcRiserInfoMod.setRiserBankNum(riserBankNum);
        sessionFactory.getCurrentSession().save(zszcRiserInfoMod);
        return 1;
    }

    @Override
    public int updatebyid(Integer riserId, Integer proId, String riserName, String riserIdNum, String riserTeamName, String riserBankName, String riserSubBankName, String riserBankHolder, String riserBankNum) {
        ZszcRiserInfoMod zszcRiserInfoMod = new ZszcRiserInfoMod();
        zszcRiserInfoMod.setRiserId(riserId);
        zszcRiserInfoMod.setProId(proId);
        zszcRiserInfoMod.setRiserName(riserName);
        zszcRiserInfoMod.setRiserIdNum(riserIdNum);
        zszcRiserInfoMod.setRiserTeamName(riserTeamName);
        zszcRiserInfoMod.setRiserBankName(riserBankName);
        zszcRiserInfoMod.setRiserSubBankName(riserSubBankName);
        zszcRiserInfoMod.setRiserBankHolder(riserBankHolder);
        zszcRiserInfoMod.setRiserBankNum(riserBankNum);
        sessionFactory.getCurrentSession().update(zszcRiserInfoMod);
        return 1;
    }

    @Override
    public int deletebyid(Integer riserId) {
        ZszcRiserInfoMod zszcRiserInfoMod = new ZszcRiserInfoMod();
        zszcRiserInfoMod.setRiserId(riserId);
        sessionFactory.getCurrentSession().delete(zszcRiserInfoMod);
        return 1;
    }

    @Override
    public List<ZszcRiserInfoMod> selectbyriserid(Integer riserId) {
        String hql = "select zszcRiserInfoMod from ZszcRiserInfoMod zszcRiserInfoMod where zszcRiserInfoMod.riserId = " + riserId;
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<ZszcRiserInfoMod> selectall() {
        String hql = "select zszcRiserInfoMod from ZszcRiserInfoMod zszcRiserInfoMod";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<ZszcRiserInfoMod> selectbyproid(Integer proId) {
        String hql = "select zszcRiserInfoMod from ZszcRiserInfoMod zszcRiserInfoMod where zszcRiserInfoMod.proId = " + proId;
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
