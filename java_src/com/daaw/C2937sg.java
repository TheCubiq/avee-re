package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.daaw.sg */
/* loaded from: classes2.dex */
public class C2937sg extends C2857rg {
    /* renamed from: j */
    public static final <T> boolean m10381j(Iterable<? extends T> iterable, T t) {
        ug0.m8268f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : m10380k(iterable, t) >= 0;
    }

    /* renamed from: k */
    public static final <T> int m10380k(Iterable<? extends T> iterable, T t) {
        ug0.m8268f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                C1946kg.m17758g();
            }
            if (ug0.m8273a(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: l */
    public static final <T, C extends Collection<? super T>> C m10379l(Iterable<? extends T> iterable, C c) {
        ug0.m8268f(iterable, "<this>");
        ug0.m8268f(c, "destination");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: m */
    public static final <T> List<T> m10378m(Iterable<? extends T> iterable) {
        ug0.m8268f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m10376o(collection);
                }
                return C1827jg.m18530b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return C1946kg.m17761d();
        }
        return C1946kg.m17759f(m10377n(iterable));
    }

    /* renamed from: n */
    public static final <T> List<T> m10377n(Iterable<? extends T> iterable) {
        ug0.m8268f(iterable, "<this>");
        return iterable instanceof Collection ? m10376o((Collection) iterable) : (List) m10379l(iterable, new ArrayList());
    }

    /* renamed from: o */
    public static final <T> List<T> m10376o(Collection<? extends T> collection) {
        ug0.m8268f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: p */
    public static final <T> Set<T> m10375p(Iterable<? extends T> iterable) {
        ug0.m8268f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return (Set) m10379l(iterable, new LinkedHashSet(an0.m27335a(collection.size())));
                }
                return qb1.m12641a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return rb1.m11457b();
        }
        return rb1.m11456c((Set) m10379l(iterable, new LinkedHashSet()));
    }

    /* renamed from: q */
    public static final <T, R> List<nv0<T, R>> m10374q(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        ug0.m8268f(iterable, "<this>");
        ug0.m8268f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C2037lg.m16966h(iterable, 10), C2037lg.m16966h(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(no1.m14903a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
