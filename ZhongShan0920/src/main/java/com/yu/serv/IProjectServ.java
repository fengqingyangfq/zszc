package com.yu.serv;

import com.yu.mod.ZszcProInfoMod;

import java.util.List;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
public interface IProjectServ {
    public List<ZszcProInfoMod> selectall();
    public ZszcProInfoMod selectbyid(Integer proId);
}
