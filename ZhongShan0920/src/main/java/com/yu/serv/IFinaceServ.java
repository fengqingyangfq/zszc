package com.yu.serv;

import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/16.
 */
public interface IFinaceServ {
    public Map<String,Object> insert(Integer id, Integer userId, Integer proId, Double money);
    public Map<String,Object> selectbyuserid(Integer userId);
    public Map<String,Object> selectbyidproid(Integer proId);
}
