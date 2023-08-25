package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class bx8 {

    /* renamed from: d */
    public static final vw8 f5263d = new vw8(0, -9223372036854775807L, null);

    /* renamed from: e */
    public static final vw8 f5264e = new vw8(1, -9223372036854775807L, null);

    /* renamed from: f */
    public static final vw8 f5265f = new vw8(2, -9223372036854775807L, null);

    /* renamed from: g */
    public static final vw8 f5266g = new vw8(3, -9223372036854775807L, null);

    /* renamed from: a */
    public final ExecutorService f5267a = it5.m19379q("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* renamed from: b */
    public ww8 f5268b;

    /* renamed from: c */
    public IOException f5269c;

    public bx8(String str) {
    }

    /* renamed from: b */
    public static vw8 m25759b(boolean z, long j) {
        return new vw8(z ? 1 : 0, j, null);
    }

    /* renamed from: a */
    public final long m25760a(xw8 xw8Var, tw8 tw8Var, int i) {
        Looper myLooper = Looper.myLooper();
        uo4.m7876b(myLooper);
        this.f5269c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new ww8(this, myLooper, xw8Var, tw8Var, i, elapsedRealtime).m5743c(0L);
        return elapsedRealtime;
    }

    /* renamed from: g */
    public final void m25754g() {
        ww8 ww8Var = this.f5268b;
        uo4.m7876b(ww8Var);
        ww8Var.m5745a(false);
    }

    /* renamed from: h */
    public final void m25753h() {
        this.f5269c = null;
    }

    /* renamed from: i */
    public final void m25752i(int i) {
        IOException iOException = this.f5269c;
        if (iOException != null) {
            throw iOException;
        }
        ww8 ww8Var = this.f5268b;
        if (ww8Var != null) {
            ww8Var.m5744b(i);
        }
    }

    /* renamed from: j */
    public final void m25751j(yw8 yw8Var) {
        ww8 ww8Var = this.f5268b;
        if (ww8Var != null) {
            ww8Var.m5745a(true);
        }
        this.f5267a.execute(new zw8(yw8Var));
        this.f5267a.shutdown();
    }

    /* renamed from: k */
    public final boolean m25750k() {
        return this.f5269c != null;
    }

    /* renamed from: l */
    public final boolean m25749l() {
        return this.f5268b != null;
    }
}
