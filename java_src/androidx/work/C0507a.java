package androidx.work;

import android.os.Build;
import com.daaw.C2581pr;
import com.daaw.dg0;
import com.daaw.m61;
import com.daaw.vf0;
import com.daaw.yy1;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: androidx.work.a */
/* loaded from: classes.dex */
public final class C0507a {

    /* renamed from: a */
    public final Executor f2439a;

    /* renamed from: b */
    public final Executor f2440b;

    /* renamed from: c */
    public final yy1 f2441c;

    /* renamed from: d */
    public final dg0 f2442d;

    /* renamed from: e */
    public final m61 f2443e;

    /* renamed from: f */
    public final vf0 f2444f;

    /* renamed from: g */
    public final String f2445g;

    /* renamed from: h */
    public final int f2446h;

    /* renamed from: i */
    public final int f2447i;

    /* renamed from: j */
    public final int f2448j;

    /* renamed from: k */
    public final int f2449k;

    /* renamed from: l */
    public final boolean f2450l;

    /* renamed from: androidx.work.a$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0508a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f2451a = new AtomicInteger(0);

        /* renamed from: b */
        public final /* synthetic */ boolean f2452b;

        public ThreadFactoryC0508a(boolean z) {
            this.f2452b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.f2452b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f2451a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$b */
    /* loaded from: classes.dex */
    public static final class C0509b {

        /* renamed from: a */
        public Executor f2454a;

        /* renamed from: b */
        public yy1 f2455b;

        /* renamed from: c */
        public dg0 f2456c;

        /* renamed from: d */
        public Executor f2457d;

        /* renamed from: e */
        public m61 f2458e;

        /* renamed from: f */
        public vf0 f2459f;

        /* renamed from: g */
        public String f2460g;

        /* renamed from: h */
        public int f2461h = 4;

        /* renamed from: i */
        public int f2462i = 0;

        /* renamed from: j */
        public int f2463j = Integer.MAX_VALUE;

        /* renamed from: k */
        public int f2464k = 20;

        /* renamed from: a */
        public C0507a m27974a() {
            return new C0507a(this);
        }
    }

    /* renamed from: androidx.work.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0510c {
        /* renamed from: a */
        C0507a m27973a();
    }

    public C0507a(C0509b c0509b) {
        Executor executor = c0509b.f2454a;
        this.f2439a = executor == null ? m27987a(false) : executor;
        Executor executor2 = c0509b.f2457d;
        if (executor2 == null) {
            this.f2450l = true;
            executor2 = m27987a(true);
        } else {
            this.f2450l = false;
        }
        this.f2440b = executor2;
        yy1 yy1Var = c0509b.f2455b;
        this.f2441c = yy1Var == null ? yy1.m3078c() : yy1Var;
        dg0 dg0Var = c0509b.f2456c;
        this.f2442d = dg0Var == null ? dg0.m24420c() : dg0Var;
        m61 m61Var = c0509b.f2458e;
        this.f2443e = m61Var == null ? new C2581pr() : m61Var;
        this.f2446h = c0509b.f2461h;
        this.f2447i = c0509b.f2462i;
        this.f2448j = c0509b.f2463j;
        this.f2449k = c0509b.f2464k;
        this.f2444f = c0509b.f2459f;
        this.f2445g = c0509b.f2460g;
    }

    /* renamed from: a */
    public final Executor m27987a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m27986b(z));
    }

    /* renamed from: b */
    public final ThreadFactory m27986b(boolean z) {
        return new ThreadFactoryC0508a(z);
    }

    /* renamed from: c */
    public String m27985c() {
        return this.f2445g;
    }

    /* renamed from: d */
    public vf0 m27984d() {
        return this.f2444f;
    }

    /* renamed from: e */
    public Executor m27983e() {
        return this.f2439a;
    }

    /* renamed from: f */
    public dg0 m27982f() {
        return this.f2442d;
    }

    /* renamed from: g */
    public int m27981g() {
        return this.f2448j;
    }

    /* renamed from: h */
    public int m27980h() {
        return Build.VERSION.SDK_INT == 23 ? this.f2449k / 2 : this.f2449k;
    }

    /* renamed from: i */
    public int m27979i() {
        return this.f2447i;
    }

    /* renamed from: j */
    public int m27978j() {
        return this.f2446h;
    }

    /* renamed from: k */
    public m61 m27977k() {
        return this.f2443e;
    }

    /* renamed from: l */
    public Executor m27976l() {
        return this.f2440b;
    }

    /* renamed from: m */
    public yy1 m27975m() {
        return this.f2441c;
    }
}
