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
    public s88 p;

    public final s88 a() {
        if (this.p == null) {
            this.p = new s88(this);
        }
        return this.p;
    }

    @Override // com.daaw.p88
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.p88
    public final void c(Intent intent) {
    }

    @Override // com.daaw.p88
    @TargetApi(24)
    public final void d(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        a().g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a().j(intent);
        return true;
    }
}
