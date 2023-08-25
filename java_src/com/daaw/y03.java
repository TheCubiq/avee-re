package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class y03 implements f13 {

    /* renamed from: a */
    public final /* synthetic */ Activity f33198a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f33199b;

    public y03(g13 g13Var, Activity activity, Bundle bundle) {
        this.f33198a = activity;
        this.f33199b = bundle;
    }

    @Override // com.daaw.f13
    /* renamed from: a */
    public final void mo3006a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f33198a, this.f33199b);
    }
}
