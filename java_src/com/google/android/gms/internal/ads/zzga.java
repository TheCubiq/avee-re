package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes2.dex */
final class zzga implements zzgc {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzrn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzga(zzfu zzfuVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzrn = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.val$activity, this.zzrn);
    }
}
