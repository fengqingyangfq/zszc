package com.yu.dao;

import com.yu.mod.ZszcFinaceMod;

import java.util.List;

/**
 * Created by Administrator on 2014/8/12.
 */
public interface IFinaceDao {
    public int insert(Integer id,Integer userId,Integer proId,Double money);
    public int updatebyid(Integer id,Integer userId,Integer proId,Double money);
    public int deletebyid(Integer id);
    public ZszcFinaceMod selectbyid(Integer id);
    public List<ZszcFinaceMod> selectall();
    public List<ZszcFinaceMod> selectbyuserid(Integer userId);
    public List<ZszcFinaceMod> selectbyproid(Integer proId);
}
