package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzoo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbg implements Runnable {
    private final /* synthetic */ zzbc zzaaf;
    private final /* synthetic */ zzoo zzwv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbg(zzbc zzbcVar, zzoo zzooVar) {
        this.zzaaf = zzbcVar;
        this.zzwv = zzooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzaaf.zzvw.zzade != null) {
                this.zzaaf.zzvw.zzade.zza(this.zzwv);
                this.zzaaf.zzb(this.zzwv.zzka());
            }
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
