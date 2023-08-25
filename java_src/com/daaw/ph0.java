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

    /* renamed from: a */
    public final Context f22931a;

    /* renamed from: b */
    public final InterfaceC2134ly f22932b;

    /* renamed from: c */
    public final s81 f22933c;

    public ph0(Context context, InterfaceC2134ly interfaceC2134ly, s81 s81Var) {
        this.f22931a = context;
        this.f22932b = interfaceC2134ly;
        this.f22933c = s81Var;
    }

    @Override // com.daaw.py1
    /* renamed from: a */
    public void mo7556a(sn1 sn1Var, int i) {
        mo7555b(sn1Var, i, false);
    }

    @Override // com.daaw.py1
    /* renamed from: b */
    public void mo7555b(sn1 sn1Var, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f22931a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f22931a.getSystemService("jobscheduler");
        int m13388c = m13388c(sn1Var);
        if (!z && m13387d(jobScheduler, m13388c, i)) {
            nl0.m15088b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sn1Var);
            return;
        }
        long mo11674J = this.f22932b.mo11674J(sn1Var);
        JobInfo.Builder m10547c = this.f22933c.m10547c(new JobInfo.Builder(m13388c, componentName), sn1Var.mo6334d(), mo11674J, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", sn1Var.mo6336b());
        persistableBundle.putInt("priority", fz0.m22132a(sn1Var.mo6334d()));
        if (sn1Var.mo6335c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(sn1Var.mo6335c(), 0));
        }
        m10547c.setExtras(persistableBundle);
        nl0.m15087c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", sn1Var, Integer.valueOf(m13388c), Long.valueOf(this.f22933c.m10543g(sn1Var.mo6334d(), mo11674J, i)), Long.valueOf(mo11674J), Integer.valueOf(i));
        jobScheduler.schedule(m10547c.build());
    }

    /* renamed from: c */
    public int m13388c(sn1 sn1Var) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f22931a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sn1Var.mo6336b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(fz0.m22132a(sn1Var.mo6334d())).array());
        if (sn1Var.mo6335c() != null) {
            adler32.update(sn1Var.mo6335c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean m13387d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
