package com.djcps.test.arrayandcollection;

import java.beans.Transient;
import java.util.*;

/**
 * @author yj
 * @date: 2018/5/9
 * @time: 15:26
 * @Description:
 */
public class TestArray {

    public static void main(String[] args) throws Exception {
        /*TestArray.testarr();
        System.out.println("-----------------------");
        TestArray.testmap();
        Transient Entry[];*/
        try {
            System.out.println("正常语句！");
            int i = 1 / 0;
            System.out.println("还正常吗?");
        } catch (Exception e) {
            System.out.println("遇到异常了");
            throw new Exception("尴尬，出问题了");
        }
        System.out.println("你还在吗?");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * arr
     */
    public static void testarr() {
        String[] stringarr = {"hehe", "haha"};
        System.out.println(stringarr.toString());
        List<String> stringList = new ArrayList<>();
        stringList.add("曹操");
        stringList.add("曹植");
        //集合转数组
        String[] strings = stringList.toArray(new String[stringList.size()]);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println(strings.length);
        //数组转集合
        List<String> lists = Arrays.asList(stringarr);
        for (String str : lists) {
            System.out.println(str);
        }
        System.out.println(lists.size());
    }

    /**
     * hashmap
     * <p>
     * key , value    允许null  值
     */
    public static void testmap() {
        //hashmap
        Map<String, String> map = new HashMap<>(16);
        map.put(null, null);
        System.out.println(map.get(null));
    }
}

