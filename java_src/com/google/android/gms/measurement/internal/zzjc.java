package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjc implements Runnable {
    private final /* synthetic */ zzin zza;
    private final /* synthetic */ zziv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjc(zziv zzivVar, zzin zzinVar) {
        this.zzb = zzivVar;
        this.zza = zzinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar;
        zzepVar = this.zzb.zzb;
        if (zzepVar == null) {
            this.zzb.zzq().zze().zza("Failed to send current screen to service");
            return;
        }
        try {
            if (this.zza == null) {
                zzepVar.zza(0L, (String) null, (String) null, this.zzb.zzm().getPackageName());
            } else {
                zzepVar.zza(this.zza.zzc, this.zza.zza, this.zza.zzb, this.zzb.zzm().getPackageName());
            }
            this.zzb.zzaj();
        } catch (RemoteException e) {
            this.zzb.zzq().zze().zza("Failed to send current screen to the service", e);
        }
    }
}
