package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zznq implements zzeb<zznp> {
    private static zznq zza = new zznq();
    private final zzeb<zznp> zzb;

    public static boolean zzb() {
        return ((zznp) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zznp) zza.zza()).zzb();
    }

    private zznq(zzeb<zznp> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zznq() {
        this(zzea.zza(new zzns()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zznp zza() {
        return this.zzb.zza();
    }
}
