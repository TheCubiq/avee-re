package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n13 {
    public final Object a = new Object();
    @GuardedBy("activityTrackerLock")
    public l13 b = null;
    @GuardedBy("activityTrackerLock")
    public boolean c = false;

    public final Activity a() {
        synchronized (this.a) {
            l13 l13Var = this.b;
            if (l13Var != null) {
                return l13Var.a();
            }
            return null;
        }
    }

    public final Context b() {
        synchronized (this.a) {
            l13 l13Var = this.b;
            if (l13Var != null) {
                return l13Var.b();
            }
            return null;
        }
    }

    public final void c(m13 m13Var) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new l13();
            }
            this.b.f(m13Var);
        }
    }

    public final void d(Context context) {
        synchronized (this.a) {
            if (!this.c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    k04.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.b == null) {
                    this.b = new l13();
                }
                this.b.g(application, context);
                this.c = true;
            }
        }
    }

    public final void e(m13 m13Var) {
        synchronized (this.a) {
            l13 l13Var = this.b;
            if (l13Var == null) {
                return;
            }
            l13Var.h(m13Var);
        }
    }
}
