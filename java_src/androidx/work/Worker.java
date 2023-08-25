package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import com.daaw.fk0;
import com.daaw.sb1;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public sb1<ListenableWorker.a> u;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.u.q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.u.r(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final fk0<ListenableWorker.a> startWork() {
        this.u = sb1.u();
        getBackgroundExecutor().execute(new a());
        return this.u;
    }
}
