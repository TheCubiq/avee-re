package com.daaw;
/* loaded from: classes.dex */
public final class eo2 extends no2 {
    public final boolean i;

    public eo2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", hi2Var, i, 61);
        this.i = wm2Var.s();
    }

    @Override // com.daaw.no2
    public final void a() {
        long longValue = ((Long) this.f.invoke(null, this.b.b(), Boolean.valueOf(this.i))).longValue();
        synchronized (this.e) {
            this.e.w(longValue);
        }
    }
}
