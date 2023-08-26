package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzmz implements zzeb<zznc> {
    private static zzmz zza = new zzmz();
    private final zzeb<zznc> zzb;

    public static boolean zzb() {
        return ((zznc) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zznc) zza.zza()).zzb();
    }

    private zzmz(zzeb<zznc> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzmz() {
        this(zzea.zza(new zznb()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zznc zza() {
        return this.zzb.zza();
    }
}
