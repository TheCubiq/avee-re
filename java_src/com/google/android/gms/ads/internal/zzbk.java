package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzqs;
/* loaded from: classes.dex */
final class zzbk implements Runnable {
    private final /* synthetic */ zzbc zzaaf;
    private final /* synthetic */ zzqs zzwx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(zzbc zzbcVar, zzqs zzqsVar) {
        this.zzaaf = zzbcVar;
        this.zzwx = zzqsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzaaf.zzvw.zzadi.get(this.zzwx.getCustomTemplateId()).zzb(this.zzwx);
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
