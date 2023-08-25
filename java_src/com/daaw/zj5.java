package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class zj5 extends xj5 {
    public zj5(Context context) {
        this.f32772f = new pt3(context, zzt.zzt().zzb(), this, this);
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
                    this.f32772f.m13149J().mo4525A1(this.f32771e, new wj5(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    e14Var = this.f32767a;
                    pk5Var = new pk5(1);
                    e14Var.m23796c(pk5Var);
                } catch (Throwable th) {
                    zzt.zzo().m11902u(th, "RemoteSignalsClientTask.onConnected");
                    e14Var = this.f32767a;
                    pk5Var = new pk5(1);
                    e14Var.m23796c(pk5Var);
                }
            }
        }
    }
}
