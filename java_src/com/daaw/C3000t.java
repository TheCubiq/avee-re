package com.daaw;

import com.daaw.C3150u;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.t */
/* loaded from: classes.dex */
public final class C3000t implements InterfaceC3467wv {

    /* renamed from: a */
    public final qv0 f26828a;

    /* renamed from: b */
    public final rv0 f26829b;

    /* renamed from: c */
    public final String f26830c;

    /* renamed from: d */
    public String f26831d;

    /* renamed from: e */
    public sm1 f26832e;

    /* renamed from: f */
    public int f26833f;

    /* renamed from: g */
    public int f26834g;

    /* renamed from: h */
    public boolean f26835h;

    /* renamed from: i */
    public long f26836i;

    /* renamed from: j */
    public Format f26837j;

    /* renamed from: k */
    public int f26838k;

    /* renamed from: l */
    public long f26839l;

    public C3000t() {
        this(null);
    }

    public C3000t(String str) {
        qv0 qv0Var = new qv0(new byte[128]);
        this.f26828a = qv0Var;
        this.f26829b = new rv0(qv0Var.f24432a);
        this.f26833f = 0;
        this.f26830c = str;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        while (rv0Var.m10919a() > 0) {
            int i = this.f26833f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(rv0Var.m10919a(), this.f26838k - this.f26834g);
                        this.f26832e.mo10157c(rv0Var, min);
                        int i2 = this.f26834g + min;
                        this.f26834g = i2;
                        int i3 = this.f26838k;
                        if (i2 == i3) {
                            this.f26832e.mo10159a(this.f26839l, 1, i3, 0, null);
                            this.f26839l += this.f26836i;
                            this.f26833f = 0;
                        }
                    }
                } else if (m9679f(rv0Var, this.f26829b.f25637a, 128)) {
                    m9678g();
                    this.f26829b.m10921J(0);
                    this.f26832e.mo10157c(this.f26829b, 128);
                    this.f26833f = 2;
                }
            } else if (m9677h(rv0Var)) {
                this.f26833f = 1;
                byte[] bArr = this.f26829b.f25637a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f26834g = 2;
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        this.f26833f = 0;
        this.f26834g = 0;
        this.f26835h = false;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f26831d = c1208d.m23335b();
        this.f26832e = d00Var.mo11478a(c1208d.m23334c(), 1);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f26839l = j;
    }

    /* renamed from: f */
    public final boolean m9679f(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.m10919a(), i - this.f26834g);
        rv0Var.m10913g(bArr, this.f26834g, min);
        int i2 = this.f26834g + min;
        this.f26834g = i2;
        return i2 == i;
    }

    /* renamed from: g */
    public final void m9678g() {
        this.f26828a.m12120m(0);
        C3150u.C3152b m8652e = C3150u.m8652e(this.f26828a);
        Format format = this.f26837j;
        if (format == null || m8652e.f28304d != format.f35706G || m8652e.f28303c != format.f35707H || m8652e.f28301a != format.f35721u) {
            Format m1722u = Format.m1722u(this.f26831d, m8652e.f28301a, null, -1, -1, m8652e.f28304d, m8652e.f28303c, null, null, 0, this.f26830c);
            this.f26837j = m1722u;
            this.f26832e.mo10156d(m1722u);
        }
        this.f26838k = m8652e.f28305e;
        this.f26836i = (m8652e.f28306f * 1000000) / this.f26837j.f35707H;
    }

    /* renamed from: h */
    public final boolean m9677h(rv0 rv0Var) {
        while (true) {
            boolean z = false;
            if (rv0Var.m10919a() <= 0) {
                return false;
            }
            if (this.f26835h) {
                int m10896x = rv0Var.m10896x();
                if (m10896x == 119) {
                    this.f26835h = false;
                    return true;
                }
                if (m10896x != 11) {
                    this.f26835h = z;
                }
                z = true;
                this.f26835h = z;
            } else {
                if (rv0Var.m10896x() != 11) {
                    this.f26835h = z;
                }
                z = true;
                this.f26835h = z;
            }
        }
    }
}
