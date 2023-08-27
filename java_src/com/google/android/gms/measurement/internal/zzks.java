package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzmb;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzks implements Callable<String> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzkp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzks(zzkp zzkpVar, zzn zznVar) {
        this.zzb = zzkpVar;
        this.zza = zznVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (zzmb.zzb() && this.zzb.zzb().zza(zzat.zzcp) && (!this.zzb.zza(this.zza.zza).zze() || !zzad.zza(this.zza.zzw).zze())) {
            this.zzb.zzq().zzw().zza("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        zzf zzc = this.zzb.zzc(this.zza);
        if (zzc == null) {
            this.zzb.zzq().zzh().zza("App info was null when attempting to get app instance id");
            return null;
        }
        return zzc.zzd();
    }
}
