package com.daaw;

import java.util.Collections;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class nc2 implements ac2 {

    /* renamed from: a */
    public final String f20019a;

    /* renamed from: b */
    public final ik5 f20020b;

    /* renamed from: c */
    public final cj5 f20021c;

    /* renamed from: d */
    public m42 f20022d;

    /* renamed from: e */
    public String f20023e;

    /* renamed from: f */
    public f92 f20024f;

    /* renamed from: g */
    public int f20025g;

    /* renamed from: h */
    public int f20026h;

    /* renamed from: i */
    public int f20027i;

    /* renamed from: j */
    public int f20028j;

    /* renamed from: k */
    public long f20029k;

    /* renamed from: l */
    public boolean f20030l;

    /* renamed from: m */
    public int f20031m;

    /* renamed from: n */
    public int f20032n;

    /* renamed from: o */
    public int f20033o;

    /* renamed from: p */
    public boolean f20034p;

    /* renamed from: q */
    public long f20035q;

    /* renamed from: r */
    public int f20036r;

    /* renamed from: s */
    public long f20037s;

    /* renamed from: t */
    public int f20038t;

    /* renamed from: u */
    public String f20039u;

    public nc2(String str) {
        this.f20019a = str;
        ik5 ik5Var = new ik5((int) NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        this.f20020b = ik5Var;
        byte[] m19714h = ik5Var.m19714h();
        this.f20021c = new cj5(m19714h, m19714h.length);
        this.f20029k = -9223372036854775807L;
    }

    /* renamed from: e */
    public static long m15241e(cj5 cj5Var) {
        return cj5Var.m25329c((cj5Var.m25329c(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r14.f20030l == false) goto L26;
     */
    @Override // com.daaw.ac2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2553a(ik5 ik5Var) {
        int i;
        int i2;
        int i3;
        boolean m25320l;
        uo4.m7876b(this.f20022d);
        while (ik5Var.m19713i() > 0) {
            int i4 = this.f20025g;
            if (i4 != 0) {
                if (i4 == 1) {
                    int m19703s = ik5Var.m19703s();
                    if ((m19703s & 224) == 224) {
                        this.f20028j = m19703s;
                        this.f20025g = 2;
                    } else if (m19703s != 86) {
                        this.f20025g = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(ik5Var.m19713i(), this.f20027i - this.f20026h);
                    ik5Var.m19720b(this.f20021c.f5841a, this.f20026h, min);
                    int i5 = this.f20026h + min;
                    this.f20026h = i5;
                    if (i5 == this.f20027i) {
                        this.f20021c.m25324h(0);
                        cj5 cj5Var = this.f20021c;
                        if (!cj5Var.m25320l()) {
                            this.f20030l = true;
                            int m25329c = cj5Var.m25329c(1);
                            if (m25329c == 1) {
                                i3 = cj5Var.m25329c(1);
                                i2 = 1;
                            } else {
                                i2 = m25329c;
                                i3 = 0;
                            }
                            this.f20031m = i3;
                            if (i3 != 0) {
                                throw dl3.m24267a(null, null);
                            }
                            if (i2 == 1) {
                                m15241e(cj5Var);
                                i2 = 1;
                            }
                            if (!cj5Var.m25320l()) {
                                throw dl3.m24267a(null, null);
                            }
                            this.f20032n = cj5Var.m25329c(6);
                            int m25329c2 = cj5Var.m25329c(4);
                            int m25329c3 = cj5Var.m25329c(3);
                            if (m25329c2 != 0 || m25329c3 != 0) {
                                throw dl3.m24267a(null, null);
                            }
                            if (i2 == 0) {
                                int m25330b = cj5Var.m25330b();
                                int m15242d = m15242d(cj5Var);
                                cj5Var.m25324h(m25330b);
                                byte[] bArr = new byte[(m15242d + 7) / 8];
                                cj5Var.m25326f(bArr, 0, m15242d);
                                b72 b72Var = new b72();
                                b72Var.m26384h(this.f20023e);
                                b72Var.m26372s("audio/mp4a-latm");
                                b72Var.m26387f0(this.f20039u);
                                b72Var.m26389e0(this.f20038t);
                                b72Var.m26371t(this.f20036r);
                                b72Var.m26382i(Collections.singletonList(bArr));
                                b72Var.m26380k(this.f20019a);
                                f92 m26366y = b72Var.m26366y();
                                if (!m26366y.equals(this.f20024f)) {
                                    this.f20024f = m26366y;
                                    this.f20037s = 1024000000 / m26366y.f9289z;
                                    this.f20022d.mo16218f(m26366y);
                                }
                            } else {
                                cj5Var.m25322j(((int) m15241e(cj5Var)) - m15242d(cj5Var));
                            }
                            int m25329c4 = cj5Var.m25329c(3);
                            this.f20033o = m25329c4;
                            if (m25329c4 == 0) {
                                cj5Var.m25322j(8);
                            } else if (m25329c4 == 1) {
                                cj5Var.m25322j(9);
                            } else if (m25329c4 == 3 || m25329c4 == 4 || m25329c4 == 5) {
                                cj5Var.m25322j(6);
                            } else if (m25329c4 != 6 && m25329c4 != 7) {
                                throw new IllegalStateException();
                            } else {
                                cj5Var.m25322j(1);
                            }
                            boolean m25320l2 = cj5Var.m25320l();
                            this.f20034p = m25320l2;
                            this.f20035q = 0L;
                            if (m25320l2) {
                                if (i2 != 1) {
                                    do {
                                        m25320l = cj5Var.m25320l();
                                        this.f20035q = (this.f20035q << 8) + cj5Var.m25329c(8);
                                    } while (m25320l);
                                } else {
                                    this.f20035q = m15241e(cj5Var);
                                }
                            }
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(8);
                            }
                        }
                        if (this.f20031m != 0) {
                            throw dl3.m24267a(null, null);
                        }
                        if (this.f20032n != 0) {
                            throw dl3.m24267a(null, null);
                        }
                        if (this.f20033o != 0) {
                            throw dl3.m24267a(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int m25329c5 = cj5Var.m25329c(8);
                            i = i6 + m25329c5;
                            if (m25329c5 != 255) {
                                break;
                            }
                            i6 = i;
                        }
                        int m25330b2 = cj5Var.m25330b();
                        if ((m25330b2 & 7) == 0) {
                            this.f20020b.m19716f(m25330b2 >> 3);
                        } else {
                            cj5Var.m25326f(this.f20020b.m19714h(), 0, i * 8);
                            this.f20020b.m19716f(0);
                        }
                        this.f20022d.mo16221c(this.f20020b, i);
                        long j = this.f20029k;
                        if (j != -9223372036854775807L) {
                            this.f20022d.mo16222b(j, 1, i, 0, null);
                            this.f20029k += this.f20037s;
                        }
                        if (this.f20034p) {
                            cj5Var.m25322j((int) this.f20035q);
                        }
                        this.f20025g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int m19703s2 = ((this.f20028j & (-225)) << 8) | ik5Var.m19703s();
                    this.f20027i = m19703s2;
                    ik5 ik5Var2 = this.f20020b;
                    if (m19703s2 > ik5Var2.m19714h().length) {
                        ik5Var2.m19719c(m19703s2);
                        cj5 cj5Var2 = this.f20021c;
                        byte[] m19714h = this.f20020b.m19714h();
                        cj5Var2.m25325g(m19714h, m19714h.length);
                    }
                    this.f20026h = 0;
                    this.f20025g = 3;
                }
            } else if (ik5Var.m19703s() == 86) {
                this.f20025g = 1;
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f20022d = m09Var.mo3292n(td2Var.m9284a(), 1);
        this.f20023e = td2Var.m9283b();
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f20029k = j;
        }
    }

    /* renamed from: d */
    public final int m15242d(cj5 cj5Var) {
        int m25331a = cj5Var.m25331a();
        yy8 m1765b = zy8.m1765b(cj5Var, true);
        this.f20039u = m1765b.f34268c;
        this.f20036r = m1765b.f34266a;
        this.f20038t = m1765b.f34267b;
        return m25331a - cj5Var.m25331a();
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f20025g = 0;
        this.f20029k = -9223372036854775807L;
        this.f20030l = false;
    }
}
