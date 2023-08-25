package com.daaw;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
/* loaded from: classes2.dex */
public final class ka8 extends pa8 {
    public final AlarmManager d;
    public hl2 e;
    public Integer f;

    public ka8(yb8 yb8Var) {
        super(yb8Var);
        this.d = (AlarmManager) this.a.d().getSystemService("alarm");
    }

    @Override // com.daaw.pa8
    public final boolean k() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(o());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            q();
            return false;
        }
        return false;
    }

    public final void l() {
        g();
        this.a.i().v().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(o());
        }
        p().b();
        if (Build.VERSION.SDK_INT >= 24) {
            q();
        }
    }

    public final void m(long j) {
        g();
        this.a.a();
        Context d = this.a.d();
        if (!dd8.Y(d)) {
            this.a.i().p().a("Receiver not registered/enabled");
        }
        if (!dd8.Z(d, false)) {
            this.a.i().p().a("Service not registered/enabled");
        }
        l();
        this.a.i().v().b("Scheduling upload, millis", Long.valueOf(j));
        long b = this.a.b().b() + j;
        this.a.z();
        if (j < Math.max(0L, ((Long) m75.y.a(null)).longValue()) && !p().e()) {
            p().d(j);
        }
        this.a.a();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.d;
            if (alarmManager != null) {
                this.a.z();
                alarmManager.setInexactRepeating(2, b, Math.max(((Long) m75.t.a(null)).longValue(), j), o());
                return;
            }
            return;
        }
        Context d2 = this.a.d();
        ComponentName componentName = new ComponentName(d2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int n = n();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        yj3.a(d2, new JobInfo.Builder(n, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final int n() {
        if (this.f == null) {
            this.f = Integer.valueOf("measurement".concat(String.valueOf(this.a.d().getPackageName())).hashCode());
        }
        return this.f.intValue();
    }

    public final PendingIntent o() {
        Context d = this.a.d();
        return PendingIntent.getBroadcast(d, 0, new Intent().setClassName(d, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), xi3.a);
    }

    public final hl2 p() {
        if (this.e == null) {
            this.e = new ha8(this, this.b.c0());
        }
        return this.e;
    }

    @TargetApi(24)
    public final void q() {
        JobScheduler jobScheduler = (JobScheduler) this.a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(n());
        }
    }
}
