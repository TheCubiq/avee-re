package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.daaw.ey1;
import com.daaw.fk0;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.rx1;
import com.daaw.sb1;
import com.daaw.sx1;
import com.daaw.wj1;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements rx1 {

    /* renamed from: z */
    public static final String f2572z = ll0.m16883f("ConstraintTrkngWrkr");

    /* renamed from: u */
    public WorkerParameters f2573u;

    /* renamed from: v */
    public final Object f2574v;

    /* renamed from: w */
    public volatile boolean f2575w;

    /* renamed from: x */
    public sb1<ListenableWorker.AbstractC0501a> f2576x;

    /* renamed from: y */
    public ListenableWorker f2577y;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    /* loaded from: classes.dex */
    public class RunnableC0541a implements Runnable {
        public RunnableC0541a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.m27872e();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    /* loaded from: classes.dex */
    public class RunnableC0542b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ fk0 f2579p;

        public RunnableC0542b(fk0 fk0Var) {
            this.f2579p = fk0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f2574v) {
                if (ConstraintTrackingWorker.this.f2575w) {
                    ConstraintTrackingWorker.this.m27873d();
                } else {
                    ConstraintTrackingWorker.this.f2576x.mo10471s(this.f2579p);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2573u = workerParameters;
        this.f2574v = new Object();
        this.f2575w = false;
        this.f2576x = sb1.m10470u();
    }

    /* renamed from: a */
    public WorkDatabase m27875a() {
        return ey1.m23004k(getApplicationContext()).m23000o();
    }

    @Override // com.daaw.rx1
    /* renamed from: b */
    public void mo10849b(List<String> list) {
        ll0.m16885c().mo16882a(f2572z, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f2574v) {
            this.f2575w = true;
        }
    }

    /* renamed from: c */
    public void m27874c() {
        this.f2576x.mo10473q(ListenableWorker.AbstractC0501a.m28006a());
    }

    /* renamed from: d */
    public void m27873d() {
        this.f2576x.mo10473q(ListenableWorker.AbstractC0501a.m28005b());
    }

    /* renamed from: e */
    public void m27872e() {
        String m27964i = getInputData().m27964i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(m27964i)) {
            ll0.m16885c().mo16881b(f2572z, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker m3079b = getWorkerFactory().m3079b(getApplicationContext(), m27964i, this.f2573u);
            this.f2577y = m3079b;
            if (m3079b != null) {
                qy1 mo9719m = m27875a().mo27951B().mo9719m(getId().toString());
                if (mo9719m == null) {
                    m27874c();
                    return;
                }
                sx1 sx1Var = new sx1(getApplicationContext(), getTaskExecutor(), this);
                sx1Var.m9789d(Collections.singletonList(mo9719m));
                if (!sx1Var.m9790c(getId().toString())) {
                    ll0.m16885c().mo16882a(f2572z, String.format("Constraints not met for delegate %s. Requesting retry.", m27964i), new Throwable[0]);
                    m27873d();
                    return;
                }
                ll0.m16885c().mo16882a(f2572z, String.format("Constraints met for delegate %s", m27964i), new Throwable[0]);
                try {
                    fk0<ListenableWorker.AbstractC0501a> startWork = this.f2577y.startWork();
                    startWork.mo14694d(new RunnableC0542b(startWork), getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    ll0 m16885c = ll0.m16885c();
                    String str = f2572z;
                    m16885c.mo16882a(str, String.format("Delegated worker %s threw exception in startWork.", m27964i), th);
                    synchronized (this.f2574v) {
                        if (this.f2575w) {
                            ll0.m16885c().mo16882a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            m27873d();
                        } else {
                            m27874c();
                        }
                        return;
                    }
                }
            }
            ll0.m16885c().mo16882a(f2572z, "No worker to delegate to.", new Throwable[0]);
        }
        m27874c();
    }

    @Override // com.daaw.rx1
    /* renamed from: f */
    public void mo10848f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public wj1 getTaskExecutor() {
        return ey1.m23004k(getApplicationContext()).m22999p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f2577y;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f2577y;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f2577y.stop();
    }

    @Override // androidx.work.ListenableWorker
    public fk0<ListenableWorker.AbstractC0501a> startWork() {
        getBackgroundExecutor().execute(new RunnableC0541a());
        return this.f2576x;
    }
}
