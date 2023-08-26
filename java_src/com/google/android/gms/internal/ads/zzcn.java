package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
final class zzcn implements Application.ActivityLifecycleCallbacks {
    private final Application zzrk;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzrl;
    private boolean zzrm = false;

    public zzcn(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzrl = new WeakReference<>(activityLifecycleCallbacks);
        this.zzrk = application;
    }

    private final void zza(zzcv zzcvVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.zzrl.get();
            if (activityLifecycleCallbacks != null) {
                zzcvVar.zza(activityLifecycleCallbacks);
            } else if (this.zzrm) {
            } else {
                this.zzrk.unregisterActivityLifecycleCallbacks(this);
                this.zzrm = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzco(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzcu(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzcr(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzcq(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzct(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzcp(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzcs(this, activity));
    }
}
