package com.daaw;
/* loaded from: classes.dex */
public final class ho2 extends no2 {
    public final en2 i;
    public long j;

    public ho2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, en2 en2Var) {
        super(wm2Var, "yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", hi2Var, i, 53);
        this.i = en2Var;
        if (en2Var != null) {
            this.j = en2Var.a();
        }
    }

    @Override // com.daaw.no2
    public final void a() {
        if (this.i != null) {
            this.e.H(((Long) this.f.invoke(null, Long.valueOf(this.j))).longValue());
        }
    }
}
