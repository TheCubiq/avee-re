package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.FragmentC0358i;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class oj0 {

    /* renamed from: a */
    public static AtomicBoolean f21577a = new AtomicBoolean(false);

    /* renamed from: com.daaw.oj0$a */
    /* loaded from: classes.dex */
    public static class C2444a extends C2124lw {
        @Override // com.daaw.C2124lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC0358i.m29009g(activity);
        }

        @Override // com.daaw.C2124lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // com.daaw.C2124lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m14257a(Context context) {
        if (f21577a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2444a());
    }
}
