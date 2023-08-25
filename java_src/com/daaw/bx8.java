package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class bx8 {
    public static final vw8 d = new vw8(0, -9223372036854775807L, null);
    public static final vw8 e = new vw8(1, -9223372036854775807L, null);
    public static final vw8 f = new vw8(2, -9223372036854775807L, null);
    public static final vw8 g = new vw8(3, -9223372036854775807L, null);
    public final ExecutorService a = it5.q("ExoPlayer:Loader:ProgressiveMediaPeriod");
    public ww8 b;
    public IOException c;

    public bx8(String str) {
    }

    public static vw8 b(boolean z, long j) {
        return new vw8(z ? 1 : 0, j, null);
    }

    public final long a(xw8 xw8Var, tw8 tw8Var, int i) {
        Looper myLooper = Looper.myLooper();
        uo4.b(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new ww8(this, myLooper, xw8Var, tw8Var, i, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }

    public final void g() {
        ww8 ww8Var = this.b;
        uo4.b(ww8Var);
        ww8Var.a(false);
    }

    public final void h() {
        this.c = null;
    }

    public final void i(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        ww8 ww8Var = this.b;
        if (ww8Var != null) {
            ww8Var.b(i);
        }
    }

    public final void j(yw8 yw8Var) {
        ww8 ww8Var = this.b;
        if (ww8Var != null) {
            ww8Var.a(true);
        }
        this.a.execute(new zw8(yw8Var));
        this.a.shutdown();
    }

    public final boolean k() {
        return this.c != null;
    }

    public final boolean l() {
        return this.b != null;
    }
}
