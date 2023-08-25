package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class z88 {
    public final w88 a;
    public final t88 b;
    public final xp4 c;
    public final l64 d;
    public int e;
    public Object f;
    public final Looper g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;

    public z88(t88 t88Var, w88 w88Var, l64 l64Var, int i, xp4 xp4Var, Looper looper) {
        this.b = t88Var;
        this.a = w88Var;
        this.d = l64Var;
        this.g = looper;
        this.c = xp4Var;
        this.h = i;
    }

    public final int a() {
        return this.e;
    }

    public final Looper b() {
        return this.g;
    }

    public final w88 c() {
        return this.a;
    }

    public final z88 d() {
        uo4.f(!this.i);
        this.i = true;
        this.b.c(this);
        return this;
    }

    public final z88 e(Object obj) {
        uo4.f(!this.i);
        this.f = obj;
        return this;
    }

    public final z88 f(int i) {
        uo4.f(!this.i);
        this.e = i;
        return this;
    }

    public final Object g() {
        return this.f;
    }

    public final synchronized void h(boolean z) {
        this.j = z | this.j;
        this.k = true;
        notifyAll();
    }

    public final synchronized boolean i(long j) {
        uo4.f(this.i);
        uo4.f(this.g.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.k) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.j;
    }

    public final synchronized boolean j() {
        return false;
    }
}
