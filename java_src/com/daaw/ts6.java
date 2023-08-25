package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzfte;
/* loaded from: classes.dex */
public final class ts6 implements pa.a, pa.b {
    public final qt6 a;
    public final lt6 b;
    public final Object c = new Object();
    public boolean d = false;
    public boolean e = false;

    public ts6(Context context, Looper looper, lt6 lt6Var) {
        this.b = lt6Var;
        this.a = new qt6(context, looper, this, this, 12800000);
    }

    @Override // com.daaw.pa.a
    public final void D(int i) {
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            this.e = true;
            try {
                this.a.J().j3(new zzfte(this.b.a()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
        }
    }

    public final void a() {
        synchronized (this.c) {
            if (!this.d) {
                this.d = true;
                this.a.checkAvailabilityAndConnect();
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            if (this.a.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
