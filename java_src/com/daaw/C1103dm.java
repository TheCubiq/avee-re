package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.conscrypt.NativeConstants;
/* renamed from: com.daaw.dm */
/* loaded from: classes2.dex */
public class C1103dm {

    /* renamed from: a */
    public final Context f7439a;

    /* renamed from: b */
    public final s10 f7440b;

    /* renamed from: c */
    public final C1209ep f7441c;

    /* renamed from: f */
    public C1200em f7444f;

    /* renamed from: g */
    public C1200em f7445g;

    /* renamed from: h */
    public boolean f7446h;

    /* renamed from: i */
    public C0860bm f7447i;

    /* renamed from: j */
    public final ue0 f7448j;

    /* renamed from: k */
    public final h10 f7449k;

    /* renamed from: l */
    public final InterfaceC2540pc f7450l;

    /* renamed from: m */
    public final InterfaceC3277v2 f7451m;

    /* renamed from: n */
    public final ExecutorService f7452n;

    /* renamed from: o */
    public final C3873zl f7453o;

    /* renamed from: p */
    public final InterfaceC1306fm f7454p;

    /* renamed from: e */
    public final long f7443e = System.currentTimeMillis();

    /* renamed from: d */
    public final fu0 f7442d = new fu0();

    /* renamed from: com.daaw.dm$a */
    /* loaded from: classes2.dex */
    public class CallableC1104a implements Callable<rj1<Void>> {

        /* renamed from: a */
        public final /* synthetic */ zb1 f7455a;

        public CallableC1104a(zb1 zb1Var) {
            this.f7455a = zb1Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public rj1<Void> call() {
            return C1103dm.this.m24245f(this.f7455a);
        }
    }

    /* renamed from: com.daaw.dm$b */
    /* loaded from: classes2.dex */
    public class RunnableC1105b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ zb1 f7457p;

        public RunnableC1105b(zb1 zb1Var) {
            this.f7457p = zb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1103dm.this.m24245f(this.f7457p);
        }
    }

    /* renamed from: com.daaw.dm$c */
    /* loaded from: classes2.dex */
    public class CallableC1106c implements Callable<Boolean> {
        public CallableC1106c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            try {
                boolean m23376d = C1103dm.this.f7444f.m23376d();
                if (!m23376d) {
                    ml0.m15976f().m15971k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m23376d);
            } catch (Exception e) {
                ml0.m15976f().m15977e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: com.daaw.dm$d */
    /* loaded from: classes2.dex */
    public class CallableC1107d implements Callable<Boolean> {
        public CallableC1107d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C1103dm.this.f7447i.m26017s());
        }
    }

    public C1103dm(s10 s10Var, ue0 ue0Var, InterfaceC1306fm interfaceC1306fm, C1209ep c1209ep, InterfaceC2540pc interfaceC2540pc, InterfaceC3277v2 interfaceC3277v2, h10 h10Var, ExecutorService executorService) {
        this.f7440b = s10Var;
        this.f7441c = c1209ep;
        this.f7439a = s10Var.m10786j();
        this.f7448j = ue0Var;
        this.f7454p = interfaceC1306fm;
        this.f7450l = interfaceC2540pc;
        this.f7451m = interfaceC3277v2;
        this.f7452n = executorService;
        this.f7449k = h10Var;
        this.f7453o = new C3873zl(executorService);
    }

    /* renamed from: i */
    public static String m24242i() {
        return "18.3.3";
    }

    /* renamed from: j */
    public static boolean m24241j(String str, boolean z) {
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        ml0.m15976f().m15973i("Configured not to require a build ID.");
        return true;
    }

    /* renamed from: d */
    public final void m24247d() {
        boolean z;
        try {
            z = Boolean.TRUE.equals((Boolean) yq1.m3444d(this.f7453o.m2142h(new CallableC1107d())));
        } catch (Exception unused) {
            z = false;
        }
        this.f7446h = z;
    }

    /* renamed from: e */
    public boolean m24246e() {
        return this.f7444f.m23377c();
    }

