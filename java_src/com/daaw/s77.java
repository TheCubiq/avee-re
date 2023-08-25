package com.daaw;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class s77 extends i67 {
    @CheckForNull

    /* renamed from: w */
    public f77 f25968w;
    @CheckForNull

    /* renamed from: x */
    public ScheduledFuture f25969x;

    public s77(f77 f77Var) {
        Objects.requireNonNull(f77Var);
        this.f25968w = f77Var;
    }

    /* renamed from: F */
    public static f77 m10592F(f77 f77Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        s77 s77Var = new s77(f77Var);
        p77 p77Var = new p77(s77Var);
        s77Var.f25969x = scheduledExecutorService.schedule(p77Var, j, timeUnit);
        f77Var.mo6515f(p77Var, g67.INSTANCE);
        return s77Var;
    }

    @Override // com.daaw.c57
    @CheckForNull
    /* renamed from: e */
    public final String mo7361e() {
        f77 f77Var = this.f25968w;
        ScheduledFuture scheduledFuture = this.f25969x;
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
    /* renamed from: g */
    public final void mo7360g() {
        m25601v(this.f25968w);
        ScheduledFuture scheduledFuture = this.f25969x;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f25968w = null;
        this.f25969x = null;
    }
}
