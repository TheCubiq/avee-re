package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ph4 implements m13 {
    public final ScheduledExecutorService a;
    public final ag b;
    @GuardedBy("this")
    public ScheduledFuture c;
    @GuardedBy("this")
    public long d = -1;
    @GuardedBy("this")
    public long e = -1;
    @GuardedBy("this")
    public Runnable f = null;
    @GuardedBy("this")
    public boolean g = false;

    public ph4(ScheduledExecutorService scheduledExecutorService, ag agVar) {
        this.a = scheduledExecutorService;
        this.b = agVar;
        zzt.zzb().c(this);
    }

    public final synchronized void a() {
        if (this.g) {
            return;
        }
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.e = -1L;
        } else {
            this.c.cancel(true);
            this.e = this.d - this.b.b();
        }
        this.g = true;
    }

    public final synchronized void b() {
        ScheduledFuture scheduledFuture;
        if (this.g) {
            if (this.e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
            }
            this.g = false;
        }
    }

    public final synchronized void c(int i, Runnable runnable) {
        this.f = runnable;
        long j = i;
        this.d = this.b.b() + j;
        this.c = this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.daaw.m13
    public final void zza(boolean z) {
        if (z) {
            b();
        } else {
            a();
        }
    }
}
