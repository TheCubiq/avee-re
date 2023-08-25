package com.daaw;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class p77 implements Runnable {
    @CheckForNull

    /* renamed from: p */
    public s77 f22668p;

    public p77(s77 s77Var) {
        this.f22668p = s77Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r1 = r0.f25968w;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        f77 f77Var;
        ScheduledFuture scheduledFuture;
        s77 s77Var = this.f22668p;
        if (s77Var == null || f77Var == null) {
            return;
        }
        this.f22668p = null;
        if (f77Var.isDone()) {
            s77Var.m25600w(f77Var);
            return;
        }
        try {
            scheduledFuture = s77Var.f25969x;
            s77Var.f25969x = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                if (abs > 10) {
                    str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                }
            }
            s77Var.mo14485i(new r77(str + ": " + f77Var.toString(), null));
        } finally {
            f77Var.cancel(true);
        }
    }
}
