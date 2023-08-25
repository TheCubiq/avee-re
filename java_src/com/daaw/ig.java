package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class ig {
    @Deprecated
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    @Deprecated
    public static <T> List<T> b(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> c(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : b(tArr[0]) : a();
    }

    public static <K, V> Map<K, V> d(K k, V v, K k2, V v2, K k3, V v3) {
        Map h = h(3, false);
        h.put(k, v);
        h.put(k2, v2);
        h.put(k3, v3);
        return Collections.unmodifiableMap(h);
    }

    public static <K, V> Map<K, V> e(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length != 0) {
            if (length != 1) {
                Map h = h(length, false);
                for (int i = 0; i < kArr.length; i++) {
                    h.put(kArr[i], vArr[i]);
                }
                return Collections.unmodifiableMap(h);
            }
            return Collections.singletonMap(kArr[0], vArr[0]);
        } else {
            return Collections.emptyMap();
        }
    }

    @Deprecated
    public static <T> Set<T> f(T t, T t2, T t3) {
        Set i = i(3, false);
        i.add(t);
        i.add(t2);
        i.add(t3);
        return Collections.unmodifiableSet(i);
    }

    @Deprecated
    public static <T> Set<T> g(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t = tArr[0];
                    T t2 = tArr[1];
                    Set i = i(2, false);
                    i.add(t);
                    i.add(t2);
                    return Collections.unmodifiableSet(i);
                } else if (length != 3) {
                    if (length != 4) {
                        Set i2 = i(length, false);
                        Collections.addAll(i2, tArr);
                        return Collections.unmodifiableSet(i2);
                    }
                    T t3 = tArr[0];
                    T t4 = tArr[1];
                    T t5 = tArr[2];
                    T t6 = tArr[3];
                    Set i3 = i(4, false);
                    i3.add(t3);
                    i3.add(t4);
                    i3.add(t5);
                    i3.add(t6);
                    return Collections.unmodifiableSet(i3);
                } else {
                    return f(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    public static Map h(int i, boolean z) {
        return i <= 256 ? new g6(i) : new HashMap(i, 1.0f);
    }

    public static Set i(int i, boolean z) {
        return i <= (true != z ? 256 : 128) ? new j6(i) : new HashSet(i, true != z ? 1.0f : 0.75f);
    }
}
