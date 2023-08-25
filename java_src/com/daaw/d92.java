package com.daaw;
/* loaded from: classes.dex */
public final class d92 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final ik5 f;
    public final ik5 g;
    public int h;
    public int i;

    public d92(ik5 ik5Var, ik5 ik5Var2, boolean z) {
        this.g = ik5Var;
        this.f = ik5Var2;
        this.e = z;
        ik5Var2.f(12);
        this.a = ik5Var2.v();
        ik5Var.f(12);
        this.i = ik5Var.v();
        n09.b(ik5Var.m() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.B() : this.f.A();
        if (this.b == this.h) {
            this.c = this.g.v();
            this.g.g(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.v() : -1;
        }
        return true;
    }
}
