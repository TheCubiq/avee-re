package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class rb2 implements ac2 {

    /* renamed from: v */
    public static final byte[] f25074v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f25075a;

    /* renamed from: b */
    public final cj5 f25076b = new cj5(new byte[7], 7);

    /* renamed from: c */
    public final ik5 f25077c = new ik5(Arrays.copyOf(f25074v, 10));

    /* renamed from: d */
    public final String f25078d;

    /* renamed from: e */
    public String f25079e;

    /* renamed from: f */
    public m42 f25080f;

    /* renamed from: g */
    public m42 f25081g;

    /* renamed from: h */
    public int f25082h;

    /* renamed from: i */
    public int f25083i;

    /* renamed from: j */
    public int f25084j;

    /* renamed from: k */
    public boolean f25085k;

    /* renamed from: l */
    public boolean f25086l;

    /* renamed from: m */
    public int f25087m;

    /* renamed from: n */
    public int f25088n;

    /* renamed from: o */
    public int f25089o;

    /* renamed from: p */
    public boolean f25090p;

    /* renamed from: q */
    public long f25091q;

    /* renamed from: r */
    public int f25092r;

    /* renamed from: s */
    public long f25093s;

    /* renamed from: t */
    public m42 f25094t;

    /* renamed from: u */
    public long f25095u;

    public rb2(boolean z, String str) {
        m11453f();
        this.f25087m = -1;
        this.f25088n = -1;
        this.f25091q = -9223372036854775807L;
        this.f25093s = -9223372036854775807L;
        this.f25075a = z;
        this.f25078d = str;
    }

    /* renamed from: d */
    public static boolean m11455d(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: j */
    public static final boolean m11449j(byte b, byte b2) {
        return m11455d((b2 & 255) | 65280);
    }

    /* renamed from: k */
    public static final boolean m11448k(ik5 ik5Var, byte[] bArr, int i) {
        if (ik5Var.m19713i() < i) {
            return false;
        }
        ik5Var.m19720b(bArr, 0, i);
        return true;
    }

    @Override // com.daaw.ac2
    /* renamed from: a */
    public final void mo2553a(ik5 ik5Var) {
        int i;
        m42 m42Var;
        long j;
        int i2;
        int i3;
        Objects.requireNonNull(this.f25080f);
        int i4 = it5.f13991a;
        while (ik5Var.m19713i() > 0) {
            int i5 = this.f25082h;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] m19714h = ik5Var.m19714h();
                int m19711k = ik5Var.m19711k();
                int m19710l = ik5Var.m19710l();
                while (m19711k < m19710l) {
                    int i8 = m19711k + 1;
                    int i9 = m19714h[m19711k] & 255;
                    if (this.f25084j == 512 && m11449j((byte) -1, (byte) i9)) {
                        if (!this.f25086l) {
                            int i10 = i8 - 2;
                            ik5Var.m19716f(i10 + 1);
                            if (m11448k(ik5Var, this.f25076b.f5841a, 1)) {
                                this.f25076b.m25324h(4);
                                int m25329c = this.f25076b.m25329c(1);
                                int i11 = this.f25087m;
                                if (i11 == -1 || m25329c == i11) {
                                    if (this.f25088n != -1) {
                                        if (m11448k(ik5Var, this.f25076b.f5841a, 1)) {
                                            this.f25076b.m25324h(i7);
                                            if (this.f25076b.m25329c(4) == this.f25088n) {
                                                ik5Var.m19716f(i10 + 2);
                                            }
                                        }
                                    }
                                    if (m11448k(ik5Var, this.f25076b.f5841a, 4)) {
                                        this.f25076b.m25324h(14);
                                        int m25329c2 = this.f25076b.m25329c(i6);
                                        if (m25329c2 >= 7) {
                                            byte[] m19714h2 = ik5Var.m19714h();
                                            int m19710l2 = ik5Var.m19710l();
                                            int i12 = i10 + m25329c2;
                                            if (i12 < m19710l2) {
                                                byte b = m19714h2[i12];
                                                if (b == -1) {
                                                    int i13 = i12 + 1;
                                                    if (i13 != m19710l2) {
                                                        byte b2 = m19714h2[i13];
                                                        if (m11449j((byte) -1, b2) && ((b2 & 8) >> 3) == m25329c) {
                                                        }
                                                    }
                                                } else if (b == 73) {
                                                    int i14 = i12 + 1;
                                                    if (i14 != m19710l2) {
                                                        if (m19714h2[i14] == 68) {
                                                            int i15 = i12 + 2;
                                                            if (i15 != m19710l2) {
                                                                if (m19714h2[i15] == 51) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                ik5Var.m19716f(i8);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.f25089o = (i9 & 8) >> 3;
                        this.f25085k = 1 == ((i9 & 1) ^ 1);
                        if (this.f25086l) {
                            m11452g();
                        } else {
                            this.f25082h = 1;
                            this.f25083i = 0;
                        }
                        ik5Var.m19716f(i8);
                        break;
                        break;
                    }
                    int i16 = this.f25084j;
                    int i17 = i16 | i9;
                    if (i17 == 329) {
                        i3 = 768;
                    } else if (i17 == 511) {
                        i3 = 512;
                    } else if (i17 == 836) {
                        i3 = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                    } else if (i17 == 1075) {
                        this.f25082h = 2;
                        this.f25083i = 3;
                        this.f25092r = 0;
                        this.f25077c.m19716f(0);
                        ik5Var.m19716f(i8);
                        break;
                        break;
                    } else if (i16 != 256) {
                        this.f25084j = 256;
                        m19711k = i8 - 1;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        m19711k = i8;
                        i6 = 13;
                        i7 = 2;
                    }
                    this.f25084j = i3;
                    m19711k = i8;
                    i6 = 13;
                    i7 = 2;
                }
                ik5Var.m19716f(m19711k);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(ik5Var.m19713i(), this.f25092r - this.f25083i);
                        this.f25094t.mo16221c(ik5Var, min);
                        int i18 = this.f25083i + min;
                        this.f25083i = i18;
                        int i19 = this.f25092r;
                        if (i18 == i19) {
                            long j2 = this.f25093s;
                            if (j2 != -9223372036854775807L) {
                                this.f25094t.mo16222b(j2, 1, i19, 0, null);
                                this.f25093s += this.f25095u;
                            }
                            m11453f();
                        }
                    } else {
                        if (m11450i(ik5Var, this.f25076b.f5841a, true != this.f25085k ? 5 : 7)) {
                            this.f25076b.m25324h(0);
                            if (this.f25090p) {
                                this.f25076b.m25322j(10);
                            } else {
                                int m25329c3 = this.f25076b.m25329c(2) + 1;
                                if (m25329c3 != 2) {
                                    s95.m10493e("AdtsReader", "Detected audio object type: " + m25329c3 + ", but assuming AAC LC.");
                                }
                                this.f25076b.m25322j(5);
                                int m25329c4 = this.f25076b.m25329c(3);
                                int i20 = this.f25088n;
                                int i21 = zy8.f35684c;
                                byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((m25329c4 << 3) & x21.f31789G0) | ((i20 << 7) & 128))};
                                yy8 m1766a = zy8.m1766a(bArr);
                                b72 b72Var = new b72();
                                b72Var.m26384h(this.f25079e);
                                b72Var.m26372s("audio/mp4a-latm");
                                b72Var.m26387f0(m1766a.f34268c);
                                b72Var.m26389e0(m1766a.f34267b);
                                b72Var.m26371t(m1766a.f34266a);
                                b72Var.m26382i(Collections.singletonList(bArr));
                                b72Var.m26380k(this.f25078d);
                                f92 m26366y = b72Var.m26366y();
                                this.f25091q = 1024000000 / m26366y.f9289z;
                                this.f25080f.mo16218f(m26366y);
                                this.f25090p = true;
                            }
                            this.f25076b.m25322j(4);
                            int m25329c5 = this.f25076b.m25329c(13) - 7;
                            if (this.f25085k) {
                                m25329c5 -= 2;
                            }
                            i = m25329c5;
                            m42Var = this.f25080f;
                            j = this.f25091q;
                            i2 = 0;
                            m11451h(m42Var, j, i2, i);
                        }
                    }
                } else if (m11450i(ik5Var, this.f25077c.m19714h(), 10)) {
                    this.f25081g.mo16221c(this.f25077c, 10);
                    this.f25077c.m19716f(6);
                    m42Var = this.f25081g;
                    j = 0;
                    i2 = 10;
                    i = 10 + this.f25077c.m19704r();
                    m11451h(m42Var, j, i2, i);
                }
            } else if (ik5Var.m19713i() != 0) {
                cj5 cj5Var = this.f25076b;
                cj5Var.f5841a[0] = ik5Var.m19714h()[ik5Var.m19711k()];
                cj5Var.m25324h(2);
                int m25329c6 = this.f25076b.m25329c(4);
                int i22 = this.f25088n;
                if (i22 == -1 || m25329c6 == i22) {
                    if (!this.f25086l) {
                        this.f25086l = true;
                        this.f25087m = this.f25089o;
                        this.f25088n = m25329c6;
                    }
                    m11452g();
                } else {
                    m11454e();
                }
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f25079e = td2Var.m9283b();
        m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 1);
        this.f25080f = mo3292n;
        this.f25094t = mo3292n;
        if (!this.f25075a) {
            this.f25081g = new i09();
            return;
        }
        td2Var.m9282c();
        m42 mo3292n2 = m09Var.mo3292n(td2Var.m9284a(), 5);
        this.f25081g = mo3292n2;
        b72 b72Var = new b72();
        b72Var.m26384h(td2Var.m9283b());
        b72Var.m26372s("application/id3");
        mo3292n2.mo16218f(b72Var.m26366y());
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f25093s = j;
        }
    }

    /* renamed from: e */
    public final void m11454e() {
        this.f25086l = false;
        m11453f();
    }

    /* renamed from: f */
    public final void m11453f() {
        this.f25082h = 0;
        this.f25083i = 0;
        this.f25084j = 256;
    }

    /* renamed from: g */
    public final void m11452g() {
        this.f25082h = 3;
        this.f25083i = 0;
    }

    /* renamed from: h */
    public final void m11451h(m42 m42Var, long j, int i, int i2) {
        this.f25082h = 4;
        this.f25083i = i;
        this.f25094t = m42Var;
        this.f25095u = j;
        this.f25092r = i2;
    }

    /* renamed from: i */
    public final boolean m11450i(ik5 ik5Var, byte[] bArr, int i) {
        int min = Math.min(ik5Var.m19713i(), i - this.f25083i);
        ik5Var.m19720b(bArr, this.f25083i, min);
        int i2 = this.f25083i + min;
        this.f25083i = i2;
        return i2 == i;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f25093s = -9223372036854775807L;
        m11454e();
    }
}
