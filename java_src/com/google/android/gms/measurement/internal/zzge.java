package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzge implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzgc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzge(zzgc zzgcVar, zzn zznVar) {
        this.zzb = zzgcVar;
        this.zza = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzb.zza;
        zzkpVar.zzr();
        zzkpVar2 = this.zzb.zza;
        zzn zznVar = this.zza;
        zzkpVar2.zzp().zzc();
        zzkpVar2.zzn();
        Preconditions.checkNotEmpty(zznVar.zza);
        zzkpVar2.zzc(zznVar);
    }
}
