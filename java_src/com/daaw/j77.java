package com.daaw;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class j77 extends m67 implements ScheduledFuture {
    public final ScheduledFuture q;

    public j77(f77 f77Var, ScheduledFuture scheduledFuture) {
        super(f77Var);
        this.q = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = b().cancel(z);
        if (cancel) {
            this.q.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.q.getDelay(timeUnit);
    }
}
