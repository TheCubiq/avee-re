package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzia implements Runnable {
    private final /* synthetic */ zzad zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzhe zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzia(zzhe zzheVar, zzad zzadVar, int i, long j, boolean z) {
        this.zze = zzheVar;
        this.zza = zzadVar;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza);
        this.zze.zza(this.zza, this.zzb, this.zzc, false, this.zzd);
    }
}
