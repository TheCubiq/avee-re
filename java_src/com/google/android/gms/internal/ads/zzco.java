package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes2.dex */
final class zzco implements zzcv {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzrn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(zzcn zzcnVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzrn = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzrn);
    }
}
