package com.daaw;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class bn0 extends an0 {
    /* renamed from: d */
    public static final <K, V> Map<K, V> m25982d() {
        C2787qw c2787qw = C2787qw.f24536p;
        ug0.m8270d(c2787qw, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c2787qw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final <K, V> Map<K, V> m25981e(Map<K, ? extends V> map) {
        ug0.m8268f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : an0.m27333c(map) : m25982d();
    }

    /* renamed from: f */
    public static final <K, V> void m25980f(Map<? super K, ? super V> map, Iterable<? extends nv0<? extends K, ? extends V>> iterable) {
        ug0.m8268f(map, "<this>");
        ug0.m8268f(iterable, "pairs");
        for (nv0<? extends K, ? extends V> nv0Var : iterable) {
            map.put((K) nv0Var.m14779a(), (V) nv0Var.m14778b());
        }
    }

    /* renamed from: g */
    public static final <K, V> Map<K, V> m25979g(Iterable<? extends nv0<? extends K, ? extends V>> iterable) {
        ug0.m8268f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m25978h(iterable, new LinkedHashMap(an0.m27335a(collection.size())));
                }
                return an0.m27334b(iterable instanceof List ? (nv0<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return m25982d();
        }
        return m25981e(m25978h(iterable, new LinkedHashMap()));
    }

    /* renamed from: h */
    public static final <K, V, M extends Map<? super K, ? super V>> M m25978h(Iterable<? extends nv0<? extends K, ? extends V>> iterable, M m) {
        ug0.m8268f(iterable, "<this>");
        ug0.m8268f(m, "destination");
        m25980f(m, iterable);
        return m;
    }

    /* renamed from: i */
    public static final <K, V> Map<K, V> m25977i(Map<? extends K, ? extends V> map) {
        ug0.m8268f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m25976j(map) : an0.m27333c(map) : m25982d();
    }

    /* renamed from: j */
    public static final <K, V> Map<K, V> m25976j(Map<? extends K, ? extends V> map) {
        ug0.m8268f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
