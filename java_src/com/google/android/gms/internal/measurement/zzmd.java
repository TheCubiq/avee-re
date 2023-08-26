package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzmd implements zzme {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Boolean> zzb;
    private static final zzdc<Long> zzc;

    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final long zzd() {
        return zzc.zzc().longValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.client.consent_state_v1", false);
        zzb = zzdlVar.zza("measurement.service.consent_state_v1_W33", false);
        zzc = zzdlVar.zza("measurement.service.storage_consent_support_version", 203290L);
    }
}
