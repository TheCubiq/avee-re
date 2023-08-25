package com.daaw;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class jt4 extends kw4 {
    public final ScheduledExecutorService q;
    public final ag r;
    @GuardedBy("this")
    public long s;
    @GuardedBy("this")
    public long t;
    @GuardedBy("this")
    public boolean u;
    @GuardedBy("this")
    public ScheduledFuture v;

    public jt4(ScheduledExecutorService scheduledExecutorService, ag agVar) {
        super(Collections.emptySet());
        this.s = -1L;
        this.t = -1L;
        this.u = false;
        this.q = scheduledExecutorService;
        this.r = agVar;
    }

    public final synchronized void C0(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.u) {
            long j = this.t;
            if (j <= 0 || millis >= j) {
                millis = j;
            }
            this.t = millis;
            return;
        }
        long b = this.r.b();
        long j2 = this.s;
        if (b > j2 || j2 - this.r.b() > millis) {
            D0(millis);
        }
    }

    public final synchronized void D0(long j) {
        ScheduledFuture scheduledFuture = this.v;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.v.cancel(true);
        }
        this.s = this.r.b() + j;
        this.v = this.q.schedule(new it4(this, null), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.u = false;
        D0(0L);
    }

    public final synchronized void zzb() {
        if (this.u) {
            return;
        }
        ScheduledFuture scheduledFuture = this.v;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.t = -1L;
        } else {
            this.v.cancel(true);
            this.t = this.s - this.r.b();
        }
        this.u = true;
    }

    public final synchronized void zzc() {
        if (this.u) {
            if (this.t > 0 && this.v.isCancelled()) {
                D0(this.t);
            }
            this.u = false;
        }
    }
}
