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
/* loaded from: classes.dex */
public final class fa implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final fa t = new fa();
    public final AtomicBoolean p = new AtomicBoolean();
    public final AtomicBoolean q = new AtomicBoolean();
    @GuardedBy("sInstance")
    public final ArrayList r = new ArrayList();
    @GuardedBy("sInstance")
    public boolean s = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    public static fa b() {
        return t;
    }

    public static void c(Application application) {
        fa faVar = t;
        synchronized (faVar) {
            if (!faVar.s) {
                application.registerActivityLifecycleCallbacks(faVar);
                application.registerComponentCallbacks(faVar);
                faVar.s = true;
            }
        }
    }

    public void a(a aVar) {
        synchronized (t) {
            this.r.add(aVar);
        }
    }

    public boolean d() {
        return this.p.get();
    }

    @TargetApi(16)
    public boolean e(boolean z) {
        if (!this.q.get()) {
            if (!vw0.b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.q.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.p.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z) {
        synchronized (t) {
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.p.compareAndSet(true, false);
        this.q.set(true);
        if (compareAndSet) {
            f(false);
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
        boolean compareAndSet = this.p.compareAndSet(true, false);
        this.q.set(true);
        if (compareAndSet) {
            f(false);
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
        if (i == 20 && this.p.compareAndSet(false, true)) {
            this.q.set(true);
            f(true);
        }
    }
}
