package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzpa implements zzeb<zzoz> {
    private static zzpa zza = new zzpa();
    private final zzeb<zzoz> zzb;

    public static boolean zzb() {
        return ((zzoz) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzoz) zza.zza()).zzb();
    }

    private zzpa(zzeb<zzoz> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzpa() {
        this(zzea.zza(new zzpc()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zzoz zza() {
        return this.zzb.zza();
    }
}
