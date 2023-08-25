package com.daaw;

import java.util.Objects;
/* renamed from: com.daaw.h6 */
/* loaded from: classes2.dex */
public class C1507h6<T> {

    /* renamed from: a */
    public Object[] f12076a = new Object[16];

    /* renamed from: b */
    public int f12077b;

    /* renamed from: c */
    public int f12078c;

    /* renamed from: a */
    public final void m21001a(T t) {
        Object[] objArr = this.f12076a;
        int i = this.f12078c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f12078c = length;
        if (length == this.f12077b) {
            m21000b();
        }
    }

    /* renamed from: b */
    public final void m21000b() {
        Object[] objArr = this.f12076a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C2248n6.m15510c(objArr, objArr2, 0, this.f12077b, 0, 10, null);
        Object[] objArr3 = this.f12076a;
        int length2 = objArr3.length;
        int i = this.f12077b;
        C2248n6.m15510c(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.f12076a = objArr2;
        this.f12077b = 0;
        this.f12078c = length;
    }

    /* renamed from: c */
    public final boolean m20999c() {
        return this.f12077b == this.f12078c;
    }

    /* renamed from: d */
    public final T m20998d() {
        int i = this.f12077b;
        if (i == this.f12078c) {
            return null;
        }
        Object[] objArr = this.f12076a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f12077b = (i + 1) & (objArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
