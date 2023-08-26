package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzjq implements Runnable {
    private final /* synthetic */ zzep zza;
    private final /* synthetic */ zzjp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjq(zzjp zzjpVar, zzep zzepVar) {
        this.zzb = zzjpVar;
        this.zza = zzepVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            zzjp.zza(this.zzb, false);
            if (!this.zzb.zza.zzaa()) {
                this.zzb.zza.zzq().zzv().zza("Connected to remote service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}
