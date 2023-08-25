package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class im2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    public final Application f13790p;

    /* renamed from: q */
    public final WeakReference f13791q;

    /* renamed from: r */
    public boolean f13792r = false;

    public im2(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f13791q = new WeakReference(activityLifecycleCallbacks);
        this.f13790p = application;
    }

    /* renamed from: a */
    public final void m19642a(hm2 hm2Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f13791q.get();
            if (activityLifecycleCallbacks != null) {
                hm2Var.mo20624a(activityLifecycleCallbacks);
            } else if (this.f13792r) {
            } else {
                this.f13790p.unregisterActivityLifecycleCallbacks(this);
                this.f13792r = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m19642a(new am2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m19642a(new gm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m19642a(new dm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m19642a(new cm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m19642a(new fm2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m19642a(new bm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m19642a(new em2(this, activity));
    }
}
