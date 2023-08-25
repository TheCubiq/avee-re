package com.daaw;

import android.util.Pair;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class ti0 implements wv {
    public final String a;
    public final rv0 b;
    public final qv0 c;
    public sm1 d;
    public Format e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;

    public ti0(String str) {
        this.a = str;
        rv0 rv0Var = new rv0((int) NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        this.b = rv0Var;
        this.c = new qv0(rv0Var.a);
    }

    public static long f(qv0 qv0Var) {
        return qv0Var.h((qv0Var.h(2) + 1) * 8);
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        while (rv0Var.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int x = rv0Var.x();
                    if ((x & 224) == 224) {
                        this.j = x;
                        this.g = 2;
                    } else if (x != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int x2 = ((this.j & (-225)) << 8) | rv0Var.x();
                    this.i = x2;
                    if (x2 > this.b.a.length) {
                        m(x2);
                    }
                    this.h = 0;
                    this.g = 3;
                } else if (i == 3) {
                    int min = Math.min(rv0Var.a(), this.i - this.h);
                    rv0Var.g(this.c.a, this.h, min);
                    int i2 = this.h + min;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.m(0);
                        g(this.c);
                        this.g = 0;
                    }
                }
            } else if (rv0Var.x() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // com.daaw.wv
    public void b() {
        this.g = 0;
        this.l = false;
    }

    @Override // com.daaw.wv
    public void c() {
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        this.d = d00Var.a(dVar.c(), 1);
        this.f = dVar.b();
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        this.k = j;
    }

    public final void g(qv0 qv0Var) {
        if (!qv0Var.g()) {
            this.l = true;
            l(qv0Var);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw new tv0();
        }
        if (this.n != 0) {
            throw new tv0();
        }
        k(qv0Var, j(qv0Var));
        if (this.p) {
            qv0Var.o((int) this.q);
        }
    }

    public final int h(qv0 qv0Var) {
        int b = qv0Var.b();
        Pair<Integer, Integer> h = eg.h(qv0Var, true);
        this.r = ((Integer) h.first).intValue();
        this.t = ((Integer) h.second).intValue();
        return b - qv0Var.b();
    }

    public final void i(qv0 qv0Var) {
        int i;
        int h = qv0Var.h(3);
        this.o = h;
        if (h == 0) {
            i = 8;
        } else if (h != 1) {
            if (h == 3 || h == 4 || h == 5) {
                qv0Var.o(6);
                return;
            } else if (h == 6 || h == 7) {
                qv0Var.o(1);
                return;
            } else {
                return;
            }
        } else {
            i = 9;
        }
        qv0Var.o(i);
    }

    public final int j(qv0 qv0Var) {
        int h;
        if (this.o == 0) {
            int i = 0;
            do {
                h = qv0Var.h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw new tv0();
    }

    public final void k(qv0 qv0Var, int i) {
        int e = qv0Var.e();
        if ((e & 7) == 0) {
            this.b.J(e >> 3);
        } else {
            qv0Var.i(this.b.a, 0, i * 8);
            this.b.J(0);
        }
        this.d.c(this.b, i);
        this.d.a(this.k, 1, i, 0, null);
        this.k += this.s;
    }

    public final void l(qv0 qv0Var) {
        boolean g;
        int h = qv0Var.h(1);
        int h2 = h == 1 ? qv0Var.h(1) : 0;
        this.m = h2;
        if (h2 != 0) {
            throw new tv0();
        }
        if (h == 1) {
            f(qv0Var);
        }
        if (!qv0Var.g()) {
            throw new tv0();
        }
        this.n = qv0Var.h(6);
        int h3 = qv0Var.h(4);
        int h4 = qv0Var.h(3);
        if (h3 != 0 || h4 != 0) {
            throw new tv0();
        }
        if (h == 0) {
            int e = qv0Var.e();
            int h5 = h(qv0Var);
            qv0Var.m(e);
            byte[] bArr = new byte[(h5 + 7) / 8];
            qv0Var.i(bArr, 0, h5);
            Format u = Format.u(this.f, "audio/mp4a-latm", null, -1, -1, this.t, this.r, Collections.singletonList(bArr), null, 0, this.a);
            if (!u.equals(this.e)) {
                this.e = u;
                this.s = 1024000000 / u.H;
                this.d.d(u);
            }
        } else {
            qv0Var.o(((int) f(qv0Var)) - h(qv0Var));
        }
        i(qv0Var);
        boolean g2 = qv0Var.g();
        this.p = g2;
        this.q = 0L;
        if (g2) {
            if (h == 1) {
                this.q = f(qv0Var);
            } else {
                do {
                    g = qv0Var.g();
                    this.q = (this.q << 8) + qv0Var.h(8);
                } while (g);
            }
        }
        if (qv0Var.g()) {
            qv0Var.o(8);
        }
    }

    public final void m(int i) {
        this.b.G(i);
        this.c.k(this.b.a);
    }
}
