package com.daaw;
/* loaded from: classes.dex */
public final class oc2 implements ac2 {
    public final ik5 a;
    public final y32 b;
    public final String c;
    public m42 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public oc2(String str) {
        ik5 ik5Var = new ik5(4);
        this.a = ik5Var;
        ik5Var.h()[0] = -1;
        this.b = new y32();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.daaw.ac2
    public final void a(ik5 ik5Var) {
        y32 y32Var;
        uo4.b(this.d);
        while (ik5Var.i() > 0) {
            int i = this.f;
            if (i == 0) {
                byte[] h = ik5Var.h();
                int l = ik5Var.l();
                for (int k = ik5Var.k(); k < l; k++) {
                    byte b = h[k];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        ik5Var.f(k + 1);
                        this.i = false;
                        this.a.h()[1] = h[k];
                        this.g = 2;
                        this.f = 1;
                        break;
                        break;
                    }
                }
                ik5Var.f(l);
            } else if (i != 1) {
                int min = Math.min(ik5Var.i(), this.k - this.g);
                this.d.c(ik5Var, min);
                int i2 = this.g + min;
                this.g = i2;
                int i3 = this.k;
                if (i2 >= i3) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.b(j, 1, i3, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                int min2 = Math.min(ik5Var.i(), 4 - this.g);
                ik5Var.b(this.a.h(), this.g, min2);
                int i4 = this.g + min2;
                this.g = i4;
                if (i4 >= 4) {
                    this.a.f(0);
                    if (!this.b.a(this.a.m())) {
                        this.g = 0;
                        this.f = 1;
                        break;
                    }
                    this.k = this.b.c;
                    if (!this.h) {
                        this.j = (y32Var.g * 1000000) / y32Var.d;
                        b72 b72Var = new b72();
                        b72Var.h(this.e);
                        b72Var.s(this.b.b);
                        b72Var.l(4096);
                        b72Var.e0(this.b.e);
                        b72Var.t(this.b.d);
                        b72Var.k(this.c);
                        this.d.f(b72Var.y());
                        this.h = true;
                    }
                    this.a.f(0);
                    this.d.c(this.a, 4);
                    this.f = 2;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.e = td2Var.b();
        this.d = m09Var.n(td2Var.a(), 1);
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
}
