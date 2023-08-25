package com.daaw;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes2.dex */
public class an0 extends zm0 {
    /* renamed from: a */
    public static final int m27335a(int i) {
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

    /* renamed from: b */
    public static final <K, V> Map<K, V> m27334b(nv0<? extends K, ? extends V> nv0Var) {
        ug0.m8268f(nv0Var, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(nv0Var.m14777c(), nv0Var.m14776d());
        ug0.m8269e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m27333c(Map<? extends K, ? extends V> map) {
        ug0.m8268f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        ug0.m8269e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
