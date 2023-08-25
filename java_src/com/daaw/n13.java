package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n13 {

    /* renamed from: a */
    public final Object f19338a = new Object();
    @GuardedBy("activityTrackerLock")

    /* renamed from: b */
    public l13 f19339b = null;
    @GuardedBy("activityTrackerLock")

    /* renamed from: c */
    public boolean f19340c = false;

    /* renamed from: a */
    public final Activity m15600a() {
        synchronized (this.f19338a) {
            l13 l13Var = this.f19339b;
            if (l13Var != null) {
                return l13Var.m17221a();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final Context m15599b() {
        synchronized (this.f19338a) {
            l13 l13Var = this.f19339b;
            if (l13Var != null) {
                return l13Var.m17220b();
            }
            return null;
        }
    }

    /* renamed from: c */
    public final void m15598c(m13 m13Var) {
        synchronized (this.f19338a) {
            if (this.f19339b == null) {
                this.f19339b = new l13();
            }
            this.f19339b.m17216f(m13Var);
        }
    }

    /* renamed from: d */
    public final void m15597d(Context context) {
        synchronized (this.f19338a) {
            if (!this.f19340c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    k04.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.f19339b == null) {
                    this.f19339b = new l13();
                }
                this.f19339b.m17215g(application, context);
                this.f19340c = true;
            }
        }
    }

    /* renamed from: e */
    public final void m15596e(m13 m13Var) {
        synchronized (this.f19338a) {
            l13 l13Var = this.f19339b;
            if (l13Var == null) {
                return;
            }
            l13Var.m17214h(m13Var);
        }
    }
}
