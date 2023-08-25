package com.daaw;

import com.daaw.eo1;
/* loaded from: classes.dex */
public final class mw0 implements eo1 {

    /* renamed from: a */
    public final InterfaceC3467wv f19173a;

    /* renamed from: b */
    public final qv0 f19174b = new qv0(new byte[10]);

    /* renamed from: c */
    public int f19175c = 0;

    /* renamed from: d */
    public int f19176d;

    /* renamed from: e */
    public ol1 f19177e;

    /* renamed from: f */
    public boolean f19178f;

    /* renamed from: g */
    public boolean f19179g;

    /* renamed from: h */
    public boolean f19180h;

    /* renamed from: i */
    public int f19181i;

    /* renamed from: j */
    public int f19182j;

    /* renamed from: k */
    public boolean f19183k;

    /* renamed from: l */
    public long f19184l;

    public mw0(InterfaceC3467wv interfaceC3467wv) {
        this.f19173a = interfaceC3467wv;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005b -> B:30:0x005d). Please submit an issue!!! */
    @Override // com.daaw.eo1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo15752a(rv0 rv0Var, boolean z) {
        if (z) {
            if (this.f19175c == 3) {
                if (this.f19182j != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected start indicator: expected ");
                    sb.append(this.f19182j);
                    sb.append(" more bytes");
                }
                this.f19173a.mo1993c();
            }
            m15746g(1);
        }
        while (rv0Var.m10919a() > 0) {
            int i = this.f19175c;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (m15749d(rv0Var, this.f19174b.f24432a, Math.min(10, this.f19181i)) && m15749d(rv0Var, null, this.f19181i)) {
                            m15747f();
                            this.f19173a.mo1991e(this.f19184l, this.f19183k);
                            m15746g(3);
                        }
                    } else if (i != 3) {
                        continue;
                    } else {
                        int m10919a = rv0Var.m10919a();
                        int i2 = this.f19182j;
                        int i3 = i2 != -1 ? m10919a - i2 : 0;
                        if (i3 > 0) {
                            m10919a -= i3;
                            rv0Var.m10922I(rv0Var.m10917c() + m10919a);
                        }
                        this.f19173a.mo1995a(rv0Var);
                        int i4 = this.f19182j;
                        if (i4 != -1) {
                            int i5 = i4 - m10919a;
                            this.f19182j = i5;
                            if (i5 == 0) {
                                this.f19173a.mo1993c();
                                m15746g(1);
                                while (rv0Var.m10919a() > 0) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (m15749d(rv0Var, this.f19174b.f24432a, 9)) {
                    m15746g(m15748e() ? 2 : 0);
                }
            } else {
                rv0Var.m10920K(rv0Var.m10919a());
            }
        }
    }

    @Override // com.daaw.eo1
    /* renamed from: b */
    public final void mo15751b() {
        this.f19175c = 0;
        this.f19176d = 0;
        this.f19180h = false;
        this.f19173a.mo1994b();
    }

    @Override // com.daaw.eo1
    /* renamed from: c */
    public void mo15750c(ol1 ol1Var, d00 d00Var, eo1.C1208d c1208d) {
        this.f19177e = ol1Var;
        this.f19173a.mo1992d(d00Var, c1208d);
    }

    /* renamed from: d */
    public final boolean m15749d(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.m10919a(), i - this.f19176d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            rv0Var.m10920K(min);
        } else {
            rv0Var.m10913g(bArr, this.f19176d, min);
        }
        int i2 = this.f19176d + min;
        this.f19176d = i2;
        return i2 == i;
    }

    /* renamed from: e */
    public final boolean m15748e() {
        this.f19174b.m12120m(0);
        int m12125h = this.f19174b.m12125h(24);
        if (m12125h != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected start code prefix: ");
            sb.append(m12125h);
            this.f19182j = -1;
            return false;
        }
        this.f19174b.m12118o(8);
        int m12125h2 = this.f19174b.m12125h(16);
        this.f19174b.m12118o(5);
        this.f19183k = this.f19174b.m12126g();
        this.f19174b.m12118o(2);
        this.f19178f = this.f19174b.m12126g();
        this.f19179g = this.f19174b.m12126g();
        this.f19174b.m12118o(6);
        int m12125h3 = this.f19174b.m12125h(8);
        this.f19181i = m12125h3;
        if (m12125h2 == 0) {
            this.f19182j = -1;
        } else {
            this.f19182j = ((m12125h2 + 6) - 9) - m12125h3;
        }
        return true;
    }

    /* renamed from: f */
    public final void m15747f() {
        this.f19174b.m12120m(0);
        this.f19184l = -9223372036854775807L;
        if (this.f19178f) {
            this.f19174b.m12118o(4);
            this.f19174b.m12118o(1);
            this.f19174b.m12118o(1);
            long m12125h = (this.f19174b.m12125h(3) << 30) | (this.f19174b.m12125h(15) << 15) | this.f19174b.m12125h(15);
            this.f19174b.m12118o(1);
            if (!this.f19180h && this.f19179g) {
                this.f19174b.m12118o(4);
                this.f19174b.m12118o(1);
                this.f19174b.m12118o(1);
                this.f19174b.m12118o(1);
                this.f19177e.m14187b((this.f19174b.m12125h(3) << 30) | (this.f19174b.m12125h(15) << 15) | this.f19174b.m12125h(15));
                this.f19180h = true;
            }
            this.f19184l = this.f19177e.m14187b(m12125h);
        }
    }

    /* renamed from: g */
    public final void m15746g(int i) {
        this.f19175c = i;
        this.f19176d = 0;
    }
}
