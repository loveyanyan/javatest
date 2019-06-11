package com.test.collection;

import java.util.*;

/**
 * @author yj
 * @date: 2018/5/29
 * @time: 15:12
 * @Description:
 */
public class testcollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("刘备", "32");
        map.put("关羽", "22");
        map.put("张飞", "21");

        Set<String> strings = map.keySet();
        for (String key : strings) {
            String v = map.get(key);
            System.out.println(key + "..." + v);
        }

    }


}
