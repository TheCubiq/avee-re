package com.daaw;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class bn0 extends an0 {
    public static final <K, V> Map<K, V> d() {
        qw qwVar = qw.p;
        ug0.d(qwVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return qwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        ug0.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : an0.c(map) : d();
    }

    public static final <K, V> void f(Map<? super K, ? super V> map, Iterable<? extends nv0<? extends K, ? extends V>> iterable) {
        ug0.f(map, "<this>");
        ug0.f(iterable, "pairs");
        for (nv0<? extends K, ? extends V> nv0Var : iterable) {
            map.put((K) nv0Var.a(), (V) nv0Var.b());
        }
    }

    public static final <K, V> Map<K, V> g(Iterable<? extends nv0<? extends K, ? extends V>> iterable) {
        ug0.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return h(iterable, new LinkedHashMap(an0.a(collection.size())));
                }
                return an0.b(iterable instanceof List ? (nv0<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return d();
        }
        return e(h(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h(Iterable<? extends nv0<? extends K, ? extends V>> iterable, M m) {
        ug0.f(iterable, "<this>");
        ug0.f(m, "destination");
        f(m, iterable);
        return m;
    }

    public static final <K, V> Map<K, V> i(Map<? extends K, ? extends V> map) {
        ug0.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? j(map) : an0.c(map) : d();
    }

    public static final <K, V> Map<K, V> j(Map<? extends K, ? extends V> map) {
        ug0.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
