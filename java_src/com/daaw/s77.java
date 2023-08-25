package com.daaw;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class s77 extends i67 {
    @CheckForNull
    public f77 w;
    @CheckForNull
    public ScheduledFuture x;

    public s77(f77 f77Var) {
        Objects.requireNonNull(f77Var);
        this.w = f77Var;
    }

    public static f77 F(f77 f77Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        s77 s77Var = new s77(f77Var);
        p77 p77Var = new p77(s77Var);
        s77Var.x = scheduledExecutorService.schedule(p77Var, j, timeUnit);
        f77Var.f(p77Var, g67.INSTANCE);
        return s77Var;
    }

    @Override // com.daaw.c57
    @CheckForNull
    public final String e() {
        f77 f77Var = this.w;
        ScheduledFuture scheduledFuture = this.x;
        if (f77Var != null) {
            String str = "inputFuture=[" + f77Var.toString() + "]";
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.daaw.c57
    public final void g() {
        v(this.w);
        ScheduledFuture scheduledFuture = this.x;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.w = null;
        this.x = null;
    }
}
