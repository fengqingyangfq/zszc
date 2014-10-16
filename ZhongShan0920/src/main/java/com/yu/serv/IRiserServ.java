package com.yu.serv;

import java.util.Map;

/**
 * Created by fengqingyangFQ on 2014/8/17.
 */
public interface IRiserServ {
    public Map<String,Object> selectbyriserid(Integer riserId);
    public Map<String,Object> selectbyproid(Integer proId);
}
