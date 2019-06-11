package com.test.string;

import java.math.BigDecimal;

/**
 * @author yj
 * @date: 2018/8/14
 * @time: 15:04
 * @Description:
 */

class Test {
    public static void main(String[] args) {
        String s = "测试优惠券，满100减10";
        String s1 = s.substring(0,s.indexOf("，满"));
        System.out.println(s1);
    }

}


