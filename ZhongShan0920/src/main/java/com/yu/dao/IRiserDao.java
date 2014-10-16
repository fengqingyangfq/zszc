package com.yu.dao;

import com.yu.mod.ZszcRiserInfoMod;

import java.util.List;

/**
 * Created by Administrator on 2014/8/12.
 * 该接口暂时不考虑
 */
public interface IRiserDao {
    public int insert(Integer riserId, Integer proId, String riserName, String riserIdNum, String riserTeamName, String riserBankName, String riserSubBankName, String riserBankHolder, String riserBankNum);
    public int updatebyid(Integer riserId, Integer proId, String riserName, String riserIdNum, String riserTeamName, String riserBankName, String riserSubBankName, String riserBankHolder, String riserBankNum);
    public int deletebyid(Integer riserId);
    public List<ZszcRiserInfoMod> selectbyriserid(Integer riserId);
    public List<ZszcRiserInfoMod> selectall();
    public List<ZszcRiserInfoMod> selectbyproid(Integer proId);
}
