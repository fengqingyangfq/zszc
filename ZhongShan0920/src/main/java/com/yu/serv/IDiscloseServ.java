package com.yu.serv;

import com.yu.mod.ZszcDiscloseMod;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/8/13.
 */
public interface IDiscloseServ {
    public void insert(Integer discId,Integer proId,Integer riserId,String discTime,String discAddress, String discTitle, Double discMoney, String discPic);
    public void updatebyid(Integer discId,Integer proId,Integer riserId,String discTime,String discAddress, String discTitle, Double discMoney, String discPic);
    public void deletebyid(Integer discId);
    public ZszcDiscloseMod selectbyid(Integer discId);
    public List<ZszcDiscloseMod> selectall();
    public Map<String,Object> selectbyproid(Integer proId);
}
