package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class gk5 {

    /* renamed from: j */
    public static volatile gk5 f11388j;

    /* renamed from: a */
    public final String f11389a;

    /* renamed from: b */
    public final InterfaceC0623ag f11390b;

    /* renamed from: c */
    public final ExecutorService f11391c;

    /* renamed from: d */
    public final C1361g5 f11392d;

    /* renamed from: e */
    public final List f11393e;

    /* renamed from: f */
    public int f11394f;

    /* renamed from: g */
    public boolean f11395g;

    /* renamed from: h */
    public final String f11396h;

    /* renamed from: i */
    public volatile ju3 f11397i;

    public gk5(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f11389a = (str == null || !m21522n(str2, str3)) ? "FA" : "FA";
        this.f11390b = C2202mq.m15857d();
        ko3.m17600a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hu4(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11391c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11392d = new C1361g5(this);
        this.f11393e = new ArrayList();
        try {
            if (q38.m12789b(context, "google_app_id", ji6.m18489a(context)) != null && !m21526j()) {
                this.f11396h = null;
                this.f11395g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (m21522n(str2, str3)) {
            this.f11396h = str2;
        } else {
            this.f11396h = "fa";
        }
        m21523m(new ih4(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new dj5(this));
    }

    /* renamed from: u */
    public static gk5 m21515u(Context context, String str, String str2, String str3, Bundle bundle) {
        ry0.m10830j(context);
        if (f11388j == null) {
            synchronized (gk5.class) {
                if (f11388j == null) {
                    f11388j = new gk5(context, str, str2, str3, bundle);
                }
            }
        }
        return f11388j;
    }

    /* renamed from: A */
    public final String m21545A() {
        oq3 oq3Var = new oq3();
        m21523m(new jl4(this, oq3Var));
        return oq3Var.m14071g3(500L);
    }

    /* renamed from: B */
    public final List m21544B(String str, String str2) {
        oq3 oq3Var = new oq3();
        m21523m(new p84(this, str, str2, oq3Var));
        List list = (List) oq3.m14070h3(oq3Var.m14073I(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: C */
    public final Map m21543C(String str, String str2, boolean z) {
        oq3 oq3Var = new oq3();
        m21523m(new yq4(this, str, str2, z, oq3Var));
        Bundle m14073I = oq3Var.m14073I(5000L);
        if (m14073I == null || m14073I.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(m14073I.size());
        for (String str3 : m14073I.keySet()) {
            Object obj = m14073I.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: G */
    public final void m21539G(String str) {
        m21523m(new li4(this, str));
    }

    /* renamed from: H */
    public final void m21538H(String str, String str2, Bundle bundle) {
        m21523m(new m74(this, str, str2, bundle));
    }

    /* renamed from: I */
    public final void m21537I(String str) {
        m21523m(new oj4(this, str));
    }

    /* renamed from: J */
    public final void m21536J(String str, String str2, Bundle bundle) {
        m21524l(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m21535a(int i, String str, Object obj, Object obj2, Object obj3) {
        m21523m(new bs4(this, false, 5, str, obj, null, null));
    }

    /* renamed from: b */
    public final void m21534b(pl7 pl7Var) {
        ry0.m10830j(pl7Var);
        synchronized (this.f11393e) {
            for (int i = 0; i < this.f11393e.size(); i++) {
                if (pl7Var.equals(((Pair) this.f11393e.get(i)).first)) {
                    return;
                }
            }
            q95 q95Var = new q95(pl7Var);
            this.f11393e.add(new Pair(pl7Var, q95Var));
            if (this.f11397i != null) {
                try {
                    this.f11397i.registerOnMeasurementEventListener(q95Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m21523m(new a35(this, q95Var));
        }
    }

    /* renamed from: c */
    public final void m21533c(Bundle bundle) {
        m21523m(new j64(this, bundle));
    }

    /* renamed from: d */
    public final void m21532d(Bundle bundle) {
        m21523m(new zc4(this, bundle));
    }

    /* renamed from: e */
    public final void m21531e(Activity activity, String str, String str2) {
        m21523m(new ua4(this, activity, str, str2));
    }

    /* renamed from: f */
    public final void m21530f(boolean z) {
        m21523m(new tz4(this, z));
    }

    /* renamed from: g */
    public final void m21529g(String str, String str2, Object obj, boolean z) {
        m21523m(new i65(this, str, str2, obj, z));
    }

    /* renamed from: j */
    public final boolean m21526j() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, gk5.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final void m21525k(Exception exc, boolean z, boolean z2) {
        this.f11395g |= z;
        if (!z && z2) {
            m21535a(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    /* renamed from: l */
    public final void m21524l(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m21523m(new f55(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: m */
    public final void m21523m(l75 l75Var) {
        this.f11391c.execute(l75Var);
    }

    /* renamed from: n */
    public final boolean m21522n(String str, String str2) {
        return (str2 == null || str == null || m21526j()) ? false : true;
    }

    /* renamed from: o */
    public final int m21521o(String str) {
        oq3 oq3Var = new oq3();
        m21523m(new kv4(this, str, oq3Var));
        Integer num = (Integer) oq3.m14070h3(oq3Var.m14073I(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: p */
    public final long m21520p() {
        oq3 oq3Var = new oq3();
        m21523m(new pn4(this, oq3Var));
        Long m14072M = oq3Var.m14072M(500L);
        if (m14072M == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f11390b.mo15860a()).nextLong();
            int i = this.f11394f + 1;
            this.f11394f = i;
            return nextLong + i;
        }
        return m14072M.longValue();
    }

    /* renamed from: q */
    public final Bundle m21519q(Bundle bundle, boolean z) {
        oq3 oq3Var = new oq3();
        m21523m(new et4(this, bundle, oq3Var));
        if (z) {
            return oq3Var.m14073I(5000L);
        }
        return null;
    }

    /* renamed from: r */
    public final C1361g5 m21518r() {
        return this.f11392d;
    }

    /* renamed from: t */
    public final ju3 m21516t(Context context, boolean z) {
        try {
            return lt3.asInterface(DynamiteModule.m1145e(context, DynamiteModule.f36681e, ModuleDescriptor.MODULE_ID).m1146d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C3992a e) {
            m21525k(e, true, false);
            return null;
        }
    }

    /* renamed from: w */
    public final String m21513w() {
        return this.f11396h;
    }

    /* renamed from: x */
    public final String m21512x() {
        oq3 oq3Var = new oq3();
        m21523m(new mm4(this, oq3Var));
        return oq3Var.m14071g3(50L);
    }

    /* renamed from: y */
    public final String m21511y() {
        oq3 oq3Var = new oq3();
        m21523m(new vp4(this, oq3Var));
        return oq3Var.m14071g3(500L);
    }

    /* renamed from: z */
    public final String m21510z() {
        oq3 oq3Var = new oq3();
        m21523m(new so4(this, oq3Var));
        return oq3Var.m14071g3(500L);
    }
}
