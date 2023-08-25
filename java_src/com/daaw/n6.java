package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public class n6 extends m6 {
    public static final <T> List<T> a(T[] tArr) {
        ug0.f(tArr, "<this>");
        List<T> a = p6.a(tArr);
        ug0.e(a, "asList(this)");
        return a;
    }

    public static final <T> T[] b(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        ug0.f(tArr, "<this>");
        ug0.f(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return b(objArr, objArr2, i, i2, i3);
    }
}
