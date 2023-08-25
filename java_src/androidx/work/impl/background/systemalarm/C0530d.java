package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.daaw.InterfaceC3778yy;
import com.daaw.bw1;
import com.daaw.ey1;
import com.daaw.jz0;
import com.daaw.ll0;
import com.daaw.mb1;
import com.daaw.wj1;
import com.daaw.wy1;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.work.impl.background.systemalarm.d */
/* loaded from: classes.dex */
public class C0530d implements InterfaceC3778yy {

    /* renamed from: z */
    public static final String f2517z = ll0.m16883f("SystemAlarmDispatcher");

    /* renamed from: p */
    public final Context f2518p;

    /* renamed from: q */
    public final wj1 f2519q;

    /* renamed from: r */
    public final wy1 f2520r;

    /* renamed from: s */
    public final jz0 f2521s;

    /* renamed from: t */
    public final ey1 f2522t;

    /* renamed from: u */
    public final C0527a f2523u;

    /* renamed from: v */
    public final Handler f2524v;

    /* renamed from: w */
    public final List<Intent> f2525w;

    /* renamed from: x */
    public Intent f2526x;

    /* renamed from: y */
    public InterfaceC0533c f2527y;

    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    /* loaded from: classes.dex */
    public class RunnableC0531a implements Runnable {
        public RunnableC0531a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0530d c0530d;
            RunnableC0534d runnableC0534d;
            synchronized (C0530d.this.f2525w) {
                C0530d c0530d2 = C0530d.this;
                c0530d2.f2526x = c0530d2.f2525w.get(0);
            }
            Intent intent = C0530d.this.f2526x;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C0530d.this.f2526x.getIntExtra("KEY_START_ID", 0);
                ll0 m16885c = ll0.m16885c();
                String str = C0530d.f2517z;
                m16885c.mo16882a(str, String.format("Processing command %s, %s", C0530d.this.f2526x, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock m25784b = bw1.m25784b(C0530d.this.f2518p, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    ll0.m16885c().mo16882a(str, String.format("Acquiring operation wake lock (%s) %s", action, m25784b), new Throwable[0]);
                    m25784b.acquire();
                    C0530d c0530d3 = C0530d.this;
                    c0530d3.f2523u.m27917p(c0530d3.f2526x, intExtra, c0530d3);
                    ll0.m16885c().mo16882a(str, String.format("Releasing operation wake lock (%s) %s", action, m25784b), new Throwable[0]);
                    m25784b.release();
                    c0530d = C0530d.this;
                    runnableC0534d = new RunnableC0534d(c0530d);
                } catch (Throwable th) {
                    try {
                        ll0 m16885c2 = ll0.m16885c();
                        String str2 = C0530d.f2517z;
                        m16885c2.mo16881b(str2, "Unexpected error in onHandleIntent", th);
                        ll0.m16885c().mo16882a(str2, String.format("Releasing operation wake lock (%s) %s", action, m25784b), new Throwable[0]);
                        m25784b.release();
                        c0530d = C0530d.this;
                        runnableC0534d = new RunnableC0534d(c0530d);
                    } catch (Throwable th2) {
                        ll0.m16885c().mo16882a(C0530d.f2517z, String.format("Releasing operation wake lock (%s) %s", action, m25784b), new Throwable[0]);
                        m25784b.release();
                        C0530d c0530d4 = C0530d.this;
                        c0530d4.m27903k(new RunnableC0534d(c0530d4));
                        throw th2;
                    }
                }
                c0530d.m27903k(runnableC0534d);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    /* loaded from: classes.dex */
    public static class RunnableC0532b implements Runnable {

        /* renamed from: p */
        public final C0530d f2529p;

        /* renamed from: q */
        public final Intent f2530q;

        /* renamed from: r */
        public final int f2531r;

        public RunnableC0532b(C0530d c0530d, Intent intent, int i) {
            this.f2529p = c0530d;
            this.f2530q = intent;
            this.f2531r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2529p.m27912a(this.f2530q, this.f2531r);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0533c {
        /* renamed from: b */
        void mo27900b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    /* loaded from: classes.dex */
    public static class RunnableC0534d implements Runnable {

        /* renamed from: p */
        public final C0530d f2532p;

        public RunnableC0534d(C0530d c0530d) {
            this.f2532p = c0530d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2532p.m27910d();
        }
    }

    public C0530d(Context context) {
        this(context, null, null);
    }

    public C0530d(Context context, jz0 jz0Var, ey1 ey1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f2518p = applicationContext;
        this.f2523u = new C0527a(applicationContext);
        this.f2520r = new wy1();
        ey1Var = ey1Var == null ? ey1.m23004k(context) : ey1Var;
        this.f2522t = ey1Var;
        jz0Var = jz0Var == null ? ey1Var.m23002m() : jz0Var;
        this.f2521s = jz0Var;
        this.f2519q = ey1Var.m22999p();
        jz0Var.m18158d(this);
        this.f2525w = new ArrayList();
        this.f2526x = null;
        this.f2524v = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public boolean m27912a(Intent intent, int i) {
        ll0 m16885c = ll0.m16885c();
        String str = f2517z;
        m16885c.mo16882a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        m27911b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ll0.m16885c().mo16878h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m27905i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f2525w) {
                boolean z = this.f2525w.isEmpty() ? false : true;
                this.f2525w.add(intent);
                if (!z) {
                    m27902l();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void m27911b() {
        if (this.f2524v.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // com.daaw.InterfaceC3778yy
    /* renamed from: c */
    public void mo3085c(String str, boolean z) {
        m27903k(new RunnableC0532b(this, C0527a.m27929d(this.f2518p, str, z), 0));
    }

    /* renamed from: d */
    public void m27910d() {
        ll0 m16885c = ll0.m16885c();
        String str = f2517z;
        m16885c.mo16882a(str, "Checking if commands are complete.", new Throwable[0]);
        m27911b();
        synchronized (this.f2525w) {
            if (this.f2526x != null) {
                ll0.m16885c().mo16882a(str, String.format("Removing command %s", this.f2526x), new Throwable[0]);
                if (!this.f2525w.remove(0).equals(this.f2526x)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f2526x = null;
            }
            mb1 mo6050c = this.f2519q.mo6050c();
            if (!this.f2523u.m27918o() && this.f2525w.isEmpty() && !mo6050c.m16115a()) {
                ll0.m16885c().mo16882a(str, "No more commands & intents.", new Throwable[0]);
                InterfaceC0533c interfaceC0533c = this.f2527y;
                if (interfaceC0533c != null) {
                    interfaceC0533c.mo27900b();
                }
            } else if (!this.f2525w.isEmpty()) {
                m27902l();
            }
        }
    }

    /* renamed from: e */
    public jz0 m27909e() {
        return this.f2521s;
    }

    /* renamed from: f */
    public wj1 m27908f() {
        return this.f2519q;
    }

    /* renamed from: g */
    public ey1 m27907g() {
        return this.f2522t;
    }

    /* renamed from: h */
    public wy1 m27906h() {
        return this.f2520r;
    }

    /* renamed from: i */
    public final boolean m27905i(String str) {
        m27911b();
        synchronized (this.f2525w) {
            for (Intent intent : this.f2525w) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: j */
    public void m27904j() {
        ll0.m16885c().mo16882a(f2517z, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2521s.m18153i(this);
        this.f2520r.m5716a();
        this.f2527y = null;
    }

    /* renamed from: k */
    public void m27903k(Runnable runnable) {
        this.f2524v.post(runnable);
    }

    /* renamed from: l */
    public final void m27902l() {
        m27911b();
        PowerManager.WakeLock m25784b = bw1.m25784b(this.f2518p, "ProcessCommand");
        try {
            m25784b.acquire();
            this.f2522t.m22999p().mo6051b(new RunnableC0531a());
        } finally {
            m25784b.release();
        }
    }

    /* renamed from: m */
    public void m27901m(InterfaceC0533c interfaceC0533c) {
        if (this.f2527y != null) {
            ll0.m16885c().mo16881b(f2517z, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f2527y = interfaceC0533c;
        }
    }
}
