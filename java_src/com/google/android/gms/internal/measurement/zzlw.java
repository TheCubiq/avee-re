package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzlw implements zzlt {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final long zzb() {
        return zzb.zzc().longValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.sdk.attribution.cache", true);
        zzb = zzdlVar.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
    }
}
