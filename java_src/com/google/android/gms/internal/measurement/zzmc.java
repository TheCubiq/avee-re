package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzmc implements zzlz {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Boolean> zzb;
    private static final zzdc<Long> zzc;

    @Override // com.google.android.gms.internal.measurement.zzlz
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlz
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlz
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.service.configurable_service_limits", true);
        zzb = zzdlVar.zza("measurement.client.configurable_service_limits", true);
        zzc = zzdlVar.zza("measurement.id.service.configurable_service_limits", 0L);
    }
}
