package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzpg implements zzeb<zzpf> {
    private static zzpg zza = new zzpg();
    private final zzeb<zzpf> zzb;

    public static boolean zzb() {
        return ((zzpf) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzpf) zza.zza()).zzb();
    }

    private zzpg(zzeb<zzpf> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzpg() {
        this(zzea.zza(new zzpi()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zzpf zza() {
        return this.zzb.zza();
    }
}
