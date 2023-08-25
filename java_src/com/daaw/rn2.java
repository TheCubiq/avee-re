package com.daaw;
/* loaded from: classes.dex */
public final class rn2 extends no2 {
    public final long i;

    public rn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, long j, int i, int i2) {
        super(wm2Var, "THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", hi2Var, i, 25);
        this.i = j;
    }

    @Override // com.daaw.no2
    public final void a() {
        long longValue = ((Long) this.f.invoke(null, new Object[0])).longValue();
        synchronized (this.e) {
            this.e.r0(longValue);
            long j = this.i;
            if (j != 0) {
                this.e.L(longValue - j);
                this.e.M(this.i);
            }
        }
    }
}
