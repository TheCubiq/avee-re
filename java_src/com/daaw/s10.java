package com.daaw;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.daaw.C2713qi;
import com.daaw.ComponentCallbacks2C1265fa;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class s10 {

    /* renamed from: k */
    public static final Object f25762k = new Object();

    /* renamed from: l */
    public static final Map<String, s10> f25763l = new C1370g6();

    /* renamed from: a */
    public final Context f25764a;

    /* renamed from: b */
    public final String f25765b;

    /* renamed from: c */
    public final h20 f25766c;

    /* renamed from: d */
    public final C2713qi f25767d;

    /* renamed from: g */
    public final xi0<C1318fp> f25770g;

    /* renamed from: h */
    public final b01<C0989cr> f25771h;

    /* renamed from: e */
    public final AtomicBoolean f25768e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f25769f = new AtomicBoolean();

    /* renamed from: i */
    public final List<InterfaceC2904a> f25772i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List<Object> f25773j = new CopyOnWriteArrayList();

    /* renamed from: com.daaw.s10$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2904a {
        /* renamed from: a */
        void mo10771a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.daaw.s10$b */
    /* loaded from: classes2.dex */
    public static class C2905b implements ComponentCallbacks2C1265fa.InterfaceC1266a {

        /* renamed from: a */
        public static AtomicReference<C2905b> f25774a = new AtomicReference<>();

        /* renamed from: c */
        public static void m10768c(Context context) {
            if (vw0.m6704a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f25774a.get() == null) {
                    C2905b c2905b = new C2905b();
                    if (f25774a.compareAndSet(null, c2905b)) {
                        ComponentCallbacks2C1265fa.m22822c(application);
                        ComponentCallbacks2C1265fa.m22823b().m22824a(c2905b);
                    }
                }
            }
        }

        @Override // com.daaw.ComponentCallbacks2C1265fa.InterfaceC1266a
        /* renamed from: a */
        public void mo10770a(boolean z) {
            synchronized (s10.f25762k) {
                Iterator it = new ArrayList(s10.f25763l.values()).iterator();
                while (it.hasNext()) {
                    s10 s10Var = (s10) it.next();
                    if (s10Var.f25768e.get()) {
                        s10Var.m10772x(z);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    /* renamed from: com.daaw.s10$c */
    /* loaded from: classes2.dex */
    public static class C2906c extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C2906c> f25775b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f25776a;

        public C2906c(Context context) {
            this.f25776a = context;
        }

        /* renamed from: b */
        public static void m10766b(Context context) {
            if (f25775b.get() == null) {
                C2906c c2906c = new C2906c(context);
                if (f25775b.compareAndSet(null, c2906c)) {
                    context.registerReceiver(c2906c, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m10765c() {
            this.f25776a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (s10.f25762k) {
                for (s10 s10Var : s10.f25763l.values()) {
                    s10Var.m10781o();
                }
            }
            m10765c();
        }
    }

    public s10(final Context context, String str, h20 h20Var) {
        this.f25764a = (Context) ry0.m10830j(context);
        this.f25765b = ry0.m10834f(str);
        this.f25766c = (h20) ry0.m10830j(h20Var);
        jf1 m61b = FirebaseInitProvider.m61b();
        i20.m20171b("Firebase");
        i20.m20171b("ComponentDiscovery");
        List<b01<ComponentRegistrar>> m22632b = C1287fi.m22631c(context, ComponentDiscoveryService.class).m22632b();
        i20.m20172a();
        i20.m20171b("Runtime");
        C2713qi.C2715b m12476g = C2713qi.m12494m(dp1.INSTANCE).m12479d(m22632b).m12480c(new FirebaseCommonRegistrar()).m12480c(new ExecutorsRegistrar()).m12481b(C3330vh.m7159s(context, Context.class, new Class[0])).m12481b(C3330vh.m7159s(this, s10.class, new Class[0])).m12481b(C3330vh.m7159s(h20Var, h20.class, new Class[0])).m12476g(new C1830ji());
        if (mq1.m15856a(context) && FirebaseInitProvider.m60c()) {
            m12476g.m12481b(C3330vh.m7159s(m61b, jf1.class, new Class[0]));
        }
        C2713qi m12478e = m12476g.m12478e();
        this.f25767d = m12478e;
        i20.m20172a();
        this.f25770g = new xi0<>(new b01() { // from class: com.daaw.r10
            @Override // com.daaw.b01
            public final Object get() {
                C1318fp m10775u;
                m10775u = s10.this.m10775u(context);
                return m10775u;
            }
        });
        this.f25771h = m12478e.mo12503d(C0989cr.class);
        m10789g(new InterfaceC2904a() { // from class: com.daaw.q10
            @Override // com.daaw.s10.InterfaceC2904a
            /* renamed from: a */
            public final void mo10771a(boolean z) {
                s10.this.m10774v(z);
            }
        });
        i20.m20172a();
    }

    /* renamed from: k */
    public static s10 m10785k() {
        s10 s10Var;
        synchronized (f25762k) {
            s10Var = f25763l.get("[DEFAULT]");
            if (s10Var == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + hz0.m20322a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return s10Var;
    }

    /* renamed from: p */
    public static s10 m10780p(Context context) {
        synchronized (f25762k) {
            if (f25763l.containsKey("[DEFAULT]")) {
                return m10785k();
            }
            h20 m21088a = h20.m21088a(context);
            if (m21088a == null) {
                return null;
            }
            return m10779q(context, m21088a);
        }
    }

    /* renamed from: q */
    public static s10 m10779q(Context context, h20 h20Var) {
        return m10778r(context, h20Var, "[DEFAULT]");
    }

    /* renamed from: r */
    public static s10 m10778r(Context context, h20 h20Var, String str) {
        s10 s10Var;
        C2905b.m10768c(context);
        String m10773w = m10773w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f25762k) {
            Map<String, s10> map = f25763l;
            boolean z = !map.containsKey(m10773w);
            ry0.m10826n(z, "FirebaseApp name " + m10773w + " already exists!");
            ry0.m10829k(context, "Application context cannot be null.");
            s10Var = new s10(context, m10773w, h20Var);
            map.put(m10773w, s10Var);
        }
        s10Var.m10781o();
        return s10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C1318fp m10775u(Context context) {
        return new C1318fp(context, m10782n(), (e01) this.f25767d.mo12506a(e01.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m10774v(boolean z) {
        if (z) {
            return;
        }
        this.f25771h.get().m25097k();
    }

    /* renamed from: w */
    public static String m10773w(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof s10) {
            return this.f25765b.equals(((s10) obj).m10784l());
        }
        return false;
    }

    /* renamed from: g */
    public void m10789g(InterfaceC2904a interfaceC2904a) {
        m10788h();
        if (this.f25768e.get() && ComponentCallbacks2C1265fa.m22823b().m22821d()) {
            interfaceC2904a.mo10771a(true);
        }
        this.f25772i.add(interfaceC2904a);
    }

    /* renamed from: h */
    public final void m10788h() {
        ry0.m10826n(!this.f25769f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.f25765b.hashCode();
    }

    /* renamed from: i */
    public <T> T m10787i(Class<T> cls) {
        m10788h();
        return (T) this.f25767d.mo12506a(cls);
    }

    /* renamed from: j */
    public Context m10786j() {
        m10788h();
        return this.f25764a;
    }

    /* renamed from: l */
    public String m10784l() {
        m10788h();
        return this.f25765b;
    }

    /* renamed from: m */
    public h20 m10783m() {
        m10788h();
        return this.f25766c;
    }

    /* renamed from: n */
    public String m10782n() {
        return C1926ka.m17933b(m10784l().getBytes(Charset.defaultCharset())) + "+" + C1926ka.m17933b(m10783m().m21086c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: o */
    public final void m10781o() {
        if (!mq1.m15856a(this.f25764a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(m10784l());
            C2906c.m10766b(this.f25764a);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(m10784l());
        this.f25767d.m12491p(m10776t());
        this.f25771h.get().m25097k();
    }

    /* renamed from: s */
    public boolean m10777s() {
        m10788h();
        return this.f25770g.get().m22435b();
    }

    /* renamed from: t */
    public boolean m10776t() {
        return "[DEFAULT]".equals(m10784l());
    }

    public String toString() {
        return ot0.m13979c(this).m13978a("name", this.f25765b).m13978a("options", this.f25766c).toString();
    }

    /* renamed from: x */
    public final void m10772x(boolean z) {
        for (InterfaceC2904a interfaceC2904a : this.f25772i) {
            interfaceC2904a.mo10771a(z);
        }
    }
}
