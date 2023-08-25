package com.daaw;

import android.os.Handler;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class vy8 {

    /* renamed from: a */
    public final Handler f30719a;

    /* renamed from: b */
    public final wy8 f30720b;

    public vy8(Handler handler, wy8 wy8Var) {
        this.f30719a = wy8Var == null ? null : handler;
        this.f30720b = wy8Var;
    }

    /* renamed from: a */
    public final void m6663a(final String str, final long j, final long j2) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.jy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6657g(str, j, j2);
                }
            });
        }
    }

    /* renamed from: b */
    public final void m6662b(final String str) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.uy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6656h(str);
                }
            });
        }
    }

    /* renamed from: c */
    public final void m6661c(final ql7 ql7Var) {
        ql7Var.m12343a();
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.iy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6655i(ql7Var);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m6660d(final int i, final long j) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.dy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6654j(i, j);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m6659e(final ql7 ql7Var) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.hy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6653k(ql7Var);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m6658f(final f92 f92Var, final tm7 tm7Var) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.sy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6652l(f92Var, tm7Var);
                }
            });
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m6657g(String str, long j, long j2) {
        wy8 wy8Var = this.f30720b;
        int i = it5.f13991a;
        wy8Var.mo4107q(str, j, j2);
    }

    /* renamed from: h */
    public final /* synthetic */ void m6656h(String str) {
        wy8 wy8Var = this.f30720b;
        int i = it5.f13991a;
        wy8Var.mo4106r(str);
    }

    /* renamed from: i */
    public final /* synthetic */ void m6655i(ql7 ql7Var) {
        ql7Var.m12343a();
        wy8 wy8Var = this.f30720b;
        int i = it5.f13991a;
        wy8Var.mo4110n(ql7Var);
    }

    /* renamed from: j */
    public final /* synthetic */ void m6654j(int i, long j) {
        wy8 wy8Var = this.f30720b;
        int i2 = it5.f13991a;
        wy8Var.mo4119e(i, j);
    }

    /* renamed from: k */
    public final /* synthetic */ void m6653k(ql7 ql7Var) {
        wy8 wy8Var = this.f30720b;
        int i = it5.f13991a;
        wy8Var.mo4113k(ql7Var);
    }

    /* renamed from: l */
    public final /* synthetic */ void m6652l(f92 f92Var, tm7 tm7Var) {
        int i = it5.f13991a;
        this.f30720b.mo4120d(f92Var, tm7Var);
    }

    /* renamed from: m */
    public final /* synthetic */ void m6651m(Object obj, long j) {
        wy8 wy8Var = this.f30720b;
        int i = it5.f13991a;
        wy8Var.mo4104t(obj, j);
    }

    /* renamed from: n */
    public final /* synthetic */ void m6650n(long j, int i) {
        wy8 wy8Var = this.f30720b;
        int i2 = it5.f13991a;
        wy8Var.mo4118f(j, i);
    }

    /* renamed from: o */
    public final /* synthetic */ void m6649o(Exception exc) {
        wy8 wy8Var = this.f30720b;
        int i = it5.f13991a;
        wy8Var.mo4108p(exc);
    }

    /* renamed from: p */
    public final /* synthetic */ void m6648p(ll4 ll4Var) {
        wy8 wy8Var = this.f30720b;
        int i = it5.f13991a;
        wy8Var.mo4123a(ll4Var);
    }

    /* renamed from: q */
    public final void m6647q(final Object obj) {
        if (this.f30719a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f30719a.post(new Runnable() { // from class: com.daaw.ey8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6651m(obj, elapsedRealtime);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m6646r(final long j, final int i) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.gy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6650n(j, i);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m6645s(final Exception exc) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.fy8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6649o(exc);
                }
            });
        }
    }

    /* renamed from: t */
    public final void m6644t(final ll4 ll4Var) {
        Handler handler = this.f30719a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ty8
                @Override // java.lang.Runnable
                public final void run() {
                    vy8.this.m6648p(ll4Var);
                }
            });
        }
    }
}
