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

    /* renamed from: d */
    public final AlarmManager f16088d;

    /* renamed from: e */
    public hl2 f16089e;

    /* renamed from: f */
    public Integer f16090f;

    public ka8(yb8 yb8Var) {
        super(yb8Var);
        this.f16088d = (AlarmManager) this.f25143a.mo3905d().getSystemService("alarm");
    }

    @Override // com.daaw.pa8
    /* renamed from: k */
    public final boolean mo8149k() {
        AlarmManager alarmManager = this.f16088d;
        if (alarmManager != null) {
            alarmManager.cancel(m17848o());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m17846q();
            return false;
        }
        return false;
    }

    /* renamed from: l */
    public final void m17851l() {
        m13533g();
        this.f25143a.mo3895i().m14156v().m20653a("Unscheduling upload");
        AlarmManager alarmManager = this.f16088d;
        if (alarmManager != null) {
            alarmManager.cancel(m17848o());
        }
        m17847p().m20638b();
        if (Build.VERSION.SDK_INT >= 24) {
            m17846q();
        }
    }

    /* renamed from: m */
    public final void m17850m(long j) {
        m13533g();
        this.f25143a.mo3911a();
        Context mo3905d = this.f25143a.mo3905d();
        if (!dd8.m24490Y(mo3905d)) {
            this.f25143a.mo3895i().m14161p().m20653a("Receiver not registered/enabled");
        }
        if (!dd8.m24489Z(mo3905d, false)) {
            this.f25143a.mo3895i().m14161p().m20653a("Service not registered/enabled");
        }
        m17851l();
        this.f25143a.mo3895i().m14156v().m20652b("Scheduling upload, millis", Long.valueOf(j));
        long mo15859b = this.f25143a.mo3909b().mo15859b() + j;
        this.f25143a.m24020z();
        if (j < Math.max(0L, ((Long) m75.f18566y.m18786a(null)).longValue()) && !m17847p().m20636e()) {
            m17847p().m20637d(j);
        }
        this.f25143a.mo3911a();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f16088d;
            if (alarmManager != null) {
                this.f25143a.m24020z();
                alarmManager.setInexactRepeating(2, mo15859b, Math.max(((Long) m75.f18557t.m18786a(null)).longValue(), j), m17848o());
                return;
            }
            return;
        }
        Context mo3905d2 = this.f25143a.mo3905d();
        ComponentName componentName = new ComponentName(mo3905d2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m17849n = m17849n();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        yj3.m3649a(mo3905d2, new JobInfo.Builder(m17849n, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* renamed from: n */
    public final int m17849n() {
        if (this.f16090f == null) {
            this.f16090f = Integer.valueOf("measurement".concat(String.valueOf(this.f25143a.mo3905d().getPackageName())).hashCode());
        }
        return this.f16090f.intValue();
    }

    /* renamed from: o */
    public final PendingIntent m17848o() {
        Context mo3905d = this.f25143a.mo3905d();
        return PendingIntent.getBroadcast(mo3905d, 0, new Intent().setClassName(mo3905d, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), xi3.f32746a);
    }

    /* renamed from: p */
    public final hl2 m17847p() {
        if (this.f16089e == null) {
            this.f16089e = new ha8(this, this.f19771b.m3906c0());
        }
        return this.f16089e;
    }

    @TargetApi(24)
    /* renamed from: q */
    public final void m17846q() {
        JobScheduler jobScheduler = (JobScheduler) this.f25143a.mo3905d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m17849n());
        }
    }
}
