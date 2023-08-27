package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzmj implements zzmk {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Boolean> zzb;
    private static final zzdc<Boolean> zzc;
    private static final zzdc<Boolean> zzd;
    private static final zzdc<Boolean> zze;
    private static final zzdc<Boolean> zzf;

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zze() {
        return zzd.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zzf() {
        return zze.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zzg() {
        return zzf.zzc().booleanValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.gold.enhanced_ecommerce.format_logs", true);
        zzb = zzdlVar.zza("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        zzc = zzdlVar.zza("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        zzd = zzdlVar.zza("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        zze = zzdlVar.zza("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        zzf = zzdlVar.zza("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }
}
