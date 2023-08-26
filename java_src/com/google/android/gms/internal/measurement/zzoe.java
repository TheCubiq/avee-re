package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzoe implements zzob {
    private static final zzdc<Long> zza;
    private static final zzdc<Boolean> zzb;
    private static final zzdc<Boolean> zzc;
    private static final zzdc<Boolean> zzd;
    private static final zzdc<Long> zze;

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zza() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zzb() {
        return zzc.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zzc() {
        return zzd.zzc().booleanValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.id.lifecycle.app_in_background_parameter", 0L);
        zzb = zzdlVar.zza("measurement.lifecycle.app_backgrounded_engagement", false);
        zzc = zzdlVar.zza("measurement.lifecycle.app_backgrounded_tracking", true);
        zzd = zzdlVar.zza("measurement.lifecycle.app_in_background_parameter", false);
        zze = zzdlVar.zza("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }
}
