package com.daaw;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class ye2 extends Thread {
    public static final boolean v = cg2.a;
    public final BlockingQueue p;
    public final BlockingQueue q;
    public final we2 r;
    public volatile boolean s = false;
    public final dg2 t;
    public final df2 u;

    public ye2(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, we2 we2Var, df2 df2Var, byte[] bArr) {
        this.p = blockingQueue;
        this.q = blockingQueue2;
        this.r = we2Var;
        this.u = df2Var;
        this.t = new dg2(this, blockingQueue2, df2Var, null);
    }

    public final void b() {
        this.s = true;
        interrupt();
    }

    public final void c() {
        df2 df2Var;
        qf2 qf2Var = (qf2) this.p.take();
        qf2Var.zzm("cache-queue-take");
        qf2Var.g(1);
        try {
            qf2Var.zzw();
            ve2 zza = this.r.zza(qf2Var.zzj());
            if (zza == null) {
                qf2Var.zzm("cache-miss");
                if (!this.t.b(qf2Var)) {
                    this.q.put(qf2Var);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza.a(currentTimeMillis)) {
                qf2Var.zzm("cache-hit-expired");
                qf2Var.zze(zza);
                if (!this.t.b(qf2Var)) {
                    this.q.put(qf2Var);
                }
                return;
            }
            qf2Var.zzm("cache-hit");
            wf2 a = qf2Var.a(new mf2(zza.a, zza.g));
            qf2Var.zzm("cache-hit-parsed");
            if (!a.c()) {
                qf2Var.zzm("cache-parsing-failed");
                this.r.b(qf2Var.zzj(), true);
                qf2Var.zze(null);
                if (!this.t.b(qf2Var)) {
                    this.q.put(qf2Var);
                }
                return;
            }
            if (zza.f < currentTimeMillis) {
                qf2Var.zzm("cache-hit-refresh-needed");
                qf2Var.zze(zza);
                a.d = true;
                if (!this.t.b(qf2Var)) {
                    this.u.b(qf2Var, a, new xe2(this, qf2Var));
                }
                df2Var = this.u;
            } else {
                df2Var = this.u;
            }
            df2Var.b(qf2Var, a, null);
        } finally {
            qf2Var.g(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (v) {
            cg2.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.r.zzb();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.s) {
                    Thread.currentThread().interrupt();
                    return;
                }
                cg2.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
