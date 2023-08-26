package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzne implements zzeb<zznd> {
    private static zzne zza = new zzne();
    private final zzeb<zznd> zzb;

    public static boolean zzb() {
        return ((zznd) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zznd) zza.zza()).zzb();
    }

    private zzne(zzeb<zznd> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzne() {
        this(zzea.zza(new zzng()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zznd zza() {
        return this.zzb.zza();
    }
}
