package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.daaw.p88;
import com.daaw.s88;
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements p88 {

    /* renamed from: p */
    public s88 f37051p;

    /* renamed from: a */
    public final s88 m1086a() {
        if (this.f37051p == null) {
            this.f37051p = new s88(this);
        }
        return this.f37051p;
    }

    @Override // com.daaw.p88
    /* renamed from: b */
    public final boolean mo1083b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.p88
    /* renamed from: c */
    public final void mo1082c(Intent intent) {
    }

    @Override // com.daaw.p88
    @TargetApi(24)
    /* renamed from: d */
    public final void mo1081d(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m1086a().m10522e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m1086a().m10521f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m1086a().m10520g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m1086a().m10518i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m1086a().m10517j(intent);
        return true;
    }
}
