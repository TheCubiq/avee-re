package com.daaw;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class gf2 extends Thread {

    /* renamed from: p */
    public final BlockingQueue f11142p;

    /* renamed from: q */
    public final ff2 f11143q;

    /* renamed from: r */
    public final we2 f11144r;

    /* renamed from: s */
    public volatile boolean f11145s = false;

    /* renamed from: t */
    public final df2 f11146t;

    public gf2(BlockingQueue blockingQueue, ff2 ff2Var, we2 we2Var, df2 df2Var, byte[] bArr) {
        this.f11142p = blockingQueue;
        this.f11143q = ff2Var;
        this.f11144r = we2Var;
        this.f11146t = df2Var;
    }

    /* renamed from: a */
    public final void m21726a() {
        this.f11145s = true;
        interrupt();
    }

    /* renamed from: b */
    public final void m21725b() {
        qf2 qf2Var = (qf2) this.f11142p.take();
        SystemClock.elapsedRealtime();
        qf2Var.m12565g(3);
        try {
            qf2Var.zzm("network-queue-take");
            qf2Var.zzw();
            TrafficStats.setThreadStatsTag(qf2Var.zzc());
            mf2 zza = this.f11143q.zza(qf2Var);
            qf2Var.zzm("network-http-complete");
            if (zza.f18853e && qf2Var.zzv()) {
                qf2Var.m12568d("not-modified");
                qf2Var.m12567e();
                return;
            }
            wf2 mo1348a = qf2Var.mo1348a(zza);
            qf2Var.zzm("network-parse-complete");
            if (mo1348a.f31213b != null) {
                this.f11144r.mo6132a(qf2Var.zzj(), mo1348a.f31213b);
                qf2Var.zzm("network-cache-written");
            }
            qf2Var.zzq();
            this.f11146t.m24429b(qf2Var, mo1348a, null);
            qf2Var.m12566f(mo1348a);
        } catch (zf2 e) {
            SystemClock.elapsedRealtime();
            this.f11146t.m24430a(qf2Var, e);
            qf2Var.m12567e();
        } catch (Exception e2) {
            cg2.m25390c(e2, "Unhandled exception %s", e2.toString());
            zf2 zf2Var = new zf2(e2);
            SystemClock.elapsedRealtime();
            this.f11146t.m24430a(qf2Var, zf2Var);
            qf2Var.m12567e();
        } finally {
            qf2Var.m12565g(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m21725b();
            } catch (InterruptedException unused) {
                if (this.f11145s) {
                    Thread.currentThread().interrupt();
                    return;
                }
                cg2.m25391b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
