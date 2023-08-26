package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
/* loaded from: classes2.dex */
final class zzk implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzw zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzw zzwVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzh().zza(this.zza, this.zzb.zza.zzz());
    }
}
