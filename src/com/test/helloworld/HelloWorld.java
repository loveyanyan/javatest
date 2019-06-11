package com.test.helloworld;

import java.util.LinkedList;

/**
 * @author yj
 * @date: 2018/5/9
 * @time: 13:40
 * @Description:
 */
public class HelloWorld {
    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        list.add("a");
        list.add(1,"b" );
        System.out.println(list.get(0));
        System.out.println(list.get(1));
       /* System.out.println(list.get(2));*/


    }
}
