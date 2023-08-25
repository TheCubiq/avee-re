package com.daaw;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.daaw.C1124dq;
import com.daaw.C1992kx;
import com.daaw.InterfaceC3255ut;
import com.daaw.ep0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* renamed from: com.daaw.fx */
/* loaded from: classes.dex */
public class C1336fx implements InterfaceC1627hx, ep0.InterfaceC1210a, C1992kx.InterfaceC1993a {

    /* renamed from: a */
    public final Map<hi0, C1479gx> f10045a;

    /* renamed from: b */
    public final C1886jx f10046b;

    /* renamed from: c */
    public final ep0 f10047c;

    /* renamed from: d */
    public final C1337a f10048d;

    /* renamed from: e */
    public final Map<hi0, WeakReference<C1992kx<?>>> f10049e;

    /* renamed from: f */
    public final h51 f10050f;

    /* renamed from: g */
    public final C1338b f10051g;

    /* renamed from: h */
    public ReferenceQueue<C1992kx<?>> f10052h;

    /* renamed from: com.daaw.fx$a */
    /* loaded from: classes.dex */
    public static class C1337a {

        /* renamed from: a */
        public final ExecutorService f10053a;

        /* renamed from: b */
        public final ExecutorService f10054b;

        /* renamed from: c */
        public final InterfaceC1627hx f10055c;

        public C1337a(ExecutorService executorService, ExecutorService executorService2, InterfaceC1627hx interfaceC1627hx) {
            this.f10053a = executorService;
            this.f10054b = executorService2;
            this.f10055c = interfaceC1627hx;
        }

        /* renamed from: a */
        public C1479gx m22172a(hi0 hi0Var, boolean z) {
            return new C1479gx(hi0Var, this.f10053a, this.f10054b, z, this.f10055c);
        }
    }

    /* renamed from: com.daaw.fx$b */
    /* loaded from: classes.dex */
    public static class C1338b implements C1124dq.InterfaceC1125a {

        /* renamed from: a */
        public final InterfaceC3255ut.InterfaceC3256a f10056a;

        /* renamed from: b */
        public volatile InterfaceC3255ut f10057b;

        public C1338b(InterfaceC3255ut.InterfaceC3256a interfaceC3256a) {
            this.f10056a = interfaceC3256a;
        }

        @Override // com.daaw.C1124dq.InterfaceC1125a
        /* renamed from: a */
        public InterfaceC3255ut mo22171a() {
            if (this.f10057b == null) {
                synchronized (this) {
                    if (this.f10057b == null) {
                        this.f10057b = this.f10056a.mo1922a();
                    }
                    if (this.f10057b == null) {
                        this.f10057b = new C3371vt();
                    }
                }
            }
            return this.f10057b;
        }
    }

    /* renamed from: com.daaw.fx$c */
    /* loaded from: classes.dex */
    public static class C1339c {

        /* renamed from: a */
        public final C1479gx f10058a;

        /* renamed from: b */
        public final b51 f10059b;

        public C1339c(b51 b51Var, C1479gx c1479gx) {
            this.f10059b = b51Var;
            this.f10058a = c1479gx;
        }

        /* renamed from: a */
        public void m22170a() {
            this.f10058a.m21149l(this.f10059b);
        }
    }

    /* renamed from: com.daaw.fx$d */
    /* loaded from: classes.dex */
    public static class C1340d implements MessageQueue.IdleHandler {

        /* renamed from: a */
        public final Map<hi0, WeakReference<C1992kx<?>>> f10060a;

        /* renamed from: b */
        public final ReferenceQueue<C1992kx<?>> f10061b;

