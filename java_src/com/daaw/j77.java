package com.daaw;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class j77 extends m67 implements ScheduledFuture {

    /* renamed from: q */
    public final ScheduledFuture f14501q;

    public j77(f77 f77Var, ScheduledFuture scheduledFuture) {
        super(f77Var);
        this.f14501q = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = mo16196b().cancel(z);
        if (cancel) {
            this.f14501q.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f14501q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f14501q.getDelay(timeUnit);
    }
}
