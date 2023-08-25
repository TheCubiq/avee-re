package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class ic2 {

    /* renamed from: a */
    public final m42 f13480a;

    /* renamed from: d */
    public final e42 f13483d;

    /* renamed from: e */
    public final byte[] f13484e;

    /* renamed from: f */
    public int f13485f;

    /* renamed from: g */
    public long f13486g;

    /* renamed from: h */
    public long f13487h;

    /* renamed from: l */
    public long f13491l;

    /* renamed from: m */
    public long f13492m;

    /* renamed from: n */
    public boolean f13493n;

    /* renamed from: b */
    public final SparseArray f13481b = new SparseArray();

    /* renamed from: c */
    public final SparseArray f13482c = new SparseArray();

    /* renamed from: i */
    public final hc2 f13488i = new hc2(null);

    /* renamed from: j */
    public final hc2 f13489j = new hc2(null);

    /* renamed from: k */
    public boolean f13490k = false;

    public ic2(m42 m42Var, boolean z, boolean z2) {
        this.f13480a = m42Var;
        byte[] bArr = new byte[128];
        this.f13484e = bArr;
        this.f13483d = new e42(bArr, 0, 0);
    }

    /* renamed from: a */
    public final void m19932a(a42 a42Var) {
        this.f13482c.append(a42Var.f2874a, a42Var);
    }

    /* renamed from: b */
    public final void m19931b(b42 b42Var) {
        this.f13481b.append(b42Var.f4285d, b42Var);
    }

    /* renamed from: c */
    public final void m19930c() {
        this.f13490k = false;
    }

    /* renamed from: d */
    public final void m19929d(long j, int i, long j2) {
        this.f13485f = i;
        this.f13487h = j2;
        this.f13486g = j;
    }

    /* renamed from: e */
    public final boolean m19928e(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f13485f == 9) {
            if (z && this.f13490k) {
                long j2 = this.f13486g;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f13492m;
                if (j3 != -9223372036854775807L) {
                    boolean z4 = this.f13493n;
                    long j4 = this.f13491l;
                    this.f13480a.mo16222b(j3, z4 ? 1 : 0, (int) (j2 - j4), i2, null);
                }
            }
            this.f13491l = this.f13486g;
            this.f13492m = this.f13487h;
            this.f13493n = false;
            this.f13490k = true;
        }
        boolean z5 = this.f13493n;
        int i3 = this.f13485f;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.f13493n = z6;
        return z6;
    }
}
