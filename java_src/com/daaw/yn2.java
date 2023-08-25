package com.daaw;
/* loaded from: classes.dex */
public final class yn2 extends no2 {
    public final wl2 i;
    public final long j;
    public final long k;

    public yn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, wl2 wl2Var, long j, long j2) {
        super(wm2Var, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", hi2Var, i, 11);
        this.i = wl2Var;
        this.j = j;
        this.k = j2;
    }

    @Override // com.daaw.no2
    public final void a() {
        wl2 wl2Var = this.i;
        if (wl2Var != null) {
            ul2 ul2Var = new ul2((String) this.f.invoke(null, wl2Var.b(), Long.valueOf(this.j), Long.valueOf(this.k)));
            synchronized (this.e) {
                this.e.x0(ul2Var.a.longValue());
                if (ul2Var.b.longValue() >= 0) {
                    this.e.I(ul2Var.b.longValue());
                }
                if (ul2Var.c.longValue() >= 0) {
                    this.e.d0(ul2Var.c.longValue());
                }
            }
        }
    }
}
