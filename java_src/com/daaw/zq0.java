package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class zq0 implements wv {
    public final rv0 a;
    public final yq0 b;
    public final String c;
    public String d;
    public sm1 e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public zq0() {
        this(null);
    }

    public zq0(String str) {
        this.f = 0;
        rv0 rv0Var = new rv0(4);
        this.a = rv0Var;
        rv0Var.a[0] = -1;
        this.b = new yq0();
        this.c = str;
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        while (rv0Var.a() > 0) {
            int i = this.f;
            if (i == 0) {
                f(rv0Var);
            } else if (i == 1) {
                h(rv0Var);
            } else if (i == 2) {
                g(rv0Var);
            }
        }
    }

    @Override // com.daaw.wv
    public void b() {
        this.f = 0;
        this.g = 0;
        this.i = false;
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

    public final void f(rv0 rv0Var) {
        byte[] bArr = rv0Var.a;
        int d = rv0Var.d();
        for (int c = rv0Var.c(); c < d; c++) {
            boolean z = (bArr[c] & 255) == 255;
            boolean z2 = this.i && (bArr[c] & 224) == 224;
            this.i = z;
            if (z2) {
                rv0Var.J(c + 1);
                this.i = false;
                this.a.a[1] = bArr[c];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        rv0Var.J(d);
    }

    public final void g(rv0 rv0Var) {
        int min = Math.min(rv0Var.a(), this.k - this.g);
        this.e.c(rv0Var, min);
        int i = this.g + min;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        this.e.a(this.l, 1, i2, 0, null);
        this.l += this.j;
        this.g = 0;
        this.f = 0;
    }

    public final void h(rv0 rv0Var) {
        int min = Math.min(rv0Var.a(), 4 - this.g);
        rv0Var.g(this.a.a, this.g, min);
        int i = this.g + min;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.a.J(0);
        if (!yq0.b(this.a.i(), this.b)) {
            this.g = 0;
            this.f = 1;
            return;
        }
        yq0 yq0Var = this.b;
        this.k = yq0Var.c;
        if (!this.h) {
            int i2 = yq0Var.d;
            this.j = (yq0Var.g * 1000000) / i2;
            this.e.d(Format.u(this.d, yq0Var.b, null, -1, 4096, yq0Var.e, i2, null, null, 0, this.c));
            this.h = true;
        }
        this.a.J(0);
        this.e.c(this.a, 4);
        this.f = 2;
    }
}
