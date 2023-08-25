package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class sg extends rg {
    public static final <T> boolean j(Iterable<? extends T> iterable, T t) {
        ug0.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : k(iterable, t) >= 0;
    }

    public static final <T> int k(Iterable<? extends T> iterable, T t) {
        ug0.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                kg.g();
            }
            if (ug0.a(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T, C extends Collection<? super T>> C l(Iterable<? extends T> iterable, C c) {
        ug0.f(iterable, "<this>");
        ug0.f(c, "destination");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> m(Iterable<? extends T> iterable) {
        ug0.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return o(collection);
                }
                return jg.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return kg.d();
        }
        return kg.f(n(iterable));
    }

    public static final <T> List<T> n(Iterable<? extends T> iterable) {
        ug0.f(iterable, "<this>");
        return iterable instanceof Collection ? o((Collection) iterable) : (List) l(iterable, new ArrayList());
    }

    public static final <T> List<T> o(Collection<? extends T> collection) {
        ug0.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> p(Iterable<? extends T> iterable) {
        ug0.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return (Set) l(iterable, new LinkedHashSet(an0.a(collection.size())));
                }
                return qb1.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return rb1.b();
        }
        return rb1.c((Set) l(iterable, new LinkedHashSet()));
    }

    public static final <T, R> List<nv0<T, R>> q(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        ug0.f(iterable, "<this>");
        ug0.f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(lg.h(iterable, 10), lg.h(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(no1.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
