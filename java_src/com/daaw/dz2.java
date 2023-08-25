package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class dz2 {

    /* renamed from: a */
    public int f8000a;

    /* renamed from: b */
    public long[] f8001b = new long[32];

    public dz2(int i) {
    }

    /* renamed from: a */
    public final int m23806a() {
        return this.f8000a;
    }

    /* renamed from: b */
    public final long m23805b(int i) {
        if (i < 0 || i >= this.f8000a) {
            int i2 = this.f8000a;
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
        }
        return this.f8001b[i];
    }

    /* renamed from: c */
    public final void m23804c(long j) {
        int i = this.f8000a;
        long[] jArr = this.f8001b;
        if (i == jArr.length) {
            this.f8001b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f8001b;
        int i2 = this.f8000a;
        this.f8000a = i2 + 1;
        jArr2[i2] = j;
    }
}
