package com.daaw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
/* loaded from: classes.dex */
public final class mq6 implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: s */
    public static final mq6 f19076s = new mq6();

    /* renamed from: p */
    public boolean f19077p;

    /* renamed from: q */
    public boolean f19078q;

    /* renamed from: r */
    public rq6 f19079r;

    /* renamed from: a */
    public static mq6 m15843a() {
        return f19076s;
    }

    /* renamed from: b */
    public final void m15842b() {
        this.f19077p = true;
        this.f19078q = false;
        m15839e();
    }

    /* renamed from: c */
    public final void m15841c() {
        this.f19077p = false;
        this.f19078q = false;
        this.f19079r = null;
    }

    /* renamed from: d */
    public final void m15840d(rq6 rq6Var) {
        this.f19079r = rq6Var;
    }

    /* renamed from: e */
    public final void m15839e() {
        boolean z = this.f19078q;
        for (xp6 xp6Var : lq6.m16667a().m16665c()) {
            xq6 m4831g = xp6Var.m4831g();
            if (m4831g.m4801k()) {
                qq6.m12283a().m12282b(m4831g.m4811a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: f */
    public final void m15838f(boolean z) {
        if (this.f19078q != z) {
            this.f19078q = z;
            if (this.f19077p) {
                m15839e();
                if (this.f19079r != null) {
                    if (!z) {
                        pr6.m13193d().m13188i();
                    } else {
                        pr6.m13193d().m13189h();
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m15838f(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View m4832f;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        boolean z2 = true;
        for (xp6 xp6Var : lq6.m16667a().m16666b()) {
            if (xp6Var.m4828j() && (m4832f = xp6Var.m4832f()) != null && m4832f.hasWindowFocus()) {
                z2 = false;
            }
        }
        m15838f((i == 100 || !z2) ? false : false);
    }
}
