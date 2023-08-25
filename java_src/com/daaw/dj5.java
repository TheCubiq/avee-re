package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class dj5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ gk5 p;

    public dj5(gk5 gk5Var) {
        this.p = gk5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.p.m(new ta5(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.p.m(new zh5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.p.m(new qe5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.p.m(new ad5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        oq3 oq3Var = new oq3();
        this.p.m(new wg5(this, activity, oq3Var));
        Bundle I = oq3Var.I(50L);
        if (I != null) {
            bundle.putAll(I);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.p.m(new wb5(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.p.m(new tf5(this, activity));
    }
}
