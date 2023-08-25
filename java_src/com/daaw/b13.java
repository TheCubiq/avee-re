package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class b13 implements f13 {

    /* renamed from: a */
    public final /* synthetic */ Activity f4222a;

    public b13(g13 g13Var, Activity activity) {
        this.f4222a = activity;
    }

    @Override // com.daaw.f13
    /* renamed from: a */
    public final void mo3006a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f4222a);
    }
}
