package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zziw implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzkw zzb;
    private final /* synthetic */ zzn zzc;
    private final /* synthetic */ zziv zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziw(zziv zzivVar, boolean z, zzkw zzkwVar, zzn zznVar) {
        this.zzd = zzivVar;
        this.zza = z;
        this.zzb = zzkwVar;
        this.zzc = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar;
        zzepVar = this.zzd.zzb;
        if (zzepVar == null) {
            this.zzd.zzq().zze().zza("Discarding data. Failed to set user property");
            return;
        }
        this.zzd.zza(zzepVar, this.zza ? null : this.zzb, this.zzc);
        this.zzd.zzaj();
    }
}
