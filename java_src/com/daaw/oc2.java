package com.daaw;
/* loaded from: classes.dex */
public final class oc2 implements ac2 {

    /* renamed from: a */
    public final ik5 f21255a;

    /* renamed from: b */
    public final y32 f21256b;

    /* renamed from: c */
    public final String f21257c;

    /* renamed from: d */
    public m42 f21258d;

    /* renamed from: e */
    public String f21259e;

    /* renamed from: f */
    public int f21260f = 0;

    /* renamed from: g */
    public int f21261g;

    /* renamed from: h */
    public boolean f21262h;

    /* renamed from: i */
    public boolean f21263i;

    /* renamed from: j */
    public long f21264j;

    /* renamed from: k */
    public int f21265k;

    /* renamed from: l */
    public long f21266l;

    public oc2(String str) {
        ik5 ik5Var = new ik5(4);
        this.f21255a = ik5Var;
        ik5Var.m19714h()[0] = -1;
        this.f21256b = new y32();
        this.f21266l = -9223372036854775807L;
        this.f21257c = str;
    }

    @Override // com.daaw.ac2
    /* renamed from: a */
    public final void mo2553a(ik5 ik5Var) {
        y32 y32Var;
        uo4.m7876b(this.f21258d);
        while (ik5Var.m19713i() > 0) {
            int i = this.f21260f;
            if (i == 0) {
                byte[] m19714h = ik5Var.m19714h();
                int m19710l = ik5Var.m19710l();
                for (int m19711k = ik5Var.m19711k(); m19711k < m19710l; m19711k++) {
                    byte b = m19714h[m19711k];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f21263i && (b & 224) == 224;
                    this.f21263i = z;
                    if (z2) {
                        ik5Var.m19716f(m19711k + 1);
                        this.f21263i = false;
                        this.f21255a.m19714h()[1] = m19714h[m19711k];
                        this.f21261g = 2;
                        this.f21260f = 1;
                        break;
                        break;
                    }
                }
                ik5Var.m19716f(m19710l);
            } else if (i != 1) {
                int min = Math.min(ik5Var.m19713i(), this.f21265k - this.f21261g);
                this.f21258d.mo16221c(ik5Var, min);
                int i2 = this.f21261g + min;
                this.f21261g = i2;
                int i3 = this.f21265k;
                if (i2 >= i3) {
                    long j = this.f21266l;
                    if (j != -9223372036854775807L) {
                        this.f21258d.mo16222b(j, 1, i3, 0, null);
                        this.f21266l += this.f21264j;
                    }
                    this.f21261g = 0;
                    this.f21260f = 0;
                }
            } else {
                int min2 = Math.min(ik5Var.m19713i(), 4 - this.f21261g);
                ik5Var.m19720b(this.f21255a.m19714h(), this.f21261g, min2);
                int i4 = this.f21261g + min2;
                this.f21261g = i4;
                if (i4 >= 4) {
                    this.f21255a.m19716f(0);
                    if (!this.f21256b.m4159a(this.f21255a.m19709m())) {
                        this.f21261g = 0;
                        this.f21260f = 1;
                        break;
                    }
                    this.f21265k = this.f21256b.f33313c;
                    if (!this.f21262h) {
                        this.f21264j = (y32Var.f33317g * 1000000) / y32Var.f33314d;
                        b72 b72Var = new b72();
                        b72Var.m26384h(this.f21259e);
                        b72Var.m26372s(this.f21256b.f33312b);
                        b72Var.m26379l(4096);
                        b72Var.m26389e0(this.f21256b.f33315e);
                        b72Var.m26371t(this.f21256b.f33314d);
                        b72Var.m26380k(this.f21257c);
                        this.f21258d.mo16218f(b72Var.m26366y());
                        this.f21262h = true;
                    }
                    this.f21255a.m19716f(0);
                    this.f21258d.mo16221c(this.f21255a, 4);
                    this.f21260f = 2;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f21259e = td2Var.m9283b();
        this.f21258d = m09Var.mo3292n(td2Var.m9284a(), 1);
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f21266l = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f21260f = 0;
        this.f21261g = 0;
        this.f21263i = false;
        this.f21266l = -9223372036854775807L;
    }
}