        public C1340d(Map<hi0, WeakReference<C1992kx<?>>> map, ReferenceQueue<C1992kx<?>> referenceQueue) {
            this.f10060a = map;
            this.f10061b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            C1341e c1341e = (C1341e) this.f10061b.poll();
            if (c1341e != null) {
                this.f10060a.remove(c1341e.f10062a);
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.daaw.fx$e */
    /* loaded from: classes.dex */
    public static class C1341e extends WeakReference<C1992kx<?>> {

        /* renamed from: a */
        public final hi0 f10062a;

        public C1341e(hi0 hi0Var, C1992kx<?> c1992kx, ReferenceQueue<? super C1992kx<?>> referenceQueue) {
            super(c1992kx, referenceQueue);
            this.f10062a = hi0Var;
        }
    }

    public C1336fx(ep0 ep0Var, InterfaceC3255ut.InterfaceC3256a interfaceC3256a, ExecutorService executorService, ExecutorService executorService2) {
        this(ep0Var, interfaceC3256a, executorService, executorService2, null, null, null, null, null);
    }

    public C1336fx(ep0 ep0Var, InterfaceC3255ut.InterfaceC3256a interfaceC3256a, ExecutorService executorService, ExecutorService executorService2, Map<hi0, C1479gx> map, C1886jx c1886jx, Map<hi0, WeakReference<C1992kx<?>>> map2, C1337a c1337a, h51 h51Var) {
        this.f10047c = ep0Var;
        this.f10051g = new C1338b(interfaceC3256a);
        this.f10049e = map2 == null ? new HashMap<>() : map2;
        this.f10046b = c1886jx == null ? new C1886jx() : c1886jx;
        this.f10045a = map == null ? new HashMap<>() : map;
        this.f10048d = c1337a == null ? new C1337a(executorService, executorService2, this) : c1337a;
        this.f10050f = h51Var == null ? new h51() : h51Var;
        ep0Var.mo3588e(this);
    }

    /* renamed from: j */
    public static void m22174j(String str, long j, hi0 hi0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(jl0.m18441a(j));
        sb.append("ms, key: ");
        sb.append(hi0Var);
    }

    @Override // com.daaw.InterfaceC1627hx
    /* renamed from: a */
    public void mo20337a(hi0 hi0Var, C1992kx<?> c1992kx) {
        tq1.m8869b();
        if (c1992kx != null) {
            c1992kx.m17368f(hi0Var, this);
            if (c1992kx.m17370d()) {
                this.f10049e.put(hi0Var, new C1341e(hi0Var, c1992kx, m22178f()));
            }
        }
        this.f10045a.remove(hi0Var);
    }

    @Override // com.daaw.InterfaceC1627hx
    /* renamed from: b */
    public void mo20336b(C1479gx c1479gx, hi0 hi0Var) {
        tq1.m8869b();
        if (c1479gx.equals(this.f10045a.get(hi0Var))) {
            this.f10045a.remove(hi0Var);
        }
    }

    @Override // com.daaw.C1992kx.InterfaceC1993a
    /* renamed from: c */
    public void mo17367c(hi0 hi0Var, C1992kx c1992kx) {
        tq1.m8869b();
        this.f10049e.remove(hi0Var);
        if (c1992kx.m17370d()) {
            this.f10047c.mo3591a(hi0Var, c1992kx);
        } else {
            this.f10050f.m21022a(c1992kx);
        }
    }

    @Override // com.daaw.ep0.InterfaceC1210a
    /* renamed from: d */
    public void mo22180d(z41<?> z41Var) {
        tq1.m8869b();
        this.f10050f.m21022a(z41Var);
    }

    /* renamed from: e */
    public final C1992kx<?> m22179e(hi0 hi0Var) {
        z41<?> mo3590b = this.f10047c.mo3590b(hi0Var);
        if (mo3590b == null) {
            return null;
        }
        return mo3590b instanceof C1992kx ? (C1992kx) mo3590b : new C1992kx<>(mo3590b, true);
    }

    /* renamed from: f */
    public final ReferenceQueue<C1992kx<?>> m22178f() {
        if (this.f10052h == null) {
            this.f10052h = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new C1340d(this.f10049e, this.f10052h));
        }
        return this.f10052h;
    }

    /* renamed from: g */
    public <T, Z, R> C1339c m22177g(hi0 hi0Var, int i, int i2, InterfaceC1744ip<T> interfaceC1744ip, InterfaceC1849jp<T, Z> interfaceC1849jp, cn1<Z> cn1Var, i51<Z, R> i51Var, dz0 dz0Var, boolean z, EnumC3465wt enumC3465wt, b51 b51Var) {
        tq1.m8869b();
        long m18440b = jl0.m18440b();
        C1766ix m18193a = this.f10046b.m18193a(interfaceC1744ip.getId(), hi0Var, i, i2, interfaceC1849jp.mo6615e(), interfaceC1849jp.mo6616d(), cn1Var, interfaceC1849jp.mo6617c(), i51Var, interfaceC1849jp.mo6618a());
        C1992kx<?> m22175i = m22175i(m18193a, z);
        if (m22175i != null) {
            b51Var.mo21156d(m22175i);
            if (Log.isLoggable("Engine", 2)) {
                m22174j("Loaded resource from cache", m18440b, m18193a);
            }
            return null;
        }
        C1992kx<?> m22176h = m22176h(m18193a, z);
        if (m22176h != null) {
            b51Var.mo21156d(m22176h);
            if (Log.isLoggable("Engine", 2)) {
                m22174j("Loaded resource from active resources", m18440b, m18193a);
            }
            return null;
        }
        C1479gx c1479gx = this.f10045a.get(m18193a);
        if (c1479gx != null) {
            c1479gx.m21155e(b51Var);
            if (Log.isLoggable("Engine", 2)) {
                m22174j("Added to existing load", m18440b, m18193a);
            }
            return new C1339c(b51Var, c1479gx);
        }
        C1479gx m22172a = this.f10048d.m22172a(m18193a, z);
        RunnableC2128lx runnableC2128lx = new RunnableC2128lx(m22172a, new C1124dq(m18193a, i, i2, interfaceC1744ip, interfaceC1849jp, cn1Var, i51Var, this.f10051g, enumC3465wt, dz0Var), dz0Var);
        this.f10045a.put(m18193a, m22172a);
        m22172a.m21155e(b51Var);
        m22172a.m21148m(runnableC2128lx);
        if (Log.isLoggable("Engine", 2)) {
            m22174j("Started new load", m18440b, m18193a);
        }
        return new C1339c(b51Var, m22172a);
    }

    /* renamed from: h */
    public final C1992kx<?> m22176h(hi0 hi0Var, boolean z) {
        C1992kx<?> c1992kx = null;
        if (z) {
            WeakReference<C1992kx<?>> weakReference = this.f10049e.get(hi0Var);
            if (weakReference != null) {
                c1992kx = weakReference.get();
                if (c1992kx != null) {
                    c1992kx.m17371b();
                } else {
                    this.f10049e.remove(hi0Var);
                }
            }
            return c1992kx;
        }
        return null;
    }

    /* renamed from: i */
    public final C1992kx<?> m22175i(hi0 hi0Var, boolean z) {
        if (z) {
            C1992kx<?> m22179e = m22179e(hi0Var);
            if (m22179e != null) {
                m22179e.m17371b();
                this.f10049e.put(hi0Var, new C1341e(hi0Var, m22179e, m22178f()));
            }
            return m22179e;
        }
        return null;
    }

    /* renamed from: k */
    public void m22173k(z41 z41Var) {
        tq1.m8869b();
        if (!(z41Var instanceof C1992kx)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C1992kx) z41Var).m17369e();
    }
}
