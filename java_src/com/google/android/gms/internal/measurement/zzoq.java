package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzoq implements zzon {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Double> zzb;
    private static final zzdc<Long> zzc;
    private static final zzdc<Long> zzd;
    private static final zzdc<String> zze;

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final double zzb() {
        return zzb.zzc().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final long zzc() {
        return zzc.zzc().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final long zzd() {
        return zzd.zzc().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final String zze() {
        return zze.zzc();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.test.boolean_flag", false);
        zzb = zzdlVar.zza("measurement.test.double_flag", -3.0d);
        zzc = zzdlVar.zza("measurement.test.int_flag", -2L);
        zzd = zzdlVar.zza("measurement.test.long_flag", -1L);
        zze = zzdlVar.zza("measurement.test.string_flag", "---");
    }
}
