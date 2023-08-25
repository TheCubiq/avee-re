package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class vj5 extends xj5 {
    public vj5(Context context) {
        this.f32772f = new pt3(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.daaw.xj5, com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        k04.zze("Cannot connect to remote service, fallback to local instance.");
        this.f32767a.m23796c(new pk5(1));
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        e14 e14Var;
        pk5 pk5Var;
        synchronized (this.f32768b) {
            if (!this.f32770d) {
                this.f32770d = true;
                try {
                    this.f32772f.m13149J().mo4524L2(this.f32771e, new wj5(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    e14Var = this.f32767a;
                    pk5Var = new pk5(1);
                    e14Var.m23796c(pk5Var);
                } catch (Throwable th) {
                    zzt.zzo().m11902u(th, "RemoteAdRequestClientTask.onConnected");
                    e14Var = this.f32767a;
                    pk5Var = new pk5(1);
                    e14Var.m23796c(pk5Var);
                }
            }
        }
    }
}
