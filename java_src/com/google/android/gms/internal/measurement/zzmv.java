package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzmv implements zzmw {
    private static final zzdc<Boolean> zza;
    private static final zzdc<Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    static {
        zzdl zzdlVar = new zzdl(zzdd.zza("com.google.android.gms.measurement"));
        zza = zzdlVar.zza("measurement.sdk.referrer.delayed_install_referrer_api", false);
        zzb = zzdlVar.zza("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }
}
