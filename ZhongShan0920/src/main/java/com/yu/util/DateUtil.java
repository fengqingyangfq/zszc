package com.yu.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2014/7/28.
 */
public class DateUtil {

    public static Date str2Date(String str){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try{
            date = df.parse(str);
        }catch(Exception e){
            return null;
        }
        return date;
    }

    public static Timestamp str2TS(String str){
        if(str==null) return null;
        return new Timestamp(str2Date(str).getTime());
    }

}
