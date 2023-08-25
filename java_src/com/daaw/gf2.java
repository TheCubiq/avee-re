package com.daaw;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class gf2 extends Thread {
    public final BlockingQueue p;
    public final ff2 q;
    public final we2 r;
    public volatile boolean s = false;
    public final df2 t;

    public gf2(BlockingQueue blockingQueue, ff2 ff2Var, we2 we2Var, df2 df2Var, byte[] bArr) {
        this.p = blockingQueue;
        this.q = ff2Var;
        this.r = we2Var;
        this.t = df2Var;
    }

    public final void a() {
        this.s = true;
        interrupt();
    }

    public final void b() {
        qf2 qf2Var = (qf2) this.p.take();
        SystemClock.elapsedRealtime();
        qf2Var.g(3);
        try {
            qf2Var.zzm("network-queue-take");
            qf2Var.zzw();
            TrafficStats.setThreadStatsTag(qf2Var.zzc());
            mf2 zza = this.q.zza(qf2Var);
            qf2Var.zzm("network-http-complete");
            if (zza.e && qf2Var.zzv()) {
                qf2Var.d("not-modified");
                qf2Var.e();
                return;
            }
            wf2 a = qf2Var.a(zza);
            qf2Var.zzm("network-parse-complete");
            if (a.b != null) {
                this.r.a(qf2Var.zzj(), a.b);
                qf2Var.zzm("network-cache-written");
            }
            qf2Var.zzq();
            this.t.b(qf2Var, a, null);
            qf2Var.f(a);
        } catch (zf2 e) {
            SystemClock.elapsedRealtime();
            this.t.a(qf2Var, e);
            qf2Var.e();
        } catch (Exception e2) {
            cg2.c(e2, "Unhandled exception %s", e2.toString());
            zf2 zf2Var = new zf2(e2);
            SystemClock.elapsedRealtime();
            this.t.a(qf2Var, zf2Var);
            qf2Var.e();
        } finally {
            qf2Var.g(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.s) {
                    Thread.currentThread().interrupt();
                    return;
                }
                cg2.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
