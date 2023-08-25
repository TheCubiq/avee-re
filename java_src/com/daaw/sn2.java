package com.daaw;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
/* loaded from: classes.dex */
public final class sn2 extends no2 {
    public sn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", hi2Var, i, 24);
    }

    @Override // com.daaw.no2
    public final void a() {
        if (this.b.q()) {
            c();
            return;
        }
        synchronized (this.e) {
            this.e.q0((String) this.f.invoke(null, this.b.b()));
        }
    }

    @Override // com.daaw.no2
    public final Void b() {
        if (this.b.r()) {
            super.b();
            return null;
        }
        if (this.b.q()) {
            c();
        }
        return null;
    }

    public final void c() {
        AdvertisingIdClient h = this.b.h();
        if (h == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = h.getInfo();
            String d = an2.d(info.getId());
            if (d != null) {
                synchronized (this.e) {
                    this.e.q0(d);
                    this.e.p0(info.isLimitAdTrackingEnabled());
                    this.e.U(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.daaw.no2, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
