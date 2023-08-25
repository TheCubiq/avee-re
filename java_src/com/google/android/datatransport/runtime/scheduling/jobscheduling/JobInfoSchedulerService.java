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
    /* renamed from: b */
    public /* synthetic */ void m1746b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        xn1.m4946f(getApplicationContext());
        sn1.AbstractC2958a mo6330d = sn1.m10151a().mo6332b(string).mo6330d(fz0.m22131b(i));
        if (string2 != null) {
            mo6330d.mo6331c(Base64.decode(string2, 0));
        }
        xn1.m4949c().m4947e().m23281v(mo6330d.mo6333a(), i2, new Runnable() { // from class: com.daaw.qh0
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m1746b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
