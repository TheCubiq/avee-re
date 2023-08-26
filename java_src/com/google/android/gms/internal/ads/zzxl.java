package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzxl implements Runnable {
    private final /* synthetic */ zzxe zzbun;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxl(zzxk zzxkVar, zzxe zzxeVar) {
        this.zzbun = zzxeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzbun.zzbtx.destroy();
        } catch (RemoteException e) {
            zzakb.zzc("Could not destroy mediation adapter.", e);
        }
    }
}
