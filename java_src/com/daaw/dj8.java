package com.daaw;

import android.os.Handler;
/* loaded from: classes.dex */
public final class dj8 {

    /* renamed from: a */
    public final Handler f7200a;

    /* renamed from: b */
    public final fj8 f7201b;

    public dj8(Handler handler, fj8 fj8Var) {
        this.f7200a = fj8Var == null ? null : handler;
        this.f7201b = fj8Var;
    }

    /* renamed from: a */
    public final void m24332a(final Exception exc) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ji8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24325h(exc);
                }
            });
        }
    }

    /* renamed from: b */
    public final void m24331b(final Exception exc) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.vi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24324i(exc);
                }
            });
        }
    }

    /* renamed from: c */
    public final void m24330c(final String str, final long j, final long j2) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ti8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24323j(str, j, j2);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m24329d(final String str) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.xi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24322k(str);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m24328e(final ql7 ql7Var) {
        ql7Var.m12343a();
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.li8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24321l(ql7Var);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m24327f(final ql7 ql7Var) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ni8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24320m(ql7Var);
                }
            });
        }
    }

    /* renamed from: g */
    public final void m24326g(final f92 f92Var, final tm7 tm7Var) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.zi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24319n(f92Var, tm7Var);
                }
            });
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m24325h(Exception exc) {
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4117g(exc);
    }

    /* renamed from: i */
    public final /* synthetic */ void m24324i(Exception exc) {
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4114j(exc);
    }

    /* renamed from: j */
    public final /* synthetic */ void m24323j(String str, long j, long j2) {
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4115i(str, j, j2);
    }

    /* renamed from: k */
    public final /* synthetic */ void m24322k(String str) {
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4112l(str);
    }

    /* renamed from: l */
    public final /* synthetic */ void m24321l(ql7 ql7Var) {
        ql7Var.m12343a();
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4122b(ql7Var);
    }

    /* renamed from: m */
    public final /* synthetic */ void m24320m(ql7 ql7Var) {
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4116h(ql7Var);
    }

    /* renamed from: n */
    public final /* synthetic */ void m24319n(f92 f92Var, tm7 tm7Var) {
        int i = it5.f13991a;
        this.f7201b.mo4111m(f92Var, tm7Var);
    }

    /* renamed from: o */
    public final /* synthetic */ void m24318o(long j) {
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4105s(j);
    }

    /* renamed from: p */
    public final /* synthetic */ void m24317p(boolean z) {
        fj8 fj8Var = this.f7201b;
        int i = it5.f13991a;
        fj8Var.mo4121c(z);
    }

    /* renamed from: q */
    public final /* synthetic */ void m24316q(int i, long j, long j2) {
        fj8 fj8Var = this.f7201b;
        int i2 = it5.f13991a;
        fj8Var.mo4109o(i, j, j2);
    }

    /* renamed from: r */
    public final void m24315r(final long j) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.pi8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24318o(j);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m24314s(final boolean z) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ri8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24317p(z);
                }
            });
        }
    }

    /* renamed from: t */
    public final void m24313t(final int i, final long j, final long j2) {
        Handler handler = this.f7200a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.bj8
                @Override // java.lang.Runnable
                public final void run() {
                    dj8.this.m24316q(i, j, j2);
                }
            });
        }
    }
}
