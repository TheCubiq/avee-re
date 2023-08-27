package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzoj implements zzeb<zzom> {
    private static zzoj zza = new zzoj();
    private final zzeb<zzom> zzb;

    public static boolean zzb() {
        return ((zzom) zza.zza()).zza();
    }

    private zzoj(zzeb<zzom> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzoj() {
        this(zzea.zza(new zzol()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zzom zza() {
        return this.zzb.zza();
    }
}
