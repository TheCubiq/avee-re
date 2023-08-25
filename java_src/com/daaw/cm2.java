package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class cm2 implements hm2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f5953a;

    public cm2(im2 im2Var, Activity activity) {
        this.f5953a = activity;
    }

    @Override // com.daaw.hm2
    /* renamed from: a */
    public final void mo20624a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f5953a);
    }
}
