package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgv implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzgc zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgv(zzgc zzgcVar, String str, String str2, String str3, long j) {
        this.zze = zzgcVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        String str = this.zza;
        if (str != null) {
            zzin zzinVar = new zzin(this.zzc, str, this.zzd);
            zzkpVar = this.zze.zza;
            zzkpVar.zzu().zzu().zza(this.zzb, zzinVar);
            return;
        }
        zzkpVar2 = this.zze.zza;
        zzkpVar2.zzu().zzu().zza(this.zzb, (zzin) null);
    }
}
