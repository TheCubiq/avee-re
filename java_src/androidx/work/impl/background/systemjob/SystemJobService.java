package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.daaw.InterfaceC3778yy;
import com.daaw.ey1;
import com.daaw.ll0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC3778yy {

    /* renamed from: r */
    public static final String f2533r = ll0.m16883f("SystemJobService");

    /* renamed from: p */
    public ey1 f2534p;

    /* renamed from: q */
    public final Map<String, JobParameters> f2535q = new HashMap();

    /* renamed from: a */
    public static String m27899a(JobParameters jobParameters) {
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

    @Override // com.daaw.InterfaceC3778yy
    /* renamed from: c */
    public void mo3085c(String str, boolean z) {
        JobParameters remove;
        ll0.m16885c().mo16882a(f2533r, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f2535q) {
            remove = this.f2535q.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            ey1 m23004k = ey1.m23004k(getApplicationContext());
            this.f2534p = m23004k;
            m23004k.m23002m().m18158d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            ll0.m16885c().mo16878h(f2533r, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ey1 ey1Var = this.f2534p;
        if (ey1Var != null) {
            ey1Var.m23002m().m18153i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f2534p == null) {
            ll0.m16885c().mo16882a(f2533r, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String m27899a = m27899a(jobParameters);
        if (TextUtils.isEmpty(m27899a)) {
            ll0.m16885c().mo16881b(f2533r, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f2535q) {
            if (this.f2535q.containsKey(m27899a)) {
                ll0.m16885c().mo16882a(f2533r, String.format("Job is already being executed by SystemJobService: %s", m27899a), new Throwable[0]);
                return false;
            }
            ll0.m16885c().mo16882a(f2533r, String.format("onStartJob for %s", m27899a), new Throwable[0]);
            this.f2535q.put(m27899a, jobParameters);
            WorkerParameters.C0506a c0506a = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                c0506a = new WorkerParameters.C0506a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    c0506a.f2437b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    c0506a.f2436a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    c0506a.f2438c = jobParameters.getNetwork();
                }
            }
            this.f2534p.m22993v(m27899a, c0506a);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f2534p == null) {
            ll0.m16885c().mo16882a(f2533r, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String m27899a = m27899a(jobParameters);
        if (TextUtils.isEmpty(m27899a)) {
            ll0.m16885c().mo16881b(f2533r, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        ll0.m16885c().mo16882a(f2533r, String.format("onStopJob for %s", m27899a), new Throwable[0]);
        synchronized (this.f2535q) {
            this.f2535q.remove(m27899a);
        }
        this.f2534p.m22991x(m27899a);
        return !this.f2534p.m23002m().m18156f(m27899a);
    }
}
