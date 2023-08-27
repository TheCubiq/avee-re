package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgt implements Callable<List<zzky>> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzgc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgt(zzgc zzgcVar, zzn zznVar) {
        this.zzb = zzgcVar;
        this.zza = zznVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzky> call() throws Exception {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzb.zza;
        zzkpVar.zzr();
        zzkpVar2 = this.zzb.zza;
        return zzkpVar2.zze().zza(this.zza.zza);
    }
}
