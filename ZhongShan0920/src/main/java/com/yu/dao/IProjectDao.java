package com.yu.dao;

import com.yu.mod.ZszcProInfoMod;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Administrator on 2014/8/12.
 */
public interface IProjectDao {
    public int insert(Integer proId, String proTitle, Integer proStatus, String proPic, Double proGoal, Timestamp proStart, Timestamp proEnd, Integer proRemark);
    public int updatebyid(Integer proId, String proTitle, Integer proStatus, String proPic, Double proGoal, Timestamp proStart, Timestamp proEnd, Integer proRemark);
    public int deletebyid(Integer proId);
    public ZszcProInfoMod selectbyid(Integer proId);
    public List<ZszcProInfoMod> selectall();
}
