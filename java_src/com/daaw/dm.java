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
/* loaded from: classes2.dex */
public class dm {
    public final Context a;
    public final s10 b;
    public final ep c;
    public em f;
    public em g;
    public boolean h;
    public bm i;
    public final ue0 j;
    public final h10 k;
    public final pc l;
    public final v2 m;
    public final ExecutorService n;
    public final zl o;
    public final fm p;
    public final long e = System.currentTimeMillis();
    public final fu0 d = new fu0();

    /* loaded from: classes2.dex */
    public class a implements Callable<rj1<Void>> {
        public final /* synthetic */ zb1 a;

        public a(zb1 zb1Var) {
            this.a = zb1Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public rj1<Void> call() {
            return dm.this.f(this.a);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public final /* synthetic */ zb1 p;

        public b(zb1 zb1Var) {
            this.p = zb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            dm.this.f(this.p);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<Boolean> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = dm.this.f.d();
                if (!d) {
                    ml0.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                ml0.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Callable<Boolean> {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(dm.this.i.s());
        }
    }

    public dm(s10 s10Var, ue0 ue0Var, fm fmVar, ep epVar, pc pcVar, v2 v2Var, h10 h10Var, ExecutorService executorService) {
        this.b = s10Var;
        this.c = epVar;
        this.a = s10Var.j();
        this.j = ue0Var;
        this.p = fmVar;
        this.l = pcVar;
        this.m = v2Var;
        this.n = executorService;
        this.k = h10Var;
        this.o = new zl(executorService);
    }

    public static String i() {
        return "18.3.3";
    }

    public static boolean j(String str, boolean z) {
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        ml0.f().i("Configured not to require a build ID.");
        return true;
    }

    public final void d() {
        boolean z;
        try {
            z = Boolean.TRUE.equals((Boolean) yq1.d(this.o.h(new d())));
        } catch (Exception unused) {
            z = false;
        }
        this.h = z;
    }

    public boolean e() {
        return this.f.c();
    }

    public final rj1<Void> f(zb1 zb1Var) {
        n();
        try {
            this.l.a(new oc() { // from class: com.daaw.cm
                @Override // com.daaw.oc
                public final void a(String str) {
                    dm.this.k(str);
                }
            });
            if (!zb1Var.b().b.a) {
                ml0.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return dk1.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.i.z(zb1Var)) {
                ml0.f().k("Previous sessions could not be finalized.");
            }
            return this.i.N(zb1Var.a());
        } catch (Exception e) {
            ml0.f().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return dk1.d(e);
        } finally {
            m();
        }
    }

    public rj1<Void> g(zb1 zb1Var) {
        return yq1.f(this.n, new a(zb1Var));
    }

    public final void h(zb1 zb1Var) {
        ml0 f;
        String str;
        Future<?> submit = this.n.submit(new b(zb1Var));
        ml0.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            f = ml0.f();
            str = "Crashlytics was interrupted during initialization.";
            f.e(str, e);
        } catch (ExecutionException e2) {
            e = e2;
            f = ml0.f();
            str = "Crashlytics encountered a problem during initialization.";
            f.e(str, e);
        } catch (TimeoutException e3) {
            e = e3;
            f = ml0.f();
            str = "Crashlytics timed out during initialization.";
            f.e(str, e);
        }
    }

    public void k(String str) {
        this.i.R(System.currentTimeMillis() - this.e, str);
    }

    public void l(Throwable th) {
        this.i.Q(Thread.currentThread(), th);
    }

    public void m() {
        this.o.h(new c());
    }

    public void n() {
        this.o.b();
        this.f.a();
        ml0.f().i("Initialization marker file was created.");
    }

    public boolean o(a5 a5Var, zb1 zb1Var) {
        if (j(a5Var.b, fh.k(this.a, "com.crashlytics.RequireBuildId", true))) {
            String fdVar = new fd(this.j).toString();
            try {
                this.g = new em("crash_marker", this.k);
                this.f = new em("initialization_marker", this.k);
                nq1 nq1Var = new nq1(fdVar, this.k, this.o);
                fl0 fl0Var = new fl0(this.k);
                this.i = new bm(this.a, this.o, this.j, this.c, this.k, this.g, a5Var, nq1Var, fl0Var, pb1.g(this.a, this.j, this.k, a5Var, fl0Var, nq1Var, new eq0(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, new t31(10)), zb1Var, this.d), this.p, this.m);
                boolean e = e();
                d();
                this.i.x(fdVar, Thread.getDefaultUncaughtExceptionHandler(), zb1Var);
                if (!e || !fh.c(this.a)) {
                    ml0.f().b("Successfully configured exception handler.");
                    return true;
                }
                ml0.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                h(zb1Var);
                return false;
            } catch (Exception e2) {
                ml0.f().e("Crashlytics was not started due to an exception during initialization", e2);
                this.i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }
}
