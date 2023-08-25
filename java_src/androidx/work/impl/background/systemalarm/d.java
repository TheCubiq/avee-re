package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.daaw.bw1;
import com.daaw.ey1;
import com.daaw.jz0;
import com.daaw.ll0;
import com.daaw.mb1;
import com.daaw.wj1;
import com.daaw.wy1;
import com.daaw.yy;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d implements yy {
    public static final String z = ll0.f("SystemAlarmDispatcher");
    public final Context p;
    public final wj1 q;
    public final wy1 r;
    public final jz0 s;
    public final ey1 t;
    public final androidx.work.impl.background.systemalarm.a u;
    public final Handler v;
    public final List<Intent> w;
    public Intent x;
    public c y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            RunnableC0034d runnableC0034d;
            synchronized (d.this.w) {
                d dVar2 = d.this;
                dVar2.x = dVar2.w.get(0);
            }
            Intent intent = d.this.x;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.x.getIntExtra("KEY_START_ID", 0);
                ll0 c = ll0.c();
                String str = d.z;
                c.a(str, String.format("Processing command %s, %s", d.this.x, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b = bw1.b(d.this.p, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    ll0.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.acquire();
                    d dVar3 = d.this;
                    dVar3.u.p(dVar3.x, intExtra, dVar3);
                    ll0.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.release();
                    dVar = d.this;
                    runnableC0034d = new RunnableC0034d(dVar);
                } catch (Throwable th) {
                    try {
                        ll0 c2 = ll0.c();
                        String str2 = d.z;
                        c2.b(str2, "Unexpected error in onHandleIntent", th);
                        ll0.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        dVar = d.this;
                        runnableC0034d = new RunnableC0034d(dVar);
                    } catch (Throwable th2) {
                        ll0.c().a(d.z, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        d dVar4 = d.this;
                        dVar4.k(new RunnableC0034d(dVar4));
                        throw th2;
                    }
                }
                dVar.k(runnableC0034d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {
        public final d p;
        public final Intent q;
        public final int r;

        public b(d dVar, Intent intent, int i) {
            this.p = dVar;
            this.q = intent;
            this.r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.a(this.q, this.r);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0034d implements Runnable {
        public final d p;

        public RunnableC0034d(d dVar) {
            this.p = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.d();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public d(Context context, jz0 jz0Var, ey1 ey1Var) {
        Context applicationContext = context.getApplicationContext();
        this.p = applicationContext;
        this.u = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.r = new wy1();
        ey1Var = ey1Var == null ? ey1.k(context) : ey1Var;
        this.t = ey1Var;
        jz0Var = jz0Var == null ? ey1Var.m() : jz0Var;
        this.s = jz0Var;
        this.q = ey1Var.p();
        jz0Var.d(this);
        this.w = new ArrayList();
        this.x = null;
        this.v = new Handler(Looper.getMainLooper());
    }

    public boolean a(Intent intent, int i) {
        ll0 c2 = ll0.c();
        String str = z;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ll0.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.w) {
                boolean z2 = this.w.isEmpty() ? false : true;
                this.w.add(intent);
                if (!z2) {
                    l();
                }
            }
            return true;
        }
    }

    public final void b() {
        if (this.v.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // com.daaw.yy
    public void c(String str, boolean z2) {
        k(new b(this, androidx.work.impl.background.systemalarm.a.d(this.p, str, z2), 0));
    }

    public void d() {
        ll0 c2 = ll0.c();
        String str = z;
        c2.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.w) {
            if (this.x != null) {
                ll0.c().a(str, String.format("Removing command %s", this.x), new Throwable[0]);
                if (!this.w.remove(0).equals(this.x)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.x = null;
            }
            mb1 c3 = this.q.c();
            if (!this.u.o() && this.w.isEmpty() && !c3.a()) {
                ll0.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.y;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.w.isEmpty()) {
                l();
            }
        }
    }

    public jz0 e() {
        return this.s;
    }

    public wj1 f() {
        return this.q;
    }

    public ey1 g() {
        return this.t;
    }

    public wy1 h() {
        return this.r;
    }

    public final boolean i(String str) {
        b();
        synchronized (this.w) {
            for (Intent intent : this.w) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void j() {
        ll0.c().a(z, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.s.i(this);
        this.r.a();
        this.y = null;
    }

    public void k(Runnable runnable) {
        this.v.post(runnable);
    }

    public final void l() {
        b();
        PowerManager.WakeLock b2 = bw1.b(this.p, "ProcessCommand");
        try {
            b2.acquire();
            this.t.p().b(new a());
        } finally {
            b2.release();
        }
    }

    public void m(c cVar) {
        if (this.y != null) {
            ll0.c().b(z, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.y = cVar;
        }
    }
}
