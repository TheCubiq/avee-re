package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* renamed from: com.daaw.t0 */
/* loaded from: classes.dex */
public final class C3001t0 {

    /* renamed from: a */
    public static final Class<?> f26840a;

    /* renamed from: b */
    public static final Field f26841b;

    /* renamed from: c */
    public static final Field f26842c;

    /* renamed from: d */
    public static final Method f26843d;

    /* renamed from: e */
    public static final Method f26844e;

    /* renamed from: f */
    public static final Method f26845f;

    /* renamed from: g */
    public static final Handler f26846g = new Handler(Looper.getMainLooper());

    /* renamed from: com.daaw.t0$a */
    /* loaded from: classes.dex */
    public class RunnableC3002a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ C3005d f26847p;

        /* renamed from: q */
        public final /* synthetic */ Object f26848q;

        public RunnableC3002a(C3005d c3005d, Object obj) {
            this.f26847p = c3005d;
            this.f26848q = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26847p.f26853p = this.f26848q;
        }
    }

    /* renamed from: com.daaw.t0$b */
    /* loaded from: classes.dex */
    public class RunnableC3003b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Application f26849p;

        /* renamed from: q */
        public final /* synthetic */ C3005d f26850q;

        public RunnableC3003b(Application application, C3005d c3005d) {
            this.f26849p = application;
            this.f26850q = c3005d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26849p.unregisterActivityLifecycleCallbacks(this.f26850q);
        }
    }

    /* renamed from: com.daaw.t0$c */
    /* loaded from: classes.dex */
    public class RunnableC3004c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Object f26851p;

        /* renamed from: q */
        public final /* synthetic */ Object f26852q;

        public RunnableC3004c(Object obj, Object obj2) {
            this.f26851p = obj;
            this.f26852q = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C3001t0.f26843d;
                if (method != null) {
                    method.invoke(this.f26851p, this.f26852q, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C3001t0.f26844e.invoke(this.f26851p, this.f26852q, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.daaw.t0$d */
    /* loaded from: classes.dex */
    public static final class C3005d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: p */
        public Object f26853p;

        /* renamed from: q */
        public Activity f26854q;

        /* renamed from: r */
        public final int f26855r;

        /* renamed from: s */
        public boolean f26856s = false;

        /* renamed from: t */
        public boolean f26857t = false;

        /* renamed from: u */
        public boolean f26858u = false;

        public C3005d(Activity activity) {
            this.f26854q = activity;
            this.f26855r = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f26854q == activity) {
                this.f26854q = null;
                this.f26857t = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f26857t || this.f26858u || this.f26856s || !C3001t0.m9669h(this.f26853p, this.f26855r, activity)) {
                return;
            }
            this.f26858u = true;
            this.f26853p = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f26854q == activity) {
                this.f26856s = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m9676a = m9676a();
        f26840a = m9676a;
        f26841b = m9675b();
        f26842c = m9671f();
        f26843d = m9673d(m9676a);
        f26844e = m9674c(m9676a);
        f26845f = m9672e(m9676a);
    }

    /* renamed from: a */
    public static Class<?> m9676a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m9675b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m9674c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m9673d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m9672e(Class<?> cls) {
        if (m9670g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m9671f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m9670g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    public static boolean m9669h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f26842c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f26846g.postAtFrontOfQueue(new RunnableC3004c(f26841b.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m9668i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m9670g() && f26845f == null) {
            return false;
        } else {
            if (f26844e == null && f26843d == null) {
                return false;
            }
            try {
                Object obj2 = f26842c.get(activity);
                if (obj2 == null || (obj = f26841b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C3005d c3005d = new C3005d(activity);
                application.registerActivityLifecycleCallbacks(c3005d);
                Handler handler = f26846g;
                handler.post(new RunnableC3002a(c3005d, obj2));
                if (m9670g()) {
                    Method method = f26845f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC3003b(application, c3005d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
