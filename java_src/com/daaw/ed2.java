package com.daaw;
/* loaded from: classes.dex */
public final class ed2 {

    /* renamed from: a */
    public final ac2 f8372a;

    /* renamed from: b */
    public final cr5 f8373b;

    /* renamed from: c */
    public final cj5 f8374c = new cj5(new byte[64], 64);

    /* renamed from: d */
    public boolean f8375d;

    /* renamed from: e */
    public boolean f8376e;

    /* renamed from: f */
    public boolean f8377f;

    public ed2(ac2 ac2Var, cr5 cr5Var) {
        this.f8372a = ac2Var;
        this.f8373b = cr5Var;
    }

    /* renamed from: a */
    public final void m23556a(ik5 ik5Var) {
        long j;
        ik5Var.m19720b(this.f8374c.f5841a, 0, 3);
        this.f8374c.m25324h(0);
        this.f8374c.m25322j(8);
        this.f8375d = this.f8374c.m25320l();
        this.f8376e = this.f8374c.m25320l();
        this.f8374c.m25322j(6);
        ik5Var.m19720b(this.f8374c.f5841a, 0, this.f8374c.m25329c(8));
        this.f8374c.m25324h(0);
        if (this.f8375d) {
            this.f8374c.m25322j(4);
            int m25329c = this.f8374c.m25329c(3);
            this.f8374c.m25322j(1);
            int m25329c2 = this.f8374c.m25329c(15);
            this.f8374c.m25322j(1);
            long m25329c3 = (m25329c << 30) | (m25329c2 << 15) | this.f8374c.m25329c(15);
            this.f8374c.m25322j(1);
            if (!this.f8377f && this.f8376e) {
                this.f8374c.m25322j(4);
                int m25329c4 = this.f8374c.m25329c(3);
                this.f8374c.m25322j(1);
                int m25329c5 = this.f8374c.m25329c(15);
                this.f8374c.m25322j(1);
                int m25329c6 = this.f8374c.m25329c(15);
                this.f8374c.m25322j(1);
                this.f8373b.m25056b((m25329c5 << 15) | (m25329c4 << 30) | m25329c6);
                this.f8377f = true;
            }
            j = this.f8373b.m25056b(m25329c3);
        } else {
            j = 0;
        }
        this.f8372a.mo2551c(j, 4);
        this.f8372a.mo2553a(ik5Var);
        this.f8372a.zzc();
    }

    /* renamed from: b */
    public final void m23555b() {
        this.f8377f = false;
        this.f8372a.zze();
    }
}
