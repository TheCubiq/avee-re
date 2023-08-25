package com.daaw;
/* loaded from: classes.dex */
public final class ae2 implements zd2 {

    /* renamed from: a */
    public final m09 f3124a;

    /* renamed from: b */
    public final m42 f3125b;

    /* renamed from: c */
    public final ce2 f3126c;

    /* renamed from: d */
    public final f92 f3127d;

    /* renamed from: e */
    public final int f3128e;

    /* renamed from: f */
    public long f3129f;

    /* renamed from: g */
    public int f3130g;

    /* renamed from: h */
    public long f3131h;

    public ae2(m09 m09Var, m42 m42Var, ce2 ce2Var, String str, int i) {
        this.f3124a = m09Var;
        this.f3125b = m42Var;
        this.f3126c = ce2Var;
        int i2 = (ce2Var.f5754b * ce2Var.f5757e) / 8;
        int i3 = ce2Var.f5756d;
        if (i3 != i2) {
            throw dl3.m24267a("Expected block size: " + i2 + "; got: " + i3, null);
        }
        int i4 = ce2Var.f5755c * i2;
        int i5 = i4 * 8;
        int max = Math.max(i2, i4 / 10);
        this.f3128e = max;
        b72 b72Var = new b72();
        b72Var.m26372s(str);
        b72Var.m26391d0(i5);
        b72Var.m26376o(i5);
        b72Var.m26379l(max);
        b72Var.m26389e0(ce2Var.f5754b);
        b72Var.m26371t(ce2Var.f5755c);
        b72Var.m26377n(i);
        this.f3127d = b72Var.m26366y();
    }

    @Override // com.daaw.zd2
    /* renamed from: a */
    public final void mo2467a(long j) {
        this.f3129f = j;
        this.f3130g = 0;
        this.f3131h = 0L;
    }

    @Override // com.daaw.zd2
    /* renamed from: b */
    public final void mo2466b(int i, long j) {
        this.f3124a.mo3297i(new je2(this.f3126c, 1, i, j));
        this.f3125b.mo16218f(this.f3127d);
    }

    @Override // com.daaw.zd2
    /* renamed from: c */
    public final boolean mo2465c(k09 k09Var, long j) {
        ce2 ce2Var;
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.f3130g) < (i2 = this.f3128e)) {
            int m18051a = k42.m18051a(this.f3125b, k09Var, (int) Math.min(i2 - i, j3), true);
            if (m18051a == -1) {
                j3 = 0;
            } else {
                this.f3130g += m18051a;
                j3 -= m18051a;
            }
        }
        int i3 = this.f3126c.f5756d;
        int i4 = this.f3130g / i3;
        if (i4 > 0) {
            long j4 = this.f3129f;
            long m19392g0 = it5.m19392g0(this.f3131h, 1000000L, ce2Var.f5755c);
            int i5 = i4 * i3;
            int i6 = this.f3130g - i5;
            this.f3125b.mo16222b(j4 + m19392g0, 1, i5, i6, null);
            this.f3131h += i4;
            this.f3130g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
