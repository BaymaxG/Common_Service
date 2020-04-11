/**
 * Copyright © 2020-2020 BaymaxG.guNingbo
 */

package com.baymax.utils;

import java.util.Collection;

/**
 * @author guNingbo
 * @since 2020/4/5
 */
public class CollectionUtil {
    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
