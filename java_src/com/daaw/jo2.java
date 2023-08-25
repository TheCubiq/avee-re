package com.daaw;
/* loaded from: classes.dex */
public final class jo2 extends no2 {
    public jo2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", hi2Var, i, 48);
    }

    @Override // com.daaw.no2
    public final void a() {
        this.e.Y(3);
        boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
        synchronized (this.e) {
            if (booleanValue) {
                this.e.Y(2);
            } else {
                this.e.Y(1);
            }
        }
    }
}
