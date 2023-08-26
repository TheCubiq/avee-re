package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgr implements Callable<byte[]> {
    private final /* synthetic */ zzar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzgc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgr(zzgc zzgcVar, zzar zzarVar, String str) {
        this.zzc = zzgcVar;
        this.zza = zzarVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzc.zza;
        zzkpVar.zzr();
        zzkpVar2 = this.zzc.zza;
        return zzkpVar2.zzg().zza(this.zza, this.zzb);
    }
}
