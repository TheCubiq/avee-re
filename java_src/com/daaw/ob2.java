package com.daaw;
/* loaded from: classes.dex */
public final class ob2 implements ac2 {
    public final cj5 a;
    public final ik5 b;
    public final String c;
    public String d;
    public m42 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public f92 j;
    public int k;
    public long l;

    public ob2(String str) {
        cj5 cj5Var = new cj5(new byte[16], 16);
        this.a = cj5Var;
        this.b = new ik5(cj5Var.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.daaw.ac2
    public final void a(ik5 ik5Var) {
        uo4.b(this.e);
        while (ik5Var.i() > 0) {
            int i = this.f;
            if (i == 0) {
                while (ik5Var.i() > 0) {
                    if (this.h) {
                        int s = ik5Var.s();
                        this.h = s == 172;
                        if (s != 64) {
                            if (s == 65) {
                                s = 65;
                            }
                        }
                        this.f = 1;
                        ik5 ik5Var2 = this.b;
                        ik5Var2.h()[0] = -84;
                        ik5Var2.h()[1] = s == 65 ? (byte) 65 : (byte) 64;
                        this.g = 2;
                    } else {
                        this.h = ik5Var.s() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(ik5Var.i(), this.k - this.g);
                this.e.c(ik5Var, min);
                int i2 = this.g + min;
                this.g = i2;
                int i3 = this.k;
                if (i2 == i3) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.e.b(j, 1, i3, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            } else {
                byte[] h = this.b.h();
                int min2 = Math.min(ik5Var.i(), 16 - this.g);
                ik5Var.b(h, this.g, min2);
                int i4 = this.g + min2;
                this.g = i4;
                if (i4 == 16) {
                    this.a.h(0);
                    ez8 a = fz8.a(this.a);
                    f92 f92Var = this.j;
                    if (f92Var == null || f92Var.y != 2 || a.a != f92Var.z || !"audio/ac4".equals(f92Var.l)) {
                        b72 b72Var = new b72();
                        b72Var.h(this.d);
                        b72Var.s("audio/ac4");
                        b72Var.e0(2);
                        b72Var.t(a.a);
                        b72Var.k(this.c);
                        f92 y = b72Var.y();
                        this.j = y;
                        this.e.f(y);
                    }
                    this.k = a.b;
                    this.i = (a.c * 1000000) / this.j.z;
                    this.b.f(0);
                    this.e.c(this.b, 16);
                    this.f = 2;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.d = td2Var.b();
        this.e = m09Var.n(td2Var.a(), 1);
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
        this.h = false;
        this.l = -9223372036854775807L;
    }
}
