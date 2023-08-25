package com.daaw;

import android.os.Handler;
/* loaded from: classes2.dex */
public abstract class hl2 {

    /* renamed from: d */
    public static volatile Handler f12639d;

    /* renamed from: a */
    public final xe7 f12640a;

    /* renamed from: b */
    public final Runnable f12641b;

    /* renamed from: c */
    public volatile long f12642c;

    public hl2(xe7 xe7Var) {
        ry0.m10830j(xe7Var);
        this.f12640a = xe7Var;
        this.f12641b = new dk2(this, xe7Var);
    }

    /* renamed from: b */
    public final void m20638b() {
        this.f12642c = 0L;
        m20635f().removeCallbacks(this.f12641b);
    }

    /* renamed from: c */
    public abstract void mo8554c();

    /* renamed from: d */
    public final void m20637d(long j) {
        m20638b();
        if (j >= 0) {
            this.f12642c = this.f12640a.mo3909b().mo15860a();
            if (m20635f().postDelayed(this.f12641b, j)) {
                return;
            }
            this.f12640a.mo3895i().m14160q().m20652b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* renamed from: e */
    public final boolean m20636e() {
        return this.f12642c != 0;
    }

    /* renamed from: f */
    public final Handler m20635f() {
        Handler handler;
        if (f12639d != null) {
            return f12639d;
        }
        synchronized (hl2.class) {
            if (f12639d == null) {
                f12639d = new np3(this.f12640a.mo3905d().getMainLooper());
            }
            handler = f12639d;
        }
        return handler;
    }
}
