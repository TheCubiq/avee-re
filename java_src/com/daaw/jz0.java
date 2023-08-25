package com.daaw;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.daaw.zy1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class jz0 implements yy, i30 {
    public static final String A = ll0.f("Processor");
    public Context q;
    public androidx.work.a r;
    public wj1 s;
    public WorkDatabase t;
    public List<r81> w;
    public Map<String, zy1> v = new HashMap();
    public Map<String, zy1> u = new HashMap();
    public Set<String> x = new HashSet();
    public final List<yy> y = new ArrayList();
    public PowerManager.WakeLock p = null;
    public final Object z = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public yy p;
        public String q;
        public fk0<Boolean> r;

        public a(yy yyVar, String str, fk0<Boolean> fk0Var) {
            this.p = yyVar;
            this.q = str;
            this.r = fk0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.r.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.p.c(this.q, z);
        }
    }

    public jz0(Context context, androidx.work.a aVar, wj1 wj1Var, WorkDatabase workDatabase, List<r81> list) {
        this.q = context;
        this.r = aVar;
        this.s = wj1Var;
        this.t = workDatabase;
        this.w = list;
    }

    public static boolean e(String str, zy1 zy1Var) {
        if (zy1Var == null) {
            ll0.c().a(A, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        zy1Var.d();
        ll0.c().a(A, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // com.daaw.i30
    public void a(String str, g30 g30Var) {
        synchronized (this.z) {
            ll0.c().d(A, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            zy1 remove = this.v.remove(str);
            if (remove != null) {
                if (this.p == null) {
                    PowerManager.WakeLock b = bw1.b(this.q, "ProcessorForegroundLck");
                    this.p = b;
                    b.acquire();
                }
                this.u.put(str, remove);
                zk.j(this.q, androidx.work.impl.foreground.a.d(this.q, str, g30Var));
            }
        }
    }

    @Override // com.daaw.i30
    public void b(String str) {
        synchronized (this.z) {
            this.u.remove(str);
            m();
        }
    }

    @Override // com.daaw.yy
    public void c(String str, boolean z) {
        synchronized (this.z) {
            this.v.remove(str);
            ll0.c().a(A, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (yy yyVar : this.y) {
                yyVar.c(str, z);
            }
        }
    }

    public void d(yy yyVar) {
        synchronized (this.z) {
            this.y.add(yyVar);
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.z) {
            contains = this.x.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z;
        synchronized (this.z) {
            z = this.v.containsKey(str) || this.u.containsKey(str);
        }
        return z;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.z) {
            containsKey = this.u.containsKey(str);
        }
        return containsKey;
    }

    public void i(yy yyVar) {
        synchronized (this.z) {
            this.y.remove(yyVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.z) {
            if (g(str)) {
                ll0.c().a(A, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            zy1 a2 = new zy1.c(this.q, this.r, this.s, this, this.t, str).c(this.w).b(aVar).a();
            fk0<Boolean> b = a2.b();
            b.d(new a(this, str, b), this.s.a());
            this.v.put(str, a2);
            this.s.c().execute(a2);
            ll0.c().a(A, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e;
        synchronized (this.z) {
            boolean z = true;
            ll0.c().a(A, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.x.add(str);
            zy1 remove = this.u.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.v.remove(str);
            }
            e = e(str, remove);
            if (z) {
                m();
            }
        }
        return e;
    }

    public final void m() {
        synchronized (this.z) {
            if (!(!this.u.isEmpty())) {
                this.q.startService(androidx.work.impl.foreground.a.e(this.q));
                PowerManager.WakeLock wakeLock = this.p;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.p = null;
                }
            }
        }
    }

    public boolean n(String str) {
        boolean e;
        synchronized (this.z) {
            ll0.c().a(A, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e = e(str, this.u.remove(str));
        }
        return e;
    }

    public boolean o(String str) {
        boolean e;
        synchronized (this.z) {
            ll0.c().a(A, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e = e(str, this.v.remove(str));
        }
        return e;
    }
}
