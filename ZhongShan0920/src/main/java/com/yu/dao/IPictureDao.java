package com.yu.dao;

import com.yu.mod.ZszcPictureMod;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Administrator on 2014/8/12.
 */
public interface IPictureDao {
    public int insert(Integer picId, Timestamp picName, Integer picRemark, String url);
    public int updatebyid(Integer picId, Timestamp picName, Integer picRemark, String url);
    public int deletebyid(Integer picId);
    public ZszcPictureMod selectbyid(Integer picId);
    public List<ZszcPictureMod> selectall();
}
