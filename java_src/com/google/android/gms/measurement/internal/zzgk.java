package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgk implements Callable<List<zzw>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzgc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgk(zzgc zzgcVar, String str, String str2, String str3) {
        this.zzd = zzgcVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzw> call() throws Exception {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzd.zza;
        zzkpVar.zzr();
        zzkpVar2 = this.zzd.zza;
        return zzkpVar2.zze().zzb(this.zza, this.zzb, this.zzc);
    }
}
