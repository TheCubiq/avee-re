package com.daaw;

import java.util.Iterator;
import java.util.Set;
/* loaded from: classes2.dex */
public final class pa2 {
    /* renamed from: a */
    public static int m13536a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
