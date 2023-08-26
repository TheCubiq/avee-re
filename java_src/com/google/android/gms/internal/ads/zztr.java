package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zztr implements Runnable {
    private final /* synthetic */ zzts zzbob;
    private final /* synthetic */ zztt zzboc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztr(zzst zzstVar, zzts zztsVar, zztt zzttVar) {
        this.zzbob = zztsVar;
        this.zzboc = zzttVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzbob.zzb(this.zzboc);
        } catch (RemoteException e) {
            zzakb.zzc("Could not propagate interstitial ad event.", e);
        }
    }
}
