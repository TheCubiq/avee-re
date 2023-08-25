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
    public static final mq6 s = new mq6();
    public boolean p;
    public boolean q;
    public rq6 r;

    public static mq6 a() {
        return s;
    }

    public final void b() {
        this.p = true;
        this.q = false;
        e();
    }

    public final void c() {
        this.p = false;
        this.q = false;
        this.r = null;
    }

    public final void d(rq6 rq6Var) {
        this.r = rq6Var;
    }

    public final void e() {
        boolean z = this.q;
        for (xp6 xp6Var : lq6.a().c()) {
            xq6 g = xp6Var.g();
            if (g.k()) {
                qq6.a().b(g.a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void f(boolean z) {
        if (this.q != z) {
            this.q = z;
            if (this.p) {
                e();
                if (this.r != null) {
                    if (!z) {
                        pr6.d().i();
                    } else {
                        pr6.d().h();
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
        f(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View f;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        boolean z2 = true;
        for (xp6 xp6Var : lq6.a().b()) {
            if (xp6Var.j() && (f = xp6Var.f()) != null && f.hasWindowFocus()) {
                z2 = false;
            }
        }
        f((i == 100 || !z2) ? false : false);
    }
}
