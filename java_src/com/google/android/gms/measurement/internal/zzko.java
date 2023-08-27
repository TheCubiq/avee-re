package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzko implements Runnable {
    private final /* synthetic */ zzku zza;
    private final /* synthetic */ zzkp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzko(zzkp zzkpVar, zzku zzkuVar) {
        this.zzb = zzkpVar;
        this.zza = zzkuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
        this.zzb.zza();
    }
}
