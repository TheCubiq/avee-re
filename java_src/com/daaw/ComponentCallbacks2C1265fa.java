package com.daaw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
/* renamed from: com.daaw.fa */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1265fa implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: t */
    public static final ComponentCallbacks2C1265fa f9295t = new ComponentCallbacks2C1265fa();

    /* renamed from: p */
    public final AtomicBoolean f9296p = new AtomicBoolean();

    /* renamed from: q */
    public final AtomicBoolean f9297q = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: r */
    public final ArrayList f9298r = new ArrayList();
    @GuardedBy("sInstance")

    /* renamed from: s */
    public boolean f9299s = false;

    /* renamed from: com.daaw.fa$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1266a {
        /* renamed from: a */
        void mo10770a(boolean z);
    }

    /* renamed from: b */
    public static ComponentCallbacks2C1265fa m22823b() {
        return f9295t;
    }

    /* renamed from: c */
    public static void m22822c(Application application) {
        ComponentCallbacks2C1265fa componentCallbacks2C1265fa = f9295t;
        synchronized (componentCallbacks2C1265fa) {
            if (!componentCallbacks2C1265fa.f9299s) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C1265fa);
                application.registerComponentCallbacks(componentCallbacks2C1265fa);
                componentCallbacks2C1265fa.f9299s = true;
            }
        }
    }

    /* renamed from: a */
    public void m22824a(InterfaceC1266a interfaceC1266a) {
        synchronized (f9295t) {
            this.f9298r.add(interfaceC1266a);
        }
    }

    /* renamed from: d */
    public boolean m22821d() {
        return this.f9296p.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean m22820e(boolean z) {
        if (!this.f9297q.get()) {
            if (!vw0.m6703b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f9297q.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f9296p.set(true);
            }
        }
        return m22821d();
    }

    /* renamed from: f */
    public final void m22819f(boolean z) {
        synchronized (f9295t) {
            Iterator it = this.f9298r.iterator();
            while (it.hasNext()) {
                ((InterfaceC1266a) it.next()).mo10770a(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f9296p.compareAndSet(true, false);
        this.f9297q.set(true);
        if (compareAndSet) {
            m22819f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f9296p.compareAndSet(true, false);
        this.f9297q.set(true);
        if (compareAndSet) {
            m22819f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f9296p.compareAndSet(false, true)) {
            this.f9297q.set(true);
            m22819f(true);
        }
    }
}
