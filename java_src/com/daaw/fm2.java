package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class fm2 implements hm2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f9682a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f9683b;

    public fm2(im2 im2Var, Activity activity, Bundle bundle) {
        this.f9682a = activity;
        this.f9683b = bundle;
    }

    @Override // com.daaw.hm2
    /* renamed from: a */
    public final void mo20624a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f9682a, this.f9683b);
    }
}
