package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzoq;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbi implements Runnable {
    private final /* synthetic */ zzbc zzaaf;
    private final /* synthetic */ zzoq zzww;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(zzbc zzbcVar, zzoq zzoqVar) {
        this.zzaaf = zzbcVar;
        this.zzww = zzoqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzaaf.zzvw.zzadf != null) {
                this.zzaaf.zzvw.zzadf.zza(this.zzww);
                this.zzaaf.zzb(this.zzww.zzka());
            }
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
