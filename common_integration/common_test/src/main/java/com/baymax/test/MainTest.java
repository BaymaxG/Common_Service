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
}
