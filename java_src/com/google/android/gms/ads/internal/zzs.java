package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzov;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzs implements Runnable {
    private final /* synthetic */ zzq zzwt;
    private final /* synthetic */ zzov zzwu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(zzq zzqVar, zzov zzovVar) {
        this.zzwt = zzqVar;
        this.zzwu = zzovVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzwt.zzvw.zzadg != null) {
                this.zzwt.zzvw.zzadg.zza(this.zzwu);
                this.zzwt.zzb(this.zzwu.zzka());
            }
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
