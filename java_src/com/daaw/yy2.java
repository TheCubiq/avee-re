package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class yy2 {
    public final ExecutorService a = pz2.l("Loader:ExtractorMediaPeriod");
    public vy2 b;
    public IOException c;

    public yy2(String str) {
    }

    public final long a(wy2 wy2Var, uy2 uy2Var, int i) {
        Looper myLooper = Looper.myLooper();
        az2.e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new vy2(this, myLooper, wy2Var, uy2Var, i, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }

    public final void f() {
        this.b.a(false);
    }

    public final void g(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        vy2 vy2Var = this.b;
        if (vy2Var != null) {
            vy2Var.b(vy2Var.r);
        }
    }

    public final void h(Runnable runnable) {
        vy2 vy2Var = this.b;
        if (vy2Var != null) {
            vy2Var.a(true);
        }
        this.a.execute(runnable);
        this.a.shutdown();
    }

    public final boolean i() {
        return this.b != null;
    }
}
