package com.yu.serv;

import com.yu.dao.IProjectDao;
import com.yu.mod.ZszcProInfoMod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
@Service
public class ProjectServ implements IProjectServ {

    @Autowired
    private IProjectDao iProjectDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<ZszcProInfoMod> selectall() {
        return iProjectDao.selectall();
    }

    @Transactional(rollbackFor = Exception.class)
    public ZszcProInfoMod selectbyid(Integer proId) {
        return iProjectDao.selectbyid(proId);
    }

}
