package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzok implements zzoh {
    private static final zzdc<Long> zza;
    private static final zzdc<Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzoh
    public final long zza() {
        return zzb.zzc().longValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.id.max_bundles_per_iteration", 0L);
        zzb = zzdlVar.zza("measurement.max_bundles_per_iteration", 2L);
    }
}
