package com.daaw;
/* loaded from: classes.dex */
public final class ae2 implements zd2 {
    public final m09 a;
    public final m42 b;
    public final ce2 c;
    public final f92 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public ae2(m09 m09Var, m42 m42Var, ce2 ce2Var, String str, int i) {
        this.a = m09Var;
        this.b = m42Var;
        this.c = ce2Var;
        int i2 = (ce2Var.b * ce2Var.e) / 8;
        int i3 = ce2Var.d;
        if (i3 != i2) {
            throw dl3.a("Expected block size: " + i2 + "; got: " + i3, null);
        }
        int i4 = ce2Var.c * i2;
        int i5 = i4 * 8;
        int max = Math.max(i2, i4 / 10);
        this.e = max;
        b72 b72Var = new b72();
        b72Var.s(str);
        b72Var.d0(i5);
        b72Var.o(i5);
        b72Var.l(max);
        b72Var.e0(ce2Var.b);
        b72Var.t(ce2Var.c);
        b72Var.n(i);
        this.d = b72Var.y();
    }

    @Override // com.daaw.zd2
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // com.daaw.zd2
    public final void b(int i, long j) {
        this.a.i(new je2(this.c, 1, i, j));
        this.b.f(this.d);
    }

    @Override // com.daaw.zd2
    public final boolean c(k09 k09Var, long j) {
        ce2 ce2Var;
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.g) < (i2 = this.e)) {
            int a = k42.a(this.b, k09Var, (int) Math.min(i2 - i, j3), true);
            if (a == -1) {
                j3 = 0;
            } else {
                this.g += a;
                j3 -= a;
            }
        }
        int i3 = this.c.d;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j4 = this.f;
            long g0 = it5.g0(this.h, 1000000L, ce2Var.c);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.b(j4 + g0, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
