package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgg implements Runnable {
    private final /* synthetic */ zzw zza;
    private final /* synthetic */ zzgc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgg(zzgc zzgcVar, zzw zzwVar) {
        this.zzb = zzgcVar;
        this.zza = zzwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkp zzkpVar3;
        zzkpVar = this.zzb.zza;
        zzkpVar.zzr();
        if (this.zza.zzc.zza() == null) {
            zzkpVar3 = this.zzb.zza;
            zzkpVar3.zzb(this.zza);
            return;
        }
        zzkpVar2 = this.zzb.zza;
        zzkpVar2.zza(this.zza);
    }
}
