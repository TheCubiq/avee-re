package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class g13 implements Application.ActivityLifecycleCallbacks {
    public final Application p;
    public final WeakReference q;
    public boolean r = false;

    public g13(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.q = new WeakReference(activityLifecycleCallbacks);
        this.p = application;
    }

    public final void a(f13 f13Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.q.get();
            if (activityLifecycleCallbacks != null) {
                f13Var.a(activityLifecycleCallbacks);
            } else if (this.r) {
            } else {
                this.p.unregisterActivityLifecycleCallbacks(this);
                this.r = true;
            }
        } catch (Exception e) {
            k04.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new y03(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new e13(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new b13(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new a13(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new d13(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new z03(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new c13(this, activity));
    }
}
