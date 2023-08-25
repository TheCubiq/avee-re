package com.daaw;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes2.dex */
public final class s88 {

    /* renamed from: a */
    public final Context f26005a;

    public s88(Context context) {
        ry0.m10830j(context);
        this.f26005a = context;
    }

    /* renamed from: a */
    public final int m10526a(final Intent intent, int i, final int i2) {
        dr6 m24051H = dr6.m24051H(this.f26005a, null, null);
        final om5 mo3895i = m24051H.mo3895i();
        if (intent == null) {
            mo3895i.m14155w().m20653a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m24051H.mo3911a();
        mo3895i.m14156v().m20651c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m10519h(new Runnable() { // from class: com.daaw.j88
                @Override // java.lang.Runnable
                public final void run() {
                    s88.this.m10524c(i2, mo3895i, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m10525b(Intent intent) {
        if (intent == null) {
            m10516k().m14160q().m20653a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new ob7(yb8.m3900f0(this.f26005a), null);
        }
        m10516k().m14155w().m20652b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ void m10524c(int i, om5 om5Var, Intent intent) {
        if (((p88) this.f26005a).mo1083b(i)) {
            om5Var.m14156v().m20652b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m10516k().m14156v().m20653a("Completed wakeful intent.");
            ((p88) this.f26005a).mo1082c(intent);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m10523d(om5 om5Var, JobParameters jobParameters) {
        om5Var.m14156v().m20653a("AppMeasurementJobService processed last upload request.");
        ((p88) this.f26005a).mo1081d(jobParameters, false);
    }

    /* renamed from: e */
    public final void m10522e() {
        dr6 m24051H = dr6.m24051H(this.f26005a, null, null);
        om5 mo3895i = m24051H.mo3895i();
        m24051H.mo3911a();
        mo3895i.m14156v().m20653a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void m10521f() {
        dr6 m24051H = dr6.m24051H(this.f26005a, null, null);
        om5 mo3895i = m24051H.mo3895i();
        m24051H.mo3911a();
        mo3895i.m14156v().m20653a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void m10520g(Intent intent) {
        if (intent == null) {
            m10516k().m14160q().m20653a("onRebind called with null intent");
            return;
        }
        m10516k().m14156v().m20652b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void m10519h(Runnable runnable) {
        yb8 m3900f0 = yb8.m3900f0(this.f26005a);
        m3900f0.mo3882r().m6978z(new m88(this, m3900f0, runnable));
    }

    @TargetApi(24)
    /* renamed from: i */
    public final boolean m10518i(final JobParameters jobParameters) {
        dr6 m24051H = dr6.m24051H(this.f26005a, null, null);
        final om5 mo3895i = m24051H.mo3895i();
        String string = jobParameters.getExtras().getString("action");
        m24051H.mo3911a();
        mo3895i.m14156v().m20652b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m10519h(new Runnable() { // from class: com.daaw.g88
                @Override // java.lang.Runnable
                public final void run() {
                    s88.this.m10523d(mo3895i, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m10517j(Intent intent) {
        if (intent == null) {
            m10516k().m14160q().m20653a("onUnbind called with null intent");
            return true;
        }
        m10516k().m14156v().m20652b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: k */
    public final om5 m10516k() {
        return dr6.m24051H(this.f26005a, null, null).mo3895i();
    }
}
