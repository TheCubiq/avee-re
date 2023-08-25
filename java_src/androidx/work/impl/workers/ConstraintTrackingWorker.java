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
    public static final String z = ll0.f("ConstraintTrkngWrkr");
    public WorkerParameters u;
    public final Object v;
    public volatile boolean w;
    public sb1<ListenableWorker.a> x;
    public ListenableWorker y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ fk0 p;

        public b(fk0 fk0Var) {
            this.p = fk0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.v) {
                if (ConstraintTrackingWorker.this.w) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.x.s(this.p);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.u = workerParameters;
        this.v = new Object();
        this.w = false;
        this.x = sb1.u();
    }

    public WorkDatabase a() {
        return ey1.k(getApplicationContext()).o();
    }

    @Override // com.daaw.rx1
    public void b(List<String> list) {
        ll0.c().a(z, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.v) {
            this.w = true;
        }
    }

    public void c() {
        this.x.q(ListenableWorker.a.a());
    }

    public void d() {
        this.x.q(ListenableWorker.a.b());
    }

    public void e() {
        String i = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i)) {
            ll0.c().b(z, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker b2 = getWorkerFactory().b(getApplicationContext(), i, this.u);
            this.y = b2;
            if (b2 != null) {
                qy1 m = a().B().m(getId().toString());
                if (m == null) {
                    c();
                    return;
                }
                sx1 sx1Var = new sx1(getApplicationContext(), getTaskExecutor(), this);
                sx1Var.d(Collections.singletonList(m));
                if (!sx1Var.c(getId().toString())) {
                    ll0.c().a(z, String.format("Constraints not met for delegate %s. Requesting retry.", i), new Throwable[0]);
                    d();
                    return;
                }
                ll0.c().a(z, String.format("Constraints met for delegate %s", i), new Throwable[0]);
                try {
                    fk0<ListenableWorker.a> startWork = this.y.startWork();
                    startWork.d(new b(startWork), getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    ll0 c = ll0.c();
                    String str = z;
                    c.a(str, String.format("Delegated worker %s threw exception in startWork.", i), th);
                    synchronized (this.v) {
                        if (this.w) {
                            ll0.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            d();
                        } else {
                            c();
                        }
                        return;
                    }
                }
            }
            ll0.c().a(z, "No worker to delegate to.", new Throwable[0]);
        }
        c();
    }

    @Override // com.daaw.rx1
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public wj1 getTaskExecutor() {
        return ey1.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.y;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.y;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.y.stop();
    }

    @Override // androidx.work.ListenableWorker
    public fk0<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.x;
    }
}
