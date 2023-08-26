package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzpi implements zzpf {
    private static final zzdc<Boolean> zza = new zzdl(zzdd.zza("com.google.android.gms.measurement")).zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }
}
