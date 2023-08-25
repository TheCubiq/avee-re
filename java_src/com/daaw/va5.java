package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class va5 {

    /* renamed from: a */
    public int f30081a;

    /* renamed from: b */
    public long[] f30082b = new long[32];

    public va5(int i) {
    }

    /* renamed from: a */
    public final int m7300a() {
        return this.f30081a;
    }

    /* renamed from: b */
    public final long m7299b(int i) {
        if (i < 0 || i >= this.f30081a) {
            int i2 = this.f30081a;
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
        }
        return this.f30082b[i];
    }

    /* renamed from: c */
    public final void m7298c(long j) {
        int i = this.f30081a;
        long[] jArr = this.f30082b;
        if (i == jArr.length) {
            this.f30082b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f30082b;
        int i2 = this.f30081a;
        this.f30081a = i2 + 1;
        jArr2[i2] = j;
    }
}
