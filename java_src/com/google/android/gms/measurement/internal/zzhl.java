package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzhl implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzhe zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhl(zzhe zzheVar, long j) {
        this.zzb = zzheVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzr().zzk.zza(this.zza);
        this.zzb.zzq().zzv().zza("Minimum session duration set", Long.valueOf(this.zza));
    }
}
