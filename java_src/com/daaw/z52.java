package com.daaw;
/* loaded from: classes.dex */
public final class z52 extends y52 {
    public final ik5 b;
    public final ik5 c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public z52(m42 m42Var) {
        super(m42Var);
        this.b = new ik5(c42.a);
        this.c = new ik5(4);
    }

    @Override // com.daaw.y52
    public final boolean a(ik5 ik5Var) {
        int s = ik5Var.s();
        int i = s >> 4;
        int i2 = s & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new x52("Video format not supported: " + i2);
    }

    @Override // com.daaw.y52
    public final boolean b(ik5 ik5Var, long j) {
        int s = ik5Var.s();
        long n = j + (ik5Var.n() * 1000);
        if (s == 0) {
            if (!this.e) {
                ik5 ik5Var2 = new ik5(new byte[ik5Var.i()]);
                ik5Var.b(ik5Var2.h(), 0, ik5Var.i());
                gz8 a = gz8.a(ik5Var2);
                this.d = a.b;
                b72 b72Var = new b72();
                b72Var.s("video/avc");
                b72Var.f0(a.f);
                b72Var.x(a.c);
                b72Var.f(a.d);
                b72Var.p(a.e);
                b72Var.i(a.a);
                this.a.f(b72Var.y());
                this.e = true;
                return false;
            }
        } else if (s == 1 && this.e) {
            int i = this.g == 1 ? 1 : 0;
            if (this.f || i != 0) {
                byte[] h = this.c.h();
                h[0] = 0;
                h[1] = 0;
                h[2] = 0;
                int i2 = 4 - this.d;
                int i3 = 0;
                while (ik5Var.i() > 0) {
                    ik5Var.b(this.c.h(), i2, this.d);
                    this.c.f(0);
                    int v = this.c.v();
                    this.b.f(0);
                    this.a.c(this.b, 4);
                    this.a.c(ik5Var, v);
                    i3 = i3 + 4 + v;
                }
                this.a.b(n, i, i3, 0, null);
                this.f = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
