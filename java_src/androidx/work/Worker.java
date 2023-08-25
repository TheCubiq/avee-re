package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import com.daaw.fk0;
import com.daaw.sb1;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: u */
    public sb1<ListenableWorker.AbstractC0501a> f2424u;

    /* renamed from: androidx.work.Worker$a */
    /* loaded from: classes.dex */
    public class RunnableC0505a implements Runnable {
        public RunnableC0505a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f2424u.mo10473q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f2424u.mo10472r(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.AbstractC0501a doWork();

    @Override // androidx.work.ListenableWorker
    public final fk0<ListenableWorker.AbstractC0501a> startWork() {
        this.f2424u = sb1.m10470u();
        getBackgroundExecutor().execute(new RunnableC0505a());
        return this.f2424u;
    }
}
