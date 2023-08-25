package com.daaw;
/* loaded from: classes.dex */
public class rt0 implements zz {
    public static final e00 d = new a();
    public d00 a;
    public rg1 b;
    public boolean c;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new rt0()};
        }
    }

    public static rv0 b(rv0 rv0Var) {
        rv0Var.J(0);
        return rv0Var;
    }

    @Override // com.daaw.zz
    public void a() {
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        try {
            return e(a00Var);
        } catch (tv0 unused) {
            return false;
        }
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        if (this.b == null) {
            if (!e(a00Var)) {
                throw new tv0("Failed to determine bitstream type");
            }
            a00Var.i();
        }
        if (!this.c) {
            sm1 a2 = this.a.a(0, 1);
            this.a.n();
            this.b.c(this.a, a2);
            this.c = true;
        }
        return this.b.f(a00Var, iy0Var);
    }

    public final boolean e(a00 a00Var) {
        rg1 xu0Var;
        tt0 tt0Var = new tt0();
        if (tt0Var.a(a00Var, true) && (tt0Var.b & 2) == 2) {
            int min = Math.min(tt0Var.i, 8);
            rv0 rv0Var = new rv0(min);
            a00Var.k(rv0Var.a, 0, min);
            if (n20.o(b(rv0Var))) {
                xu0Var = new n20();
            } else if (yv1.p(b(rv0Var))) {
                xu0Var = new yv1();
            } else if (xu0.n(b(rv0Var))) {
                xu0Var = new xu0();
            }
            this.b = xu0Var;
            return true;
        }
        return false;
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        rg1 rg1Var = this.b;
        if (rg1Var != null) {
            rg1Var.k(j, j2);
        }
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.a = d00Var;
    }
}
