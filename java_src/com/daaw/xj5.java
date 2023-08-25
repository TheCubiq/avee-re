package com.daaw;

import android.os.Binder;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public abstract class xj5 implements pa.a, pa.b {
    public final e14 a = new e14();
    public final Object b = new Object();
    public boolean c = false;
    public boolean d = false;
    public zzccb e;
    public pt3 f;

    @Override // com.daaw.pa.a
    public final void D(int i) {
        k04.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public void I(ConnectionResult connectionResult) {
        k04.zze("Disconnected from remote ad request service.");
        this.a.c(new pk5(1));
    }

    public final void a() {
        synchronized (this.b) {
            this.d = true;
            if (this.f.isConnected() || this.f.isConnecting()) {
                this.f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
