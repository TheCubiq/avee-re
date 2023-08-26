package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzka implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzkb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzka(zzkb zzkbVar, long j) {
        this.zzb = zzkbVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkb.zza(this.zzb, this.zza);
    }
}
