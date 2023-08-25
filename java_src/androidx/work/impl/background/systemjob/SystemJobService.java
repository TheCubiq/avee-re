package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.daaw.ey1;
import com.daaw.ll0;
import com.daaw.yy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements yy {
    public static final String r = ll0.f("SystemJobService");
    public ey1 p;
    public final Map<String, JobParameters> q = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.daaw.yy
    public void c(String str, boolean z) {
        JobParameters remove;
        ll0.c().a(r, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.q) {
            remove = this.q.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            ey1 k = ey1.k(getApplicationContext());
            this.p = k;
            k.m().d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            ll0.c().h(r, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ey1 ey1Var = this.p;
        if (ey1Var != null) {
            ey1Var.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.p == null) {
            ll0.c().a(r, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            ll0.c().b(r, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.q) {
            if (this.q.containsKey(a)) {
                ll0.c().a(r, String.format("Job is already being executed by SystemJobService: %s", a), new Throwable[0]);
                return false;
            }
            ll0.c().a(r, String.format("onStartJob for %s", a), new Throwable[0]);
            this.q.put(a, jobParameters);
            WorkerParameters.a aVar = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    aVar.c = jobParameters.getNetwork();
                }
            }
            this.p.v(a, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.p == null) {
            ll0.c().a(r, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            ll0.c().b(r, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        ll0.c().a(r, String.format("onStopJob for %s", a), new Throwable[0]);
        synchronized (this.q) {
            this.q.remove(a);
        }
        this.p.x(a);
        return !this.p.m().f(a);
    }
}
