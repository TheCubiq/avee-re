package com.daaw;

import android.os.Handler;
/* loaded from: classes.dex */
public final class fx0 {

    /* renamed from: a */
    public final InterfaceC1343b f10063a;

    /* renamed from: b */
    public final InterfaceC1342a f10064b;

    /* renamed from: c */
    public final nl1 f10065c;

    /* renamed from: d */
    public int f10066d;

    /* renamed from: e */
    public Object f10067e;

    /* renamed from: f */
    public Handler f10068f;

    /* renamed from: g */
    public int f10069g;

    /* renamed from: h */
    public long f10070h = -9223372036854775807L;

    /* renamed from: i */
    public boolean f10071i = true;

    /* renamed from: j */
    public boolean f10072j;

    /* renamed from: k */
    public boolean f10073k;

    /* renamed from: l */
    public boolean f10074l;

    /* renamed from: m */
    public boolean f10075m;

    /* renamed from: com.daaw.fx0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1342a {
        /* renamed from: b */
        void mo7617b(fx0 fx0Var);
    }

    /* renamed from: com.daaw.fx0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1343b {
        /* renamed from: r */
        void mo5354r(int i, Object obj);
    }

    public fx0(InterfaceC1342a interfaceC1342a, InterfaceC1343b interfaceC1343b, nl1 nl1Var, int i, Handler handler) {
        this.f10064b = interfaceC1342a;
        this.f10063a = interfaceC1343b;
        this.f10065c = nl1Var;
        this.f10068f = handler;
        this.f10069g = i;
    }

    /* renamed from: a */
    public synchronized boolean m22168a() {
        C2914s6.m10685f(this.f10072j);
        C2914s6.m10685f(this.f10068f.getLooper().getThread() != Thread.currentThread());
        while (!this.f10074l) {
            wait();
        }
        return this.f10073k;
    }

    /* renamed from: b */
    public boolean m22167b() {
        return this.f10071i;
    }

    /* renamed from: c */
    public Handler m22166c() {
        return this.f10068f;
    }

    /* renamed from: d */
    public Object m22165d() {
        return this.f10067e;
    }

    /* renamed from: e */
    public long m22164e() {
        return this.f10070h;
    }

    /* renamed from: f */
    public InterfaceC1343b m22163f() {
        return this.f10063a;
    }

    /* renamed from: g */
    public nl1 m22162g() {
        return this.f10065c;
    }

    /* renamed from: h */
    public int m22161h() {
        return this.f10066d;
    }

    /* renamed from: i */
    public int m22160i() {
        return this.f10069g;
    }

    /* renamed from: j */
    public synchronized boolean m22159j() {
        return this.f10075m;
    }

    /* renamed from: k */
    public synchronized void m22158k(boolean z) {
        this.f10073k = z | this.f10073k;
        this.f10074l = true;
        notifyAll();
    }

    /* renamed from: l */
    public fx0 m22157l() {
        C2914s6.m10685f(!this.f10072j);
        if (this.f10070h == -9223372036854775807L) {
            C2914s6.m10690a(this.f10071i);
        }
        this.f10072j = true;
        this.f10064b.mo7617b(this);
        return this;
    }

    /* renamed from: m */
    public fx0 m22156m(Object obj) {
        C2914s6.m10685f(!this.f10072j);
        this.f10067e = obj;
        return this;
    }

    /* renamed from: n */
    public fx0 m22155n(int i) {
        C2914s6.m10685f(!this.f10072j);
        this.f10066d = i;
        return this;
    }
}
