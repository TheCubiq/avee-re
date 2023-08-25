package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.RunnableC2128lx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* renamed from: com.daaw.gx */
/* loaded from: classes.dex */
public class C1479gx implements RunnableC2128lx.InterfaceC2129a {

    /* renamed from: q */
    public static final C1481b f11796q = new C1481b();

    /* renamed from: r */
    public static final Handler f11797r = new Handler(Looper.getMainLooper(), new C1482c());

    /* renamed from: a */
    public final List<b51> f11798a;

    /* renamed from: b */
    public final C1481b f11799b;

    /* renamed from: c */
    public final InterfaceC1627hx f11800c;

    /* renamed from: d */
    public final hi0 f11801d;

    /* renamed from: e */
    public final ExecutorService f11802e;

    /* renamed from: f */
    public final ExecutorService f11803f;

    /* renamed from: g */
    public final boolean f11804g;

    /* renamed from: h */
    public boolean f11805h;

    /* renamed from: i */
    public z41<?> f11806i;

    /* renamed from: j */
    public boolean f11807j;

    /* renamed from: k */
    public Exception f11808k;

    /* renamed from: l */
    public boolean f11809l;

    /* renamed from: m */
    public Set<b51> f11810m;

    /* renamed from: n */
    public RunnableC2128lx f11811n;

    /* renamed from: o */
    public C1992kx<?> f11812o;

    /* renamed from: p */
    public volatile Future<?> f11813p;

    /* renamed from: com.daaw.gx$b */
    /* loaded from: classes.dex */
    public static class C1481b {
        /* renamed from: a */
        public <R> C1992kx<R> m21147a(z41<R> z41Var, boolean z) {
            return new C1992kx<>(z41Var, z);
        }
    }

    /* renamed from: com.daaw.gx$c */
    /* loaded from: classes.dex */
    public static class C1482c implements Handler.Callback {
        public C1482c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (1 == i || 2 == i) {
                C1479gx c1479gx = (C1479gx) message.obj;
                if (1 == i) {
                    c1479gx.m21151j();
                } else {
                    c1479gx.m21152i();
                }
                return true;
            }
            return false;
        }
    }

    public C1479gx(hi0 hi0Var, ExecutorService executorService, ExecutorService executorService2, boolean z, InterfaceC1627hx interfaceC1627hx) {
        this(hi0Var, executorService, executorService2, z, interfaceC1627hx, f11796q);
    }

    public C1479gx(hi0 hi0Var, ExecutorService executorService, ExecutorService executorService2, boolean z, InterfaceC1627hx interfaceC1627hx, C1481b c1481b) {
        this.f11798a = new ArrayList();
        this.f11801d = hi0Var;
        this.f11802e = executorService;
        this.f11803f = executorService2;
        this.f11804g = z;
        this.f11800c = interfaceC1627hx;
        this.f11799b = c1481b;
    }

    @Override // com.daaw.b51
    /* renamed from: a */
    public void mo21159a(Exception exc) {
        this.f11808k = exc;
        f11797r.obtainMessage(2, this).sendToTarget();
    }

    @Override // com.daaw.b51
    /* renamed from: d */
    public void mo21156d(z41<?> z41Var) {
        this.f11806i = z41Var;
        f11797r.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: e */
    public void m21155e(b51 b51Var) {
        tq1.m8869b();
        if (this.f11807j) {
            b51Var.mo21156d(this.f11812o);
        } else if (this.f11809l) {
            b51Var.mo21159a(this.f11808k);
        } else {
            this.f11798a.add(b51Var);
        }
    }

    /* renamed from: f */
    public final void m21154f(b51 b51Var) {
        if (this.f11810m == null) {
            this.f11810m = new HashSet();
        }
        this.f11810m.add(b51Var);
    }

    /* renamed from: g */
    public void m21153g() {
        if (this.f11809l || this.f11807j || this.f11805h) {
            return;
        }
        this.f11811n.m16407b();
        Future<?> future = this.f11813p;
        if (future != null) {
            future.cancel(true);
        }
        this.f11805h = true;
        this.f11800c.mo20336b(this, this.f11801d);
    }

    @Override // com.daaw.RunnableC2128lx.InterfaceC2129a
    /* renamed from: h */
    public void mo16400h(RunnableC2128lx runnableC2128lx) {
        this.f11813p = this.f11803f.submit(runnableC2128lx);
    }

    /* renamed from: i */
    public final void m21152i() {
        if (this.f11805h) {
            return;
        }
        if (this.f11798a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        this.f11809l = true;
        this.f11800c.mo20337a(this.f11801d, null);
        for (b51 b51Var : this.f11798a) {
            if (!m21150k(b51Var)) {
                b51Var.mo21159a(this.f11808k);
            }
        }
    }

    /* renamed from: j */
    public final void m21151j() {
        if (this.f11805h) {
            this.f11806i.mo2827c();
        } else if (this.f11798a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else {
            C1992kx<?> m21147a = this.f11799b.m21147a(this.f11806i, this.f11804g);
            this.f11812o = m21147a;
            this.f11807j = true;
            m21147a.m17371b();
            this.f11800c.mo20337a(this.f11801d, this.f11812o);
            for (b51 b51Var : this.f11798a) {
                if (!m21150k(b51Var)) {
                    this.f11812o.m17371b();
                    b51Var.mo21156d(this.f11812o);
                }
            }
            this.f11812o.m17369e();
        }
    }

    /* renamed from: k */
    public final boolean m21150k(b51 b51Var) {
        Set<b51> set = this.f11810m;
        return set != null && set.contains(b51Var);
    }

    /* renamed from: l */
    public void m21149l(b51 b51Var) {
        tq1.m8869b();
        if (this.f11807j || this.f11809l) {
            m21154f(b51Var);
            return;
        }
        this.f11798a.remove(b51Var);
        if (this.f11798a.isEmpty()) {
            m21153g();
        }
    }

    /* renamed from: m */
    public void m21148m(RunnableC2128lx runnableC2128lx) {
        this.f11811n = runnableC2128lx;
        this.f11813p = this.f11802e.submit(runnableC2128lx);
    }
}
