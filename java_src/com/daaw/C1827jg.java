package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.jg */
/* loaded from: classes2.dex */
public class C1827jg {
    /* renamed from: a */
    public static final <T> Object[] m18531a(T[] tArr, boolean z) {
        ug0.m8268f(tArr, "<this>");
        if (z && ug0.m8273a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        ug0.m8269e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: b */
    public static final <T> List<T> m18530b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        ug0.m8269e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
