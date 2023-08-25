package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class e13 implements f13 {

    /* renamed from: a */
    public final /* synthetic */ Activity f8026a;

    public e13(g13 g13Var, Activity activity) {
        this.f8026a = activity;
    }

    @Override // com.daaw.f13
    /* renamed from: a */
    public final void mo3006a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f8026a);
    }
}
