package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class bw8 {

    /* renamed from: a */
    public Object[] f5237a = new Object[8];

    /* renamed from: b */
    public int f5238b = 0;

    /* renamed from: c */
    public xu8 f5239c;

    /* renamed from: a */
    public final bw8 m25782a(Object obj, Object obj2) {
        int i = this.f5238b + 1;
        int i2 = i + i;
        Object[] objArr = this.f5237a;
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
            this.f5237a = Arrays.copyOf(objArr, i3);
        }
        rm8.m11174a(obj, obj2);
        Object[] objArr2 = this.f5237a;
        int i4 = this.f5238b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f5238b = i4 + 1;
        return this;
    }

    /* renamed from: b */
    public final ix8 m25781b() {
        xu8 xu8Var = this.f5239c;
        if (xu8Var == null) {
            h92 m20927f = h92.m20927f(this.f5238b, this.f5237a, this);
            xu8 xu8Var2 = this.f5239c;
            if (xu8Var2 == null) {
                return m20927f;
            }
            throw xu8Var2.m4497a();
        }
        throw xu8Var.m4497a();
    }
}
