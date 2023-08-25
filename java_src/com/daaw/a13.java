package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class a13 implements f13 {

    /* renamed from: a */
    public final /* synthetic */ Activity f2694a;

    public a13(g13 g13Var, Activity activity) {
        this.f2694a = activity;
    }

    @Override // com.daaw.f13
    /* renamed from: a */
    public final void mo3006a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f2694a);
    }
}
