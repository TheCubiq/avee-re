package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes2.dex */
public class x10 {
    public final dm a;

    /* loaded from: classes2.dex */
    public class a implements hl<Void, Object> {
        @Override // com.daaw.hl
        public Object a(rj1<Void> rj1Var) {
            if (rj1Var.n()) {
                return null;
            }
            ml0.f().e("Error fetching settings.", rj1Var.j());
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<Void> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ dm b;
        public final /* synthetic */ wb1 c;

        public b(boolean z, dm dmVar, wb1 wb1Var) {
            this.a = z;
            this.b = dmVar;
            this.c = wb1Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (this.a) {
                this.b.g(this.c);
                return null;
            }
            return null;
        }
    }

    public x10(dm dmVar) {
        this.a = dmVar;
    }

    public static x10 a() {
        x10 x10Var = (x10) s10.k().i(x10.class);
        Objects.requireNonNull(x10Var, "FirebaseCrashlytics component is not present.");
        return x10Var;
    }

    public static x10 b(s10 s10Var, e20 e20Var, es<fm> esVar, es<p2> esVar2) {
        Context j = s10Var.j();
        String packageName = j.getPackageName();
        ml0 f = ml0.f();
        f.g("Initializing Firebase Crashlytics " + dm.i() + " for " + packageName);
        h10 h10Var = new h10(j);
        ep epVar = new ep(s10Var);
        ue0 ue0Var = new ue0(j, packageName, e20Var, epVar);
        im imVar = new im(esVar);
        u2 u2Var = new u2(esVar2);
        dm dmVar = new dm(s10Var, ue0Var, imVar, epVar, u2Var.e(), u2Var.d(), h10Var, cz.c("Crashlytics Exception Handler"));
        String c = s10Var.m().c();
        String n = fh.n(j);
        ml0 f2 = ml0.f();
        f2.b("Mapping file ID is: " + n);
        try {
            a5 a2 = a5.a(j, ue0Var, c, n, new mt(j));
            ml0 f3 = ml0.f();
            f3.i("Installer package name is: " + a2.c);
            ExecutorService c2 = cz.c("com.google.firebase.crashlytics.startup");
            wb1 l = wb1.l(j, c, ue0Var, new vb0(), a2.e, a2.f, h10Var, epVar);
            l.p(c2).g(c2, new a());
            dk1.c(c2, new b(dmVar.o(a2, l), dmVar, l));
            return new x10(dmVar);
        } catch (PackageManager.NameNotFoundException e) {
            ml0.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public void c(String str) {
        this.a.k(str);
    }

    public void d(Throwable th) {
        if (th == null) {
            ml0.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.l(th);
        }
    }
}
