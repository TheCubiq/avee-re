package com.daaw;

import android.text.TextUtils;
import com.daaw.bm1;
import com.daaw.f20;
import com.daaw.ig0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class d20 implements e20 {
    public static final Object m = new Object();
    public static final ThreadFactory n = new a();
    public final s10 a;
    public final z10 b;
    public final jw0 c;
    public final ar1 d;
    public final xi0<ve0> e;
    public final b31 f;
    public final Object g;
    public final ExecutorService h;
    public final ExecutorService i;
    public String j;
    public Set<p00> k;
    public final List<mf1> l;

    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[bm1.b.values().length];
            b = iArr;
            try {
                iArr[bm1.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[bm1.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[bm1.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ig0.b.values().length];
            a = iArr2;
            try {
                iArr2[ig0.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ig0.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d20(final s10 s10Var, b01<va0> b01Var) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), n), s10Var, new z10(s10Var.j(), b01Var), new jw0(s10Var), ar1.c(), new xi0(new b01() { // from class: com.daaw.a20
            @Override // com.daaw.b01
            public final Object get() {
                ve0 u;
                u = d20.u(s10.this);
                return u;
            }
        }), new b31());
    }

    public d20(ExecutorService executorService, s10 s10Var, z10 z10Var, jw0 jw0Var, ar1 ar1Var, xi0<ve0> xi0Var, b31 b31Var) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = s10Var;
        this.b = z10Var;
        this.c = jw0Var;
        this.d = ar1Var;
        this.e = xi0Var;
        this.f = b31Var;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), n);
    }

    public static d20 m() {
        return n(s10.k());
    }

    public static d20 n(s10 s10Var) {
        ry0.b(s10Var != null, "Null is not a valid value of FirebaseApp.");
        return (d20) s10Var.i(e20.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        g(false);
    }

    public static /* synthetic */ ve0 u(s10 s10Var) {
        return new ve0(s10Var);
    }

    public final synchronized void A(String str) {
        this.j = str;
    }

    public final synchronized void B(kw0 kw0Var, kw0 kw0Var2) {
        if (this.k.size() != 0 && !TextUtils.equals(kw0Var.d(), kw0Var2.d())) {
            for (p00 p00Var : this.k) {
                p00Var.a(kw0Var2.d());
            }
        }
    }

    public final rj1<String> d() {
        tj1 tj1Var = new tj1();
        e(new i60(tj1Var));
        return tj1Var.a();
    }

    public final void e(mf1 mf1Var) {
        synchronized (this.g) {
            this.l.add(mf1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r3) {
        /*
            r2 = this;
            com.daaw.kw0 r0 = r2.o()
            boolean r1 = r0.i()     // Catch: com.daaw.f20 -> L5c
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.daaw.f20 -> L5c
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.daaw.ar1 r3 = r2.d     // Catch: com.daaw.f20 -> L5c
            boolean r3 = r3.f(r0)     // Catch: com.daaw.f20 -> L5c
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.daaw.kw0 r3 = r2.h(r0)     // Catch: com.daaw.f20 -> L5c
            goto L26
        L22:
            com.daaw.kw0 r3 = r2.x(r0)     // Catch: com.daaw.f20 -> L5c
        L26:
            r2.r(r3)
            r2.B(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.A(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.daaw.f20 r3 = new com.daaw.f20
            com.daaw.f20$a r0 = com.daaw.f20.a.BAD_CONFIG
            r3.<init>(r0)
        L46:
            r2.y(r3)
            goto L5b
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L58
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L46
        L58:
            r2.z(r3)
        L5b:
            return
        L5c:
            r3 = move-exception
            r2.y(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.d20.s(boolean):void");
    }

    public final void g(final boolean z) {
        kw0 p = p();
        if (z) {
            p = p.p();
        }
        z(p);
        this.i.execute(new Runnable() { // from class: com.daaw.c20
            @Override // java.lang.Runnable
            public final void run() {
                d20.this.s(z);
            }
        });
    }

    @Override // com.daaw.e20
    public rj1<String> getId() {
        v();
        String k = k();
        if (k != null) {
            return dk1.e(k);
        }
        rj1<String> d = d();
        this.h.execute(new Runnable() { // from class: com.daaw.b20
            @Override // java.lang.Runnable
            public final void run() {
                d20.this.t();
            }
        });
        return d;
    }

    public final kw0 h(kw0 kw0Var) {
        bm1 e = this.b.e(i(), kw0Var.d(), q(), kw0Var.f());
        int i = b.b[e.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    A(null);
                    return kw0Var.r();
                }
                throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.a.UNAVAILABLE);
            }
            return kw0Var.q("BAD CONFIG");
        }
        return kw0Var.o(e.c(), e.d(), this.d.b());
    }

    public String i() {
        return this.a.m().b();
    }

    public String j() {
        return this.a.m().c();
    }

    public final synchronized String k() {
        return this.j;
    }

    public final ve0 l() {
        return this.e.get();
    }

    public final kw0 o() {
        kw0 d;
        synchronized (m) {
            in a2 = in.a(this.a.j(), "generatefid.lock");
            d = this.c.d();
            if (a2 != null) {
                a2.b();
            }
        }
        return d;
    }

    public final kw0 p() {
        kw0 d;
        synchronized (m) {
            in a2 = in.a(this.a.j(), "generatefid.lock");
            d = this.c.d();
            if (d.j()) {
                d = this.c.b(d.t(w(d)));
            }
            if (a2 != null) {
                a2.b();
            }
        }
        return d;
    }

    public String q() {
        return this.a.m().e();
    }

    public final void r(kw0 kw0Var) {
        synchronized (m) {
            in a2 = in.a(this.a.j(), "generatefid.lock");
            this.c.b(kw0Var);
            if (a2 != null) {
                a2.b();
            }
        }
    }

    public final void v() {
        ry0.g(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.g(q(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.g(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.b(ar1.h(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.b(ar1.g(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String w(kw0 kw0Var) {
        if ((this.a.l().equals("CHIME_ANDROID_SDK") || this.a.t()) && kw0Var.m()) {
            String f = l().f();
            return TextUtils.isEmpty(f) ? this.f.a() : f;
        }
        return this.f.a();
    }

    public final kw0 x(kw0 kw0Var) {
        ig0 d = this.b.d(i(), kw0Var.d(), q(), j(), (kw0Var.d() == null || kw0Var.d().length() != 11) ? null : l().i());
        int i = b.a[d.e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return kw0Var.q("BAD CONFIG");
            }
            throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.a.UNAVAILABLE);
        }
        return kw0Var.s(d.c(), d.d(), this.d.b(), d.b().c(), d.b().d());
    }

    public final void y(Exception exc) {
        synchronized (this.g) {
            Iterator<mf1> it = this.l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void z(kw0 kw0Var) {
        synchronized (this.g) {
            Iterator<mf1> it = this.l.iterator();
            while (it.hasNext()) {
                if (it.next().b(kw0Var)) {
                    it.remove();
                }
            }
        }
    }
}
