package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class rl0 {
    public int a;
    public long[] b;

    public rl0() {
        this(32);
    }

    public rl0(int i) {
        this.b = new long[i];
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public long b(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
        }
        return this.b[i];
    }

    public int c() {
        return this.a;
    }

    public long[] d() {
        return Arrays.copyOf(this.b, this.a);
    }
}
