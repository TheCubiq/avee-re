package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzpn implements zzeb<zzpq> {
    private static zzpn zza = new zzpn();
    private final zzeb<zzpq> zzb;

    public static boolean zzb() {
        return ((zzpq) zza.zza()).zza();
    }

    private zzpn(zzeb<zzpq> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzpn() {
        this(zzea.zza(new zzpp()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zzpq zza() {
        return this.zzb.zza();
    }
}
