package com.test.calender;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yj
 * @date: 2018/6/19
 * @time: 15:14
 * @Description:
 */
public class calenderTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //创建Calendar对象
        /*Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        calendar1.add(Calendar.MONTH, 0);
        calendar1.set(Calendar.HOUR_OF_DAY, 0);
        calendar1.set(Calendar.MINUTE, 0);
        calendar1.set(Calendar.SECOND, 0);
        calendar1.set(Calendar.MILLISECOND, 0);
        String startTime = dateFormat.format(calendar1.getTime());
        *//*结束时间*//*
        //创建Calendar对象
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        calendar2.add(Calendar.MONTH, 0);
        calendar2.set(Calendar.HOUR_OF_DAY, 23);
        calendar2.set(Calendar.MINUTE, 59);
        calendar2.set(Calendar.SECOND, 59);
        calendar2.set(Calendar.MILLISECOND, 999);
        String endTime = dateFormat.format(calendar2.getTime());
        System.out.println(startTime);
        System.out.println(endTime);


        System.out.println("-----------------------------------");
        System.out.println(getThreeMonthsEarly());
        System.out.println(getThreeMonthsEarly2());*/

        /*getOneDayTime("2019-03-07 20:22:55");
        getLastTimeOfDay("2019-03-12 20:22:55");*/
        getTime(3);

    }

    /*当前时间的三个月之前的时间获取*/
    public static long getThreeMonthsEarly() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, -3);
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 000);
        System.out.println(dateFormat.format(calendar.getTime()));
        return calendar.getTime().getTime();
    }

    public static Date getThreeMonthsEarly2() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, year);
        instance.set(Calendar.MONTH, month);
        instance.add(Calendar.MONTH, -3);
        instance.set(Calendar.DATE, 1);
        instance.set(Calendar.HOUR_OF_DAY, 0);
        instance.set(Calendar.MINUTE, 0);
        instance.set(Calendar.SECOND, 0);
        instance.set(Calendar.MILLISECOND, 0);
        System.out.println(dateFormat.format(instance.getTime()));
        return instance.getTime();
    }

    /*获得某时间24小时之后的时间*/
    public static long getOneDayTime(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + 24);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        return calendar.getTime().getTime();
    }

    /*获得某一天的24点*/
    public static long getLastTimeOfDay(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 000);

       /* Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
        *//*calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH) + 1);*//*
        calendar1.set(Calendar.HOUR_OF_DAY, 24);
        calendar1.set(Calendar.MINUTE, 0);
        calendar1.set(Calendar.SECOND, 0);
        calendar1.set(Calendar.MILLISECOND, 000);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(sdf.format(calendar1.getTime()));
        System.out.println(calendar.getTime().getTime() == calendar1.getTime().getTime());*/
        System.out.println(sdf.format(calendar.getTime()));
        return 1;
    }

    public static long getTime(int time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, time);
        String times = sdf.format(calendar.getTime());
        Date deliveryTime = sdf.parse(times);
        System.out.println(deliveryTime);
        return 1;
    }

}
