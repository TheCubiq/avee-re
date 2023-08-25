package com.daaw;

import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class wo8 {
    public long a;
    public long b;
    public boolean c;

    public final long a(f92 f92Var) {
        return d(f92Var.z);
    }

    public final long b(f92 f92Var, ma7 ma7Var) {
        if (this.b == 0) {
            this.a = ma7Var.e;
        }
        if (this.c) {
            return ma7Var.e;
        }
        ByteBuffer byteBuffer = ma7Var.c;
        Objects.requireNonNull(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int c = z32.c(i);
        if (c != -1) {
            long d = d(f92Var.z);
            this.b += c;
            return d;
        }
        this.c = true;
        this.b = 0L;
        this.a = ma7Var.e;
        s95.e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return ma7Var.e;
    }

    public final void c() {
        this.a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public final long d(long j) {
        return this.a + Math.max(0L, ((this.b - 529) * 1000000) / j);
    }
}
