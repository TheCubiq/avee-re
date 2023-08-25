package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class sp2 {
    public final wv2 a;
    public final Object b;
    public final int c;
    public final iw2[] d;
    public final boolean[] e;
    public final long f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public sp2 l;
    public gx2 m;
    public final gq2[] n;
    public final hq2[] o;
    public final fx2 p;
    public final yv2 q;
    public gx2 r;
    public final y34 s;

    public sp2(gq2[] gq2VarArr, hq2[] hq2VarArr, long j, fx2 fx2Var, y34 y34Var, yv2 yv2Var, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.n = gq2VarArr;
        this.o = hq2VarArr;
        this.f = j;
        this.p = fx2Var;
        this.s = y34Var;
        this.q = yv2Var;
        Objects.requireNonNull(obj);
        this.b = obj;
        this.c = i;
        this.g = i2;
        this.i = z;
        this.h = j2;
        this.d = new iw2[2];
        this.e = new boolean[2];
        this.a = yv2Var.c(i2, y34Var.l());
    }

    public final long a(long j, boolean z) {
        return b(j, false, new boolean[2]);
    }

    public final long b(long j, boolean z, boolean[] zArr) {
        dx2 dx2Var = this.m.b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.e;
            if (z || !this.m.a(this.r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long g = this.a.g(dx2Var.b(), this.e, this.d, zArr, j);
        this.r = this.m;
        this.k = false;
        int i2 = 0;
        while (true) {
            iw2[] iw2VarArr = this.d;
            if (i2 >= 2) {
                this.s.d(this.n, this.m.a, dx2Var);
                return g;
            }
            if (iw2VarArr[i2] != null) {
                az2.e(dx2Var.a(i2) != null);
                this.k = true;
            } else {
                az2.e(dx2Var.a(i2) == null);
            }
            i2++;
        }
    }

    public final void c() {
        try {
            this.q.a(this.a);
        } catch (RuntimeException unused) {
        }
    }

    public final boolean d() {
        return this.j && (!this.k || this.a.zzg() == Long.MIN_VALUE);
    }

    public final boolean e() {
        gx2 a = this.p.a(this.o, this.a.zzn());
        gx2 gx2Var = this.r;
        if (gx2Var != null) {
            for (int i = 0; i < 2; i++) {
                if (a.a(gx2Var, i)) {
                }
            }
            return false;
        }
        this.m = a;
        return true;
    }
}
