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

    /* renamed from: t */
    public static final String f5826t = ll0.m16883f("SystemJobScheduler");

    /* renamed from: p */
    public final Context f5827p;

    /* renamed from: q */
    public final JobScheduler f5828q;

    /* renamed from: r */
    public final ey1 f5829r;

    /* renamed from: s */
    public final bj1 f5830s;

    public cj1(Context context, ey1 ey1Var) {
        this(context, ey1Var, (JobScheduler) context.getSystemService("jobscheduler"), new bj1(context));
    }

    public cj1(Context context, ey1 ey1Var, JobScheduler jobScheduler, bj1 bj1Var) {
        this.f5827p = context;
        this.f5829r = ey1Var;
        this.f5828q = jobScheduler;
        this.f5830s = bj1Var;
    }

    /* renamed from: b */
    public static void m25362b(Context context) {
        List<JobInfo> m25359g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (m25359g = m25359g(context, jobScheduler)) == null || m25359g.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : m25359g) {
            m25361c(jobScheduler, jobInfo.getId());
        }
    }

    /* renamed from: c */
    public static void m25361c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ll0.m16885c().mo16881b(f5826t, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* renamed from: f */
    public static List<Integer> m25360f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m25359g = m25359g(context, jobScheduler);
        if (m25359g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m25359g) {
            if (str.equals(m25358h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<JobInfo> m25359g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            ll0.m16885c().mo16881b(f5826t, "getAllPendingJobs() is not reliable on this device.", th);
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

    /* renamed from: h */
    public static String m25358h(JobInfo jobInfo) {
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

    /* renamed from: i */
    public static boolean m25357i(Context context, ey1 ey1Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m25359g = m25359g(context, jobScheduler);
        List<String> mo2279a = ey1Var.m23000o().mo27936y().mo2279a();
        boolean z = false;
        HashSet hashSet = new HashSet(m25359g != null ? m25359g.size() : 0);
        if (m25359g != null && !m25359g.isEmpty()) {
            for (JobInfo jobInfo : m25359g) {
                String m25358h = m25358h(jobInfo);
                if (TextUtils.isEmpty(m25358h)) {
                    m25361c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(m25358h);
                }
            }
        }
        Iterator<String> it = mo2279a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    ll0.m16885c().mo16882a(f5826t, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase m23000o = ey1Var.m23000o();
            m23000o.m26481c();
            try {
                ry1 mo27951B = m23000o.mo27951B();
                for (String str : mo2279a) {
                    mo27951B.mo9730b(str, -1L);
                }
                m23000o.m26466r();
            } finally {
                m23000o.m26477g();
            }
        }
        return z;
    }

    @Override // com.daaw.r81
    /* renamed from: a */
    public boolean mo9090a() {
        return true;
    }

    @Override // com.daaw.r81
    /* renamed from: d */
    public void mo9088d(String str) {
        List<Integer> m25360f = m25360f(this.f5827p, this.f5828q, str);
        if (m25360f == null || m25360f.isEmpty()) {
            return;
        }
        for (Integer num : m25360f) {
            m25361c(this.f5828q, num.intValue());
        }
        this.f5829r.m23000o().mo27936y().mo2276d(str);
    }

    @Override // com.daaw.r81
    /* renamed from: e */
    public void mo9087e(qy1... qy1VarArr) {
        List<Integer> m25360f;
        WorkDatabase m23000o = this.f5829r.m23000o();
        te0 te0Var = new te0(m23000o);
        for (qy1 qy1Var : qy1VarArr) {
            m23000o.m26481c();
            try {
                qy1 mo9719m = m23000o.mo27951B().mo9719m(qy1Var.f24624a);
                if (mo9719m == null) {
                    ll0.m16885c().mo16878h(f5826t, "Skipping scheduling " + qy1Var.f24624a + " because it's no longer in the DB", new Throwable[0]);
                } else if (mo9719m.f24625b != yx1.ENQUEUED) {
                    ll0.m16885c().mo16878h(f5826t, "Skipping scheduling " + qy1Var.f24624a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    yi1 mo2277c = m23000o.mo27936y().mo2277c(qy1Var.f24624a);
                    int m9234d = mo2277c != null ? mo2277c.f33688b : te0Var.m9234d(this.f5829r.m23006i().m27979i(), this.f5829r.m23006i().m27981g());
                    if (mo2277c == null) {
                        this.f5829r.m23000o().mo27936y().mo2278b(new yi1(qy1Var.f24624a, m9234d));
                    }
                    m25356j(qy1Var, m9234d);
                    if (Build.VERSION.SDK_INT == 23 && (m25360f = m25360f(this.f5827p, this.f5828q, qy1Var.f24624a)) != null) {
                        int indexOf = m25360f.indexOf(Integer.valueOf(m9234d));
                        if (indexOf >= 0) {
                            m25360f.remove(indexOf);
                        }
                        m25356j(qy1Var, !m25360f.isEmpty() ? m25360f.get(0).intValue() : te0Var.m9234d(this.f5829r.m23006i().m27979i(), this.f5829r.m23006i().m27981g()));
                    }
                }
                m23000o.m26466r();
                m23000o.m26477g();
            } catch (Throwable th) {
                m23000o.m26477g();
                throw th;
            }
        }
    }

    /* renamed from: j */
    public void m25356j(qy1 qy1Var, int i) {
        JobInfo m26128a = this.f5830s.m26128a(qy1Var, i);
        ll0 m16885c = ll0.m16885c();
        String str = f5826t;
        m16885c.mo16882a(str, String.format("Scheduling work ID %s Job ID %s", qy1Var.f24624a, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.f5828q.schedule(m26128a) == 0) {
                ll0.m16885c().mo16878h(str, String.format("Unable to schedule work ID %s", qy1Var.f24624a), new Throwable[0]);
                if (qy1Var.f24640q && qy1Var.f24641r == zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    qy1Var.f24640q = false;
                    ll0.m16885c().mo16882a(str, String.format("Scheduling a non-expedited job (work ID %s)", qy1Var.f24624a), new Throwable[0]);
                    m25356j(qy1Var, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> m25359g = m25359g(this.f5827p, this.f5828q);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(m25359g != null ? m25359g.size() : 0), Integer.valueOf(this.f5829r.m23000o().mo27951B().mo9726f().size()), Integer.valueOf(this.f5829r.m23006i().m27980h()));
            ll0.m16885c().mo16881b(f5826t, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            ll0.m16885c().mo16881b(f5826t, String.format("Unable to schedule %s", qy1Var), th);
        }
    }
}
