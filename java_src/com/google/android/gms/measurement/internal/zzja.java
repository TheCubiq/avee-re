package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzmb;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzja implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzw zzb;
    private final /* synthetic */ zziv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzja(zziv zzivVar, zzn zznVar, com.google.android.gms.internal.measurement.zzw zzwVar) {
        this.zzc = zzivVar;
        this.zza = zznVar;
        this.zzb = zzwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar;
        try {
            if (zzmb.zzb() && this.zzc.zzs().zza(zzat.zzco) && !this.zzc.zzr().zzw().zze()) {
                this.zzc.zzq().zzj().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zze().zza((String) null);
                this.zzc.zzr().zzj.zza(null);
                return;
            }
            zzepVar = this.zzc.zzb;
            if (zzepVar == null) {
                this.zzc.zzq().zze().zza("Failed to get app instance id");
                return;
            }
            String zzc = zzepVar.zzc(this.zza);
            if (zzc != null) {
                this.zzc.zze().zza(zzc);
                this.zzc.zzr().zzj.zza(zzc);
            }
            this.zzc.zzaj();
            this.zzc.zzo().zza(this.zzb, zzc);
        } catch (RemoteException e) {
            this.zzc.zzq().zze().zza("Failed to get app instance id", e);
        } finally {
            this.zzc.zzo().zza(this.zzb, (String) null);
        }
    }
}
