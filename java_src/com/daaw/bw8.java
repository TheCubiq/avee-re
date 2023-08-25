package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class bw8 {
    public Object[] a = new Object[8];
    public int b = 0;
    public xu8 c;

    public final bw8 a(Object obj, Object obj2) {
        int i = this.b + 1;
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i3);
        }
        rm8.a(obj, obj2);
        Object[] objArr2 = this.a;
        int i4 = this.b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.b = i4 + 1;
        return this;
    }

    public final ix8 b() {
        xu8 xu8Var = this.c;
        if (xu8Var == null) {
            h92 f = h92.f(this.b, this.a, this);
            xu8 xu8Var2 = this.c;
            if (xu8Var2 == null) {
                return f;
            }
            throw xu8Var2.a();
        }
        throw xu8Var.a();
    }
}
