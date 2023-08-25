package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class dm2 implements hm2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f7478a;

    public dm2(im2 im2Var, Activity activity) {
        this.f7478a = activity;
    }

    @Override // com.daaw.hm2
    /* renamed from: a */
    public final void mo20624a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f7478a);
    }
}
