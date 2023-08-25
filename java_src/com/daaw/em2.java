package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class em2 implements hm2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f8573a;

    public em2(im2 im2Var, Activity activity) {
        this.f8573a = activity;
    }

    @Override // com.daaw.hm2
    /* renamed from: a */
    public final void mo20624a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f8573a);
    }
}
