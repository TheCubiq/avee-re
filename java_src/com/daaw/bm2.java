package com.daaw;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public final class bm2 implements hm2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f4958a;

    public bm2(im2 im2Var, Activity activity) {
        this.f4958a = activity;
    }

    @Override // com.daaw.hm2
    /* renamed from: a */
    public final void mo20624a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f4958a);
    }
}