    /* renamed from: f */
    public final rj1<Void> m24245f(zb1 zb1Var) {
        m24237n();
        try {
            this.f7450l.mo8831a(new InterfaceC2430oc() { // from class: com.daaw.cm
                @Override // com.daaw.InterfaceC2430oc
                /* renamed from: a */
                public final void mo14390a(String str) {
                    C1103dm.this.m24240k(str);
                }
            });
            if (!zb1Var.mo2554b().f27200b.f27207a) {
                ml0.m15976f().m15980b("Collection of crash reports disabled in Crashlytics settings.");
                return dk1.m24305d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f7447i.m26010z(zb1Var)) {
                ml0.m15976f().m15971k("Previous sessions could not be finalized.");
            }
            return this.f7447i.m26040N(zb1Var.mo2555a());
        } catch (Exception e) {
            ml0.m15976f().m15977e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return dk1.m24305d(e);
        } finally {
            m24238m();
        }
    }

    /* renamed from: g */
    public rj1<Void> m24244g(zb1 zb1Var) {
        return yq1.m3442f(this.f7452n, new CallableC1104a(zb1Var));
    }

    /* renamed from: h */
    public final void m24243h(zb1 zb1Var) {
        ml0 m15976f;
        String str;
        Future<?> submit = this.f7452n.submit(new RunnableC1105b(zb1Var));
        ml0.m15976f().m15980b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            m15976f = ml0.m15976f();
            str = "Crashlytics was interrupted during initialization.";
            m15976f.m15977e(str, e);
        } catch (ExecutionException e2) {
            e = e2;
            m15976f = ml0.m15976f();
            str = "Crashlytics encountered a problem during initialization.";
            m15976f.m15977e(str, e);
        } catch (TimeoutException e3) {
            e = e3;
            m15976f = ml0.m15976f();
            str = "Crashlytics timed out during initialization.";
            m15976f.m15977e(str, e);
        }
    }

    /* renamed from: k */
    public void m24240k(String str) {
        this.f7447i.m26036R(System.currentTimeMillis() - this.f7443e, str);
    }

    /* renamed from: l */
    public void m24239l(Throwable th) {
        this.f7447i.m26037Q(Thread.currentThread(), th);
    }

    /* renamed from: m */
    public void m24238m() {
        this.f7453o.m2142h(new CallableC1106c());
    }

    /* renamed from: n */
    public void m24237n() {
        this.f7453o.m2148b();
        this.f7444f.m23379a();
        ml0.m15976f().m15973i("Initialization marker file was created.");
    }

    /* renamed from: o */
    public boolean m24236o(C0602a5 c0602a5, zb1 zb1Var) {
        if (m24241j(c0602a5.f2888b, C1279fh.m22656k(this.f7439a, "com.crashlytics.RequireBuildId", true))) {
            String c1269fd = new C1269fd(this.f7448j).toString();
            try {
                this.f7445g = new C1200em("crash_marker", this.f7449k);
                this.f7444f = new C1200em("initialization_marker", this.f7449k);
                nq1 nq1Var = new nq1(c1269fd, this.f7449k, this.f7453o);
                fl0 fl0Var = new fl0(this.f7449k);
                this.f7447i = new C0860bm(this.f7439a, this.f7453o, this.f7448j, this.f7441c, this.f7449k, this.f7445g, c0602a5, nq1Var, fl0Var, pb1.m13486g(this.f7439a, this.f7448j, this.f7449k, c0602a5, fl0Var, nq1Var, new eq0(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, new t31(10)), zb1Var, this.f7442d), this.f7454p, this.f7451m);
                boolean m24246e = m24246e();
                m24247d();
                this.f7447i.m26012x(c1269fd, Thread.getDefaultUncaughtExceptionHandler(), zb1Var);
                if (!m24246e || !C1279fh.m22664c(this.f7439a)) {
                    ml0.m15976f().m15980b("Successfully configured exception handler.");
                    return true;
                }
                ml0.m15976f().m15980b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m24243h(zb1Var);
                return false;
            } catch (Exception e) {
                ml0.m15976f().m15977e("Crashlytics was not started due to an exception during initialization", e);
                this.f7447i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }
}
