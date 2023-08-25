package com.daaw;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class cj1 implements r81 {
    public static final String t = ll0.f("SystemJobScheduler");
    public final Context p;
    public final JobScheduler q;
    public final ey1 r;
    public final bj1 s;

    public cj1(Context context, ey1 ey1Var) {
        this(context, ey1Var, (JobScheduler) context.getSystemService("jobscheduler"), new bj1(context));
    }

    public cj1(Context context, ey1 ey1Var, JobScheduler jobScheduler, bj1 bj1Var) {
        this.p = context;
        this.r = ey1Var;
        this.q = jobScheduler;
        this.s = bj1Var;
    }

    public static void b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g = g(context, jobScheduler)) == null || g.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g) {
            c(jobScheduler, jobInfo.getId());
        }
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ll0.c().b(t, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            ll0.c().b(t, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, ey1 ey1Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = g(context, jobScheduler);
        List<String> a = ey1Var.o().y().a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                String h = h(jobInfo);
                if (TextUtils.isEmpty(h)) {
                    c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(h);
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    ll0.c().a(t, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase o = ey1Var.o();
            o.c();
            try {
                ry1 B = o.B();
                for (String str : a) {
                    B.b(str, -1L);
                }
                o.r();
            } finally {
                o.g();
            }
        }
        return z;
    }

    @Override // com.daaw.r81
    public boolean a() {
        return true;
    }

    @Override // com.daaw.r81
    public void d(String str) {
        List<Integer> f = f(this.p, this.q, str);
        if (f == null || f.isEmpty()) {
            return;
        }
        for (Integer num : f) {
            c(this.q, num.intValue());
        }
        this.r.o().y().d(str);
    }

    @Override // com.daaw.r81
    public void e(qy1... qy1VarArr) {
        List<Integer> f;
        WorkDatabase o = this.r.o();
        te0 te0Var = new te0(o);
        for (qy1 qy1Var : qy1VarArr) {
            o.c();
            try {
                qy1 m = o.B().m(qy1Var.a);
                if (m == null) {
                    ll0.c().h(t, "Skipping scheduling " + qy1Var.a + " because it's no longer in the DB", new Throwable[0]);
                } else if (m.b != yx1.ENQUEUED) {
                    ll0.c().h(t, "Skipping scheduling " + qy1Var.a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    yi1 c = o.y().c(qy1Var.a);
                    int d = c != null ? c.b : te0Var.d(this.r.i().i(), this.r.i().g());
                    if (c == null) {
                        this.r.o().y().b(new yi1(qy1Var.a, d));
                    }
                    j(qy1Var, d);
                    if (Build.VERSION.SDK_INT == 23 && (f = f(this.p, this.q, qy1Var.a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(d));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        j(qy1Var, !f.isEmpty() ? f.get(0).intValue() : te0Var.d(this.r.i().i(), this.r.i().g()));
                    }
                }
                o.r();
                o.g();
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
    }

    public void j(qy1 qy1Var, int i) {
        JobInfo a = this.s.a(qy1Var, i);
        ll0 c = ll0.c();
        String str = t;
        c.a(str, String.format("Scheduling work ID %s Job ID %s", qy1Var.a, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.q.schedule(a) == 0) {
                ll0.c().h(str, String.format("Unable to schedule work ID %s", qy1Var.a), new Throwable[0]);
                if (qy1Var.q && qy1Var.r == zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    qy1Var.q = false;
                    ll0.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", qy1Var.a), new Throwable[0]);
                    j(qy1Var, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = g(this.p, this.q);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.r.o().B().f().size()), Integer.valueOf(this.r.i().h()));
            ll0.c().b(t, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            ll0.c().b(t, String.format("Unable to schedule %s", qy1Var), th);
        }
    }
}
