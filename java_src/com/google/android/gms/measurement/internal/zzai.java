package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzai implements Runnable {
    private final /* synthetic */ zzgw zza;
    private final /* synthetic */ zzaj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzaj zzajVar, zzgw zzgwVar) {
        this.zzb = zzajVar;
        this.zza = zzgwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzt();
        if (zzx.zza()) {
            this.zza.zzp().zza(this);
            return;
        }
        boolean zzb = this.zzb.zzb();
        zzaj.zza(this.zzb, 0L);
        if (zzb) {
            this.zzb.zza();
        }
    }
}
