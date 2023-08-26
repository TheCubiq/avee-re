package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzqs;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzv implements Runnable {
    private final /* synthetic */ zzq zzwt;
    private final /* synthetic */ zzqs zzwx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(zzq zzqVar, zzqs zzqsVar) {
        this.zzwt = zzqVar;
        this.zzwx = zzqsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzwt.zzvw.zzadi.get(this.zzwx.getCustomTemplateId()).zzb(this.zzwx);
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
