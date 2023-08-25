package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class rb2 implements ac2 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final cj5 b = new cj5(new byte[7], 7);
    public final ik5 c = new ik5(Arrays.copyOf(v, 10));
    public final String d;
    public String e;
    public m42 f;
    public m42 g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public m42 t;
    public long u;

    public rb2(boolean z, String str) {
        f();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = z;
        this.d = str;
    }

    public static boolean d(int i) {
        return (i & 65526) == 65520;
    }

    public static final boolean j(byte b, byte b2) {
        return d((b2 & 255) | 65280);
    }

    public static final boolean k(ik5 ik5Var, byte[] bArr, int i) {
        if (ik5Var.i() < i) {
            return false;
        }
        ik5Var.b(bArr, 0, i);
        return true;
    }

    @Override // com.daaw.ac2
    public final void a(ik5 ik5Var) {
        int i;
        m42 m42Var;
        long j;
        int i2;
        int i3;
        Objects.requireNonNull(this.f);
        int i4 = it5.a;
        while (ik5Var.i() > 0) {
            int i5 = this.h;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] h = ik5Var.h();
                int k = ik5Var.k();
                int l = ik5Var.l();
                while (k < l) {
                    int i8 = k + 1;
                    int i9 = h[k] & 255;
                    if (this.j == 512 && j((byte) -1, (byte) i9)) {
                        if (!this.l) {
                            int i10 = i8 - 2;
                            ik5Var.f(i10 + 1);
                            if (k(ik5Var, this.b.a, 1)) {
                                this.b.h(4);
                                int c = this.b.c(1);
                                int i11 = this.m;
                                if (i11 == -1 || c == i11) {
                                    if (this.n != -1) {
                                        if (k(ik5Var, this.b.a, 1)) {
                                            this.b.h(i7);
                                            if (this.b.c(4) == this.n) {
                                                ik5Var.f(i10 + 2);
                                            }
                                        }
                                    }
                                    if (k(ik5Var, this.b.a, 4)) {
                                        this.b.h(14);
                                        int c2 = this.b.c(i6);
                                        if (c2 >= 7) {
                                            byte[] h2 = ik5Var.h();
                                            int l2 = ik5Var.l();
                                            int i12 = i10 + c2;
                                            if (i12 < l2) {
                                                byte b = h2[i12];
                                                if (b == -1) {
                                                    int i13 = i12 + 1;
                                                    if (i13 != l2) {
                                                        byte b2 = h2[i13];
                                                        if (j((byte) -1, b2) && ((b2 & 8) >> 3) == c) {
                                                        }
                                                    }
                                                } else if (b == 73) {
                                                    int i14 = i12 + 1;
                                                    if (i14 != l2) {
                                                        if (h2[i14] == 68) {
                                                            int i15 = i12 + 2;
                                                            if (i15 != l2) {
                                                                if (h2[i15] == 51) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                ik5Var.f(i8);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.o = (i9 & 8) >> 3;
                        this.k = 1 == ((i9 & 1) ^ 1);
                        if (this.l) {
                            g();
                        } else {
                            this.h = 1;
                            this.i = 0;
                        }
                        ik5Var.f(i8);
                        break;
                        break;
                    }
                    int i16 = this.j;
                    int i17 = i16 | i9;
                    if (i17 == 329) {
                        i3 = 768;
                    } else if (i17 == 511) {
                        i3 = 512;
                    } else if (i17 == 836) {
                        i3 = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                    } else if (i17 == 1075) {
                        this.h = 2;
                        this.i = 3;
                        this.r = 0;
                        this.c.f(0);
                        ik5Var.f(i8);
                        break;
                        break;
                    } else if (i16 != 256) {
                        this.j = 256;
                        k = i8 - 1;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        k = i8;
                        i6 = 13;
                        i7 = 2;
                    }
                    this.j = i3;
                    k = i8;
                    i6 = 13;
                    i7 = 2;
                }
                ik5Var.f(k);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(ik5Var.i(), this.r - this.i);
                        this.t.c(ik5Var, min);
                        int i18 = this.i + min;
                        this.i = i18;
                        int i19 = this.r;
                        if (i18 == i19) {
                            long j2 = this.s;
                            if (j2 != -9223372036854775807L) {
                                this.t.b(j2, 1, i19, 0, null);
                                this.s += this.u;
                            }
                            f();
                        }
                    } else {
                        if (i(ik5Var, this.b.a, true != this.k ? 5 : 7)) {
                            this.b.h(0);
                            if (this.p) {
                                this.b.j(10);
                            } else {
                                int c3 = this.b.c(2) + 1;
                                if (c3 != 2) {
                                    s95.e("AdtsReader", "Detected audio object type: " + c3 + ", but assuming AAC LC.");
                                }
                                this.b.j(5);
                                int c4 = this.b.c(3);
                                int i20 = this.n;
                                int i21 = zy8.c;
                                byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((c4 << 3) & x21.G0) | ((i20 << 7) & 128))};
                                yy8 a = zy8.a(bArr);
                                b72 b72Var = new b72();
                                b72Var.h(this.e);
                                b72Var.s("audio/mp4a-latm");
                                b72Var.f0(a.c);
                                b72Var.e0(a.b);
                                b72Var.t(a.a);
                                b72Var.i(Collections.singletonList(bArr));
                                b72Var.k(this.d);
                                f92 y = b72Var.y();
                                this.q = 1024000000 / y.z;
                                this.f.f(y);
                                this.p = true;
                            }
                            this.b.j(4);
                            int c5 = this.b.c(13) - 7;
                            if (this.k) {
                                c5 -= 2;
                            }
                            i = c5;
                            m42Var = this.f;
                            j = this.q;
                            i2 = 0;
                            h(m42Var, j, i2, i);
                        }
                    }
                } else if (i(ik5Var, this.c.h(), 10)) {
                    this.g.c(this.c, 10);
                    this.c.f(6);
                    m42Var = this.g;
                    j = 0;
                    i2 = 10;
                    i = 10 + this.c.r();
                    h(m42Var, j, i2, i);
                }
            } else if (ik5Var.i() != 0) {
                cj5 cj5Var = this.b;
                cj5Var.a[0] = ik5Var.h()[ik5Var.k()];
                cj5Var.h(2);
                int c6 = this.b.c(4);
                int i22 = this.n;
                if (i22 == -1 || c6 == i22) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = c6;
                    }
                    g();
                } else {
                    e();
                }
            }
        }
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.e = td2Var.b();
        m42 n = m09Var.n(td2Var.a(), 1);
        this.f = n;
        this.t = n;
        if (!this.a) {
            this.g = new i09();
            return;
        }
        td2Var.c();
        m42 n2 = m09Var.n(td2Var.a(), 5);
        this.g = n2;
        b72 b72Var = new b72();
        b72Var.h(td2Var.b());
        b72Var.s("application/id3");
        n2.f(b72Var.y());
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    public final void e() {
        this.l = false;
        f();
    }

    public final void f() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    public final void g() {
        this.h = 3;
        this.i = 0;
    }

    public final void h(m42 m42Var, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = m42Var;
        this.u = j;
        this.r = i2;
    }

    public final boolean i(ik5 ik5Var, byte[] bArr, int i) {
        int min = Math.min(ik5Var.i(), i - this.i);
        ik5Var.b(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.s = -9223372036854775807L;
        e();
    }
}
