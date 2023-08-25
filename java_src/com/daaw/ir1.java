package com.daaw;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ir1<Result> extends AsyncTask<Object, Integer, Result> implements me0<Result> {
    public static final int d;
    public static final int e;
    public static final int f;
    public static final ThreadFactory g;
    public static final BlockingQueue<Runnable> h;
    public static final RejectedExecutionHandler i;
    public static final Executor j;
    public Result a;
    public c<Result> b;
    public List<b<Result>> c = new ArrayList();

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "VAsyncTask #" + this.a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    public interface b<Result> {
        void a(Result result, boolean z);
    }

    /* loaded from: classes.dex */
    public interface c<Result> {
        Result a(ir1<Result> ir1Var);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        d = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        e = max;
        int i2 = (availableProcessors * 2) + 1;
        f = i2;
        a aVar = new a();
        g = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        h = linkedBlockingQueue;
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        i = callerRunsPolicy;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i2, 30L, TimeUnit.SECONDS, linkedBlockingQueue, aVar, callerRunsPolicy);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        j = threadPoolExecutor;
    }

    public ir1(c<Result> cVar) {
        this.b = cVar;
    }

    @Override // com.daaw.me0
    public void a(b<Result> bVar) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            bVar.a(this.a, false);
            return;
        }
        this.c.add(bVar);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            execute(null);
        }
    }

    public void b(b<Result> bVar) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            bVar.a(this.a, false);
            return;
        }
        this.c.add(bVar);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            executeOnExecutor(j, null);
        }
    }

    @Override // android.os.AsyncTask
    public Result doInBackground(Object... objArr) {
        return this.b.a(this);
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Result result) {
        this.a = result;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.c.get(i2).a(null, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Result result) {
        this.a = result;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.c.get(i2).a(result, false);
        }
    }
}
