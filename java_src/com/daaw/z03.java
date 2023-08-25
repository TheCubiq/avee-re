package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class z03 implements f13 {

    /* renamed from: a */
    public final /* synthetic */ Activity f34304a;

    public z03(g13 g13Var, Activity activity) {
        this.f34304a = activity;
    }

    @Override // com.daaw.f13
    /* renamed from: a */
    public final void mo3006a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f34304a);
    }
}
