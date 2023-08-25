package com.daaw;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
/* loaded from: classes.dex */
public class ph0 implements py1 {
    public final Context a;
    public final ly b;
    public final s81 c;

    public ph0(Context context, ly lyVar, s81 s81Var) {
        this.a = context;
        this.b = lyVar;
        this.c = s81Var;
    }

    @Override // com.daaw.py1
    public void a(sn1 sn1Var, int i) {
        b(sn1Var, i, false);
    }

    @Override // com.daaw.py1
    public void b(sn1 sn1Var, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int c = c(sn1Var);
        if (!z && d(jobScheduler, c, i)) {
            nl0.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sn1Var);
            return;
        }
        long J = this.b.J(sn1Var);
        JobInfo.Builder c2 = this.c.c(new JobInfo.Builder(c, componentName), sn1Var.d(), J, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", sn1Var.b());
        persistableBundle.putInt("priority", fz0.a(sn1Var.d()));
        if (sn1Var.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(sn1Var.c(), 0));
        }
        c2.setExtras(persistableBundle);
        nl0.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", sn1Var, Integer.valueOf(c), Long.valueOf(this.c.g(sn1Var.d(), J, i)), Long.valueOf(J), Integer.valueOf(i));
        jobScheduler.schedule(c2.build());
    }

    public int c(sn1 sn1Var) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sn1Var.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(fz0.a(sn1Var.d())).array());
        if (sn1Var.c() != null) {
            adler32.update(sn1Var.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
