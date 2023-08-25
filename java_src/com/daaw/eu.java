package com.daaw;

import com.daaw.p51;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public abstract class eu<T> extends qj1 {
    public int r;

    public eu(int i) {
        this.r = i;
    }

    public void c(Object obj, Throwable th) {
    }

    public abstract gl<T> d();

    public Throwable e(Object obj) {
        nh nhVar = obj instanceof nh ? (nh) obj : null;
        if (nhVar == null) {
            return null;
        }
        return nhVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            xy.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ug0.c(th);
        sl.a(d().getContext(), new wl("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object a;
        Object a2;
        Object a3;
        uj1 uj1Var = this.q;
        try {
            bu buVar = (bu) d();
            gl<T> glVar = buVar.t;
            Object obj = buVar.v;
            nl context = glVar.getContext();
            Object c = bl1.c(context, obj);
            ip1<?> c2 = c != bl1.a ? ol.c(glVar, context, c) : null;
            nl context2 = glVar.getContext();
            Object h = h();
            Throwable e = e(h);
            mh0 mh0Var = (e == null && fu.b(this.r)) ? (mh0) context2.get(mh0.d) : null;
            if (mh0Var != null && !mh0Var.d()) {
                CancellationException q = mh0Var.q();
                c(h, q);
                p51.a aVar = p51.p;
                a2 = p51.a(s51.a(q));
            } else if (e != null) {
                p51.a aVar2 = p51.p;
                a2 = p51.a(s51.a(e));
            } else {
                T f = f(h);
                p51.a aVar3 = p51.p;
                a2 = p51.a(f);
            }
            glVar.b(a2);
            lp1 lp1Var = lp1.a;
            if (c2 == null || c2.l0()) {
                bl1.a(context, c);
            }
            try {
                p51.a aVar4 = p51.p;
                uj1Var.a();
                a3 = p51.a(lp1Var);
            } catch (Throwable th) {
                p51.a aVar5 = p51.p;
                a3 = p51.a(s51.a(th));
            }
            g(null, p51.b(a3));
        } catch (Throwable th2) {
            try {
                p51.a aVar6 = p51.p;
                uj1Var.a();
                a = p51.a(lp1.a);
            } catch (Throwable th3) {
                p51.a aVar7 = p51.p;
                a = p51.a(s51.a(th3));
            }
            g(th2, p51.b(a));
        }
    }
}
