package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zziq implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzim zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziq(zzim zzimVar, long j) {
        this.zzb = zzimVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzd().zza(this.zza);
        this.zzb.zza = null;
    }
}
