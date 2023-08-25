package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class g13 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    public final Application f10145p;

    /* renamed from: q */
    public final WeakReference f10146q;

    /* renamed from: r */
    public boolean f10147r = false;

    public g13(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f10146q = new WeakReference(activityLifecycleCallbacks);
        this.f10145p = application;
    }

    /* renamed from: a */
    public final void m22094a(f13 f13Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10146q.get();
            if (activityLifecycleCallbacks != null) {
                f13Var.mo3006a(activityLifecycleCallbacks);
            } else if (this.f10147r) {
            } else {
                this.f10145p.unregisterActivityLifecycleCallbacks(this);
                this.f10147r = true;
            }
        } catch (Exception e) {
            k04.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m22094a(new y03(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m22094a(new e13(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m22094a(new b13(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m22094a(new a13(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m22094a(new d13(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m22094a(new z03(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m22094a(new c13(this, activity));
    }
}
