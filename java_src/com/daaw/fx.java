package com.daaw;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.daaw.dq;
import com.daaw.ep0;
import com.daaw.kx;
import com.daaw.ut;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class fx implements hx, ep0.a, kx.a {
    public final Map<hi0, gx> a;
    public final jx b;
    public final ep0 c;
    public final a d;
    public final Map<hi0, WeakReference<kx<?>>> e;
    public final h51 f;
    public final b g;
    public ReferenceQueue<kx<?>> h;

    /* loaded from: classes.dex */
    public static class a {
        public final ExecutorService a;
        public final ExecutorService b;
        public final hx c;

        public a(ExecutorService executorService, ExecutorService executorService2, hx hxVar) {
            this.a = executorService;
            this.b = executorService2;
            this.c = hxVar;
        }

        public gx a(hi0 hi0Var, boolean z) {
            return new gx(hi0Var, this.a, this.b, z, this.c);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements dq.a {
        public final ut.a a;
        public volatile ut b;

        public b(ut.a aVar) {
            this.a = aVar;
        }

        @Override // com.daaw.dq.a
        public ut a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.a();
                    }
                    if (this.b == null) {
                        this.b = new vt();
                    }
                }
            }
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final gx a;
        public final b51 b;

        public c(b51 b51Var, gx gxVar) {
            this.b = b51Var;
            this.a = gxVar;
        }

        public void a() {
            this.a.l(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements MessageQueue.IdleHandler {
        public final Map<hi0, WeakReference<kx<?>>> a;
        public final ReferenceQueue<kx<?>> b;

        public d(Map<hi0, WeakReference<kx<?>>> map, ReferenceQueue<kx<?>> referenceQueue) {
            this.a = map;
            this.b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            e eVar = (e) this.b.poll();
            if (eVar != null) {
                this.a.remove(eVar.a);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends WeakReference<kx<?>> {
        public final hi0 a;

        public e(hi0 hi0Var, kx<?> kxVar, ReferenceQueue<? super kx<?>> referenceQueue) {
            super(kxVar, referenceQueue);
            this.a = hi0Var;
        }
    }

    public fx(ep0 ep0Var, ut.a aVar, ExecutorService executorService, ExecutorService executorService2) {
        this(ep0Var, aVar, executorService, executorService2, null, null, null, null, null);
    }

    public fx(ep0 ep0Var, ut.a aVar, ExecutorService executorService, ExecutorService executorService2, Map<hi0, gx> map, jx jxVar, Map<hi0, WeakReference<kx<?>>> map2, a aVar2, h51 h51Var) {
        this.c = ep0Var;
        this.g = new b(aVar);
        this.e = map2 == null ? new HashMap<>() : map2;
        this.b = jxVar == null ? new jx() : jxVar;
        this.a = map == null ? new HashMap<>() : map;
        this.d = aVar2 == null ? new a(executorService, executorService2, this) : aVar2;
        this.f = h51Var == null ? new h51() : h51Var;
        ep0Var.e(this);
    }

    public static void j(String str, long j, hi0 hi0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(jl0.a(j));
        sb.append("ms, key: ");
        sb.append(hi0Var);
    }

    @Override // com.daaw.hx
    public void a(hi0 hi0Var, kx<?> kxVar) {
        tq1.b();
        if (kxVar != null) {
            kxVar.f(hi0Var, this);
            if (kxVar.d()) {
                this.e.put(hi0Var, new e(hi0Var, kxVar, f()));
            }
        }
        this.a.remove(hi0Var);
    }

    @Override // com.daaw.hx
    public void b(gx gxVar, hi0 hi0Var) {
        tq1.b();
        if (gxVar.equals(this.a.get(hi0Var))) {
            this.a.remove(hi0Var);
        }
    }

    @Override // com.daaw.kx.a
    public void c(hi0 hi0Var, kx kxVar) {
        tq1.b();
        this.e.remove(hi0Var);
        if (kxVar.d()) {
            this.c.a(hi0Var, kxVar);
        } else {
            this.f.a(kxVar);
        }
    }

    @Override // com.daaw.ep0.a
    public void d(z41<?> z41Var) {
        tq1.b();
        this.f.a(z41Var);
    }

    public final kx<?> e(hi0 hi0Var) {
        z41<?> b2 = this.c.b(hi0Var);
        if (b2 == null) {
            return null;
        }
        return b2 instanceof kx ? (kx) b2 : new kx<>(b2, true);
    }

    public final ReferenceQueue<kx<?>> f() {
        if (this.h == null) {
            this.h = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new d(this.e, this.h));
        }
        return this.h;
    }

    public <T, Z, R> c g(hi0 hi0Var, int i, int i2, ip<T> ipVar, jp<T, Z> jpVar, cn1<Z> cn1Var, i51<Z, R> i51Var, dz0 dz0Var, boolean z, wt wtVar, b51 b51Var) {
        tq1.b();
        long b2 = jl0.b();
        ix a2 = this.b.a(ipVar.getId(), hi0Var, i, i2, jpVar.e(), jpVar.d(), cn1Var, jpVar.c(), i51Var, jpVar.a());
        kx<?> i3 = i(a2, z);
        if (i3 != null) {
            b51Var.d(i3);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from cache", b2, a2);
            }
            return null;
        }
        kx<?> h = h(a2, z);
        if (h != null) {
            b51Var.d(h);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from active resources", b2, a2);
            }
            return null;
        }
        gx gxVar = this.a.get(a2);
        if (gxVar != null) {
            gxVar.e(b51Var);
            if (Log.isLoggable("Engine", 2)) {
                j("Added to existing load", b2, a2);
            }
            return new c(b51Var, gxVar);
        }
        gx a3 = this.d.a(a2, z);
        lx lxVar = new lx(a3, new dq(a2, i, i2, ipVar, jpVar, cn1Var, i51Var, this.g, wtVar, dz0Var), dz0Var);
        this.a.put(a2, a3);
        a3.e(b51Var);
        a3.m(lxVar);
        if (Log.isLoggable("Engine", 2)) {
            j("Started new load", b2, a2);
        }
        return new c(b51Var, a3);
    }

    public final kx<?> h(hi0 hi0Var, boolean z) {
        kx<?> kxVar = null;
        if (z) {
            WeakReference<kx<?>> weakReference = this.e.get(hi0Var);
            if (weakReference != null) {
                kxVar = weakReference.get();
                if (kxVar != null) {
                    kxVar.b();
                } else {
                    this.e.remove(hi0Var);
                }
            }
            return kxVar;
        }
        return null;
    }

    public final kx<?> i(hi0 hi0Var, boolean z) {
        if (z) {
            kx<?> e2 = e(hi0Var);
            if (e2 != null) {
                e2.b();
                this.e.put(hi0Var, new e(hi0Var, e2, f()));
            }
            return e2;
        }
        return null;
    }

    public void k(z41 z41Var) {
        tq1.b();
        if (!(z41Var instanceof kx)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((kx) z41Var).e();
    }
}
