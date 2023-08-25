package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes2.dex */
public class x10 {

    /* renamed from: a */
    public final C1103dm f31728a;

    /* renamed from: com.daaw.x10$a */
    /* loaded from: classes2.dex */
    public class C3492a implements InterfaceC1587hl<Void, Object> {
        @Override // com.daaw.InterfaceC1587hl
        /* renamed from: a */
        public Object mo2139a(rj1<Void> rj1Var) {
            if (rj1Var.mo11236n()) {
                return null;
            }
            ml0.m15976f().m15977e("Error fetching settings.", rj1Var.mo11240j());
            return null;
        }
    }

    /* renamed from: com.daaw.x10$b */
    /* loaded from: classes2.dex */
    public class CallableC3493b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ boolean f31729a;

        /* renamed from: b */
        public final /* synthetic */ C1103dm f31730b;

        /* renamed from: c */
        public final /* synthetic */ wb1 f31731c;

        public CallableC3493b(boolean z, C1103dm c1103dm, wb1 wb1Var) {
            this.f31729a = z;
            this.f31730b = c1103dm;
            this.f31731c = wb1Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (this.f31729a) {
                this.f31730b.m24244g(this.f31731c);
                return null;
            }
            return null;
        }
    }

    public x10(C1103dm c1103dm) {
        this.f31728a = c1103dm;
    }

    /* renamed from: a */
    public static x10 m5653a() {
        x10 x10Var = (x10) s10.m10785k().m10787i(x10.class);
        Objects.requireNonNull(x10Var, "FirebaseCrashlytics component is not present.");
        return x10Var;
    }

    /* renamed from: b */
    public static x10 m5652b(s10 s10Var, e20 e20Var, InterfaceC1216es<InterfaceC1306fm> interfaceC1216es, InterfaceC1216es<InterfaceC2505p2> interfaceC1216es2) {
        Context m10786j = s10Var.m10786j();
        String packageName = m10786j.getPackageName();
        ml0 m15976f = ml0.m15976f();
        m15976f.m15975g("Initializing Firebase Crashlytics " + C1103dm.m24242i() + " for " + packageName);
        h10 h10Var = new h10(m10786j);
        C1209ep c1209ep = new C1209ep(s10Var);
        ue0 ue0Var = new ue0(m10786j, packageName, e20Var, c1209ep);
        C1720im c1720im = new C1720im(interfaceC1216es);
        C3155u2 c3155u2 = new C3155u2(interfaceC1216es2);
        C1103dm c1103dm = new C1103dm(s10Var, ue0Var, c1720im, c1209ep, c3155u2.m8629e(), c3155u2.m8630d(), h10Var, C1027cz.m24865c("Crashlytics Exception Handler"));
        String m21086c = s10Var.m10783m().m21086c();
        String m22653n = C1279fh.m22653n(m10786j);
        ml0 m15976f2 = ml0.m15976f();
        m15976f2.m15980b("Mapping file ID is: " + m22653n);
        try {
            C0602a5 m27610a = C0602a5.m27610a(m10786j, ue0Var, m21086c, m22653n, new C2209mt(m10786j));
            ml0 m15976f3 = ml0.m15976f();
            m15976f3.m15973i("Installer package name is: " + m27610a.f2889c);
            ExecutorService m24865c = C1027cz.m24865c("com.google.firebase.crashlytics.startup");
            wb1 m6216l = wb1.m6216l(m10786j, m21086c, ue0Var, new vb0(), m27610a.f2891e, m27610a.f2892f, h10Var, c1209ep);
            m6216l.m6212p(m24865c).mo11243g(m24865c, new C3492a());
            dk1.m24306c(m24865c, new CallableC3493b(c1103dm.m24236o(m27610a, m6216l), c1103dm, m6216l));
            return new x10(c1103dm);
        } catch (PackageManager.NameNotFoundException e) {
            ml0.m15976f().m15977e("Error retrieving app package info.", e);
            return null;
        }
    }

    /* renamed from: c */
    public void m5651c(String str) {
        this.f31728a.m24240k(str);
    }

    /* renamed from: d */
    public void m5650d(Throwable th) {
        if (th == null) {
            ml0.m15976f().m15971k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f31728a.m24239l(th);
        }
    }
}
