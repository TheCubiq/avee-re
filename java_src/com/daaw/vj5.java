package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class vj5 extends xj5 {
    public vj5(Context context) {
        this.f = new pt3(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.daaw.xj5, com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        k04.zze("Cannot connect to remote service, fallback to local instance.");
        this.a.c(new pk5(1));
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        e14 e14Var;
        pk5 pk5Var;
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    this.f.J().L2(this.e, new wj5(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    e14Var = this.a;
                    pk5Var = new pk5(1);
                    e14Var.c(pk5Var);
                } catch (Throwable th) {
                    zzt.zzo().u(th, "RemoteAdRequestClientTask.onConnected");
                    e14Var = this.a;
                    pk5Var = new pk5(1);
                    e14Var.c(pk5Var);
                }
            }
        }
    }
}
