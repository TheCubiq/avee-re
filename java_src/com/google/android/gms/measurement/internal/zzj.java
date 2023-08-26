package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
/* loaded from: classes2.dex */
final class zzj implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzw zza;
    private final /* synthetic */ zzar zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ AppMeasurementDynamiteService zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzw zzwVar, zzar zzarVar, String str) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = zzwVar;
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzv().zza(this.zza, this.zzb, this.zzc);
    }
}
