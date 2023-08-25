package com.daaw;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class pg extends og {
    public static final <T> boolean i(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ug0.f(collection, "<this>");
        ug0.f(iterable, "elements");
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
