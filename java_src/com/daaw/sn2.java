package com.daaw;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
/* loaded from: classes.dex */
public final class sn2 extends no2 {
    public sn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", hi2Var, i, 24);
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        if (this.f20525b.m5989q()) {
            m10147c();
            return;
        }
        synchronized (this.f20528e) {
            this.f20528e.m20749q0((String) this.f20529f.invoke(null, this.f20525b.m6004b()));
        }
    }

    @Override // com.daaw.no2
    /* renamed from: b */
    public final Void mo10148b() {
        if (this.f20525b.m5988r()) {
            super.mo10148b();
            return null;
        }
        if (this.f20525b.m5989q()) {
            m10147c();
        }
        return null;
    }

    /* renamed from: c */
    public final void m10147c() {
        AdvertisingIdClient m5998h = this.f20525b.m5998h();
        if (m5998h == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = m5998h.getInfo();
            String m27327d = an2.m27327d(info.getId());
            if (m27327d != null) {
                synchronized (this.f20528e) {
                    this.f20528e.m20749q0(m27327d);
                    this.f20528e.m20750p0(info.isLimitAdTrackingEnabled());
                    this.f20528e.m20771U(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.daaw.no2, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mo10148b();
        return null;
    }
}
