package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class am2 implements hm2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f3311a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f3312b;

    public am2(im2 im2Var, Activity activity, Bundle bundle) {
        this.f3311a = activity;
        this.f3312b = bundle;
    }

    @Override // com.daaw.hm2
    /* renamed from: a */
    public final void mo20624a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f3311a, this.f3312b);
    }
}
