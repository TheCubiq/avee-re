package com.daaw;
/* loaded from: classes.dex */
public final class un2 extends no2 {
    public final xm2 i;

    public un2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, xm2 xm2Var) {
        super(wm2Var, "DEi5JrQn0pxSuKS2Ij/fpEA7I+0FPLXDsBWBfvVwt/zwZUJJ4fnydbsyET2LCYMF", "Jj1vyuWfy0iUak+iXdGffQYzyyVnoa3nOmSynhrPgns=", hi2Var, i, 85);
        this.i = xm2Var;
    }

    @Override // com.daaw.no2
    public final void a() {
        long[] jArr = (long[]) this.f.invoke(null, Long.valueOf(this.i.d()), Long.valueOf(this.i.h()), Long.valueOf(this.i.b()), Long.valueOf(this.i.f()));
        synchronized (this.e) {
            this.e.t0(jArr[0]);
            this.e.s0(jArr[1]);
        }
    }
}
