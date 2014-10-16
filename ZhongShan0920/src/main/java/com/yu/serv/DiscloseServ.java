package com.yu.serv;

import com.yu.dao.IDiscloseDao;
import com.yu.mod.ZszcDiscloseMod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/8/13.
 */
@Service
public class DiscloseServ implements IDiscloseServ{

    @Autowired
    private IDiscloseDao iDiscloseDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(Integer discId, Integer proId, Integer riserId, String discTime, String discAddress, String discTitle, Double discMoney, String discPic) {
        iDiscloseDao.insert(discId, proId, riserId, discTime, discAddress, discTitle, discMoney, discPic);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updatebyid(Integer discId, Integer proId, Integer riserId, String discTime, String discAddress, String discTitle, Double discMoney, String discPic) {
        iDiscloseDao.updatebyid(discId, proId, riserId, discTime, discAddress, discTitle, discMoney, discPic);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deletebyid(Integer discId) {
        iDiscloseDao.deletebyid(discId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ZszcDiscloseMod selectbyid(Integer discId) {
        return iDiscloseDao.selectbyid(discId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<ZszcDiscloseMod> selectall() {
        return iDiscloseDao.selectall();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String,Object> selectbyproid(Integer proId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result",iDiscloseDao.selectbyproid(proId));
        map.put("status","ok");
        return map;
    }
}
