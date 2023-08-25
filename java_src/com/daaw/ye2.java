package com.daaw;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class ye2 extends Thread {

    /* renamed from: v */
    public static final boolean f33600v = cg2.f5792a;

    /* renamed from: p */
    public final BlockingQueue f33601p;

    /* renamed from: q */
    public final BlockingQueue f33602q;

    /* renamed from: r */
    public final we2 f33603r;

    /* renamed from: s */
    public volatile boolean f33604s = false;

    /* renamed from: t */
    public final dg2 f33605t;

    /* renamed from: u */
    public final df2 f33606u;

    public ye2(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, we2 we2Var, df2 df2Var, byte[] bArr) {
        this.f33601p = blockingQueue;
        this.f33602q = blockingQueue2;
        this.f33603r = we2Var;
        this.f33606u = df2Var;
        this.f33605t = new dg2(this, blockingQueue2, df2Var, null);
    }

    /* renamed from: b */
    public final void m3809b() {
        this.f33604s = true;
        interrupt();
    }

    /* renamed from: c */
    public final void m3808c() {
        df2 df2Var;
        qf2 qf2Var = (qf2) this.f33601p.take();
        qf2Var.zzm("cache-queue-take");
        qf2Var.m12565g(1);
        try {
            qf2Var.zzw();
            ve2 zza = this.f33603r.zza(qf2Var.zzj());
            if (zza == null) {
                qf2Var.zzm("cache-miss");
                if (!this.f33605t.m24418b(qf2Var)) {
                    this.f33602q.put(qf2Var);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza.m7211a(currentTimeMillis)) {
                qf2Var.zzm("cache-hit-expired");
                qf2Var.zze(zza);
                if (!this.f33605t.m24418b(qf2Var)) {
                    this.f33602q.put(qf2Var);
                }
                return;
            }
            qf2Var.zzm("cache-hit");
            wf2 mo1348a = qf2Var.mo1348a(new mf2(zza.f30176a, zza.f30182g));
            qf2Var.zzm("cache-hit-parsed");
            if (!mo1348a.m6087c()) {
                qf2Var.zzm("cache-parsing-failed");
                this.f33603r.mo6131b(qf2Var.zzj(), true);
                qf2Var.zze(null);
                if (!this.f33605t.m24418b(qf2Var)) {
                    this.f33602q.put(qf2Var);
                }
                return;
            }
            if (zza.f30181f < currentTimeMillis) {
                qf2Var.zzm("cache-hit-refresh-needed");
                qf2Var.zze(zza);
                mo1348a.f31215d = true;
                if (!this.f33605t.m24418b(qf2Var)) {
                    this.f33606u.m24429b(qf2Var, mo1348a, new xe2(this, qf2Var));
                }
                df2Var = this.f33606u;
            } else {
                df2Var = this.f33606u;
            }
            df2Var.m24429b(qf2Var, mo1348a, null);
        } finally {
            qf2Var.m12565g(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f33600v) {
            cg2.m25389d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f33603r.zzb();
        while (true) {
            try {
                m3808c();
            } catch (InterruptedException unused) {
                if (this.f33604s) {
                    Thread.currentThread().interrupt();
                    return;
                }
                cg2.m25391b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
