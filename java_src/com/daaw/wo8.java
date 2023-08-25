package com.daaw;

import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class wo8 {

    /* renamed from: a */
    public long f31428a;

    /* renamed from: b */
    public long f31429b;

    /* renamed from: c */
    public boolean f31430c;

    /* renamed from: a */
    public final long m5884a(f92 f92Var) {
        return m5881d(f92Var.f9289z);
    }

    /* renamed from: b */
    public final long m5883b(f92 f92Var, ma7 ma7Var) {
        if (this.f31429b == 0) {
            this.f31428a = ma7Var.f18730e;
        }
        if (this.f31430c) {
            return ma7Var.f18730e;
        }
        ByteBuffer byteBuffer = ma7Var.f18728c;
        Objects.requireNonNull(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m2862c = z32.m2862c(i);
        if (m2862c != -1) {
            long m5881d = m5881d(f92Var.f9289z);
            this.f31429b += m2862c;
            return m5881d;
        }
        this.f31430c = true;
        this.f31429b = 0L;
        this.f31428a = ma7Var.f18730e;
        s95.m10493e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return ma7Var.f18730e;
    }

    /* renamed from: c */
    public final void m5882c() {
        this.f31428a = 0L;
        this.f31429b = 0L;
        this.f31430c = false;
    }

    /* renamed from: d */
    public final long m5881d(long j) {
        return this.f31428a + Math.max(0L, ((this.f31429b - 529) * 1000000) / j);
    }
}
