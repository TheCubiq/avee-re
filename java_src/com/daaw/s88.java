package com.daaw;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes2.dex */
public final class s88 {
    public final Context a;

    public s88(Context context) {
        ry0.j(context);
        this.a = context;
    }

    public final int a(final Intent intent, int i, final int i2) {
        dr6 H = dr6.H(this.a, null, null);
        final om5 i3 = H.i();
        if (intent == null) {
            i3.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.a();
        i3.v().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.daaw.j88
                @Override // java.lang.Runnable
                public final void run() {
                    s88.this.c(i2, i3, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().q().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new ob7(yb8.f0(this.a), null);
        }
        k().w().b("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void c(int i, om5 om5Var, Intent intent) {
        if (((p88) this.a).b(i)) {
            om5Var.v().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            k().v().a("Completed wakeful intent.");
            ((p88) this.a).c(intent);
        }
    }

    public final /* synthetic */ void d(om5 om5Var, JobParameters jobParameters) {
        om5Var.v().a("AppMeasurementJobService processed last upload request.");
        ((p88) this.a).d(jobParameters, false);
    }

    public final void e() {
        dr6 H = dr6.H(this.a, null, null);
        om5 i = H.i();
        H.a();
        i.v().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        dr6 H = dr6.H(this.a, null, null);
        om5 i = H.i();
        H.a();
        i.v().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().q().a("onRebind called with null intent");
            return;
        }
        k().v().b("onRebind called. action", intent.getAction());
    }

    public final void h(Runnable runnable) {
        yb8 f0 = yb8.f0(this.a);
        f0.r().z(new m88(this, f0, runnable));
    }

    @TargetApi(24)
    public final boolean i(final JobParameters jobParameters) {
        dr6 H = dr6.H(this.a, null, null);
        final om5 i = H.i();
        String string = jobParameters.getExtras().getString("action");
        H.a();
        i.v().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            h(new Runnable() { // from class: com.daaw.g88
                @Override // java.lang.Runnable
                public final void run() {
                    s88.this.d(i, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().q().a("onUnbind called with null intent");
            return true;
        }
        k().v().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final om5 k() {
        return dr6.H(this.a, null, null).i();
    }
}
