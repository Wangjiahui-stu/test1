package com.aistar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static void main(String[] args) {
        System.out.println(getBeforeDate(-1));
    }

    //获得前几天的日期
    public static Date getBeforeDate(int days){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,days);  // cal.add(Calendar.DAY_OF_MONTH,-2);
        return cal.getTime();
    }
    public static String getMonthNum(String start,int month){
        Long time = null;
        SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(format.parse(start));//设置起时间
        } catch (ParseException e) {
            e.printStackTrace();
        }
        cal.add(Calendar.MONTH, month);
        Date endDate = cal.getTime();
        String end = format.format(endDate);
        return end;
    }


    public static Date string2DateYM(String time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static Date string2Date(String time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    //把日期转化成字符串
    public static String date2String(Date date){
        String s = null;
        SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd");
        s=format.format(date);
        return s;
    }
}
