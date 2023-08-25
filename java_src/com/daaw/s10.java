package com.daaw;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.daaw.fa;
import com.daaw.qi;
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
    public static final Object k = new Object();
    public static final Map<String, s10> l = new g6();
    public final Context a;
    public final String b;
    public final h20 c;
    public final qi d;
    public final xi0<fp> g;
    public final b01<cr> h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final List<a> i = new CopyOnWriteArrayList();
    public final List<Object> j = new CopyOnWriteArrayList();

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    @TargetApi(14)
    /* loaded from: classes2.dex */
    public static class b implements fa.a {
        public static AtomicReference<b> a = new AtomicReference<>();

        public static void c(Context context) {
            if (vw0.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (a.compareAndSet(null, bVar)) {
                        fa.c(application);
                        fa.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.daaw.fa.a
        public void a(boolean z) {
            synchronized (s10.k) {
                Iterator it = new ArrayList(s10.l.values()).iterator();
                while (it.hasNext()) {
                    s10 s10Var = (s10) it.next();
                    if (s10Var.e.get()) {
                        s10Var.x(z);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    /* loaded from: classes2.dex */
    public static class c extends BroadcastReceiver {
        public static AtomicReference<c> b = new AtomicReference<>();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (b.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (s10.k) {
                for (s10 s10Var : s10.l.values()) {
                    s10Var.o();
                }
            }
            c();
        }
    }

    public s10(final Context context, String str, h20 h20Var) {
        this.a = (Context) ry0.j(context);
        this.b = ry0.f(str);
        this.c = (h20) ry0.j(h20Var);
        jf1 b2 = FirebaseInitProvider.b();
        i20.b("Firebase");
        i20.b("ComponentDiscovery");
        List<b01<ComponentRegistrar>> b3 = fi.c(context, ComponentDiscoveryService.class).b();
        i20.a();
        i20.b("Runtime");
        qi.b g = qi.m(dp1.INSTANCE).d(b3).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(vh.s(context, Context.class, new Class[0])).b(vh.s(this, s10.class, new Class[0])).b(vh.s(h20Var, h20.class, new Class[0])).g(new ji());
        if (mq1.a(context) && FirebaseInitProvider.c()) {
            g.b(vh.s(b2, jf1.class, new Class[0]));
        }
        qi e = g.e();
        this.d = e;
        i20.a();
        this.g = new xi0<>(new b01() { // from class: com.daaw.r10
            @Override // com.daaw.b01
            public final Object get() {
                fp u;
                u = s10.this.u(context);
                return u;
            }
        });
        this.h = e.d(cr.class);
        g(new a() { // from class: com.daaw.q10
            @Override // com.daaw.s10.a
            public final void a(boolean z) {
                s10.this.v(z);
            }
        });
        i20.a();
    }

    public static s10 k() {
        s10 s10Var;
        synchronized (k) {
            s10Var = l.get("[DEFAULT]");
            if (s10Var == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + hz0.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return s10Var;
    }

    public static s10 p(Context context) {
        synchronized (k) {
            if (l.containsKey("[DEFAULT]")) {
                return k();
            }
            h20 a2 = h20.a(context);
            if (a2 == null) {
                return null;
            }
            return q(context, a2);
        }
    }

    public static s10 q(Context context, h20 h20Var) {
        return r(context, h20Var, "[DEFAULT]");
    }

    public static s10 r(Context context, h20 h20Var, String str) {
        s10 s10Var;
        b.c(context);
        String w = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map<String, s10> map = l;
            boolean z = !map.containsKey(w);
            ry0.n(z, "FirebaseApp name " + w + " already exists!");
            ry0.k(context, "Application context cannot be null.");
            s10Var = new s10(context, w, h20Var);
            map.put(w, s10Var);
        }
        s10Var.o();
        return s10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ fp u(Context context) {
        return new fp(context, n(), (e01) this.d.a(e01.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(boolean z) {
        if (z) {
            return;
        }
        this.h.get().k();
    }

    public static String w(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof s10) {
            return this.b.equals(((s10) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.e.get() && fa.b().d()) {
            aVar.a(true);
        }
        this.i.add(aVar);
    }

    public final void h() {
        ry0.n(!this.f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T i(Class<T> cls) {
        h();
        return (T) this.d.a(cls);
    }

    public Context j() {
        h();
        return this.a;
    }

    public String l() {
        h();
        return this.b;
    }

    public h20 m() {
        h();
        return this.c;
    }

    public String n() {
        return ka.b(l().getBytes(Charset.defaultCharset())) + "+" + ka.b(m().c().getBytes(Charset.defaultCharset()));
    }

    public final void o() {
        if (!mq1.a(this.a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(l());
            c.b(this.a);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(l());
        this.d.p(t());
        this.h.get().k();
    }

    public boolean s() {
        h();
        return this.g.get().b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return ot0.c(this).a("name", this.b).a("options", this.c).toString();
    }

    public final void x(boolean z) {
        for (a aVar : this.i) {
            aVar.a(z);
        }
    }
}
