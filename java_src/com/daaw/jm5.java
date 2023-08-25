package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class jm5 implements pa.a, pa.b {
    public final e14 a = new e14();
    public boolean b = false;
    public boolean c = false;
    public rt3 d;
    public Context e;
    public Looper f;
    public ScheduledExecutorService g;

    @Override // com.daaw.pa.a
    public void D(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        k04.zze(format);
        this.a.c(new pk5(1, format));
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.h()));
        k04.zze(format);
        this.a.c(new pk5(1, format));
    }

    public final synchronized void a() {
        if (this.d == null) {
            this.d = new rt3(this.e, this.f, this, this);
        }
        this.d.checkAvailabilityAndConnect();
    }

    public final synchronized void b() {
        this.c = true;
        rt3 rt3Var = this.d;
        if (rt3Var == null) {
            return;
        }
        if (rt3Var.isConnected() || this.d.isConnecting()) {
            this.d.disconnect();
        }
        Binder.flushPendingCommands();
    }
}
