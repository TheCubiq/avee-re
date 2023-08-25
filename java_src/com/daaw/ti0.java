package com.daaw;

import android.util.Pair;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class ti0 implements InterfaceC3467wv {

    /* renamed from: a */
    public final String f27742a;

    /* renamed from: b */
    public final rv0 f27743b;

    /* renamed from: c */
    public final qv0 f27744c;

    /* renamed from: d */
    public sm1 f27745d;

    /* renamed from: e */
    public Format f27746e;

    /* renamed from: f */
    public String f27747f;

    /* renamed from: g */
    public int f27748g;

    /* renamed from: h */
    public int f27749h;

    /* renamed from: i */
    public int f27750i;

    /* renamed from: j */
    public int f27751j;

    /* renamed from: k */
    public long f27752k;

    /* renamed from: l */
    public boolean f27753l;

    /* renamed from: m */
    public int f27754m;

    /* renamed from: n */
    public int f27755n;

    /* renamed from: o */
    public int f27756o;

    /* renamed from: p */
    public boolean f27757p;

    /* renamed from: q */
    public long f27758q;

    /* renamed from: r */
    public int f27759r;

    /* renamed from: s */
    public long f27760s;

    /* renamed from: t */
    public int f27761t;

    public ti0(String str) {
        this.f27742a = str;
        rv0 rv0Var = new rv0((int) NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        this.f27743b = rv0Var;
        this.f27744c = new qv0(rv0Var.f25637a);
    }

    /* renamed from: f */
    public static long m9098f(qv0 qv0Var) {
        return qv0Var.m12125h((qv0Var.m12125h(2) + 1) * 8);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        while (rv0Var.m10919a() > 0) {
            int i = this.f27748g;
            if (i != 0) {
                if (i == 1) {
                    int m10896x = rv0Var.m10896x();
                    if ((m10896x & 224) == 224) {
                        this.f27751j = m10896x;
                        this.f27748g = 2;
                    } else if (m10896x != 86) {
                        this.f27748g = 0;
                    }
                } else if (i == 2) {
                    int m10896x2 = ((this.f27751j & (-225)) << 8) | rv0Var.m10896x();
                    this.f27750i = m10896x2;
                    if (m10896x2 > this.f27743b.f25637a.length) {
                        m9091m(m10896x2);
                    }
                    this.f27749h = 0;
                    this.f27748g = 3;
                } else if (i == 3) {
                    int min = Math.min(rv0Var.m10919a(), this.f27750i - this.f27749h);
                    rv0Var.m10913g(this.f27744c.f24432a, this.f27749h, min);
                    int i2 = this.f27749h + min;
                    this.f27749h = i2;
                    if (i2 == this.f27750i) {
                        this.f27744c.m12120m(0);
                        m9097g(this.f27744c);
                        this.f27748g = 0;
                    }
                }
            } else if (rv0Var.m10896x() == 86) {
                this.f27748g = 1;
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        this.f27748g = 0;
        this.f27753l = false;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f27745d = d00Var.mo11478a(c1208d.m23334c(), 1);
        this.f27747f = c1208d.m23335b();
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f27752k = j;
    }

    /* renamed from: g */
    public final void m9097g(qv0 qv0Var) {
        if (!qv0Var.m12126g()) {
            this.f27753l = true;
            m9092l(qv0Var);
        } else if (!this.f27753l) {
            return;
        }
        if (this.f27754m != 0) {
            throw new tv0();
        }
        if (this.f27755n != 0) {
            throw new tv0();
        }
        m9093k(qv0Var, m9094j(qv0Var));
        if (this.f27757p) {
            qv0Var.m12118o((int) this.f27758q);
        }
    }

    /* renamed from: h */
    public final int m9096h(qv0 qv0Var) {
        int m12131b = qv0Var.m12131b();
        Pair<Integer, Integer> m23486h = C1183eg.m23486h(qv0Var, true);
        this.f27759r = ((Integer) m23486h.first).intValue();
        this.f27761t = ((Integer) m23486h.second).intValue();
        return m12131b - qv0Var.m12131b();
    }

    /* renamed from: i */
    public final void m9095i(qv0 qv0Var) {
        int i;
        int m12125h = qv0Var.m12125h(3);
        this.f27756o = m12125h;
        if (m12125h == 0) {
            i = 8;
        } else if (m12125h != 1) {
            if (m12125h == 3 || m12125h == 4 || m12125h == 5) {
                qv0Var.m12118o(6);
                return;
            } else if (m12125h == 6 || m12125h == 7) {
                qv0Var.m12118o(1);
                return;
            } else {
                return;
            }
        } else {
            i = 9;
        }
        qv0Var.m12118o(i);
    }

    /* renamed from: j */
    public final int m9094j(qv0 qv0Var) {
        int m12125h;
        if (this.f27756o == 0) {
            int i = 0;
            do {
                m12125h = qv0Var.m12125h(8);
                i += m12125h;
            } while (m12125h == 255);
            return i;
        }
        throw new tv0();
    }

    /* renamed from: k */
    public final void m9093k(qv0 qv0Var, int i) {
        int m12128e = qv0Var.m12128e();
        if ((m12128e & 7) == 0) {
            this.f27743b.m10921J(m12128e >> 3);
        } else {
            qv0Var.m12124i(this.f27743b.f25637a, 0, i * 8);
            this.f27743b.m10921J(0);
        }
        this.f27745d.mo10157c(this.f27743b, i);
        this.f27745d.mo10159a(this.f27752k, 1, i, 0, null);
        this.f27752k += this.f27760s;
    }

    /* renamed from: l */
    public final void m9092l(qv0 qv0Var) {
        boolean m12126g;
        int m12125h = qv0Var.m12125h(1);
        int m12125h2 = m12125h == 1 ? qv0Var.m12125h(1) : 0;
        this.f27754m = m12125h2;
        if (m12125h2 != 0) {
            throw new tv0();
        }
        if (m12125h == 1) {
            m9098f(qv0Var);
        }
        if (!qv0Var.m12126g()) {
            throw new tv0();
        }
        this.f27755n = qv0Var.m12125h(6);
        int m12125h3 = qv0Var.m12125h(4);
        int m12125h4 = qv0Var.m12125h(3);
        if (m12125h3 != 0 || m12125h4 != 0) {
            throw new tv0();
        }
        if (m12125h == 0) {
            int m12128e = qv0Var.m12128e();
            int m9096h = m9096h(qv0Var);
            qv0Var.m12120m(m12128e);
            byte[] bArr = new byte[(m9096h + 7) / 8];
            qv0Var.m12124i(bArr, 0, m9096h);
            Format m1722u = Format.m1722u(this.f27747f, "audio/mp4a-latm", null, -1, -1, this.f27761t, this.f27759r, Collections.singletonList(bArr), null, 0, this.f27742a);
            if (!m1722u.equals(this.f27746e)) {
                this.f27746e = m1722u;
                this.f27760s = 1024000000 / m1722u.f35707H;
                this.f27745d.mo10156d(m1722u);
            }
        } else {
            qv0Var.m12118o(((int) m9098f(qv0Var)) - m9096h(qv0Var));
        }
        m9095i(qv0Var);
        boolean m12126g2 = qv0Var.m12126g();
        this.f27757p = m12126g2;
        this.f27758q = 0L;
        if (m12126g2) {
            if (m12125h == 1) {
                this.f27758q = m9098f(qv0Var);
            } else {
                do {
                    m12126g = qv0Var.m12126g();
                    this.f27758q = (this.f27758q << 8) + qv0Var.m12125h(8);
                } while (m12126g);
            }
        }
        if (qv0Var.m12126g()) {
            qv0Var.m12118o(8);
        }
    }

    /* renamed from: m */
    public final void m9091m(int i) {
        this.f27743b.m10924G(i);
        this.f27744c.m12122k(this.f27743b.f25637a);
    }
}
