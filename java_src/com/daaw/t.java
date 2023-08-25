package com.daaw;

import com.daaw.eo1;
import com.daaw.u;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class t implements wv {
    public final qv0 a;
    public final rv0 b;
    public final String c;
    public String d;
    public sm1 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public Format j;
    public int k;
    public long l;

    public t() {
        this(null);
    }

    public t(String str) {
        qv0 qv0Var = new qv0(new byte[128]);
        this.a = qv0Var;
        this.b = new rv0(qv0Var.a);
        this.f = 0;
        this.c = str;
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        while (rv0Var.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(rv0Var.a(), this.k - this.g);
                        this.e.c(rv0Var, min);
                        int i2 = this.g + min;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.i;
                            this.f = 0;
                        }
                    }
                } else if (f(rv0Var, this.b.a, 128)) {
                    g();
                    this.b.J(0);
                    this.e.c(this.b, 128);
                    this.f = 2;
                }
            } else if (h(rv0Var)) {
                this.f = 1;
                byte[] bArr = this.b.a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.g = 2;
            }
        }
    }

    @Override // com.daaw.wv
    public void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    @Override // com.daaw.wv
    public void c() {
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = d00Var.a(dVar.c(), 1);
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        this.l = j;
    }

    public final boolean f(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.a(), i - this.g);
        rv0Var.g(bArr, this.g, min);
        int i2 = this.g + min;
        this.g = i2;
        return i2 == i;
    }

    public final void g() {
        this.a.m(0);
        u.b e = u.e(this.a);
        Format format = this.j;
        if (format == null || e.d != format.G || e.c != format.H || e.a != format.u) {
            Format u = Format.u(this.d, e.a, null, -1, -1, e.d, e.c, null, null, 0, this.c);
            this.j = u;
            this.e.d(u);
        }
        this.k = e.e;
        this.i = (e.f * 1000000) / this.j.H;
    }

    public final boolean h(rv0 rv0Var) {
        while (true) {
            boolean z = false;
            if (rv0Var.a() <= 0) {
                return false;
            }
            if (this.h) {
                int x = rv0Var.x();
                if (x == 119) {
                    this.h = false;
                    return true;
                }
                if (x != 11) {
                    this.h = z;
                }
                z = true;
                this.h = z;
            } else {
                if (rv0Var.x() != 11) {
                    this.h = z;
                }
                z = true;
                this.h = z;
            }
        }
    }
}
