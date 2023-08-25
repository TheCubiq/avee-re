package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class cv implements wv {
    public final String b;
    public String c;
    public sm1 d;
    public int f;
    public int g;
    public long h;
    public Format i;
    public int j;
    public long k;
    public final rv0 a = new rv0(new byte[18]);
    public int e = 0;

    public cv(String str) {
        this.b = str;
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        while (rv0Var.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(rv0Var.a(), this.j - this.f);
                        this.d.c(rv0Var, min);
                        int i2 = this.f + min;
                        this.f = i2;
                        int i3 = this.j;
                        if (i2 == i3) {
                            this.d.a(this.k, 1, i3, 0, null);
                            this.k += this.h;
                            this.e = 0;
                        }
                    }
                } else if (f(rv0Var, this.a.a, 18)) {
                    g();
                    this.a.J(0);
                    this.d.c(this.a, 18);
                    this.e = 2;
                }
            } else if (h(rv0Var)) {
                this.e = 1;
            }
        }
    }

    @Override // com.daaw.wv
    public void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    @Override // com.daaw.wv
    public void c() {
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = d00Var.a(dVar.c(), 1);
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        this.k = j;
    }

    public final boolean f(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.a(), i - this.f);
        rv0Var.g(bArr, this.f, min);
        int i2 = this.f + min;
        this.f = i2;
        return i2 == i;
    }

    public final void g() {
        byte[] bArr = this.a.a;
        if (this.i == null) {
            Format g = dv.g(bArr, this.c, this.b, null);
            this.i = g;
            this.d.d(g);
        }
        this.j = dv.a(bArr);
        this.h = (int) ((dv.f(bArr) * 1000000) / this.i.H);
    }

    public final boolean h(rv0 rv0Var) {
        while (rv0Var.a() > 0) {
            int i = this.g << 8;
            this.g = i;
            int x = i | rv0Var.x();
            this.g = x;
            if (dv.d(x)) {
                byte[] bArr = this.a.a;
                int i2 = this.g;
                bArr[0] = (byte) ((i2 >> 24) & 255);
                bArr[1] = (byte) ((i2 >> 16) & 255);
                bArr[2] = (byte) ((i2 >> 8) & 255);
                bArr[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }
}
