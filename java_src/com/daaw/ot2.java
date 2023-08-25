package com.daaw;
/* loaded from: classes.dex */
public final class ot2 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final iz2 f;
    public final iz2 g;
    public int h;
    public int i;

    public ot2(iz2 iz2Var, iz2 iz2Var2, boolean z) {
        this.g = iz2Var;
        this.f = iz2Var2;
        this.e = z;
        iz2Var2.v(12);
        this.a = iz2Var2.i();
        iz2Var.v(12);
        this.i = iz2Var.i();
        az2.f(iz2Var.e() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.n() : this.f.m();
        if (this.b == this.h) {
            this.c = this.g.i();
            this.g.w(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.i() : -1;
        }
        return true;
    }
}
