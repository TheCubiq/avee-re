package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzoi implements zzeb<zzoh> {
    private static zzoi zza = new zzoi();
    private final zzeb<zzoh> zzb;

    public static long zzb() {
        return ((zzoh) zza.zza()).zza();
    }

    private zzoi(zzeb<zzoh> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzoi() {
        this(zzea.zza(new zzok()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zzoh zza() {
        return this.zzb.zza();
    }
}
