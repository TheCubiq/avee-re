package com.daaw;
/* loaded from: classes.dex */
public final class ob2 implements ac2 {

    /* renamed from: a */
    public final cj5 f21234a;

    /* renamed from: b */
    public final ik5 f21235b;

    /* renamed from: c */
    public final String f21236c;

    /* renamed from: d */
    public String f21237d;

    /* renamed from: e */
    public m42 f21238e;

    /* renamed from: f */
    public int f21239f;

    /* renamed from: g */
    public int f21240g;

    /* renamed from: h */
    public boolean f21241h;

    /* renamed from: i */
    public long f21242i;

    /* renamed from: j */
    public f92 f21243j;

    /* renamed from: k */
    public int f21244k;

    /* renamed from: l */
    public long f21245l;

    public ob2(String str) {
        cj5 cj5Var = new cj5(new byte[16], 16);
        this.f21234a = cj5Var;
        this.f21235b = new ik5(cj5Var.f5841a);
        this.f21239f = 0;
        this.f21240g = 0;
        this.f21241h = false;
        this.f21245l = -9223372036854775807L;
        this.f21236c = str;
    }

    @Override // com.daaw.ac2
    /* renamed from: a */
    public final void mo2553a(ik5 ik5Var) {
        uo4.m7876b(this.f21238e);
        while (ik5Var.m19713i() > 0) {
            int i = this.f21239f;
            if (i == 0) {
                while (ik5Var.m19713i() > 0) {
                    if (this.f21241h) {
                        int m19703s = ik5Var.m19703s();
                        this.f21241h = m19703s == 172;
                        if (m19703s != 64) {
                            if (m19703s == 65) {
                                m19703s = 65;
                            }
                        }
                        this.f21239f = 1;
                        ik5 ik5Var2 = this.f21235b;
                        ik5Var2.m19714h()[0] = -84;
                        ik5Var2.m19714h()[1] = m19703s == 65 ? (byte) 65 : (byte) 64;
                        this.f21240g = 2;
                    } else {
                        this.f21241h = ik5Var.m19703s() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(ik5Var.m19713i(), this.f21244k - this.f21240g);
                this.f21238e.mo16221c(ik5Var, min);
                int i2 = this.f21240g + min;
                this.f21240g = i2;
                int i3 = this.f21244k;
                if (i2 == i3) {
                    long j = this.f21245l;
                    if (j != -9223372036854775807L) {
                        this.f21238e.mo16222b(j, 1, i3, 0, null);
                        this.f21245l += this.f21242i;
                    }
                    this.f21239f = 0;
                }
            } else {
                byte[] m19714h = this.f21235b.m19714h();
                int min2 = Math.min(ik5Var.m19713i(), 16 - this.f21240g);
                ik5Var.m19720b(m19714h, this.f21240g, min2);
                int i4 = this.f21240g + min2;
                this.f21240g = i4;
                if (i4 == 16) {
                    this.f21234a.m25324h(0);
                    ez8 m22117a = fz8.m22117a(this.f21234a);
                    f92 f92Var = this.f21243j;
                    if (f92Var == null || f92Var.f9288y != 2 || m22117a.f8974a != f92Var.f9289z || !"audio/ac4".equals(f92Var.f9275l)) {
                        b72 b72Var = new b72();
                        b72Var.m26384h(this.f21237d);
                        b72Var.m26372s("audio/ac4");
                        b72Var.m26389e0(2);
                        b72Var.m26371t(m22117a.f8974a);
                        b72Var.m26380k(this.f21236c);
                        f92 m26366y = b72Var.m26366y();
                        this.f21243j = m26366y;
                        this.f21238e.mo16218f(m26366y);
                    }
                    this.f21244k = m22117a.f8975b;
                    this.f21242i = (m22117a.f8976c * 1000000) / this.f21243j.f9289z;
                    this.f21235b.m19716f(0);
                    this.f21238e.mo16221c(this.f21235b, 16);
                    this.f21239f = 2;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f21237d = td2Var.m9283b();
        this.f21238e = m09Var.mo3292n(td2Var.m9284a(), 1);
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f21245l = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f21239f = 0;
        this.f21240g = 0;
        this.f21241h = false;
        this.f21245l = -9223372036854775807L;
    }
}
