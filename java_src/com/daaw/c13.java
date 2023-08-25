package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class c13 implements f13 {

    /* renamed from: a */
    public final /* synthetic */ Activity f5371a;

    public c13(g13 g13Var, Activity activity) {
        this.f5371a = activity;
    }

    @Override // com.daaw.f13
    /* renamed from: a */
    public final void mo3006a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f5371a);
    }
}
