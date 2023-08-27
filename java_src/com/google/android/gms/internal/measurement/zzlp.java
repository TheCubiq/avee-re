package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzlp implements zzeb<zzls> {
    private static zzlp zza = new zzlp();
    private final zzeb<zzls> zzb;

    public static boolean zzb() {
        return ((zzls) zza.zza()).zza();
    }

    private zzlp(zzeb<zzls> zzebVar) {
        this.zzb = zzea.zza((zzeb) zzebVar);
    }

    public zzlp() {
        this(zzea.zza(new zzlr()));
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final /* synthetic */ zzls zza() {
        return this.zzb.zza();
    }
}
