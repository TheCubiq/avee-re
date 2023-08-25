package com.daaw;

import android.util.Pair;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class t1 implements wv {
    public static final byte[] r = {73, 68, 51};
    public final boolean a;
    public final qv0 b;
    public final rv0 c;
    public final String d;
    public String e;
    public sm1 f;
    public sm1 g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public long m;
    public int n;
    public long o;
    public sm1 p;
    public long q;

    public t1(boolean z) {
        this(z, null);
    }

    public t1(boolean z, String str) {
        this.b = new qv0(new byte[7]);
        this.c = new rv0(Arrays.copyOf(r, 10));
        k();
        this.a = z;
        this.d = str;
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        while (rv0Var.a() > 0) {
            int i = this.h;
            if (i == 0) {
                g(rv0Var);
            } else if (i != 1) {
                if (i == 2) {
                    if (f(rv0Var, this.b.a, this.k ? 7 : 5)) {
                        h();
                    }
                } else if (i == 3) {
                    j(rv0Var);
                }
            } else if (f(rv0Var, this.c.a, 10)) {
                i();
            }
        }
    }

    @Override // com.daaw.wv
    public void b() {
        k();
    }

    @Override // com.daaw.wv
    public void c() {
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = d00Var.a(dVar.c(), 1);
        if (!this.a) {
            this.g = new ev();
            return;
        }
        dVar.a();
        sm1 a = d00Var.a(dVar.c(), 4);
        this.g = a;
        a.d(Format.y(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        this.o = j;
    }

    public final boolean f(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.a(), i - this.i);
        rv0Var.g(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    public final void g(rv0 rv0Var) {
        int i;
        byte[] bArr = rv0Var.a;
        int c = rv0Var.c();
        int d = rv0Var.d();
        while (c < d) {
            int i2 = c + 1;
            int i3 = bArr[c] & 255;
            int i4 = this.j;
            if (i4 != 512 || i3 < 240 || i3 == 255) {
                int i5 = i3 | i4;
                if (i5 != 329) {
                    if (i5 == 511) {
                        this.j = 512;
                    } else if (i5 == 836) {
                        i = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                    } else if (i5 == 1075) {
                        m();
                    } else if (i4 != 256) {
                        this.j = 256;
                        i2--;
                    }
                    c = i2;
                } else {
                    i = 768;
                }
                this.j = i;
                c = i2;
            } else {
                this.k = (i3 & 1) == 0;
                l();
            }
            rv0Var.J(i2);
            return;
        }
        rv0Var.J(c);
    }

    public final void h() {
        this.b.m(0);
        if (this.l) {
            this.b.o(10);
        } else {
            int h = this.b.h(2) + 1;
            if (h != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Detected audio object type: ");
                sb.append(h);
                sb.append(", but assuming AAC LC.");
                h = 2;
            }
            int h2 = this.b.h(4);
            this.b.o(1);
            byte[] a = eg.a(h, h2, this.b.h(3));
            Pair<Integer, Integer> i = eg.i(a);
            Format u = Format.u(this.e, "audio/mp4a-latm", null, -1, -1, ((Integer) i.second).intValue(), ((Integer) i.first).intValue(), Collections.singletonList(a), null, 0, this.d);
            this.m = 1024000000 / u.H;
            this.f.d(u);
            this.l = true;
        }
        this.b.o(4);
        int h3 = (this.b.h(13) - 2) - 5;
        if (this.k) {
            h3 -= 2;
        }
        n(this.f, this.m, 0, h3);
    }

    public final void i() {
        this.g.c(this.c, 10);
        this.c.J(6);
        n(this.g, 0L, 10, this.c.w() + 10);
    }

    public final void j(rv0 rv0Var) {
        int min = Math.min(rv0Var.a(), this.n - this.i);
        this.p.c(rv0Var, min);
        int i = this.i + min;
        this.i = i;
        int i2 = this.n;
        if (i == i2) {
            this.p.a(this.o, 1, i2, 0, null);
            this.o += this.q;
            k();
        }
    }

    public final void k() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    public final void l() {
        this.h = 2;
        this.i = 0;
    }

    public final void m() {
        this.h = 1;
        this.i = r.length;
        this.n = 0;
        this.c.J(0);
    }

    public final void n(sm1 sm1Var, long j, int i, int i2) {
        this.h = 3;
        this.i = i;
        this.p = sm1Var;
        this.q = j;
        this.n = i2;
    }
}
