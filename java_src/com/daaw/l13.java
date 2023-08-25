package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class l13 implements Application.ActivityLifecycleCallbacks {
    public Activity p;
    public Context q;
    public Runnable w;
    public long y;
    public final Object r = new Object();
    public boolean s = true;
    public boolean t = false;
    @GuardedBy("lock")
    public final List u = new ArrayList();
    @GuardedBy("lock")
    public final List v = new ArrayList();
    public boolean x = false;

    public final Activity a() {
        return this.p;
    }

    public final Context b() {
        return this.q;
    }

    public final void f(m13 m13Var) {
        synchronized (this.r) {
            this.u.add(m13Var);
        }
    }

    public final void g(Application application, Context context) {
        if (this.x) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.q = application;
        this.y = ((Long) zzba.zzc().b(g93.M0)).longValue();
        this.x = true;
    }

    public final void h(m13 m13Var) {
        synchronized (this.r) {
            this.u.remove(m13Var);
        }
    }

    public final void k(Activity activity) {
        synchronized (this.r) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.p = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.r) {
            Activity activity2 = this.p;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.p = null;
                }
                Iterator it = this.v.iterator();
                while (it.hasNext()) {
                    try {
                        if (((d23) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzt.zzo().u(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        k04.zzh("", e);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.r) {
            for (d23 d23Var : this.v) {
                try {
                    d23Var.zzb();
                } catch (Exception e) {
                    zzt.zzo().u(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    k04.zzh("", e);
                }
            }
        }
        this.t = true;
        Runnable runnable = this.w;
        if (runnable != null) {
            zzs.zza.removeCallbacks(runnable);
        }
        gv6 gv6Var = zzs.zza;
        k13 k13Var = new k13(this);
        this.w = k13Var;
        gv6Var.postDelayed(k13Var, this.y);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.t = false;
        boolean z = !this.s;
        this.s = true;
        Runnable runnable = this.w;
        if (runnable != null) {
            zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.r) {
            for (d23 d23Var : this.v) {
                try {
                    d23Var.zzc();
                } catch (Exception e) {
                    zzt.zzo().u(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    k04.zzh("", e);
                }
            }
            if (z) {
                for (m13 m13Var : this.u) {
                    try {
                        m13Var.zza(true);
                    } catch (Exception e2) {
                        k04.zzh("", e2);
                    }
                }
            } else {
                k04.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
