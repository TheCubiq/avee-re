package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class em2 implements hm2 {
    public final /* synthetic */ Activity a;

    public em2(im2 im2Var, Activity activity) {
        this.a = activity;
    }

    @Override // com.daaw.hm2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
