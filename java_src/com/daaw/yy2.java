package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class yy2 {

    /* renamed from: a */
    public final ExecutorService f34255a = pz2.m12838l("Loader:ExtractorMediaPeriod");

    /* renamed from: b */
    public vy2 f34256b;

    /* renamed from: c */
    public IOException f34257c;

    public yy2(String str) {
    }

    /* renamed from: a */
    public final long m3076a(wy2 wy2Var, uy2 uy2Var, int i) {
        Looper myLooper = Looper.myLooper();
        az2.m26583e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new vy2(this, myLooper, wy2Var, uy2Var, i, elapsedRealtime).m6665c(0L);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final void m3071f() {
        this.f34256b.m6667a(false);
    }

    /* renamed from: g */
    public final void m3070g(int i) {
        IOException iOException = this.f34257c;
        if (iOException != null) {
            throw iOException;
        }
        vy2 vy2Var = this.f34256b;
        if (vy2Var != null) {
            vy2Var.m6666b(vy2Var.f30709r);
        }
    }

    /* renamed from: h */
    public final void m3069h(Runnable runnable) {
        vy2 vy2Var = this.f34256b;
        if (vy2Var != null) {
            vy2Var.m6667a(true);
        }
        this.f34255a.execute(runnable);
        this.f34255a.shutdown();
    }

    /* renamed from: i */
    public final boolean m3068i() {
        return this.f34256b != null;
    }
}
