package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ph4 implements m13 {

    /* renamed from: a */
    public final ScheduledExecutorService f22936a;

    /* renamed from: b */
    public final InterfaceC0623ag f22937b;
    @GuardedBy("this")

    /* renamed from: c */
    public ScheduledFuture f22938c;
    @GuardedBy("this")

    /* renamed from: d */
    public long f22939d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    public long f22940e = -1;
    @GuardedBy("this")

    /* renamed from: f */
    public Runnable f22941f = null;
    @GuardedBy("this")

    /* renamed from: g */
    public boolean f22942g = false;

    public ph4(ScheduledExecutorService scheduledExecutorService, InterfaceC0623ag interfaceC0623ag) {
        this.f22936a = scheduledExecutorService;
        this.f22937b = interfaceC0623ag;
        zzt.zzb().m15598c(this);
    }

    /* renamed from: a */
    public final synchronized void m13385a() {
        if (this.f22942g) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f22938c;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f22940e = -1L;
        } else {
            this.f22938c.cancel(true);
            this.f22940e = this.f22939d - this.f22937b.mo15859b();
        }
        this.f22942g = true;
    }

    /* renamed from: b */
    public final synchronized void m13384b() {
        ScheduledFuture scheduledFuture;
        if (this.f22942g) {
            if (this.f22940e > 0 && (scheduledFuture = this.f22938c) != null && scheduledFuture.isCancelled()) {
                this.f22938c = this.f22936a.schedule(this.f22941f, this.f22940e, TimeUnit.MILLISECONDS);
            }
            this.f22942g = false;
        }
    }

    /* renamed from: c */
    public final synchronized void m13383c(int i, Runnable runnable) {
        this.f22941f = runnable;
        long j = i;
        this.f22939d = this.f22937b.mo15859b() + j;
        this.f22938c = this.f22936a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.daaw.m13
    public final void zza(boolean z) {
        if (z) {
            m13384b();
        } else {
            m13385a();
        }
    }
}
