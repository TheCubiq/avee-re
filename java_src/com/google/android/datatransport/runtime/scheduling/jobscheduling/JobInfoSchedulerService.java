package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.daaw.fz0;
import com.daaw.sn1;
import com.daaw.xn1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        xn1.f(getApplicationContext());
        sn1.a d = sn1.a().b(string).d(fz0.b(i));
        if (string2 != null) {
            d.c(Base64.decode(string2, 0));
        }
        xn1.c().e().v(d.a(), i2, new Runnable() { // from class: com.daaw.qh0
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
