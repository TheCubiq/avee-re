package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgp implements Runnable {
    private final /* synthetic */ zzar zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zzgc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgp(zzgc zzgcVar, zzar zzarVar, zzn zznVar) {
        this.zzc = zzgcVar;
        this.zza = zzarVar;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzar zzb = this.zzc.zzb(this.zza, this.zzb);
        zzkpVar = this.zzc.zza;
        zzkpVar.zzr();
        zzkpVar2 = this.zzc.zza;
        zzkpVar2.zza(zzb, this.zzb);
    }
}
