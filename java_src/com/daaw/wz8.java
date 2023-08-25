package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public final class wz8 {
    /* renamed from: a */
    public static Object m5677a(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
