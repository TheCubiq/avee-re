package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class k37 {
    /* renamed from: a */
    public static Object m18059a(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m18058b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m18059a(objArr[i2], i2);
        }
        return objArr;
    }
}
