package com.daaw;
/* loaded from: classes.dex */
public final class yk8 {
    public final hi8[] a;
    public final um8 b;
    public final ym8 c;

    public yk8(hi8... hi8VarArr) {
        um8 um8Var = new um8();
        ym8 ym8Var = new ym8();
        this.a = r2;
        System.arraycopy(hi8VarArr, 0, r2, 0, 0);
        this.b = um8Var;
        this.c = ym8Var;
        hi8[] hi8VarArr2 = {um8Var, ym8Var};
    }

    public final long a(long j) {
        return this.c.c(j);
    }

    public final long b() {
        return this.b.i();
    }

    public final pp3 c(pp3 pp3Var) {
        this.c.e(pp3Var.a);
        this.c.d(pp3Var.b);
        return pp3Var;
    }

    public final boolean d(boolean z) {
        this.b.j(z);
        return z;
    }

    public final hi8[] e() {
        return this.a;
    }
}
