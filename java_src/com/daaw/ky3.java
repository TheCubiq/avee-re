package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ky3 {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    @GuardedBy("gmpAppIdLock")
    public String c = null;
    @GuardedBy("gmpAppIdLock")
    public String d = null;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(-1);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(null);
    public final ConcurrentMap i = new ConcurrentHashMap(9);
    public final AtomicReference j = new AtomicReference(null);
    @GuardedBy("proxyReference")
    public final BlockingQueue k = new ArrayBlockingQueue(20);
    public final Object l = new Object();

    public static final boolean A(Context context) {
        if (((Boolean) zzba.zzc().b(g93.f0)).booleanValue()) {
            if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzba.zzc().b(g93.g0)).intValue()) {
                return false;
            }
            if (((Boolean) zzba.zzc().b(g93.h0)).booleanValue()) {
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object B(String str, Object obj, iy3 iy3Var) {
        synchronized (this.j) {
            if (((x84) this.j.get()) != null) {
                try {
                    return iy3Var.a((x84) this.j.get());
                } catch (Exception unused) {
                    c(str, false);
                }
            }
            return obj;
        }
    }

    public final Object C(String str, Context context) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            try {
                return D(context, str).invoke(this.g.get(), new Object[0]);
            } catch (Exception unused) {
                c(str, true);
                return null;
            }
        }
        return null;
    }

    public final Method D(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    public final ExecutorService E() {
        ExecutorService threadPoolExecutor;
        if (this.a.get() == null) {
            if (vf.a()) {
                threadPoolExecutor = fv6.a().b(((Integer) zzba.zzc().b(g93.e0)).intValue(), new hy3(this), 2);
            } else {
                y83 y83Var = g93.e0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzba.zzc().b(y83Var)).intValue(), ((Integer) zzba.zzc().b(y83Var)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new hy3(this));
            }
            tx3.a(this.a, null, threadPoolExecutor);
        }
        return (ExecutorService) this.a.get();
    }

    public final void a(Context context, String str, String str2) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            Method method = (Method) this.i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.i.put(str2, method);
                } catch (Exception unused) {
                    c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.g.get(), str);
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    public final void b(Context context, final String str, String str2, Bundle bundle) {
        if (z(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                k04.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (A(context)) {
                d("logEventInternal", new jy3() { // from class: com.daaw.wx3
                    @Override // com.daaw.jy3
                    public final void a(x84 x84Var) {
                        x84Var.Y1("am", str, bundle2);
                    }
                });
            } else if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                Method method = (Method) this.i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    public final void c(String str, boolean z) {
        if (this.e.get()) {
            return;
        }
        k04.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            k04.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.e.set(true);
        }
    }

    public final void d(final String str, final jy3 jy3Var) {
        synchronized (this.j) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.daaw.xx3
                @Override // java.lang.Runnable
                public final void run() {
                    ky3.this.o(jy3Var, str);
                }
            }, null);
            if (this.j.get() != null) {
                futureTask.run();
            } else {
                this.k.offer(futureTask);
            }
        }
    }

    public final boolean e(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                tx3.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) {
        if (z(context)) {
            if (A(context)) {
                Long l = (Long) B("getAdEventId", null, new iy3() { // from class: com.daaw.yx3
                    @Override // com.daaw.iy3
                    public final Object a(x84 x84Var) {
                        return Long.valueOf(x84Var.zzc());
                    }
                });
                if (l != null) {
                    return Long.toString(l.longValue());
                }
                return null;
            }
            Object C = C("generateEventId", context);
            if (C != null) {
                return C.toString();
            }
            return null;
        }
        return null;
    }

    public final String g(Context context) {
        if (z(context)) {
            synchronized (this.b) {
                String str = this.d;
                if (str != null) {
                    return str;
                }
                this.d = A(context) ? (String) B("getAppIdOrigin", this.d, new iy3() { // from class: com.daaw.cy3
                    @Override // com.daaw.iy3
                    public final Object a(x84 x84Var) {
                        return x84Var.zze();
                    }
                }) : "fa";
                return this.d;
            }
        }
        return null;
    }

    public final String h(final Context context) {
        if (z(context)) {
            long longValue = ((Long) zzba.zzc().b(g93.d0)).longValue();
            if (A(context)) {
                try {
                    return longValue < 0 ? (String) B("getAppInstanceId", null, dy3.a) : (String) E().submit(new Callable() { // from class: com.daaw.ey3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ky3.this.k();
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    return "TIME_OUT";
                } catch (Exception unused2) {
                    return null;
                }
            } else if (longValue < 0) {
                return (String) C("getAppInstanceId", context);
            } else {
                try {
                    return (String) E().submit(new Callable() { // from class: com.daaw.fy3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ky3.this.l(context);
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused3) {
                    return "TIME_OUT";
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String i(Context context) {
        if (z(context)) {
            if (A(context)) {
                return (String) B("getCurrentScreenNameOrScreenClass", "", new iy3() { // from class: com.daaw.zx3
                    @Override // com.daaw.iy3
                    public final Object a(x84 x84Var) {
                        String zzh = x84Var.zzh();
                        return (zzh == null && (zzh = x84Var.zzg()) == null) ? "" : zzh;
                    }
                });
            }
            if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                try {
                    String str = (String) D(context, "getCurrentScreenName").invoke(this.g.get(), new Object[0]);
                    if (str == null) {
                        str = (String) D(context, "getCurrentScreenClass").invoke(this.g.get(), new Object[0]);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    c("getCurrentScreenName", false);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public final String j(Context context) {
        if (z(context)) {
            synchronized (this.b) {
                String str = this.c;
                if (str != null) {
                    return str;
                }
                this.c = A(context) ? (String) B("getGmpAppId", this.c, new iy3() { // from class: com.daaw.vx3
                    @Override // com.daaw.iy3
                    public final Object a(x84 x84Var) {
                        return x84Var.zzi();
                    }
                }) : (String) C("getGmpAppId", context);
                return this.c;
            }
        }
        return null;
    }

    public final /* synthetic */ String k() {
        return (String) B("getAppInstanceId", null, dy3.a);
    }

    public final /* synthetic */ String l(Context context) {
        return (String) C("getAppInstanceId", context);
    }

    public final void m(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("beginAdUnitExposure", new jy3() { // from class: com.daaw.ux3
                    @Override // com.daaw.jy3
                    public final void a(x84 x84Var) {
                        x84Var.n(str);
                    }
                });
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void n(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("endAdUnitExposure", new jy3() { // from class: com.daaw.by3
                    @Override // com.daaw.jy3
                    public final void a(x84 x84Var) {
                        x84Var.zzn(str);
                    }
                });
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    public final /* synthetic */ void o(jy3 jy3Var, String str) {
        if (((x84) this.j.get()) != null) {
            try {
                jy3Var.a((x84) this.j.get());
            } catch (Exception unused) {
                c(str, false);
            }
        }
    }

    public final void p(Context context, String str) {
        b(context, "_aa", str, null);
    }

    public final void q(Context context, String str) {
        b(context, "_aq", str, null);
    }

    public final void r(Context context, String str) {
        b(context, "_ac", str, null);
    }

    public final void s(Context context, String str) {
        b(context, "_ai", str, null);
    }

    public final void t(Context context, String str, String str2, String str3, int i) {
        if (z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            b(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void u(Context context, zzl zzlVar) {
        if (((Boolean) zzba.zzc().b(g93.k0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void v(Context context, zzff zzffVar) {
        ly3.d(context).b().d(zzffVar);
        if (((Boolean) zzba.zzc().b(g93.k0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void w(final Bundle bundle) {
        d("setConsent", new jy3() { // from class: com.daaw.gy3
            @Override // com.daaw.jy3
            public final void a(x84 x84Var) {
                x84Var.H(bundle);
            }
        });
    }

    @Deprecated
    public final void x(final Context context, final String str) {
        if (z(context) && (context instanceof Activity)) {
            if (A(context)) {
                d("setScreenName", new jy3() { // from class: com.daaw.ay3
                    @Override // com.daaw.jy3
                    public final void a(x84 x84Var) {
                        Context context2 = context;
                        x84Var.u2(nt0.g3(context2), str, context2.getPackageName());
                    }
                });
            } else if (e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.h, false)) {
                Method method = (Method) this.i.get("setCurrentScreen");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.i.put("setCurrentScreen", method);
                    } catch (Exception unused) {
                        c("setCurrentScreen", false);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    c("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean y() {
        synchronized (this.l) {
        }
        return false;
    }

    public final boolean z(Context context) {
        if (((Boolean) zzba.zzc().b(g93.Y)).booleanValue() && !this.e.get()) {
            if (((Boolean) zzba.zzc().b(g93.i0)).booleanValue()) {
                return true;
            }
            if (this.f.get() == -1) {
                zzay.zzb();
                if (!d04.y(context, c80.a)) {
                    zzay.zzb();
                    if (d04.z(context)) {
                        k04.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f.set(0);
                    }
                }
                this.f.set(1);
            }
            if (this.f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
