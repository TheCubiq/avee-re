package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzb extends TimerTask {
    private final /* synthetic */ CountDownLatch zzwd;
    private final /* synthetic */ Timer zzwe;
    private final /* synthetic */ zza zzwf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(zza zzaVar, CountDownLatch countDownLatch, Timer timer) {
        this.zzwf = zzaVar;
        this.zzwd = countDownLatch;
        this.zzwe = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (((Integer) zzkb.zzik().zzd(zznk.zzbck)).intValue() != this.zzwd.getCount()) {
            zzakb.zzck("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.zzwd.getCount() == 0) {
                this.zzwe.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.zzwf.zzvw.zzrt.getPackageName()).concat("_adsTrace_");
        try {
            zzakb.zzck("Starting method tracing");
            this.zzwd.countDown();
            long currentTimeMillis = zzbv.zzer().currentTimeMillis();
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 20);
            sb.append(concat);
            sb.append(currentTimeMillis);
            Debug.startMethodTracing(sb.toString(), ((Integer) zzkb.zzik().zzd(zznk.zzbcl)).intValue());
        } catch (Exception e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
