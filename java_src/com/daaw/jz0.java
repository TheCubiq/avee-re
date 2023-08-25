package com.daaw;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C0507a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0538a;
import com.daaw.zy1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class jz0 implements InterfaceC3778yy, i30 {

    /* renamed from: A */
    public static final String f15516A = ll0.m16883f("Processor");

    /* renamed from: q */
    public Context f15518q;

    /* renamed from: r */
    public C0507a f15519r;

    /* renamed from: s */
    public wj1 f15520s;

    /* renamed from: t */
    public WorkDatabase f15521t;

    /* renamed from: w */
    public List<r81> f15524w;

    /* renamed from: v */
    public Map<String, zy1> f15523v = new HashMap();

    /* renamed from: u */
    public Map<String, zy1> f15522u = new HashMap();

    /* renamed from: x */
    public Set<String> f15525x = new HashSet();

    /* renamed from: y */
    public final List<InterfaceC3778yy> f15526y = new ArrayList();

    /* renamed from: p */
    public PowerManager.WakeLock f15517p = null;

    /* renamed from: z */
    public final Object f15527z = new Object();

    /* renamed from: com.daaw.jz0$a */
    /* loaded from: classes.dex */
    public static class RunnableC1890a implements Runnable {

        /* renamed from: p */
        public InterfaceC3778yy f15528p;

        /* renamed from: q */
        public String f15529q;

        /* renamed from: r */
        public fk0<Boolean> f15530r;

        public RunnableC1890a(InterfaceC3778yy interfaceC3778yy, String str, fk0<Boolean> fk0Var) {
            this.f15528p = interfaceC3778yy;
            this.f15529q = str;
            this.f15530r = fk0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.f15530r.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f15528p.mo3085c(this.f15529q, z);
        }
    }

    public jz0(Context context, C0507a c0507a, wj1 wj1Var, WorkDatabase workDatabase, List<r81> list) {
        this.f15518q = context;
        this.f15519r = c0507a;
        this.f15520s = wj1Var;
        this.f15521t = workDatabase;
        this.f15524w = list;
    }

    /* renamed from: e */
    public static boolean m18157e(String str, zy1 zy1Var) {
        if (zy1Var == null) {
            ll0.m16885c().mo16882a(f15516A, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        zy1Var.m1787d();
        ll0.m16885c().mo16882a(f15516A, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // com.daaw.i30
    /* renamed from: a */
    public void mo18160a(String str, g30 g30Var) {
        synchronized (this.f15527z) {
            ll0.m16885c().mo16880d(f15516A, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            zy1 remove = this.f15523v.remove(str);
            if (remove != null) {
                if (this.f15517p == null) {
                    PowerManager.WakeLock m25784b = bw1.m25784b(this.f15518q, "ProcessorForegroundLck");
                    this.f15517p = m25784b;
                    m25784b.acquire();
                }
                this.f15522u.put(str, remove);
                C3866zk.m2173j(this.f15518q, C0538a.m27896d(this.f15518q, str, g30Var));
            }
        }
    }

    @Override // com.daaw.i30
    /* renamed from: b */
    public void mo18159b(String str) {
        synchronized (this.f15527z) {
            this.f15522u.remove(str);
            m18149m();
        }
    }

    @Override // com.daaw.InterfaceC3778yy
    /* renamed from: c */
    public void mo3085c(String str, boolean z) {
        synchronized (this.f15527z) {
            this.f15523v.remove(str);
            ll0.m16885c().mo16882a(f15516A, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (InterfaceC3778yy interfaceC3778yy : this.f15526y) {
                interfaceC3778yy.mo3085c(str, z);
            }
        }
    }

    /* renamed from: d */
    public void m18158d(InterfaceC3778yy interfaceC3778yy) {
        synchronized (this.f15527z) {
            this.f15526y.add(interfaceC3778yy);
        }
    }

    /* renamed from: f */
    public boolean m18156f(String str) {
        boolean contains;
        synchronized (this.f15527z) {
            contains = this.f15525x.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean m18155g(String str) {
        boolean z;
        synchronized (this.f15527z) {
            z = this.f15523v.containsKey(str) || this.f15522u.containsKey(str);
        }
        return z;
    }

    /* renamed from: h */
    public boolean m18154h(String str) {
        boolean containsKey;
        synchronized (this.f15527z) {
            containsKey = this.f15522u.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void m18153i(InterfaceC3778yy interfaceC3778yy) {
        synchronized (this.f15527z) {
            this.f15526y.remove(interfaceC3778yy);
        }
    }

    /* renamed from: j */
    public boolean m18152j(String str) {
        return m18151k(str, null);
    }

    /* renamed from: k */
    public boolean m18151k(String str, WorkerParameters.C0506a c0506a) {
        synchronized (this.f15527z) {
            if (m18155g(str)) {
                ll0.m16885c().mo16882a(f15516A, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            zy1 m1775a = new zy1.C3918c(this.f15518q, this.f15519r, this.f15520s, this, this.f15521t, str).m1773c(this.f15524w).m1774b(c0506a).m1775a();
            fk0<Boolean> m1789b = m1775a.m1789b();
            m1789b.mo14694d(new RunnableC1890a(this, str, m1789b), this.f15520s.mo6052a());
            this.f15523v.put(str, m1775a);
            this.f15520s.mo6050c().execute(m1775a);
            ll0.m16885c().mo16882a(f15516A, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean m18150l(String str) {
        boolean m18157e;
        synchronized (this.f15527z) {
            boolean z = true;
            ll0.m16885c().mo16882a(f15516A, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f15525x.add(str);
            zy1 remove = this.f15522u.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f15523v.remove(str);
            }
            m18157e = m18157e(str, remove);
            if (z) {
                m18149m();
            }
        }
        return m18157e;
    }

    /* renamed from: m */
    public final void m18149m() {
        synchronized (this.f15527z) {
            if (!(!this.f15522u.isEmpty())) {
                this.f15518q.startService(C0538a.m27895e(this.f15518q));
                PowerManager.WakeLock wakeLock = this.f15517p;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f15517p = null;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean m18148n(String str) {
        boolean m18157e;
        synchronized (this.f15527z) {
            ll0.m16885c().mo16882a(f15516A, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            m18157e = m18157e(str, this.f15522u.remove(str));
        }
        return m18157e;
    }

    /* renamed from: o */
    public boolean m18147o(String str) {
        boolean m18157e;
        synchronized (this.f15527z) {
            ll0.m16885c().mo16882a(f15516A, String.format("Processor stopping background work %s", str), new Throwable[0]);
            m18157e = m18157e(str, this.f15523v.remove(str));
        }
        return m18157e;
    }
}
