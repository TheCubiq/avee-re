package com.daaw;

import android.util.Pair;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import org.conscrypt.NativeConstants;
/* renamed from: com.daaw.t1 */
/* loaded from: classes.dex */
public final class C3007t1 implements InterfaceC3467wv {

    /* renamed from: r */
    public static final byte[] f26872r = {73, 68, 51};

    /* renamed from: a */
    public final boolean f26873a;

    /* renamed from: b */
    public final qv0 f26874b;

    /* renamed from: c */
    public final rv0 f26875c;

    /* renamed from: d */
    public final String f26876d;

    /* renamed from: e */
    public String f26877e;

    /* renamed from: f */
    public sm1 f26878f;

    /* renamed from: g */
    public sm1 f26879g;

    /* renamed from: h */
    public int f26880h;

    /* renamed from: i */
    public int f26881i;

    /* renamed from: j */
    public int f26882j;

    /* renamed from: k */
    public boolean f26883k;

    /* renamed from: l */
    public boolean f26884l;

    /* renamed from: m */
    public long f26885m;

    /* renamed from: n */
    public int f26886n;

    /* renamed from: o */
    public long f26887o;

    /* renamed from: p */
    public sm1 f26888p;

    /* renamed from: q */
    public long f26889q;

    public C3007t1(boolean z) {
        this(z, null);
    }

    public C3007t1(boolean z, String str) {
        this.f26874b = new qv0(new byte[7]);
        this.f26875c = new rv0(Arrays.copyOf(f26872r, 10));
        m9659k();
        this.f26873a = z;
        this.f26876d = str;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        while (rv0Var.m10919a() > 0) {
            int i = this.f26880h;
            if (i == 0) {
                m9663g(rv0Var);
            } else if (i != 1) {
                if (i == 2) {
                    if (m9664f(rv0Var, this.f26874b.f24432a, this.f26883k ? 7 : 5)) {
                        m9662h();
                    }
                } else if (i == 3) {
                    m9660j(rv0Var);
                }
            } else if (m9664f(rv0Var, this.f26875c.f25637a, 10)) {
                m9661i();
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        m9659k();
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f26877e = c1208d.m23335b();
        this.f26878f = d00Var.mo11478a(c1208d.m23334c(), 1);
        if (!this.f26873a) {
            this.f26879g = new C1220ev();
            return;
        }
        c1208d.m23336a();
        sm1 mo11478a = d00Var.mo11478a(c1208d.m23334c(), 4);
        this.f26879g = mo11478a;
        mo11478a.mo10156d(Format.m1718y(c1208d.m23335b(), "application/id3", null, -1, null));
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f26887o = j;
    }

    /* renamed from: f */
    public final boolean m9664f(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.m10919a(), i - this.f26881i);
        rv0Var.m10913g(bArr, this.f26881i, min);
        int i2 = this.f26881i + min;
        this.f26881i = i2;
        return i2 == i;
    }

    /* renamed from: g */
    public final void m9663g(rv0 rv0Var) {
        int i;
        byte[] bArr = rv0Var.f25637a;
        int m10917c = rv0Var.m10917c();
        int m10916d = rv0Var.m10916d();
        while (m10917c < m10916d) {
            int i2 = m10917c + 1;
            int i3 = bArr[m10917c] & 255;
            int i4 = this.f26882j;
            if (i4 != 512 || i3 < 240 || i3 == 255) {
                int i5 = i3 | i4;
                if (i5 != 329) {
                    if (i5 == 511) {
                        this.f26882j = 512;
                    } else if (i5 == 836) {
                        i = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                    } else if (i5 == 1075) {
                        m9657m();
                    } else if (i4 != 256) {
                        this.f26882j = 256;
                        i2--;
                    }
                    m10917c = i2;
                } else {
                    i = 768;
                }
                this.f26882j = i;
                m10917c = i2;
            } else {
                this.f26883k = (i3 & 1) == 0;
                m9658l();
            }
            rv0Var.m10921J(i2);
            return;
        }
        rv0Var.m10921J(m10917c);
    }

    /* renamed from: h */
    public final void m9662h() {
        this.f26874b.m12120m(0);
        if (this.f26884l) {
            this.f26874b.m12118o(10);
        } else {
            int m12125h = this.f26874b.m12125h(2) + 1;
            if (m12125h != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Detected audio object type: ");
                sb.append(m12125h);
                sb.append(", but assuming AAC LC.");
                m12125h = 2;
            }
            int m12125h2 = this.f26874b.m12125h(4);
            this.f26874b.m12118o(1);
            byte[] m23493a = C1183eg.m23493a(m12125h, m12125h2, this.f26874b.m12125h(3));
            Pair<Integer, Integer> m23485i = C1183eg.m23485i(m23493a);
            Format m1722u = Format.m1722u(this.f26877e, "audio/mp4a-latm", null, -1, -1, ((Integer) m23485i.second).intValue(), ((Integer) m23485i.first).intValue(), Collections.singletonList(m23493a), null, 0, this.f26876d);
            this.f26885m = 1024000000 / m1722u.f35707H;
            this.f26878f.mo10156d(m1722u);
            this.f26884l = true;
        }
        this.f26874b.m12118o(4);
        int m12125h3 = (this.f26874b.m12125h(13) - 2) - 5;
        if (this.f26883k) {
            m12125h3 -= 2;
        }
        m9656n(this.f26878f, this.f26885m, 0, m12125h3);
    }

    /* renamed from: i */
    public final void m9661i() {
        this.f26879g.mo10157c(this.f26875c, 10);
        this.f26875c.m10921J(6);
        m9656n(this.f26879g, 0L, 10, this.f26875c.m10897w() + 10);
    }

    /* renamed from: j */
    public final void m9660j(rv0 rv0Var) {
        int min = Math.min(rv0Var.m10919a(), this.f26886n - this.f26881i);
        this.f26888p.mo10157c(rv0Var, min);
        int i = this.f26881i + min;
        this.f26881i = i;
        int i2 = this.f26886n;
        if (i == i2) {
            this.f26888p.mo10159a(this.f26887o, 1, i2, 0, null);
            this.f26887o += this.f26889q;
            m9659k();
        }
    }

    /* renamed from: k */
    public final void m9659k() {
        this.f26880h = 0;
        this.f26881i = 0;
        this.f26882j = 256;
    }

    /* renamed from: l */
    public final void m9658l() {
        this.f26880h = 2;
        this.f26881i = 0;
    }

    /* renamed from: m */
    public final void m9657m() {
        this.f26880h = 1;
        this.f26881i = f26872r.length;
        this.f26886n = 0;
        this.f26875c.m10921J(0);
    }

    /* renamed from: n */
    public final void m9656n(sm1 sm1Var, long j, int i, int i2) {
        this.f26880h = 3;
        this.f26881i = i;
        this.f26888p = sm1Var;
        this.f26889q = j;
        this.f26886n = i2;
    }
}
