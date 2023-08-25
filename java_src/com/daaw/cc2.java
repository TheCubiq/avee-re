package com.daaw;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes.dex */
public final class cc2 implements ac2 {

    /* renamed from: q */
    public static final double[] f5701q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f5702a;

    /* renamed from: b */
    public m42 f5703b;

    /* renamed from: c */
    public final wd2 f5704c;

    /* renamed from: d */
    public final ik5 f5705d;

    /* renamed from: e */
    public final pc2 f5706e;

    /* renamed from: f */
    public final boolean[] f5707f = new boolean[4];

    /* renamed from: g */
    public final bc2 f5708g = new bc2(128);

    /* renamed from: h */
    public long f5709h;

    /* renamed from: i */
    public boolean f5710i;

    /* renamed from: j */
    public boolean f5711j;

    /* renamed from: k */
    public long f5712k;

    /* renamed from: l */
    public long f5713l;

    /* renamed from: m */
    public long f5714m;

    /* renamed from: n */
    public long f5715n;

    /* renamed from: o */
    public boolean f5716o;

    /* renamed from: p */
    public boolean f5717p;

    public cc2(wd2 wd2Var) {
        ik5 ik5Var;
        this.f5704c = wd2Var;
        if (wd2Var != null) {
            this.f5706e = new pc2(178, 128);
            ik5Var = new ik5();
        } else {
            ik5Var = null;
            this.f5706e = null;
        }
        this.f5705d = ik5Var;
        this.f5713l = -9223372036854775807L;
        this.f5715n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    @Override // com.daaw.ac2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2553a(ik5 ik5Var) {
        int i;
        pc2 pc2Var;
        int i2;
        long j;
        long j2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        uo4.m7876b(this.f5703b);
        int m19711k = ik5Var.m19711k();
        int m19710l = ik5Var.m19710l();
        byte[] m19714h = ik5Var.m19714h();
        this.f5709h += ik5Var.m19713i();
        this.f5703b.mo16221c(ik5Var, ik5Var.m19713i());
        while (true) {
            int m25632a = c42.m25632a(m19714h, m19711k, m19710l, this.f5707f);
            if (m25632a == m19710l) {
                break;
            }
            int i6 = m25632a + 3;
            int i7 = ik5Var.m19714h()[i6] & 255;
            int i8 = m25632a - m19711k;
            if (!this.f5711j) {
                if (i8 > 0) {
                    this.f5708g.m26229a(m19714h, m19711k, m25632a);
                }
                if (this.f5708g.m26227c(i7, i8 < 0 ? -i8 : 0)) {
                    bc2 bc2Var = this.f5708g;
                    String str = this.f5702a;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(bc2Var.f4693d, bc2Var.f4691b);
                    byte b = copyOf[4];
                    int i9 = copyOf[5] & 255;
                    int i10 = ((b & 255) << 4) | (i9 >> 4);
                    int i11 = ((i9 & 15) << 8) | (copyOf[6] & 255);
                    int i12 = (copyOf[7] & 240) >> 4;
                    if (i12 == 2) {
                        f = i11 * 4;
                        i4 = i10 * 3;
                    } else if (i12 == 3) {
                        f = i11 * 16;
                        i4 = i10 * 9;
                    } else if (i12 != 4) {
                        f2 = 1.0f;
                        b72 b72Var = new b72();
                        b72Var.m26384h(str);
                        b72Var.m26372s("video/mpeg2");
                        b72Var.m26367x(i10);
                        b72Var.m26388f(i11);
                        b72Var.m26375p(f2);
                        b72Var.m26382i(Collections.singletonList(copyOf));
                        f92 m26366y = b72Var.m26366y();
                        i5 = (copyOf[7] & 15) - 1;
                        long j3 = 0;
                        if (i5 >= 0 || i5 >= 8) {
                            i = i6;
                        } else {
                            double d = f5701q[i5];
                            byte b2 = copyOf[bc2Var.f4692c + 9];
                            int i13 = (b2 & 96) >> 5;
                            int i14 = b2 & 31;
                            if (i13 != i14) {
                                double d2 = i13;
                                Double.isNaN(d2);
                                i = i6;
                                double d3 = i14 + 1;
                                Double.isNaN(d3);
                                d *= (d2 + 1.0d) / d3;
                            } else {
                                i = i6;
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(m26366y, Long.valueOf(j3));
                        this.f5703b.mo16218f((f92) create.first);
                        this.f5712k = ((Long) create.second).longValue();
                        this.f5711j = true;
                        pc2Var = this.f5706e;
                        if (pc2Var != null) {
                            if (i8 > 0) {
                                pc2Var.m13456a(m19714h, m19711k, m25632a);
                                i3 = 0;
                            } else {
                                i3 = -i8;
                            }
                            if (this.f5706e.m13453d(i3)) {
                                pc2 pc2Var2 = this.f5706e;
                                int m25631b = c42.m25631b(pc2Var2.f22829d, pc2Var2.f22830e);
                                ik5 ik5Var2 = this.f5705d;
                                int i15 = it5.f13991a;
                                ik5Var2.m19718d(this.f5706e.f22829d, m25631b);
                                this.f5704c.m6156a(this.f5715n, this.f5705d);
                            }
                            if (i7 == 178) {
                                if (ik5Var.m19714h()[m25632a + 2] == 1) {
                                    this.f5706e.m13454c(178);
                                }
                                i7 = 178;
                            }
                        }
                        if (i7 != 0 || i7 == 179) {
                            i2 = m19710l - m25632a;
                            if (this.f5717p && this.f5711j) {
                                j2 = this.f5715n;
                                if (j2 != -9223372036854775807L) {
                                    this.f5703b.mo16222b(j2, this.f5716o ? 1 : 0, ((int) (this.f5709h - this.f5714m)) - i2, i2, null);
                                }
                            }
                            if (this.f5710i || this.f5717p) {
                                this.f5714m = this.f5709h - i2;
                                j = this.f5713l;
                                if (j == -9223372036854775807L) {
                                    long j4 = this.f5715n;
                                    j = j4 != -9223372036854775807L ? j4 + this.f5712k : -9223372036854775807L;
                                }
                                this.f5715n = j;
                                this.f5716o = false;
                                this.f5713l = -9223372036854775807L;
                                this.f5710i = true;
                            }
                            this.f5717p = i7 == 0;
                        } else if (i7 == 184) {
                            this.f5716o = true;
                        }
                        m19711k = i;
                    } else {
                        f = i11 * x21.f31794H0;
                        i4 = i10 * 100;
                    }
                    f2 = f / i4;
                    b72 b72Var2 = new b72();
                    b72Var2.m26384h(str);
                    b72Var2.m26372s("video/mpeg2");
                    b72Var2.m26367x(i10);
                    b72Var2.m26388f(i11);
                    b72Var2.m26375p(f2);
                    b72Var2.m26382i(Collections.singletonList(copyOf));
                    f92 m26366y2 = b72Var2.m26366y();
                    i5 = (copyOf[7] & 15) - 1;
                    long j32 = 0;
                    if (i5 >= 0) {
                    }
                    i = i6;
                    Pair create2 = Pair.create(m26366y2, Long.valueOf(j32));
                    this.f5703b.mo16218f((f92) create2.first);
                    this.f5712k = ((Long) create2.second).longValue();
                    this.f5711j = true;
                    pc2Var = this.f5706e;
                    if (pc2Var != null) {
                    }
                    if (i7 != 0) {
                    }
                    i2 = m19710l - m25632a;
                    if (this.f5717p) {
                        j2 = this.f5715n;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.f5710i) {
                    }
                    this.f5714m = this.f5709h - i2;
                    j = this.f5713l;
                    if (j == -9223372036854775807L) {
                    }
                    this.f5715n = j;
                    this.f5716o = false;
                    this.f5713l = -9223372036854775807L;
                    this.f5710i = true;
                    this.f5717p = i7 == 0;
                    m19711k = i;
                }
            }
            i = i6;
            pc2Var = this.f5706e;
            if (pc2Var != null) {
            }
            if (i7 != 0) {
            }
            i2 = m19710l - m25632a;
            if (this.f5717p) {
            }
            if (this.f5710i) {
            }
            this.f5714m = this.f5709h - i2;
            j = this.f5713l;
            if (j == -9223372036854775807L) {
            }
            this.f5715n = j;
            this.f5716o = false;
            this.f5713l = -9223372036854775807L;
            this.f5710i = true;
            this.f5717p = i7 == 0;
            m19711k = i;
        }
        if (!this.f5711j) {
            this.f5708g.m26229a(m19714h, m19711k, m19710l);
        }
        pc2 pc2Var3 = this.f5706e;
        if (pc2Var3 != null) {
            pc2Var3.m13456a(m19714h, m19711k, m19710l);
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f5702a = td2Var.m9283b();
        this.f5703b = m09Var.mo3292n(td2Var.m9284a(), 2);
        wd2 wd2Var = this.f5704c;
        if (wd2Var != null) {
            wd2Var.m6155b(m09Var, td2Var);
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        this.f5713l = j;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        c42.m25628e(this.f5707f);
        this.f5708g.m26228b();
        pc2 pc2Var = this.f5706e;
        if (pc2Var != null) {
            pc2Var.m13455b();
        }
        this.f5709h = 0L;
        this.f5710i = false;
        this.f5713l = -9223372036854775807L;
        this.f5715n = -9223372036854775807L;
    }
}
