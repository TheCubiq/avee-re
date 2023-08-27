package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzll implements zzlm {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Boolean> zzb;
    private static final zzdc<Boolean> zzc;
    private static final zzdc<Long> zzd;

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.client.ad_impression.dev", false);
        zzb = zzdlVar.zza("measurement.service.separate_public_internal_event_blacklisting", false);
        zzc = zzdlVar.zza("measurement.service.ad_impression", false);
        zzd = zzdlVar.zza("measurement.id.service.ad_impression", 0L);
    }
}
