package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class im2 implements Application.ActivityLifecycleCallbacks {
    public final Application p;
    public final WeakReference q;
    public boolean r = false;

    public im2(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.q = new WeakReference(activityLifecycleCallbacks);
        this.p = application;
    }

    public final void a(hm2 hm2Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.q.get();
            if (activityLifecycleCallbacks != null) {
                hm2Var.a(activityLifecycleCallbacks);
            } else if (this.r) {
            } else {
                this.p.unregisterActivityLifecycleCallbacks(this);
                this.r = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new am2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new gm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new dm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new cm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new fm2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new bm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new em2(this, activity));
    }
}
