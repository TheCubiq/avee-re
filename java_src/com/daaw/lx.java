package com.daaw;

import android.util.Log;
/* loaded from: classes.dex */
public class lx implements Runnable, bz0 {
    public final dz0 p;
    public final a q;
    public final dq<?, ?, ?> r;
    public b s = b.CACHE;
    public volatile boolean t;

    /* loaded from: classes.dex */
    public interface a extends b51 {
        void h(lx lxVar);
    }

    /* loaded from: classes.dex */
    public enum b {
        CACHE,
        SOURCE
    }

    public lx(a aVar, dq<?, ?, ?> dqVar, dz0 dz0Var) {
        this.q = aVar;
        this.r = dqVar;
        this.p = dz0Var;
    }

    @Override // com.daaw.bz0
    public int a() {
        return this.p.ordinal();
    }

    public void b() {
        this.t = true;
        this.r.c();
    }

    public final z41<?> c() {
        return f() ? d() : e();
    }

    public final z41<?> d() {
        z41<?> z41Var;
        try {
            z41Var = this.r.f();
        } catch (Exception e) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception decoding result from cache: ");
                sb.append(e);
            }
            z41Var = null;
        }
        return z41Var == null ? this.r.h() : z41Var;
    }

    public final z41<?> e() {
        return this.r.d();
    }

    public final boolean f() {
        return this.s == b.CACHE;
    }

    public final void g(z41 z41Var) {
        this.q.d(z41Var);
    }

    public final void h(Exception exc) {
        if (!f()) {
            this.q.a(exc);
            return;
        }
        this.s = b.SOURCE;
        this.q.h(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Exception e;
        if (this.t) {
            return;
        }
        z41<?> z41Var = null;
        try {
            e = null;
            z41Var = c();
        } catch (Exception e2) {
            e = e2;
        } catch (OutOfMemoryError e3) {
            e = new ux(e3);
        }
        if (this.t) {
            if (z41Var != null) {
                z41Var.c();
            }
        } else if (z41Var == null) {
            h(e);
        } else {
            g(z41Var);
        }
    }
}
