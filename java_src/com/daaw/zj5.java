package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class zj5 extends xj5 {
    public zj5(Context context) {
        this.f = new pt3(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        e14 e14Var;
        pk5 pk5Var;
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    this.f.J().A1(this.e, new wj5(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    e14Var = this.a;
                    pk5Var = new pk5(1);
                    e14Var.c(pk5Var);
                } catch (Throwable th) {
                    zzt.zzo().u(th, "RemoteSignalsClientTask.onConnected");
                    e14Var = this.a;
                    pk5Var = new pk5(1);
                    e14Var.c(pk5Var);
                }
            }
        }
    }
}
