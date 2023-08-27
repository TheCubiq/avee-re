package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgh implements Runnable {
    private final /* synthetic */ zzw zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zzgc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh(zzgc zzgcVar, zzw zzwVar, zzn zznVar) {
        this.zzc = zzgcVar;
        this.zza = zzwVar;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkp zzkpVar3;
        zzkpVar = this.zzc.zza;
        zzkpVar.zzr();
        if (this.zza.zzc.zza() == null) {
            zzkpVar3 = this.zzc.zza;
            zzkpVar3.zzb(this.zza, this.zzb);
            return;
        }
        zzkpVar2 = this.zzc.zza;
        zzkpVar2.zza(this.zza, this.zzb);
    }
}
