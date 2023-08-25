package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public final class ew2 {

    /* renamed from: i */
    public int f8877i;

    /* renamed from: j */
    public int f8878j;

    /* renamed from: k */
    public int f8879k;

    /* renamed from: l */
    public int f8880l;

    /* renamed from: q */
    public zzatd f8885q;

    /* renamed from: a */
    public int f8869a = 1000;

    /* renamed from: b */
    public int[] f8870b = new int[1000];

    /* renamed from: c */
    public long[] f8871c = new long[1000];

    /* renamed from: f */
    public long[] f8874f = new long[1000];

    /* renamed from: e */
    public int[] f8873e = new int[1000];

    /* renamed from: d */
    public int[] f8872d = new int[1000];

    /* renamed from: g */
    public vs2[] f8875g = new vs2[1000];

    /* renamed from: h */
    public zzatd[] f8876h = new zzatd[1000];

    /* renamed from: m */
    public long f8881m = Long.MIN_VALUE;

    /* renamed from: n */
    public long f8882n = Long.MIN_VALUE;

    /* renamed from: p */
    public boolean f8884p = true;

    /* renamed from: o */
    public boolean f8883o = true;

    /* renamed from: a */
    public final int m23100a() {
        return this.f8878j + this.f8877i;
    }

    /* renamed from: b */
    public final synchronized int m23099b(cq2 cq2Var, bs2 bs2Var, boolean z, boolean z2, zzatd zzatdVar, dw2 dw2Var) {
        if (!m23089l()) {
            if (z2) {
                bs2Var.m5836c(4);
                return -4;
            }
            zzatd zzatdVar2 = this.f8885q;
            if (zzatdVar2 == null || (!z && zzatdVar2 == zzatdVar)) {
                return -3;
            }
            cq2Var.f6080a = zzatdVar2;
            return -5;
        }
        if (!z) {
            zzatd[] zzatdVarArr = this.f8876h;
            int i = this.f8879k;
            if (zzatdVarArr[i] == zzatdVar) {
                if (bs2Var.f5093c != null) {
                    bs2Var.f5094d = this.f8874f[i];
                    bs2Var.m5836c(this.f8873e[i]);
                    int[] iArr = this.f8872d;
                    int i2 = this.f8879k;
                    dw2Var.f7935a = iArr[i2];
                    dw2Var.f7936b = this.f8871c[i2];
                    dw2Var.f7938d = this.f8875g[i2];
                    this.f8881m = Math.max(this.f8881m, bs2Var.f5094d);
                    int i3 = this.f8877i - 1;
                    this.f8877i = i3;
                    int i4 = this.f8879k + 1;
                    this.f8879k = i4;
                    this.f8878j++;
                    if (i4 == this.f8869a) {
                        this.f8879k = 0;
                        i4 = 0;
                    }
                    dw2Var.f7937c = i3 > 0 ? this.f8871c[i4] : dw2Var.f7936b + dw2Var.f7935a;
                    return -4;
                }
                return -3;
            }
        }
        cq2Var.f6080a = this.f8876h[this.f8879k];
        return -5;
    }

    /* renamed from: c */
    public final synchronized long m23098c() {
        return Math.max(this.f8881m, this.f8882n);
    }

    /* renamed from: d */
    public final synchronized long m23097d() {
        if (m23089l()) {
            int i = this.f8879k;
            int i2 = this.f8877i;
            int i3 = i + i2;
            int i4 = this.f8869a;
            int i5 = (i3 - 1) % i4;
            this.f8879k = i3 % i4;
            this.f8878j += i2;
            this.f8877i = 0;
            return this.f8871c[i5] + this.f8872d[i5];
        }
        return -1L;
    }

    /* renamed from: e */
    public final synchronized long m23096e(long j, boolean z) {
        if (m23089l()) {
            long[] jArr = this.f8874f;
            int i = this.f8879k;
            if (j >= jArr[i]) {
                int i2 = 0;
                if (j <= this.f8882n || z) {
                    int i3 = -1;
                    while (i != this.f8880l && this.f8874f[i] <= j) {
                        if (1 == (this.f8873e[i] & 1)) {
                            i3 = i2;
                        }
                        i = (i + 1) % this.f8869a;
                        i2++;
                    }
                    if (i3 == -1) {
                        return -1L;
                    }
                    int i4 = (this.f8879k + i3) % this.f8869a;
                    this.f8879k = i4;
                    this.f8878j += i3;
                    this.f8877i -= i3;
                    return this.f8871c[i4];
                }
                return -1L;
            }
        }
        return -1L;
    }

    /* renamed from: f */
    public final synchronized zzatd m23095f() {
        if (this.f8884p) {
            return null;
        }
        return this.f8885q;
    }

    /* renamed from: g */
    public final void m23094g() {
        this.f8878j = 0;
        this.f8879k = 0;
        this.f8880l = 0;
        this.f8877i = 0;
        this.f8883o = true;
    }

    /* renamed from: h */
    public final synchronized void m23093h(long j, int i, long j2, int i2, vs2 vs2Var) {
        if (this.f8883o) {
            if ((i & 1) == 0) {
                return;
            }
            this.f8883o = false;
        }
        az2.m26583e(!this.f8884p);
        m23092i(j);
        long[] jArr = this.f8874f;
        int i3 = this.f8880l;
        jArr[i3] = j;
        long[] jArr2 = this.f8871c;
        jArr2[i3] = j2;
        this.f8872d[i3] = i2;
        this.f8873e[i3] = i;
        this.f8875g[i3] = vs2Var;
        this.f8876h[i3] = this.f8885q;
        this.f8870b[i3] = 0;
        int i4 = this.f8877i + 1;
        this.f8877i = i4;
        int i5 = this.f8869a;
        if (i4 != i5) {
            int i6 = i3 + 1;
            this.f8880l = i6;
            if (i6 == i5) {
                this.f8880l = 0;
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
        int i8 = this.f8879k;
        int i9 = i5 - i8;
        System.arraycopy(jArr2, i8, jArr3, 0, i9);
        System.arraycopy(this.f8874f, this.f8879k, jArr4, 0, i9);
        System.arraycopy(this.f8873e, this.f8879k, iArr2, 0, i9);
        System.arraycopy(this.f8872d, this.f8879k, iArr3, 0, i9);
        System.arraycopy(this.f8875g, this.f8879k, vs2VarArr, 0, i9);
        System.arraycopy(this.f8876h, this.f8879k, zzatdVarArr, 0, i9);
        System.arraycopy(this.f8870b, this.f8879k, iArr, 0, i9);
        int i10 = this.f8879k;
        System.arraycopy(this.f8871c, 0, jArr3, i9, i10);
        System.arraycopy(this.f8874f, 0, jArr4, i9, i10);
        System.arraycopy(this.f8873e, 0, iArr2, i9, i10);
        System.arraycopy(this.f8872d, 0, iArr3, i9, i10);
        System.arraycopy(this.f8875g, 0, vs2VarArr, i9, i10);
        System.arraycopy(this.f8876h, 0, zzatdVarArr, i9, i10);
        System.arraycopy(this.f8870b, 0, iArr, i9, i10);
        this.f8871c = jArr3;
        this.f8874f = jArr4;
        this.f8873e = iArr2;
        this.f8872d = iArr3;
        this.f8875g = vs2VarArr;
        this.f8876h = zzatdVarArr;
        this.f8870b = iArr;
        this.f8879k = 0;
        int i11 = this.f8869a;
        this.f8880l = i11;
        this.f8877i = i11;
        this.f8869a = i7;
    }

    /* renamed from: i */
    public final synchronized void m23092i(long j) {
        this.f8882n = Math.max(this.f8882n, j);
    }

    /* renamed from: j */
    public final void m23091j() {
        this.f8881m = Long.MIN_VALUE;
        this.f8882n = Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final synchronized boolean m23090k(zzatd zzatdVar) {
        if (zzatdVar == null) {
            this.f8884p = true;
            return false;
        }
        this.f8884p = false;
        if (pz2.m12835o(zzatdVar, this.f8885q)) {
            return false;
        }
        this.f8885q = zzatdVar;
        return true;
    }

    /* renamed from: l */
    public final synchronized boolean m23089l() {
        return this.f8877i != 0;
    }
}
