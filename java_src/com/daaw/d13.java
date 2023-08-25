package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class d13 implements f13 {

    /* renamed from: a */
    public final /* synthetic */ Activity f6362a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f6363b;

    public d13(g13 g13Var, Activity activity, Bundle bundle) {
        this.f6362a = activity;
        this.f6363b = bundle;
    }

    @Override // com.daaw.f13
    /* renamed from: a */
    public final void mo3006a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f6362a, this.f6363b);
    }
}
