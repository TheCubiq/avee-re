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
    public static volatile gk5 j;
    public final String a;
    public final ag b;
    public final ExecutorService c;
    public final g5 d;
    public final List e;
    public int f;
    public boolean g;
    public final String h;
    public volatile ju3 i;

    public gk5(Context context, String str, String str2, String str3, Bundle bundle) {
        this.a = (str == null || !n(str2, str3)) ? "FA" : "FA";
        this.b = mq.d();
        ko3.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hu4(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.d = new g5(this);
        this.e = new ArrayList();
        try {
            if (q38.b(context, "google_app_id", ji6.a(context)) != null && !j()) {
                this.h = null;
                this.g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (n(str2, str3)) {
            this.h = str2;
        } else {
            this.h = "fa";
        }
        m(new ih4(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new dj5(this));
    }

    public static gk5 u(Context context, String str, String str2, String str3, Bundle bundle) {
        ry0.j(context);
        if (j == null) {
            synchronized (gk5.class) {
                if (j == null) {
                    j = new gk5(context, str, str2, str3, bundle);
                }
            }
        }
        return j;
    }

    public final String A() {
        oq3 oq3Var = new oq3();
        m(new jl4(this, oq3Var));
        return oq3Var.g3(500L);
    }

    public final List B(String str, String str2) {
        oq3 oq3Var = new oq3();
        m(new p84(this, str, str2, oq3Var));
        List list = (List) oq3.h3(oq3Var.I(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map C(String str, String str2, boolean z) {
        oq3 oq3Var = new oq3();
        m(new yq4(this, str, str2, z, oq3Var));
        Bundle I = oq3Var.I(5000L);
        if (I == null || I.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(I.size());
        for (String str3 : I.keySet()) {
            Object obj = I.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void G(String str) {
        m(new li4(this, str));
    }

    public final void H(String str, String str2, Bundle bundle) {
        m(new m74(this, str, str2, bundle));
    }

    public final void I(String str) {
        m(new oj4(this, str));
    }

    public final void J(String str, String str2, Bundle bundle) {
        l(str, str2, bundle, true, true, null);
    }

    public final void a(int i, String str, Object obj, Object obj2, Object obj3) {
        m(new bs4(this, false, 5, str, obj, null, null));
    }

    public final void b(pl7 pl7Var) {
        ry0.j(pl7Var);
        synchronized (this.e) {
            for (int i = 0; i < this.e.size(); i++) {
                if (pl7Var.equals(((Pair) this.e.get(i)).first)) {
                    return;
                }
            }
            q95 q95Var = new q95(pl7Var);
            this.e.add(new Pair(pl7Var, q95Var));
            if (this.i != null) {
                try {
                    this.i.registerOnMeasurementEventListener(q95Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m(new a35(this, q95Var));
        }
    }

    public final void c(Bundle bundle) {
        m(new j64(this, bundle));
    }

    public final void d(Bundle bundle) {
        m(new zc4(this, bundle));
    }

    public final void e(Activity activity, String str, String str2) {
        m(new ua4(this, activity, str, str2));
    }

    public final void f(boolean z) {
        m(new tz4(this, z));
    }

    public final void g(String str, String str2, Object obj, boolean z) {
        m(new i65(this, str, str2, obj, z));
    }

    public final boolean j() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, gk5.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void k(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (!z && z2) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    public final void l(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m(new f55(this, l, str, str2, bundle, z, z2));
    }

    public final void m(l75 l75Var) {
        this.c.execute(l75Var);
    }

    public final boolean n(String str, String str2) {
        return (str2 == null || str == null || j()) ? false : true;
    }

    public final int o(String str) {
        oq3 oq3Var = new oq3();
        m(new kv4(this, str, oq3Var));
        Integer num = (Integer) oq3.h3(oq3Var.I(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long p() {
        oq3 oq3Var = new oq3();
        m(new pn4(this, oq3Var));
        Long M = oq3Var.M(500L);
        if (M == null) {
            long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
            int i = this.f + 1;
            this.f = i;
            return nextLong + i;
        }
        return M.longValue();
    }

    public final Bundle q(Bundle bundle, boolean z) {
        oq3 oq3Var = new oq3();
        m(new et4(this, bundle, oq3Var));
        if (z) {
            return oq3Var.I(5000L);
        }
        return null;
    }

    public final g5 r() {
        return this.d;
    }

    public final ju3 t(Context context, boolean z) {
        try {
            return lt3.asInterface(DynamiteModule.e(context, DynamiteModule.e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            k(e, true, false);
            return null;
        }
    }

    public final String w() {
        return this.h;
    }

    public final String x() {
        oq3 oq3Var = new oq3();
        m(new mm4(this, oq3Var));
        return oq3Var.g3(50L);
    }

    public final String y() {
        oq3 oq3Var = new oq3();
        m(new vp4(this, oq3Var));
        return oq3Var.g3(500L);
    }

    public final String z() {
        oq3 oq3Var = new oq3();
        m(new so4(this, oq3Var));
        return oq3Var.g3(500L);
    }
}
