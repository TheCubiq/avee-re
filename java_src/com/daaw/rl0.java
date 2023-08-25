package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class rl0 {

    /* renamed from: a */
    public int f25401a;

    /* renamed from: b */
    public long[] f25402b;

    public rl0() {
        this(32);
    }

    public rl0(int i) {
        this.f25402b = new long[i];
    }

    /* renamed from: a */
    public void m11204a(long j) {
        int i = this.f25401a;
        long[] jArr = this.f25402b;
        if (i == jArr.length) {
            this.f25402b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f25402b;
        int i2 = this.f25401a;
        this.f25401a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long m11203b(int i) {
        if (i < 0 || i >= this.f25401a) {
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f25401a);
        }
        return this.f25402b[i];
    }

    /* renamed from: c */
    public int m11202c() {
        return this.f25401a;
    }

    /* renamed from: d */
    public long[] m11201d() {
        return Arrays.copyOf(this.f25402b, this.f25401a);
    }
}
