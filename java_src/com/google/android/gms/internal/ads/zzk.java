package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzk implements Runnable {
    private final zzr zzw;
    private final zzx zzx;
    private final Runnable zzy;

    public zzk(zzi zziVar, zzr zzrVar, zzx zzxVar, Runnable runnable) {
        this.zzw = zzrVar;
        this.zzx = zzxVar;
        this.zzy = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzw.isCanceled();
        if (this.zzx.zzbh == null) {
            this.zzw.zza((zzr) this.zzx.result);
        } else {
            this.zzw.zzb(this.zzx.zzbh);
        }
        if (this.zzx.zzbi) {
            this.zzw.zzb("intermediate-response");
        } else {
            this.zzw.zzc("done");
        }
        Runnable runnable = this.zzy;
        if (runnable != null) {
            runnable.run();
        }
    }
}
