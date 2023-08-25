package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class ic2 {
    public final m42 a;
    public final e42 d;
    public final byte[] e;
    public int f;
    public long g;
    public long h;
    public long l;
    public long m;
    public boolean n;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final hc2 i = new hc2(null);
    public final hc2 j = new hc2(null);
    public boolean k = false;

    public ic2(m42 m42Var, boolean z, boolean z2) {
        this.a = m42Var;
        byte[] bArr = new byte[128];
        this.e = bArr;
        this.d = new e42(bArr, 0, 0);
    }

    public final void a(a42 a42Var) {
        this.c.append(a42Var.a, a42Var);
    }

    public final void b(b42 b42Var) {
        this.b.append(b42Var.d, b42Var);
    }

    public final void c() {
        this.k = false;
    }

    public final void d(long j, int i, long j2) {
        this.f = i;
        this.h = j2;
        this.g = j;
    }

    public final boolean e(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f == 9) {
            if (z && this.k) {
                long j2 = this.g;
                int i2 = i + ((int) (j - j2));
                long j3 = this.m;
                if (j3 != -9223372036854775807L) {
                    boolean z4 = this.n;
                    long j4 = this.l;
                    this.a.b(j3, z4 ? 1 : 0, (int) (j2 - j4), i2, null);
                }
            }
            this.l = this.g;
            this.m = this.h;
            this.n = false;
            this.k = true;
        }
        boolean z5 = this.n;
        int i3 = this.f;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.n = z6;
        return z6;
    }
}
