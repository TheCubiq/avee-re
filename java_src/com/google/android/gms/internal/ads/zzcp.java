package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes2.dex */
final class zzcp implements zzcv {
    private final /* synthetic */ Activity val$activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcp(zzcn zzcnVar, Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.val$activity);
    }
}
