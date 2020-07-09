package com.djcps.test.collection;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author yj
 * @date: 2018/5/29
 * @time: 15:12
 * @Description:
 */
public class testcollection {
    public static void main(String[] args) {
        /*Map<String, String> map = new HashMap<>();
        map.put("刘备", "32");
        map.put("关羽", "22");
        map.put("张飞", "21");

        Set<String> strings = map.keySet();
        for (String key : strings) {
            String v = map.get(key);
            System.out.println(key + "..." + v);
        }
*/
        // testList();
        //test2();
        /*test3();*/
        Map<String, List> map = new HashMap<>();
        List id = map.get("ID");
        if (map.get("ID").isEmpty()){
            System.out.println("我还在吗");
        }
        System.out.println(id);

    }


    public static void testList() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);
        /*for (int i = 1; i <= list.size(); i++) {
            for (int j = i + 1; i < (list.size()-1); j++) {
                System.out.println("heheh" + list.get(j));
            }
            System.out.println(list.get(i));
        }*/
        System.out.println("list1" + list1);
        System.out.println("list2" + list2);
        list1 = list2;
        System.out.println(list1);

    }


    public static void test2() {
        Map<String, BigDecimal> map = new HashMap<>(16);
        map.put("q", BigDecimal.valueOf(2));
        BigDecimal l = map.get("q");
        BigDecimal a = BigDecimal.ZERO;
        if (l != null) {
            BigDecimal add = a.add(l);
            System.out.println(add);
        }

        System.out.println("返回为空");
    }

    public static void test3() {
        String fhline = "3.5+100+99+100+99";
        /*String substring = fhline.substring(5, 9);
        String substring1 = fhline.substring(11, 13);*/
        //String substring = fhline.substring(fhline.indexOf(("+")+1, fhline.indexOf("+")));
        /*int indexOf = fhline.indexOf("+");
        System.out.println(indexOf);
        String substring = fhline.substring(indexOf, fhline.indexOf("+"));
        System.out.println(substring);*/
        //System.out.println(substring1);c.substring(c.indexOf("(")+1,c.indexOf(")"));
        String[] split = fhline.split("\\+");
        String s1 = split[1];
        System.out.println(s1);
        String s2 = split[2];
        System.out.println(s2);
        /*for (String A : split) {

            System.out.println(A);
        }*/
    }
}
