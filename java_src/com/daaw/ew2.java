package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public final class ew2 {
    public int i;
    public int j;
    public int k;
    public int l;
    public zzatd q;
    public int a = 1000;
    public int[] b = new int[1000];
    public long[] c = new long[1000];
    public long[] f = new long[1000];
    public int[] e = new int[1000];
    public int[] d = new int[1000];
    public vs2[] g = new vs2[1000];
    public zzatd[] h = new zzatd[1000];
    public long m = Long.MIN_VALUE;
    public long n = Long.MIN_VALUE;
    public boolean p = true;
    public boolean o = true;

    public final int a() {
        return this.j + this.i;
    }

    public final synchronized int b(cq2 cq2Var, bs2 bs2Var, boolean z, boolean z2, zzatd zzatdVar, dw2 dw2Var) {
        if (!l()) {
            if (z2) {
                bs2Var.c(4);
                return -4;
            }
            zzatd zzatdVar2 = this.q;
            if (zzatdVar2 == null || (!z && zzatdVar2 == zzatdVar)) {
                return -3;
            }
            cq2Var.a = zzatdVar2;
            return -5;
        }
        if (!z) {
            zzatd[] zzatdVarArr = this.h;
            int i = this.k;
            if (zzatdVarArr[i] == zzatdVar) {
                if (bs2Var.c != null) {
                    bs2Var.d = this.f[i];
                    bs2Var.c(this.e[i]);
                    int[] iArr = this.d;
                    int i2 = this.k;
                    dw2Var.a = iArr[i2];
                    dw2Var.b = this.c[i2];
                    dw2Var.d = this.g[i2];
                    this.m = Math.max(this.m, bs2Var.d);
                    int i3 = this.i - 1;
                    this.i = i3;
                    int i4 = this.k + 1;
                    this.k = i4;
                    this.j++;
                    if (i4 == this.a) {
                        this.k = 0;
                        i4 = 0;
                    }
                    dw2Var.c = i3 > 0 ? this.c[i4] : dw2Var.b + dw2Var.a;
                    return -4;
                }
                return -3;
            }
        }
        cq2Var.a = this.h[this.k];
        return -5;
    }

    public final synchronized long c() {
        return Math.max(this.m, this.n);
    }

    public final synchronized long d() {
        if (l()) {
            int i = this.k;
            int i2 = this.i;
            int i3 = i + i2;
            int i4 = this.a;
            int i5 = (i3 - 1) % i4;
            this.k = i3 % i4;
            this.j += i2;
            this.i = 0;
            return this.c[i5] + this.d[i5];
        }
        return -1L;
    }

    public final synchronized long e(long j, boolean z) {
        if (l()) {
            long[] jArr = this.f;
            int i = this.k;
            if (j >= jArr[i]) {
                int i2 = 0;
                if (j <= this.n || z) {
                    int i3 = -1;
                    while (i != this.l && this.f[i] <= j) {
                        if (1 == (this.e[i] & 1)) {
                            i3 = i2;
                        }
                        i = (i + 1) % this.a;
                        i2++;
                    }
                    if (i3 == -1) {
                        return -1L;
                    }
                    int i4 = (this.k + i3) % this.a;
                    this.k = i4;
                    this.j += i3;
                    this.i -= i3;
                    return this.c[i4];
                }
                return -1L;
            }
        }
        return -1L;
    }

    public final synchronized zzatd f() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final void g() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.i = 0;
        this.o = true;
    }

    public final synchronized void h(long j, int i, long j2, int i2, vs2 vs2Var) {
        if (this.o) {
            if ((i & 1) == 0) {
                return;
            }
            this.o = false;
        }
        az2.e(!this.p);
        i(j);
        long[] jArr = this.f;
        int i3 = this.l;
        jArr[i3] = j;
        long[] jArr2 = this.c;
        jArr2[i3] = j2;
        this.d[i3] = i2;
        this.e[i3] = i;
        this.g[i3] = vs2Var;
        this.h[i3] = this.q;
        this.b[i3] = 0;
        int i4 = this.i + 1;
        this.i = i4;
        int i5 = this.a;
        if (i4 != i5) {
            int i6 = i3 + 1;
            this.l = i6;
            if (i6 == i5) {
                this.l = 0;
                return;
            }
            return;
        }
        int i7 = i5 + 1000;
        int[] iArr = new int[i7];
        long[] jArr3 = new long[i7];
        long[] jArr4 = new long[i7];
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        vs2[] vs2VarArr = new vs2[i7];
        zzatd[] zzatdVarArr = new zzatd[i7];
        int i8 = this.k;
        int i9 = i5 - i8;
        System.arraycopy(jArr2, i8, jArr3, 0, i9);
        System.arraycopy(this.f, this.k, jArr4, 0, i9);
        System.arraycopy(this.e, this.k, iArr2, 0, i9);
        System.arraycopy(this.d, this.k, iArr3, 0, i9);
        System.arraycopy(this.g, this.k, vs2VarArr, 0, i9);
        System.arraycopy(this.h, this.k, zzatdVarArr, 0, i9);
        System.arraycopy(this.b, this.k, iArr, 0, i9);
        int i10 = this.k;
        System.arraycopy(this.c, 0, jArr3, i9, i10);
        System.arraycopy(this.f, 0, jArr4, i9, i10);
        System.arraycopy(this.e, 0, iArr2, i9, i10);
        System.arraycopy(this.d, 0, iArr3, i9, i10);
        System.arraycopy(this.g, 0, vs2VarArr, i9, i10);
        System.arraycopy(this.h, 0, zzatdVarArr, i9, i10);
        System.arraycopy(this.b, 0, iArr, i9, i10);
        this.c = jArr3;
        this.f = jArr4;
        this.e = iArr2;
        this.d = iArr3;
        this.g = vs2VarArr;
        this.h = zzatdVarArr;
        this.b = iArr;
        this.k = 0;
        int i11 = this.a;
        this.l = i11;
        this.i = i11;
        this.a = i7;
    }

    public final synchronized void i(long j) {
        this.n = Math.max(this.n, j);
    }

    public final void j() {
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final synchronized boolean k(zzatd zzatdVar) {
        if (zzatdVar == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (pz2.o(zzatdVar, this.q)) {
            return false;
        }
        this.q = zzatdVar;
        return true;
    }

    public final synchronized boolean l() {
        return this.i != 0;
    }
}
