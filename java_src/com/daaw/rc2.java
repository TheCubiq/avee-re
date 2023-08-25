package com.daaw;
/* loaded from: classes.dex */
public final class rc2 implements ud2 {

    /* renamed from: a */
    public final ac2 f25121a;

    /* renamed from: b */
    public final cj5 f25122b = new cj5(new byte[10], 10);

    /* renamed from: c */
    public int f25123c = 0;

    /* renamed from: d */
    public int f25124d;

    /* renamed from: e */
    public cr5 f25125e;

    /* renamed from: f */
    public boolean f25126f;

    /* renamed from: g */
    public boolean f25127g;

    /* renamed from: h */
    public boolean f25128h;

    /* renamed from: i */
    public int f25129i;

    /* renamed from: j */
    public int f25130j;

    /* renamed from: k */
    public boolean f25131k;

    public rc2(ac2 ac2Var) {
        this.f25121a = ac2Var;
    }

    @Override // com.daaw.ud2
    /* renamed from: a */
    public final void mo8317a(ik5 ik5Var, int i) {
        long j;
        uo4.m7876b(this.f25125e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.f25123c;
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    int i5 = this.f25130j;
                    if (i5 != -1) {
                        s95.m10493e("PesReader", "Unexpected start indicator: expected " + i5 + " more bytes");
                    }
                    this.f25121a.zzc();
                } else {
                    s95.m10493e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m11421c(1);
        }
        int i6 = i;
        while (ik5Var.m19713i() > 0) {
            int i7 = this.f25123c;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != i3) {
                        int m19713i = ik5Var.m19713i();
                        int i8 = this.f25130j;
                        int i9 = i8 != i2 ? m19713i - i8 : 0;
                        if (i9 > 0) {
                            m19713i -= i9;
                            ik5Var.m19717e(ik5Var.m19711k() + m19713i);
                        }
                        this.f25121a.mo2553a(ik5Var);
                        int i10 = this.f25130j;
                        if (i10 != i2) {
                            int i11 = i10 - m19713i;
                            this.f25130j = i11;
                            if (i11 == 0) {
                                this.f25121a.zzc();
                                m11421c(1);
                            }
                        }
                    } else {
                        if (m11420d(ik5Var, this.f25122b.f5841a, Math.min(10, this.f25129i)) && m11420d(ik5Var, null, this.f25129i)) {
                            this.f25122b.m25324h(0);
                            if (this.f25126f) {
                                this.f25122b.m25322j(4);
                                int m25329c = this.f25122b.m25329c(3);
                                this.f25122b.m25322j(1);
                                int m25329c2 = this.f25122b.m25329c(15);
                                this.f25122b.m25322j(1);
                                long m25329c3 = (m25329c2 << 15) | (m25329c << 30) | this.f25122b.m25329c(15);
                                this.f25122b.m25322j(1);
                                if (!this.f25128h && this.f25127g) {
                                    this.f25122b.m25322j(4);
                                    int m25329c4 = this.f25122b.m25329c(3);
                                    this.f25122b.m25322j(1);
                                    int m25329c5 = this.f25122b.m25329c(15);
                                    this.f25122b.m25322j(1);
                                    int m25329c6 = this.f25122b.m25329c(15);
                                    this.f25122b.m25322j(1);
                                    this.f25125e.m25056b((m25329c4 << 30) | (m25329c5 << 15) | m25329c6);
                                    this.f25128h = true;
                                }
                                j = this.f25125e.m25056b(m25329c3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.f25131k ? 0 : 4;
                            this.f25121a.mo2551c(j, i6);
                            m11421c(3);
                            i2 = -1;
                        }
                    }
                } else if (m11420d(ik5Var, this.f25122b.f5841a, 9)) {
                    int i12 = 0;
                    this.f25122b.m25324h(0);
                    int m25329c7 = this.f25122b.m25329c(24);
                    if (m25329c7 != 1) {
                        s95.m10493e("PesReader", "Unexpected start code prefix: " + m25329c7);
                        i2 = -1;
                        this.f25130j = -1;
                    } else {
                        this.f25122b.m25322j(8);
                        int m25329c8 = this.f25122b.m25329c(16);
                        this.f25122b.m25322j(5);
                        this.f25131k = this.f25122b.m25320l();
                        this.f25122b.m25322j(2);
                        this.f25126f = this.f25122b.m25320l();
                        this.f25127g = this.f25122b.m25320l();
                        this.f25122b.m25322j(6);
                        int m25329c9 = this.f25122b.m25329c(8);
                        this.f25129i = m25329c9;
                        if (m25329c8 == 0) {
                            this.f25130j = -1;
                        } else {
                            int i13 = (m25329c8 - 3) - m25329c9;
                            this.f25130j = i13;
                            if (i13 < 0) {
                                s95.m10493e("PesReader", "Found negative packet payload size: " + i13);
                                i2 = -1;
                                this.f25130j = -1;
                                i12 = 2;
                            }
                        }
                        i2 = -1;
                        i12 = 2;
                    }
                    m11421c(i12);
                } else {
                    i2 = -1;
                }
            } else {
                ik5Var.m19715g(ik5Var.m19713i());
            }
            i3 = 2;
        }
    }

    @Override // com.daaw.ud2
    /* renamed from: b */
    public final void mo8316b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
        this.f25125e = cr5Var;
        this.f25121a.mo2552b(m09Var, td2Var);
    }

    /* renamed from: c */
    public final void m11421c(int i) {
        this.f25123c = i;
        this.f25124d = 0;
    }

    /* renamed from: d */
    public final boolean m11420d(ik5 ik5Var, byte[] bArr, int i) {
        int min = Math.min(ik5Var.m19713i(), i - this.f25124d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ik5Var.m19715g(min);
        } else {
            ik5Var.m19720b(bArr, this.f25124d, min);
        }
        int i2 = this.f25124d + min;
        this.f25124d = i2;
        return i2 == i;
    }

    @Override // com.daaw.ud2
    public final void zzc() {
        this.f25123c = 0;
        this.f25124d = 0;
        this.f25128h = false;
        this.f25121a.zze();
    }
}
