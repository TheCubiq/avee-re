package com.daaw;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes2.dex */
public class an0 extends zm0 {
    public static final int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(nv0<? extends K, ? extends V> nv0Var) {
        ug0.f(nv0Var, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(nv0Var.c(), nv0Var.d());
        ug0.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        ug0.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        ug0.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
