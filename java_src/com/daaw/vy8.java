package com.daaw;

import android.os.Handler;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class vy8 {
    public final Handler a;
    public final wy8 b;

    public vy8(Handler handler, wy8 wy8Var) {
        this.a = wy8Var == null ? null : handler;
        this.b = wy8Var;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.jy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.g(str, j, j2);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.uy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.h(str);
                }
            });
        }
    }

    public final void c(final ql7 ql7Var) {
        ql7Var.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.iy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.i(ql7Var);
                }
            });
        }
    }

    public final void d(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.dy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.j(i, j);
                }
            });
        }
    }

    public final void e(final ql7 ql7Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.hy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.k(ql7Var);
                }
            });
        }
    }

    public final void f(final f92 f92Var, final tm7 tm7Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.sy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.l(f92Var, tm7Var);
                }
            });
        }
    }

    public final /* synthetic */ void g(String str, long j, long j2) {
        wy8 wy8Var = this.b;
        int i = it5.a;
        wy8Var.q(str, j, j2);
    }

    public final /* synthetic */ void h(String str) {
        wy8 wy8Var = this.b;
        int i = it5.a;
        wy8Var.r(str);
    }

    public final /* synthetic */ void i(ql7 ql7Var) {
        ql7Var.a();
        wy8 wy8Var = this.b;
        int i = it5.a;
        wy8Var.n(ql7Var);
    }

    public final /* synthetic */ void j(int i, long j) {
        wy8 wy8Var = this.b;
        int i2 = it5.a;
        wy8Var.e(i, j);
    }

    public final /* synthetic */ void k(ql7 ql7Var) {
        wy8 wy8Var = this.b;
        int i = it5.a;
        wy8Var.k(ql7Var);
    }

    public final /* synthetic */ void l(f92 f92Var, tm7 tm7Var) {
        int i = it5.a;
        this.b.d(f92Var, tm7Var);
    }

    public final /* synthetic */ void m(Object obj, long j) {
        wy8 wy8Var = this.b;
        int i = it5.a;
        wy8Var.t(obj, j);
    }

    public final /* synthetic */ void n(long j, int i) {
        wy8 wy8Var = this.b;
        int i2 = it5.a;
        wy8Var.f(j, i);
    }

    public final /* synthetic */ void o(Exception exc) {
        wy8 wy8Var = this.b;
        int i = it5.a;
        wy8Var.p(exc);
    }

    public final /* synthetic */ void p(ll4 ll4Var) {
        wy8 wy8Var = this.b;
        int i = it5.a;
        wy8Var.a(ll4Var);
    }

    public final void q(final Object obj) {
        if (this.a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.post(new Runnable() { // from class: com.daaw.ey8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j, final int i) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.gy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.n(j, i);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.fy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.o(exc);
                }
            });
        }
    }

    public final void t(final ll4 ll4Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ty8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.p(ll4Var);
                }
            });
        }
    }
}
