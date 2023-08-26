package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zznt implements zznu {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Boolean> zzb;
    private static final zzdc<Boolean> zzc;
    private static final zzdc<Long> zzd;

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.client.global_params", true);
        zzb = zzdlVar.zza("measurement.service.global_params_in_payload", true);
        zzc = zzdlVar.zza("measurement.service.global_params", true);
        zzd = zzdlVar.zza("measurement.id.service.global_params", 0L);
    }
}
