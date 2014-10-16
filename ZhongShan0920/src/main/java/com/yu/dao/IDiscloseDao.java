package com.yu.dao;

import com.yu.mod.ZszcDiscloseMod;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2014/8/12.
 */
public interface IDiscloseDao {
    public int insert(Integer discId,Integer proId,Integer riserId,String discTime,String discAddress, String discTitle, Double discMoney, String discPic);
    public int updatebyid(Integer discId,Integer proId,Integer riserId,String discTime,String discAddress, String discTitle, Double discMoney, String discPic);
    public int deletebyid(Integer discId);
    public ZszcDiscloseMod selectbyid(Integer discId);
    public List<ZszcDiscloseMod> selectall();
    public List<ZszcDiscloseMod> selectbyproid(Integer proId);
}
