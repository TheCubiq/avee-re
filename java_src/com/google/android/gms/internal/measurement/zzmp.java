package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzmp implements zzmq {
    private static final zzdc<Boolean> zza = new zzdl(zzdd.zza("com.google.android.gms.measurement")).zza("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }
}
