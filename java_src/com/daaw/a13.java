package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class a13 implements f13 {
    public final /* synthetic */ Activity a;

    public a13(g13 g13Var, Activity activity) {
        this.a = activity;
    }

    @Override // com.daaw.f13
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}
