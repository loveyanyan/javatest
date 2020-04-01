package com.djcps.test.forTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yj
 * @date: 2018/12/21
 * @time: 10:23
 * @Description:
 */
public class forTest {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("郭靖");
        nameList.add("黄蓉");
        nameList.add("乔峰");
        nameList.add("扫地僧");
        System.out.println(nameList);
        System.out.println("-----------------------------------");
        for (int i = 1; i <= nameList.size(); i = i + 1) {
            String name1 = nameList.get(i - 1);
            System.out.println(name1);
            if (i == nameList.size()) {
                System.out.println(i - 1);
            }
        }
    }
}
