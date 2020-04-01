package com.djcps.test.string;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yj
 * @date: 2018/5/23
 * @time: 13:43
 * @Description: String类的方法使用
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = new String("加油");
        String s2 = "加油";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.equals(s1));
        /*String类  常见方法*/

        System.out.println("-------------分割线------------");
        String s = "abcdeffedcbaef";
        // 获取
        System.out.println(s.length() + "--获取长度");
        System.out.println(s.charAt(2) + "--获取角标的字符");
        /*System.out.println(s.charAt(10) + "--索引越界异常");*/

        System.out.println(s.indexOf('l') + "--返回指定字符的索引");
        System.out.println(s.indexOf("bc") + "--返回指定字符串的索引");
        System.out.println(s.indexOf('a', 2) + "--从指定索引开始返回指定字符的索引");
        /*返回-1  表示没有此字符*/
        System.out.println(s.lastIndexOf('b') + "--反向返回字符第一次一次出现的索引");
        System.out.println(s.lastIndexOf("ef", 10) + "--从指定的索引开始返回字符串第一次一次出现的索引");

        System.out.println("------------分割线-------------");
        /*判断*/
        System.out.println(s.contains("bc") + "原理为索引大于-1");
        System.out.println(s.isEmpty() + "--长度是否为0");
        System.out.println(s.startsWith("a") + "--指定开始");
        System.out.println(s.endsWith("a") + "--指定开始");
        System.out.println(s.equalsIgnoreCase(s) + "--判断是否相同忽略大小写");
        /*转换*/
        System.out.println(String.valueOf(3) + "--基本类型转成字符串，toSting()方法封装");
        /*替换*/
        System.out.println(s.replace('a', 'g'));
        /*分割*/
        System.out.println("============分割线=============");
        String str = "中国人，汉族，杭州，java，智能";
       /* String[] arr = str.split("，");
        for (int i = 0; arr.length > 1; i++) {
            System.out.println(arr[i]);
        }*/
        /*截取*/
        System.out.println("-----");
        System.out.println(str.substring(2, 5) + "--不包含尾");
        /*大小写转换*/
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String ST = "  -  -  ";
        System.out.println(ST.trim());
        /*比较*/
        System.out.println(s.compareTo(s));


        StringBuffer sb1 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(1);
        sb2.append(2);


        Set set = new HashSet();

        ArrayList C = new ArrayList<String>();

    }
}
