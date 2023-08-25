package com.daaw;

import java.util.Objects;
/* loaded from: classes2.dex */
public class h6<T> {
    public Object[] a = new Object[16];
    public int b;
    public int c;

    public final void a(T t) {
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.c = length;
        if (length == this.b) {
            b();
        }
    }

    public final void b() {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        n6.c(objArr, objArr2, 0, this.b, 0, 10, null);
        Object[] objArr3 = this.a;
        int length2 = objArr3.length;
        int i = this.b;
        n6.c(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.a = objArr2;
        this.b = 0;
        this.c = length;
    }

    public final boolean c() {
        return this.b == this.c;
    }

    public final T d() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        Object[] objArr = this.a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.b = (i + 1) & (objArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
