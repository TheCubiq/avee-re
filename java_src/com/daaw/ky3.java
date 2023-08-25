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

    /* renamed from: a */
    public final AtomicReference f16849a = new AtomicReference(null);

    /* renamed from: b */
    public final Object f16850b = new Object();
    @GuardedBy("gmpAppIdLock")

    /* renamed from: c */
    public String f16851c = null;
    @GuardedBy("gmpAppIdLock")

    /* renamed from: d */
    public String f16852d = null;

    /* renamed from: e */
    public final AtomicBoolean f16853e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicInteger f16854f = new AtomicInteger(-1);

    /* renamed from: g */
    public final AtomicReference f16855g = new AtomicReference(null);

    /* renamed from: h */
    public final AtomicReference f16856h = new AtomicReference(null);

    /* renamed from: i */
    public final ConcurrentMap f16857i = new ConcurrentHashMap(9);

    /* renamed from: j */
    public final AtomicReference f16858j = new AtomicReference(null);
    @GuardedBy("proxyReference")

    /* renamed from: k */
    public final BlockingQueue f16859k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    public final Object f16860l = new Object();

    /* renamed from: A */
    public static final boolean m17347A(Context context) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10677f0)).booleanValue()) {
            if (DynamiteModule.m1149a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzba.zzc().m23658b(g93.f10688g0)).intValue()) {
                return false;
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10699h0)).booleanValue()) {
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

    /* renamed from: B */
    public final Object m17346B(String str, Object obj, iy3 iy3Var) {
        synchronized (this.f16858j) {
            if (((x84) this.f16858j.get()) != null) {
                try {
                    return iy3Var.mo1800a((x84) this.f16858j.get());
                } catch (Exception unused) {
                    m17340c(str, false);
                }
            }
            return obj;
        }
    }

    /* renamed from: C */
    public final Object m17345C(String str, Context context) {
        if (m17338e(context, "com.google.android.gms.measurement.AppMeasurement", this.f16855g, true)) {
            try {
                return m17344D(context, str).invoke(this.f16855g.get(), new Object[0]);
            } catch (Exception unused) {
                m17340c(str, true);
                return null;
            }
        }
        return null;
    }

    /* renamed from: D */
    public final Method m17344D(Context context, String str) {
        Method method = (Method) this.f16857i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f16857i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m17340c(str, false);
            return null;
        }
    }

    /* renamed from: E */
    public final ExecutorService m17343E() {
        ExecutorService threadPoolExecutor;
        if (this.f16849a.get() == null) {
            if (C3327vf.m7198a()) {
                threadPoolExecutor = fv6.m22241a().mo1868b(((Integer) zzba.zzc().m23658b(g93.f10666e0)).intValue(), new hy3(this), 2);
            } else {
                y83 y83Var = g93.f10666e0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzba.zzc().m23658b(y83Var)).intValue(), ((Integer) zzba.zzc().m23658b(y83Var)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new hy3(this));
            }
            tx3.m8721a(this.f16849a, null, threadPoolExecutor);
        }
        return (ExecutorService) this.f16849a.get();
    }

    /* renamed from: a */
    public final void m17342a(Context context, String str, String str2) {
        if (m17338e(context, "com.google.android.gms.measurement.AppMeasurement", this.f16855g, true)) {
            Method method = (Method) this.f16857i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f16857i.put(str2, method);
                } catch (Exception unused) {
                    m17340c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f16855g.get(), str);
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                m17340c(str2, false);
            }
        }
    }

    /* renamed from: b */
    public final void m17341b(Context context, final String str, String str2, Bundle bundle) {
        if (m17317z(context)) {
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
            if (m17347A(context)) {
                m17339d("logEventInternal", new jy3() { // from class: com.daaw.wx3
                    @Override // com.daaw.jy3
                    /* renamed from: a */
                    public final void mo5732a(x84 x84Var) {
                        x84Var.mo5437Y1("am", str, bundle2);
                    }
                });
            } else if (m17338e(context, "com.google.android.gms.measurement.AppMeasurement", this.f16855g, true)) {
                Method method = (Method) this.f16857i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f16857i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m17340c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f16855g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    m17340c("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m17340c(String str, boolean z) {
        if (this.f16853e.get()) {
            return;
        }
        k04.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            k04.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f16853e.set(true);
        }
    }

    /* renamed from: d */
    public final void m17339d(final String str, final jy3 jy3Var) {
        synchronized (this.f16858j) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.daaw.xx3
                @Override // java.lang.Runnable
                public final void run() {
                    ky3.this.m17328o(jy3Var, str);
                }
            }, null);
            if (this.f16858j.get() != null) {
                futureTask.run();
            } else {
                this.f16859k.offer(futureTask);
            }
        }
    }

    /* renamed from: e */
    public final boolean m17338e(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                tx3.m8721a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                m17340c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m17337f(Context context) {
        if (m17317z(context)) {
            if (m17347A(context)) {
                Long l = (Long) m17346B("getAdEventId", null, new iy3() { // from class: com.daaw.yx3
                    @Override // com.daaw.iy3
                    /* renamed from: a */
                    public final Object mo1800a(x84 x84Var) {
                        return Long.valueOf(x84Var.zzc());
                    }
                });
                if (l != null) {
                    return Long.toString(l.longValue());
                }
                return null;
            }
            Object m17345C = m17345C("generateEventId", context);
            if (m17345C != null) {
                return m17345C.toString();
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    public final String m17336g(Context context) {
        if (m17317z(context)) {
            synchronized (this.f16850b) {
                String str = this.f16852d;
                if (str != null) {
                    return str;
                }
                this.f16852d = m17347A(context) ? (String) m17346B("getAppIdOrigin", this.f16852d, new iy3() { // from class: com.daaw.cy3
                    @Override // com.daaw.iy3
                    /* renamed from: a */
                    public final Object mo1800a(x84 x84Var) {
                        return x84Var.zze();
                    }
                }) : "fa";
                return this.f16852d;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String m17335h(final Context context) {
        if (m17317z(context)) {
            long longValue = ((Long) zzba.zzc().m23658b(g93.f10655d0)).longValue();
            if (m17347A(context)) {
                try {
                    return longValue < 0 ? (String) m17346B("getAppInstanceId", null, dy3.f7976a) : (String) m17343E().submit(new Callable() { // from class: com.daaw.ey3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ky3.this.m17332k();
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    return "TIME_OUT";
                } catch (Exception unused2) {
                    return null;
                }
            } else if (longValue < 0) {
                return (String) m17345C("getAppInstanceId", context);
            } else {
                try {
                    return (String) m17343E().submit(new Callable() { // from class: com.daaw.fy3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ky3.this.m17331l(context);
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

    /* renamed from: i */
    public final String m17334i(Context context) {
        if (m17317z(context)) {
            if (m17347A(context)) {
                return (String) m17346B("getCurrentScreenNameOrScreenClass", "", new iy3() { // from class: com.daaw.zx3
                    @Override // com.daaw.iy3
                    /* renamed from: a */
                    public final Object mo1800a(x84 x84Var) {
                        String zzh = x84Var.zzh();
                        return (zzh == null && (zzh = x84Var.zzg()) == null) ? "" : zzh;
                    }
                });
            }
            if (m17338e(context, "com.google.android.gms.measurement.AppMeasurement", this.f16855g, true)) {
                try {
                    String str = (String) m17344D(context, "getCurrentScreenName").invoke(this.f16855g.get(), new Object[0]);
                    if (str == null) {
                        str = (String) m17344D(context, "getCurrentScreenClass").invoke(this.f16855g.get(), new Object[0]);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    m17340c("getCurrentScreenName", false);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    /* renamed from: j */
    public final String m17333j(Context context) {
        if (m17317z(context)) {
            synchronized (this.f16850b) {
                String str = this.f16851c;
                if (str != null) {
                    return str;
                }
                this.f16851c = m17347A(context) ? (String) m17346B("getGmpAppId", this.f16851c, new iy3() { // from class: com.daaw.vx3
                    @Override // com.daaw.iy3
                    /* renamed from: a */
                    public final Object mo1800a(x84 x84Var) {
                        return x84Var.zzi();
                    }
                }) : (String) m17345C("getGmpAppId", context);
                return this.f16851c;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final /* synthetic */ String m17332k() {
        return (String) m17346B("getAppInstanceId", null, dy3.f7976a);
    }

    /* renamed from: l */
    public final /* synthetic */ String m17331l(Context context) {
        return (String) m17345C("getAppInstanceId", context);
    }

    /* renamed from: m */
    public final void m17330m(Context context, final String str) {
        if (m17317z(context)) {
            if (m17347A(context)) {
                m17339d("beginAdUnitExposure", new jy3() { // from class: com.daaw.ux3
                    @Override // com.daaw.jy3
                    /* renamed from: a */
                    public final void mo5732a(x84 x84Var) {
                        x84Var.mo5436n(str);
                    }
                });
            } else {
                m17342a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: n */
    public final void m17329n(Context context, final String str) {
        if (m17317z(context)) {
            if (m17347A(context)) {
                m17339d("endAdUnitExposure", new jy3() { // from class: com.daaw.by3
                    @Override // com.daaw.jy3
                    /* renamed from: a */
                    public final void mo5732a(x84 x84Var) {
                        x84Var.zzn(str);
                    }
                });
            } else {
                m17342a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void m17328o(jy3 jy3Var, String str) {
        if (((x84) this.f16858j.get()) != null) {
            try {
                jy3Var.mo5732a((x84) this.f16858j.get());
            } catch (Exception unused) {
                m17340c(str, false);
            }
        }
    }

    /* renamed from: p */
    public final void m17327p(Context context, String str) {
        m17341b(context, "_aa", str, null);
    }

    /* renamed from: q */
    public final void m17326q(Context context, String str) {
        m17341b(context, "_aq", str, null);
    }

    /* renamed from: r */
    public final void m17325r(Context context, String str) {
        m17341b(context, "_ac", str, null);
    }

    /* renamed from: s */
    public final void m17324s(Context context, String str) {
        m17341b(context, "_ai", str, null);
    }

    /* renamed from: t */
    public final void m17323t(Context context, String str, String str2, String str3, int i) {
        if (m17317z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m17341b(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    /* renamed from: u */
    public final void m17322u(Context context, zzl zzlVar) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10732k0)).booleanValue() && m17317z(context) && m17347A(context)) {
            synchronized (this.f16860l) {
            }
        }
    }

    /* renamed from: v */
    public final void m17321v(Context context, zzff zzffVar) {
        ly3.m16372d(context).mo10846b().m19295d(zzffVar);
        if (((Boolean) zzba.zzc().m23658b(g93.f10732k0)).booleanValue() && m17317z(context) && m17347A(context)) {
            synchronized (this.f16860l) {
            }
        }
    }

    /* renamed from: w */
    public final void m17320w(final Bundle bundle) {
        m17339d("setConsent", new jy3() { // from class: com.daaw.gy3
            @Override // com.daaw.jy3
            /* renamed from: a */
            public final void mo5732a(x84 x84Var) {
                x84Var.mo5441H(bundle);
            }
        });
    }

    @Deprecated
    /* renamed from: x */
    public final void m17319x(final Context context, final String str) {
        if (m17317z(context) && (context instanceof Activity)) {
            if (m17347A(context)) {
                m17339d("setScreenName", new jy3() { // from class: com.daaw.ay3
                    @Override // com.daaw.jy3
                    /* renamed from: a */
                    public final void mo5732a(x84 x84Var) {
                        Context context2 = context;
                        x84Var.mo5434u2(nt0.m14830g3(context2), str, context2.getPackageName());
                    }
                });
            } else if (m17338e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f16856h, false)) {
                Method method = (Method) this.f16857i.get("setCurrentScreen");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.f16857i.put("setCurrentScreen", method);
                    } catch (Exception unused) {
                        m17340c("setCurrentScreen", false);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f16856h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    m17340c("setCurrentScreen", false);
                }
            }
        }
    }

    /* renamed from: y */
    public final boolean m17318y() {
        synchronized (this.f16860l) {
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m17317z(Context context) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10601Y)).booleanValue() && !this.f16853e.get()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10710i0)).booleanValue()) {
                return true;
            }
            if (this.f16854f.get() == -1) {
                zzay.zzb();
                if (!d04.m24807y(context, c80.f5613a)) {
                    zzay.zzb();
                    if (d04.m24806z(context)) {
                        k04.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f16854f.set(0);
                    }
                }
                this.f16854f.set(1);
            }
            if (this.f16854f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
