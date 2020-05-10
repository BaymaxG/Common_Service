/**
 * Copyright © 2020-2020 BaymaxG.guNingbo
 */

package com.baymax.test;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guNingbo
 * @since 2020/5/10
 */
public class MainTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(System.out::println);
        } else {
            System.out.println("list is null!");
        }
    }

    public static void test1() {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.forEach(System.out::println);
        System.out.println("============");
    }

    public static void test2(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        long count = list.stream().distinct().count();
        System.out.println(count + "\r\n");
        list.forEach(str -> System.out.println(str));
    }

    private static void myTest(String text) {
        System.out.println(text);
    }
}
