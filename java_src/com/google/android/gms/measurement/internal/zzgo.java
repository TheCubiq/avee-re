package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgo implements Runnable {
    private final /* synthetic */ zzar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzgc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgo(zzgc zzgcVar, zzar zzarVar, String str) {
        this.zzc = zzgcVar;
        this.zza = zzarVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzc.zza;
        zzkpVar.zzr();
        zzkpVar2 = this.zzc.zza;
        zzkpVar2.zza(this.zza, this.zzb);
    }
}
