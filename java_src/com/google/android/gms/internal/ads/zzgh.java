package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgh implements Application.ActivityLifecycleCallbacks {
    private Activity mActivity;
    private Context mContext;
    private Runnable zzahv;
    private long zzahw;
    private final Object mLock = new Object();
    private boolean zzahr = true;
    private boolean zzahs = false;
    private final List<zzgj> zzaht = new ArrayList();
    private final List<zzgw> zzahu = new ArrayList();
    private boolean zzzv = false;

    private final void setActivity(Activity activity) {
        synchronized (this.mLock) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.mActivity = activity;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzgh zzghVar, boolean z) {
        zzghVar.zzahr = false;
        return false;
    }

    public final Activity getActivity() {
        return this.mActivity;
    }

    public final Context getContext() {
        return this.mContext;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.mLock) {
            if (this.mActivity == null) {
                return;
            }
            if (this.mActivity.equals(activity)) {
                this.mActivity = null;
            }
            Iterator<zzgw> it = this.zzahu.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().zza(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzane.zzb("", e);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.mLock) {
            for (zzgw zzgwVar : this.zzahu) {
                try {
                    zzgwVar.onActivityPaused(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzane.zzb("", e);
                }
            }
        }
        this.zzahs = true;
        if (this.zzahv != null) {
            zzakk.zzcrm.removeCallbacks(this.zzahv);
        }
        Handler handler = zzakk.zzcrm;
        zzgi zzgiVar = new zzgi(this);
        this.zzahv = zzgiVar;
        handler.postDelayed(zzgiVar, this.zzahw);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzahs = false;
        boolean z = !this.zzahr;
        this.zzahr = true;
        if (this.zzahv != null) {
            zzakk.zzcrm.removeCallbacks(this.zzahv);
        }
        synchronized (this.mLock) {
            for (zzgw zzgwVar : this.zzahu) {
                try {
                    zzgwVar.onActivityResumed(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzane.zzb("", e);
                }
            }
            if (z) {
                for (zzgj zzgjVar : this.zzaht) {
                    try {
                        zzgjVar.zzh(true);
                    } catch (Exception e2) {
                        zzane.zzb("", e2);
                    }
                }
            } else {
                zzakb.zzck("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzzv) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            setActivity((Activity) context);
        }
        this.mContext = application;
        this.zzahw = ((Long) zzkb.zzik().zzd(zznk.zzayh)).longValue();
        this.zzzv = true;
    }

    public final void zza(zzgj zzgjVar) {
        synchronized (this.mLock) {
            this.zzaht.add(zzgjVar);
        }
    }
}
