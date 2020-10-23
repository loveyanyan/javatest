package com.djcps.test.arraytest;


import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * FileName: ArraysTest
 *
 * @author :   JJ
 * @date: 2020/10/16 16:40
 * @description: TODO
 * @version: 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 8, 9, 0, 3};
        String[] b = {"32","afsd","价格考虑到","第三个","(","s","f","+"};
        String[][] c= {{"32","afsd","价格考虑到","第三个","(","s","f","+"},{"32","afsd","价格考虑到","第三个","(","s","f","+"}};
        int[][]d = {{1, 2, 4, 6, 8, 9, 0, 3},{1, 2, 4, 6, 8, 9, 0, 3}};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(deepToString(c));
        System.out.println();
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.deepToString(d));
        sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }

    }
}
