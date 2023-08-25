package com.daaw;

import com.daaw.da1;
import com.daaw.tq0;
/* loaded from: classes.dex */
public final class jj implements tq0.b {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;

    public jj(long j, long j2, yq0 yq0Var) {
        long b;
        this.a = j2;
        this.b = yq0Var.c;
        this.d = yq0Var.f;
        if (j == -1) {
            this.c = -1L;
            b = -9223372036854775807L;
        } else {
            this.c = j - j2;
            b = b(j);
        }
        this.e = b;
    }

    @Override // com.daaw.tq0.b
    public long b(long j) {
        return ((Math.max(0L, j - this.a) * 1000000) * 8) / this.d;
    }

    @Override // com.daaw.da1
    public boolean e() {
        return this.c != -1;
    }

    @Override // com.daaw.da1
    public da1.a g(long j) {
        long j2 = this.c;
        if (j2 == -1) {
            return new da1.a(new fa1(0L, this.a));
        }
        int i = this.b;
        long m = sq1.m((((this.d * j) / 8000000) / i) * i, 0L, j2 - i);
        long j3 = this.a + m;
        long b = b(j3);
        fa1 fa1Var = new fa1(b, j3);
        if (b < j) {
            long j4 = this.c;
            int i2 = this.b;
            if (m != j4 - i2) {
                long j5 = j3 + i2;
                return new da1.a(fa1Var, new fa1(b(j5), j5));
            }
        }
        return new da1.a(fa1Var);
    }

    @Override // com.daaw.da1
    public long h() {
        return this.e;
    }
}
