package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.lx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class gx implements lx.a {
    public static final b q = new b();
    public static final Handler r = new Handler(Looper.getMainLooper(), new c());
    public final List<b51> a;
    public final b b;
    public final hx c;
    public final hi0 d;
    public final ExecutorService e;
    public final ExecutorService f;
    public final boolean g;
    public boolean h;
    public z41<?> i;
    public boolean j;
    public Exception k;
    public boolean l;
    public Set<b51> m;
    public lx n;
    public kx<?> o;
    public volatile Future<?> p;

    /* loaded from: classes.dex */
    public static class b {
        public <R> kx<R> a(z41<R> z41Var, boolean z) {
            return new kx<>(z41Var, z);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (1 == i || 2 == i) {
                gx gxVar = (gx) message.obj;
                if (1 == i) {
                    gxVar.j();
                } else {
                    gxVar.i();
                }
                return true;
            }
            return false;
        }
    }

    public gx(hi0 hi0Var, ExecutorService executorService, ExecutorService executorService2, boolean z, hx hxVar) {
        this(hi0Var, executorService, executorService2, z, hxVar, q);
    }

    public gx(hi0 hi0Var, ExecutorService executorService, ExecutorService executorService2, boolean z, hx hxVar, b bVar) {
        this.a = new ArrayList();
        this.d = hi0Var;
        this.e = executorService;
        this.f = executorService2;
        this.g = z;
        this.c = hxVar;
        this.b = bVar;
    }

    @Override // com.daaw.b51
    public void a(Exception exc) {
        this.k = exc;
        r.obtainMessage(2, this).sendToTarget();
    }

    @Override // com.daaw.b51
    public void d(z41<?> z41Var) {
        this.i = z41Var;
        r.obtainMessage(1, this).sendToTarget();
    }

    public void e(b51 b51Var) {
        tq1.b();
        if (this.j) {
            b51Var.d(this.o);
        } else if (this.l) {
            b51Var.a(this.k);
        } else {
            this.a.add(b51Var);
        }
    }

    public final void f(b51 b51Var) {
        if (this.m == null) {
            this.m = new HashSet();
        }
        this.m.add(b51Var);
    }

    public void g() {
        if (this.l || this.j || this.h) {
            return;
        }
        this.n.b();
        Future<?> future = this.p;
        if (future != null) {
            future.cancel(true);
        }
        this.h = true;
        this.c.b(this, this.d);
    }

    @Override // com.daaw.lx.a
    public void h(lx lxVar) {
        this.p = this.f.submit(lxVar);
    }

    public final void i() {
        if (this.h) {
            return;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        this.l = true;
        this.c.a(this.d, null);
        for (b51 b51Var : this.a) {
            if (!k(b51Var)) {
                b51Var.a(this.k);
            }
        }
    }

    public final void j() {
        if (this.h) {
            this.i.c();
        } else if (this.a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else {
            kx<?> a2 = this.b.a(this.i, this.g);
            this.o = a2;
            this.j = true;
            a2.b();
            this.c.a(this.d, this.o);
            for (b51 b51Var : this.a) {
                if (!k(b51Var)) {
                    this.o.b();
                    b51Var.d(this.o);
                }
            }
            this.o.e();
        }
    }

    public final boolean k(b51 b51Var) {
        Set<b51> set = this.m;
        return set != null && set.contains(b51Var);
    }

    public void l(b51 b51Var) {
        tq1.b();
        if (this.j || this.l) {
            f(b51Var);
            return;
        }
        this.a.remove(b51Var);
        if (this.a.isEmpty()) {
            g();
        }
    }

    public void m(lx lxVar) {
        this.n = lxVar;
        this.p = this.e.submit(lxVar);
    }
}
