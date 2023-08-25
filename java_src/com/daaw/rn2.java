package com.daaw;
/* loaded from: classes.dex */
public final class rn2 extends no2 {

    /* renamed from: i */
    public final long f25422i;

    public rn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, long j, int i, int i2) {
        super(wm2Var, "THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", hi2Var, i, 25);
        this.f25422i = j;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        long longValue = ((Long) this.f20529f.invoke(null, new Object[0])).longValue();
        synchronized (this.f20528e) {
            this.f20528e.m20748r0(longValue);
            long j = this.f25422i;
            if (j != 0) {
                this.f20528e.m20780L(longValue - j);
                this.f20528e.m20779M(this.f25422i);
            }
        }
    }
}
