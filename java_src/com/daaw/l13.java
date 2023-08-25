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

    /* renamed from: p */
    public Activity f16948p;

    /* renamed from: q */
    public Context f16949q;

    /* renamed from: w */
    public Runnable f16955w;

    /* renamed from: y */
    public long f16957y;

    /* renamed from: r */
    public final Object f16950r = new Object();

    /* renamed from: s */
    public boolean f16951s = true;

    /* renamed from: t */
    public boolean f16952t = false;
    @GuardedBy("lock")

    /* renamed from: u */
    public final List f16953u = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: v */
    public final List f16954v = new ArrayList();

    /* renamed from: x */
    public boolean f16956x = false;

    /* renamed from: a */
    public final Activity m17221a() {
        return this.f16948p;
    }

    /* renamed from: b */
    public final Context m17220b() {
        return this.f16949q;
    }

    /* renamed from: f */
    public final void m17216f(m13 m13Var) {
        synchronized (this.f16950r) {
            this.f16953u.add(m13Var);
        }
    }

    /* renamed from: g */
    public final void m17215g(Application application, Context context) {
        if (this.f16956x) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            m17211k((Activity) context);
        }
        this.f16949q = application;
        this.f16957y = ((Long) zzba.zzc().m23658b(g93.f10482M0)).longValue();
        this.f16956x = true;
    }

    /* renamed from: h */
    public final void m17214h(m13 m13Var) {
        synchronized (this.f16950r) {
            this.f16953u.remove(m13Var);
        }
    }

    /* renamed from: k */
    public final void m17211k(Activity activity) {
        synchronized (this.f16950r) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.f16948p = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f16950r) {
            Activity activity2 = this.f16948p;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f16948p = null;
                }
                Iterator it = this.f16954v.iterator();
                while (it.hasNext()) {
                    try {
                        if (((d23) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzt.zzo().m11902u(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        k04.zzh("", e);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m17211k(activity);
        synchronized (this.f16950r) {
            for (d23 d23Var : this.f16954v) {
                try {
                    d23Var.zzb();
                } catch (Exception e) {
                    zzt.zzo().m11902u(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    k04.zzh("", e);
                }
            }
        }
        this.f16952t = true;
        Runnable runnable = this.f16955w;
        if (runnable != null) {
            zzs.zza.removeCallbacks(runnable);
        }
        gv6 gv6Var = zzs.zza;
        k13 k13Var = new k13(this);
        this.f16955w = k13Var;
        gv6Var.postDelayed(k13Var, this.f16957y);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m17211k(activity);
        this.f16952t = false;
        boolean z = !this.f16951s;
        this.f16951s = true;
        Runnable runnable = this.f16955w;
        if (runnable != null) {
            zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.f16950r) {
            for (d23 d23Var : this.f16954v) {
                try {
                    d23Var.zzc();
                } catch (Exception e) {
                    zzt.zzo().m11902u(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    k04.zzh("", e);
                }
            }
            if (z) {
                for (m13 m13Var : this.f16953u) {
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
        m17211k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
