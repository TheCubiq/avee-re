package com.daaw;
/* loaded from: classes.dex */
public final class yn2 extends no2 {

    /* renamed from: i */
    public final wl2 f33885i;

    /* renamed from: j */
    public final long f33886j;

    /* renamed from: k */
    public final long f33887k;

    public yn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, wl2 wl2Var, long j, long j2) {
        super(wm2Var, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", hi2Var, i, 11);
        this.f33885i = wl2Var;
        this.f33886j = j;
        this.f33887k = j2;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        wl2 wl2Var = this.f33885i;
        if (wl2Var != null) {
            ul2 ul2Var = new ul2((String) this.f20529f.invoke(null, wl2Var.m6015b(), Long.valueOf(this.f33886j), Long.valueOf(this.f33887k)));
            synchronized (this.f20528e) {
                this.f20528e.m20736x0(ul2Var.f29172a.longValue());
                if (ul2Var.f29173b.longValue() >= 0) {
                    this.f20528e.m20783I(ul2Var.f29173b.longValue());
                }
                if (ul2Var.f29174c.longValue() >= 0) {
                    this.f20528e.m20762d0(ul2Var.f29174c.longValue());
                }
            }
        }
    }
}
