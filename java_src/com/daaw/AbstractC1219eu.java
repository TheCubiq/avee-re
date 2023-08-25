package com.daaw;

import com.daaw.p51;
import java.util.concurrent.CancellationException;
/* renamed from: com.daaw.eu */
/* loaded from: classes2.dex */
public abstract class AbstractC1219eu<T> extends qj1 {

    /* renamed from: r */
    public int f8831r;

    public AbstractC1219eu(int i) {
        this.f8831r = i;
    }

    /* renamed from: c */
    public void mo7266c(Object obj, Throwable th) {
    }

    /* renamed from: d */
    public abstract InterfaceC1438gl<T> mo7265d();

    /* renamed from: e */
    public Throwable mo7264e(Object obj) {
        C2292nh c2292nh = obj instanceof C2292nh ? (C2292nh) obj : null;
        if (c2292nh == null) {
            return null;
        }
        return c2292nh.f20118a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public <T> T mo7263f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public final void m23180g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C3651xy.m4411a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ug0.m8271c(th);
        C2954sl.m10220a(mo7265d().getContext(), new C3447wl("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: h */
    public abstract Object mo7262h();

    @Override // java.lang.Runnable
    public final void run() {
        Object m13631a;
        Object m13631a2;
        Object m13631a3;
        uj1 uj1Var = this.f24070q;
        try {
            C0887bu c0887bu = (C0887bu) mo7265d();
            InterfaceC1438gl<T> interfaceC1438gl = c0887bu.f5181t;
            Object obj = c0887bu.f5183v;
            InterfaceC2307nl context = interfaceC1438gl.getContext();
            Object m26071c = bl1.m26071c(context, obj);
            ip1<?> m14202c = m26071c != bl1.f4887a ? C2447ol.m14202c(interfaceC1438gl, context, m26071c) : null;
            InterfaceC2307nl context2 = interfaceC1438gl.getContext();
            Object mo7262h = mo7262h();
            Throwable mo7264e = mo7264e(mo7262h);
            mh0 mh0Var = (mo7264e == null && C1327fu.m22269b(this.f8831r)) ? (mh0) context2.get(mh0.f18874d) : null;
            if (mh0Var != null && !mh0Var.mo8224d()) {
                CancellationException mo8207q = mh0Var.mo8207q();
                mo7266c(mo7262h, mo8207q);
                p51.C2516a c2516a = p51.f22616p;
                m13631a2 = p51.m13631a(s51.m10708a(mo8207q));
            } else if (mo7264e != null) {
                p51.C2516a c2516a2 = p51.f22616p;
                m13631a2 = p51.m13631a(s51.m10708a(mo7264e));
            } else {
                T mo7263f = mo7263f(mo7262h);
                p51.C2516a c2516a3 = p51.f22616p;
                m13631a2 = p51.m13631a(mo7263f);
            }
            interfaceC1438gl.mo7267b(m13631a2);
            lp1 lp1Var = lp1.f17593a;
            if (m14202c == null || m14202c.m19544l0()) {
                bl1.m26073a(context, m26071c);
            }
            try {
                p51.C2516a c2516a4 = p51.f22616p;
                uj1Var.mo7119a();
                m13631a3 = p51.m13631a(lp1Var);
            } catch (Throwable th) {
                p51.C2516a c2516a5 = p51.f22616p;
                m13631a3 = p51.m13631a(s51.m10708a(th));
            }
            m23180g(null, p51.m13630b(m13631a3));
        } catch (Throwable th2) {
            try {
                p51.C2516a c2516a6 = p51.f22616p;
                uj1Var.mo7119a();
                m13631a = p51.m13631a(lp1.f17593a);
            } catch (Throwable th3) {
                p51.C2516a c2516a7 = p51.f22616p;
                m13631a = p51.m13631a(s51.m10708a(th3));
            }
            m23180g(th2, p51.m13630b(m13631a));
        }
    }
}
