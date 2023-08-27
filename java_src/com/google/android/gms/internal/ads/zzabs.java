package com.google.android.gms.internal.ads;

import java.util.concurrent.CountDownLatch;
/* loaded from: classes2.dex */
final class zzabs implements Runnable {
    private final /* synthetic */ zzabr zzbzt;
    private final /* synthetic */ CountDownLatch zzwd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabs(zzabr zzabrVar, CountDownLatch countDownLatch) {
        this.zzbzt = zzabrVar;
        this.zzwd = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqw zzaqwVar;
        synchronized (this.zzbzt.zzbzh) {
            zzabr zzabrVar = this.zzbzt;
            zzaqwVar = this.zzbzt.zzbnd;
            zzabrVar.zzbzs = com.google.android.gms.ads.internal.zzas.zza(zzaqwVar, this.zzbzt.zzbzr, this.zzwd);
        }
    }
}
