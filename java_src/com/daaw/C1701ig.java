package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.daaw.ig */
/* loaded from: classes.dex */
public final class C1701ig {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m19849a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m19848b(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m19847c(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m19848b(tArr[0]) : m19849a();
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m19846d(K k, V v, K k2, V v2, K k3, V v3) {
        Map m19842h = m19842h(3, false);
        m19842h.put(k, v);
        m19842h.put(k2, v2);
        m19842h.put(k3, v3);
        return Collections.unmodifiableMap(m19842h);
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m19845e(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length != 0) {
            if (length != 1) {
                Map m19842h = m19842h(length, false);
                for (int i = 0; i < kArr.length; i++) {
                    m19842h.put(kArr[i], vArr[i]);
                }
                return Collections.unmodifiableMap(m19842h);
            }
            return Collections.singletonMap(kArr[0], vArr[0]);
        } else {
            return Collections.emptyMap();
        }
    }

    @Deprecated
    /* renamed from: f */
    public static <T> Set<T> m19844f(T t, T t2, T t3) {
        Set m19841i = m19841i(3, false);
        m19841i.add(t);
        m19841i.add(t2);
        m19841i.add(t3);
        return Collections.unmodifiableSet(m19841i);
    }

    @Deprecated
    /* renamed from: g */
    public static <T> Set<T> m19843g(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t = tArr[0];
                    T t2 = tArr[1];
                    Set m19841i = m19841i(2, false);
                    m19841i.add(t);
                    m19841i.add(t2);
                    return Collections.unmodifiableSet(m19841i);
                } else if (length != 3) {
                    if (length != 4) {
                        Set m19841i2 = m19841i(length, false);
                        Collections.addAll(m19841i2, tArr);
                        return Collections.unmodifiableSet(m19841i2);
                    }
                    T t3 = tArr[0];
                    T t4 = tArr[1];
                    T t5 = tArr[2];
                    T t6 = tArr[3];
                    Set m19841i3 = m19841i(4, false);
                    m19841i3.add(t3);
                    m19841i3.add(t4);
                    m19841i3.add(t5);
                    m19841i3.add(t6);
                    return Collections.unmodifiableSet(m19841i3);
                } else {
                    return m19844f(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    /* renamed from: h */
    public static Map m19842h(int i, boolean z) {
        return i <= 256 ? new C1370g6(i) : new HashMap(i, 1.0f);
    }

    /* renamed from: i */
    public static Set m19841i(int i, boolean z) {
        return i <= (true != z ? 256 : 128) ? new C1798j6(i) : new HashSet(i, true != z ? 1.0f : 0.75f);
    }
}
