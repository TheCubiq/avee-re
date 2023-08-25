package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class dj5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    public final /* synthetic */ gk5 f7199p;

    public dj5(gk5 gk5Var) {
        this.f7199p = gk5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f7199p.m21523m(new ta5(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f7199p.m21523m(new zh5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f7199p.m21523m(new qe5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f7199p.m21523m(new ad5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        oq3 oq3Var = new oq3();
        this.f7199p.m21523m(new wg5(this, activity, oq3Var));
        Bundle m14073I = oq3Var.m14073I(50L);
        if (m14073I != null) {
            bundle.putAll(m14073I);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f7199p.m21523m(new wb5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f7199p.m21523m(new tf5(this, activity));
    }
}
