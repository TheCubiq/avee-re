package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzlu implements zzeb<zzlt> {
    private static zzlu zza = new zzlu();
    private final zzeb<zzlt> zzb;

    public static boolean zzb() {
        return ((zzlt) zza.zza()).zza();
    }

    public static long zzc() {
        return ((zzlt) zza.zza()).zzb();
    }

    private zzlu(zzeb<zzlt> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzlu() {
        this(zzea.zza(new zzlw()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zzlt zza() {
        return this.zzb.zza();
    }
}
