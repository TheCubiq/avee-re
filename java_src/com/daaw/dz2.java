package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class dz2 {
    public int a;
    public long[] b = new long[32];

    public dz2(int i) {
    }

    public final int a() {
        return this.a;
    }

    public final long b(int i) {
        if (i < 0 || i >= this.a) {
            int i2 = this.a;
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
        }
        return this.b[i];
    }

    public final void c(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }
}
