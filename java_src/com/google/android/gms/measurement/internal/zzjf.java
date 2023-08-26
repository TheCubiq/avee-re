package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjf implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zziv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjf(zziv zzivVar, Bundle bundle, zzn zznVar) {
        this.zzc = zzivVar;
        this.zza = bundle;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar;
        zzepVar = this.zzc.zzb;
        if (zzepVar == null) {
            this.zzc.zzq().zze().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            zzepVar.zza(this.zza, this.zzb);
        } catch (RemoteException e) {
            this.zzc.zzq().zze().zza("Failed to send default event parameters to service", e);
        }
    }
}
