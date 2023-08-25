package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class jg {
    public static final <T> Object[] a(T[] tArr, boolean z) {
        ug0.f(tArr, "<this>");
        if (z && ug0.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        ug0.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static final <T> List<T> b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        ug0.e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
