package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeu;
/* loaded from: classes.dex */
public final class vx5 implements Runnable {
    public final /* synthetic */ c06 p;

    public vx5(c06 c06Var) {
        this.p = c06Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.p.p;
        if (zzeu.g3(zzeuVar) != null) {
            try {
                zzeu.g3(zzeuVar).zze(1);
            } catch (RemoteException e) {
                k04.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
