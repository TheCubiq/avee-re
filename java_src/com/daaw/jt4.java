package com.daaw;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class jt4 extends kw4 {

    /* renamed from: q */
    public final ScheduledExecutorService f15391q;

    /* renamed from: r */
    public final InterfaceC0623ag f15392r;
    @GuardedBy("this")

    /* renamed from: s */
    public long f15393s;
    @GuardedBy("this")

    /* renamed from: t */
    public long f15394t;
    @GuardedBy("this")

    /* renamed from: u */
    public boolean f15395u;
    @GuardedBy("this")

    /* renamed from: v */
    public ScheduledFuture f15396v;

    public jt4(ScheduledExecutorService scheduledExecutorService, InterfaceC0623ag interfaceC0623ag) {
        super(Collections.emptySet());
        this.f15393s = -1L;
        this.f15394t = -1L;
        this.f15395u = false;
        this.f15391q = scheduledExecutorService;
        this.f15392r = interfaceC0623ag;
    }

    /* renamed from: C0 */
    public final synchronized void m18252C0(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.f15395u) {
            long j = this.f15394t;
            if (j <= 0 || millis >= j) {
                millis = j;
            }
            this.f15394t = millis;
            return;
        }
        long mo15859b = this.f15392r.mo15859b();
        long j2 = this.f15393s;
        if (mo15859b > j2 || j2 - this.f15392r.mo15859b() > millis) {
            m18251D0(millis);
        }
    }

    /* renamed from: D0 */
    public final synchronized void m18251D0(long j) {
        ScheduledFuture scheduledFuture = this.f15396v;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f15396v.cancel(true);
        }
        this.f15393s = this.f15392r.mo15859b() + j;
        this.f15396v = this.f15391q.schedule(new it4(this, null), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.f15395u = false;
        m18251D0(0L);
    }

    public final synchronized void zzb() {
        if (this.f15395u) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f15396v;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.f15394t = -1L;
        } else {
            this.f15396v.cancel(true);
            this.f15394t = this.f15393s - this.f15392r.mo15859b();
        }
        this.f15395u = true;
    }

    public final synchronized void zzc() {
        if (this.f15395u) {
            if (this.f15394t > 0 && this.f15396v.isCancelled()) {
                m18251D0(this.f15394t);
            }
            this.f15395u = false;
        }
    }
}
