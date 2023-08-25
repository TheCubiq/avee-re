package com.daaw;

import android.os.Handler;
/* loaded from: classes.dex */
public final class dj8 {
    public final Handler a;
    public final fj8 b;

    public dj8(Handler handler, fj8 fj8Var) {
        this.a = fj8Var == null ? null : handler;
        this.b = fj8Var;
    }

    public final void a(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ji8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.h(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.vi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.i(exc);
                }
            });
        }
    }

    public final void c(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ti8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.j(str, j, j2);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.xi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.k(str);
                }
            });
        }
    }

    public final void e(final ql7 ql7Var) {
        ql7Var.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.li8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.l(ql7Var);
                }
            });
        }
    }

    public final void f(final ql7 ql7Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ni8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m(ql7Var);
                }
            });
        }
    }

    public final void g(final f92 f92Var, final tm7 tm7Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.zi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.n(f92Var, tm7Var);
                }
            });
        }
    }

    public final /* synthetic */ void h(Exception exc) {
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.g(exc);
    }

    public final /* synthetic */ void i(Exception exc) {
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.j(exc);
    }

    public final /* synthetic */ void j(String str, long j, long j2) {
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.i(str, j, j2);
    }

    public final /* synthetic */ void k(String str) {
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.l(str);
    }

    public final /* synthetic */ void l(ql7 ql7Var) {
        ql7Var.a();
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.b(ql7Var);
    }

    public final /* synthetic */ void m(ql7 ql7Var) {
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.h(ql7Var);
    }

    public final /* synthetic */ void n(f92 f92Var, tm7 tm7Var) {
        int i = it5.a;
        this.b.m(f92Var, tm7Var);
    }

    public final /* synthetic */ void o(long j) {
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.s(j);
    }

    public final /* synthetic */ void p(boolean z) {
        fj8 fj8Var = this.b;
        int i = it5.a;
        fj8Var.c(z);
    }

    public final /* synthetic */ void q(int i, long j, long j2) {
        fj8 fj8Var = this.b;
        int i2 = it5.a;
        fj8Var.o(i, j, j2);
    }

    public final void r(final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.pi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.o(j);
                }
            });
        }
    }

    public final void s(final boolean z) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ri8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.p(z);
                }
            });
        }
    }

    public final void t(final int i, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.bj8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.q(i, j, j2);
                }
            });
        }
    }
}
