package com.test.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description TODO
 * @author yj
 * @date 2019/1/16 12:15
 * @param null
 * @return 
 */
public class 三个月之前的时间 {
    public static void main(String[] args) {
        //设置传入时间的格式
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*默认查询三个月时间订单*/
        /*开始时间*/
        //创建Calendar对象
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        calendar1.add(Calendar.MONTH, -3);
        calendar1.set(Calendar.HOUR_OF_DAY, 0);
        calendar1.set(Calendar.MINUTE, 0);
        calendar1.set(Calendar.SECOND, 0);
        calendar1.set(Calendar.MILLISECOND, 0);
        String startTime = dateFormat1.format(calendar1.getTime());
        /*结束时间*/
        //创建Calendar对象
        Calendar calendar2 = Calendar.getInstance();
        String endTime = dateFormat1.format(calendar2.getTime());
        System.out.println(startTime);
        System.out.println(endTime);
    }
}
