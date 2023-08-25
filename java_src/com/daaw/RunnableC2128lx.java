package com.daaw;

import android.util.Log;
/* renamed from: com.daaw.lx */
/* loaded from: classes.dex */
public class RunnableC2128lx implements Runnable, bz0 {

    /* renamed from: p */
    public final dz0 f17877p;

    /* renamed from: q */
    public final InterfaceC2129a f17878q;

    /* renamed from: r */
    public final C1124dq<?, ?, ?> f17879r;

    /* renamed from: s */
    public EnumC2130b f17880s = EnumC2130b.CACHE;

    /* renamed from: t */
    public volatile boolean f17881t;

    /* renamed from: com.daaw.lx$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2129a extends b51 {
        /* renamed from: h */
        void mo16400h(RunnableC2128lx runnableC2128lx);
    }

    /* renamed from: com.daaw.lx$b */
    /* loaded from: classes.dex */
    public enum EnumC2130b {
        CACHE,
        SOURCE
    }

    public RunnableC2128lx(InterfaceC2129a interfaceC2129a, C1124dq<?, ?, ?> c1124dq, dz0 dz0Var) {
        this.f17878q = interfaceC2129a;
        this.f17879r = c1124dq;
        this.f17877p = dz0Var;
    }

    @Override // com.daaw.bz0
    /* renamed from: a */
    public int mo16408a() {
        return this.f17877p.ordinal();
    }

    /* renamed from: b */
    public void m16407b() {
        this.f17881t = true;
        this.f17879r.m24093c();
    }

    /* renamed from: c */
    public final z41<?> m16406c() {
        return m16403f() ? m16405d() : m16404e();
    }

    /* renamed from: d */
    public final z41<?> m16405d() {
        z41<?> z41Var;
        try {
            z41Var = this.f17879r.m24090f();
        } catch (Exception e) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception decoding result from cache: ");
                sb.append(e);
            }
            z41Var = null;
        }
        return z41Var == null ? this.f17879r.m24088h() : z41Var;
    }

    /* renamed from: e */
    public final z41<?> m16404e() {
        return this.f17879r.m24092d();
    }

    /* renamed from: f */
    public final boolean m16403f() {
        return this.f17880s == EnumC2130b.CACHE;
    }

    /* renamed from: g */
    public final void m16402g(z41 z41Var) {
        this.f17878q.mo21156d(z41Var);
    }

    /* renamed from: h */
    public final void m16401h(Exception exc) {
        if (!m16403f()) {
            this.f17878q.mo21159a(exc);
            return;
        }
        this.f17880s = EnumC2130b.SOURCE;
        this.f17878q.mo16400h(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Exception e;
        if (this.f17881t) {
            return;
        }
        z41<?> z41Var = null;
        try {
            e = null;
            z41Var = m16406c();
        } catch (Exception e2) {
            e = e2;
        } catch (OutOfMemoryError e3) {
            e = new C3264ux(e3);
        }
        if (this.f17881t) {
            if (z41Var != null) {
                z41Var.mo2827c();
            }
        } else if (z41Var == null) {
            m16401h(e);
        } else {
            m16402g(z41Var);
        }
    }
}
