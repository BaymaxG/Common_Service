/**
 * Copyright © 2020-2020 BaymaxG.guNingbo
 */

package com.baymax.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guNingbo
 * @since 2020/5/10
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(">>=========================<<");
    }

    public static void test1() {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.forEach(str -> {
            System.out.println(str);
        });
        System.out.println("============");
    }

    private static void myTest(String text) {
        System.out.println(text);
    }
}
