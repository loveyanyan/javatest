package com.jin.test.string;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author yj
 * @date: 2018/8/14
 * @time: 15:04
 * @Description: 切割字符串
 */

class Test {
    public static void main(String[] args) {
        //格式化数值
        DecimalFormat decimalFormat = new DecimalFormat("###################.##");
       /* String s = "测试优惠券，满100减10";
        String s1 = s.substring(0,s.indexOf("，满"));
        System.out.println(s1);*/


        BigDecimal a = new BigDecimal(1.01123124142);
        System.out.println(a);
        String s = a.toString();
        String format = decimalFormat.format(s);
        System.out.println(format);
    }


}


