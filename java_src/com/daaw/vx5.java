package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeu;
/* loaded from: classes.dex */
public final class vx5 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ c06 f30700p;

    public vx5(c06 c06Var) {
        this.f30700p = c06Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.f30700p.f5356p;
        if (zzeu.m1394g3(zzeuVar) != null) {
            try {
                zzeu.m1394g3(zzeuVar).zze(1);
            } catch (RemoteException e) {
                k04.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
