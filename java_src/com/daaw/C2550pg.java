package com.daaw;

import java.util.Collection;
import java.util.Iterator;
/* renamed from: com.daaw.pg */
/* loaded from: classes2.dex */
public class C2550pg extends C2438og {
    /* renamed from: i */
    public static final <T> boolean m13404i(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ug0.m8268f(collection, "<this>");
        ug0.m8268f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }
}
