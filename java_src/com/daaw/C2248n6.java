package com.daaw;

import java.util.List;
/* renamed from: com.daaw.n6 */
/* loaded from: classes2.dex */
public class C2248n6 extends C2153m6 {
    /* renamed from: a */
    public static final <T> List<T> m15512a(T[] tArr) {
        ug0.m8268f(tArr, "<this>");
        List<T> m13618a = C2518p6.m13618a(tArr);
        ug0.m8269e(m13618a, "asList(this)");
        return m13618a;
    }

    /* renamed from: b */
    public static final <T> T[] m15511b(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        ug0.m8268f(tArr, "<this>");
        ug0.m8268f(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: c */
    public static /* synthetic */ Object[] m15510c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m15511b(objArr, objArr2, i, i2, i3);
    }
}
