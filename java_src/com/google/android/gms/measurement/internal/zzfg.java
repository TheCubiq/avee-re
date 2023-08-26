package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
final class zzfg implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzfh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfg(zzfh zzfhVar, boolean z) {
        this.zzb = zzfhVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkpVar = this.zzb.zzb;
        zzkpVar.zza(this.zza);
    }
}
