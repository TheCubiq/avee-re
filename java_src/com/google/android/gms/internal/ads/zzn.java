package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes2.dex */
public final class zzn extends Thread {
    private final zzm zzaa;
    private final zzb zzj;
    private final zzaa zzk;
    private volatile boolean zzl = false;
    private final BlockingQueue<zzr<?>> zzz;

    public zzn(BlockingQueue<zzr<?>> blockingQueue, zzm zzmVar, zzb zzbVar, zzaa zzaaVar) {
        this.zzz = blockingQueue;
        this.zzaa = zzmVar;
        this.zzj = zzbVar;
        this.zzk = zzaaVar;
    }

    private final void processRequest() throws InterruptedException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzr<?> take = this.zzz.take();
        try {
            take.zzb("network-queue-take");
            take.isCanceled();
            TrafficStats.setThreadStatsTag(take.zze());
            zzp zzc = this.zzaa.zzc(take);
            take.zzb("network-http-complete");
            if (zzc.zzac && take.zzl()) {
                take.zzc("not-modified");
                take.zzm();
                return;
            }
            zzx<?> zza = take.zza(zzc);
            take.zzb("network-parse-complete");
            if (take.zzh() && zza.zzbg != null) {
                this.zzj.zza(take.getUrl(), zza.zzbg);
                take.zzb("network-cache-written");
            }
            take.zzk();
            this.zzk.zzb(take, zza);
            take.zza(zza);
        } catch (zzae e) {
            e.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzk.zza(take, e);
            take.zzm();
        } catch (Exception e2) {
            zzaf.zza(e2, "Unhandled exception %s", e2.toString());
            zzae zzaeVar = new zzae(e2);
            zzaeVar.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzk.zza(take, zzaeVar);
            take.zzm();
        }
    }

    public final void quit() {
        this.zzl = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.zzl) {
                    return;
                }
            }
        }
    }
}
