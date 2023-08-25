package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class gm2 implements hm2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f11440a;

    public gm2(im2 im2Var, Activity activity) {
        this.f11440a = activity;
    }

    @Override // com.daaw.hm2
    /* renamed from: a */
    public final void mo20624a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f11440a);
    }
}
