package com.daaw;

import android.text.TextUtils;
import com.daaw.bm1;
import com.daaw.f20;
import com.daaw.ig0;
import java.io.IOException;
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

    /* renamed from: m */
    public static final Object f6394m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f6395n = new ThreadFactoryC1036a();

    /* renamed from: a */
    public final s10 f6396a;

    /* renamed from: b */
    public final z10 f6397b;

    /* renamed from: c */
    public final jw0 f6398c;

    /* renamed from: d */
    public final ar1 f6399d;

    /* renamed from: e */
    public final xi0<ve0> f6400e;

    /* renamed from: f */
    public final b31 f6401f;

    /* renamed from: g */
    public final Object f6402g;

    /* renamed from: h */
    public final ExecutorService f6403h;

    /* renamed from: i */
    public final ExecutorService f6404i;

    /* renamed from: j */
    public String f6405j;

    /* renamed from: k */
    public Set<p00> f6406k;

    /* renamed from: l */
    public final List<mf1> f6407l;

    /* renamed from: com.daaw.d20$a */
    /* loaded from: classes2.dex */
    public class ThreadFactoryC1036a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f6408a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f6408a.getAndIncrement())));
        }
    }

    /* renamed from: com.daaw.d20$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1037b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6409a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6410b;

        static {
            int[] iArr = new int[bm1.EnumC0873b.values().length];
            f6410b = iArr;
            try {
                iArr[bm1.EnumC0873b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6410b[bm1.EnumC0873b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6410b[bm1.EnumC0873b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ig0.EnumC1703b.values().length];
            f6409a = iArr2;
            try {
                iArr2[ig0.EnumC1703b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6409a[ig0.EnumC1703b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d20(final s10 s10Var, b01<va0> b01Var) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f6395n), s10Var, new z10(s10Var.m10786j(), b01Var), new jw0(s10Var), ar1.m27138c(), new xi0(new b01() { // from class: com.daaw.a20
            @Override // com.daaw.b01
            public final Object get() {
                ve0 m24774u;
                m24774u = d20.m24774u(s10.this);
                return m24774u;
            }
        }), new b31());
    }

    public d20(ExecutorService executorService, s10 s10Var, z10 z10Var, jw0 jw0Var, ar1 ar1Var, xi0<ve0> xi0Var, b31 b31Var) {
        this.f6402g = new Object();
        this.f6406k = new HashSet();
        this.f6407l = new ArrayList();
        this.f6396a = s10Var;
        this.f6397b = z10Var;
        this.f6398c = jw0Var;
        this.f6399d = ar1Var;
        this.f6400e = xi0Var;
        this.f6401f = b31Var;
        this.f6403h = executorService;
        this.f6404i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f6395n);
    }

    /* renamed from: m */
    public static d20 m24782m() {
        return m24781n(s10.m10785k());
    }

    /* renamed from: n */
    public static d20 m24781n(s10 s10Var) {
        ry0.m10838b(s10Var != null, "Null is not a valid value of FirebaseApp.");
        return (d20) s10Var.m10787i(e20.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m24775t() {
        m24788g(false);
    }

    /* renamed from: u */
    public static /* synthetic */ ve0 m24774u(s10 s10Var) {
        return new ve0(s10Var);
    }

    /* renamed from: A */
    public final synchronized void m24796A(String str) {
        this.f6405j = str;
    }

    /* renamed from: B */
    public final synchronized void m24795B(kw0 kw0Var, kw0 kw0Var2) {
        if (this.f6406k.size() != 0 && !TextUtils.equals(kw0Var.mo16161d(), kw0Var2.mo16161d())) {
            for (p00 p00Var : this.f6406k) {
                p00Var.m13788a(kw0Var2.mo16161d());
            }
        }
    }

    /* renamed from: d */
    public final rj1<String> m24791d() {
        tj1 tj1Var = new tj1();
        m24790e(new i60(tj1Var));
        return tj1Var.m9082a();
    }

    /* renamed from: e */
    public final void m24790e(mf1 mf1Var) {
        synchronized (this.f6402g) {
            this.f6407l.add(mf1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24776s(boolean z) {
        kw0 m24771x;
        Exception iOException;
        kw0 m24780o = m24780o();
        try {
            if (!m24780o.m17393i() && !m24780o.m17390l()) {
                if (!z && !this.f6399d.m27135f(m24780o)) {
                    return;
                }
                m24771x = m24787h(m24780o);
                m24777r(m24771x);
                m24795B(m24780o, m24771x);
                if (m24771x.m17391k()) {
                    m24796A(m24771x.mo16161d());
                }
                if (!m24771x.m17393i()) {
                    iOException = new f20(f20.EnumC1246a.BAD_CONFIG);
                } else if (!m24771x.m17392j()) {
                    m24769z(m24771x);
                    return;
                } else {
                    iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                }
                m24770y(iOException);
            }
            m24771x = m24771x(m24780o);
            m24777r(m24771x);
            m24795B(m24780o, m24771x);
            if (m24771x.m17391k()) {
            }
            if (!m24771x.m17393i()) {
            }
            m24770y(iOException);
        } catch (f20 e) {
            m24770y(e);
        }
    }

    /* renamed from: g */
    public final void m24788g(final boolean z) {
        kw0 m24779p = m24779p();
        if (z) {
            m24779p = m24779p.m17387p();
        }
        m24769z(m24779p);
        this.f6404i.execute(new Runnable() { // from class: com.daaw.c20
            @Override // java.lang.Runnable
            public final void run() {
                d20.this.m24776s(z);
            }
        });
    }

    @Override // com.daaw.e20
    public rj1<String> getId() {
        m24773v();
        String m24784k = m24784k();
        if (m24784k != null) {
            return dk1.m24304e(m24784k);
        }
        rj1<String> m24791d = m24791d();
        this.f6403h.execute(new Runnable() { // from class: com.daaw.b20
            @Override // java.lang.Runnable
            public final void run() {
                d20.this.m24775t();
            }
        });
        return m24791d;
    }

    /* renamed from: h */
    public final kw0 m24787h(kw0 kw0Var) {
        bm1 m2997e = this.f6397b.m2997e(m24786i(), kw0Var.mo16161d(), m24778q(), kw0Var.mo16159f());
        int i = C1037b.f6410b[m2997e.mo7326b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m24796A(null);
                    return kw0Var.m17385r();
                }
                throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.EnumC1246a.UNAVAILABLE);
            }
            return kw0Var.m17386q("BAD CONFIG");
        }
        return kw0Var.m17388o(m2997e.mo7325c(), m2997e.mo7324d(), this.f6399d.m27139b());
    }

    /* renamed from: i */
    public String m24786i() {
        return this.f6396a.m10783m().m21087b();
    }

    /* renamed from: j */
    public String m24785j() {
        return this.f6396a.m10783m().m21086c();
    }

    /* renamed from: k */
    public final synchronized String m24784k() {
        return this.f6405j;
    }

    /* renamed from: l */
    public final ve0 m24783l() {
        return this.f6400e.get();
    }

    /* renamed from: o */
    public final kw0 m24780o() {
        kw0 m18206d;
        synchronized (f6394m) {
            C1723in m19627a = C1723in.m19627a(this.f6396a.m10786j(), "generatefid.lock");
            m18206d = this.f6398c.m18206d();
            if (m19627a != null) {
                m19627a.m19626b();
            }
        }
        return m18206d;
    }

    /* renamed from: p */
    public final kw0 m24779p() {
        kw0 m18206d;
        synchronized (f6394m) {
            C1723in m19627a = C1723in.m19627a(this.f6396a.m10786j(), "generatefid.lock");
            m18206d = this.f6398c.m18206d();
            if (m18206d.m17392j()) {
                m18206d = this.f6398c.m18208b(m18206d.m17383t(m24772w(m18206d)));
            }
            if (m19627a != null) {
                m19627a.m19626b();
            }
        }
        return m18206d;
    }

    /* renamed from: q */
    public String m24778q() {
        return this.f6396a.m10783m().m21084e();
    }

    /* renamed from: r */
    public final void m24777r(kw0 kw0Var) {
        synchronized (f6394m) {
            C1723in m19627a = C1723in.m19627a(this.f6396a.m10786j(), "generatefid.lock");
            this.f6398c.m18208b(kw0Var);
            if (m19627a != null) {
                m19627a.m19626b();
            }
        }
    }

    /* renamed from: v */
    public final void m24773v() {
        ry0.m10833g(m24785j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.m10833g(m24778q(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.m10833g(m24786i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.m10838b(ar1.m27133h(m24785j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ry0.m10838b(ar1.m27134g(m24786i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: w */
    public final String m24772w(kw0 kw0Var) {
        if ((this.f6396a.m10784l().equals("CHIME_ANDROID_SDK") || this.f6396a.m10776t()) && kw0Var.m17389m()) {
            String m7219f = m24783l().m7219f();
            return TextUtils.isEmpty(m7219f) ? this.f6401f.m26501a() : m7219f;
        }
        return this.f6401f.m26501a();
    }

    /* renamed from: x */
    public final kw0 m24771x(kw0 kw0Var) {
        ig0 m2998d = this.f6397b.m2998d(m24786i(), kw0Var.mo16161d(), m24778q(), m24785j(), (kw0Var.mo16161d() == null || kw0Var.mo16161d().length() != 11) ? null : m24783l().m7216i());
        int i = C1037b.f6409a[m2998d.mo19836e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return kw0Var.m17386q("BAD CONFIG");
            }
            throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.EnumC1246a.UNAVAILABLE);
        }
        return kw0Var.m17384s(m2998d.mo19838c(), m2998d.mo19837d(), this.f6399d.m27139b(), m2998d.mo19839b().mo7325c(), m2998d.mo19839b().mo7324d());
    }

    /* renamed from: y */
    public final void m24770y(Exception exc) {
        synchronized (this.f6402g) {
            Iterator<mf1> it = this.f6407l.iterator();
            while (it.hasNext()) {
                if (it.next().mo16043a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    public final void m24769z(kw0 kw0Var) {
        synchronized (this.f6402g) {
            Iterator<mf1> it = this.f6407l.iterator();
            while (it.hasNext()) {
                if (it.next().mo16042b(kw0Var)) {
                    it.remove();
                }
            }
        }
    }
}
