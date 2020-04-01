package com.jin.test.string;

import java.math.BigDecimal;

/**
 * @author yj
 * @date: 2018/8/20
 * @time: 21:55
 * @Description:
 */
public class test2 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(10);
        BigDecimal c = new BigDecimal(3);

/*`
        BigDecimal c = a.add(b);
        System.out.println(c);
        a.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(a);
        b.setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal f = a.add(b);
        System.out.println(f);*/
        BigDecimal fdiscountamount = (a.multiply(b.divide(c)).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println(fdiscountamount);
      /*  System.out.println();


        int  i = 1;
        int j = 2;
        System.out.println(j+i);*/
    }


}
