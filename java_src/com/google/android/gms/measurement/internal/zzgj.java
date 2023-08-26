package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgj implements Callable<List<zzky>> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzgc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgj(zzgc zzgcVar, zzn zznVar, String str, String str2) {
        this.zzd = zzgcVar;
        this.zza = zznVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzky> call() throws Exception {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzd.zza;
        zzkpVar.zzr();
        zzkpVar2 = this.zzd.zza;
        return zzkpVar2.zze().zza(this.zza.zza, this.zzb, this.zzc);
    }
}
