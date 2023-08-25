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

    /* renamed from: d */
    public static final int f13935d;

    /* renamed from: e */
    public static final int f13936e;

    /* renamed from: f */
    public static final int f13937f;

    /* renamed from: g */
    public static final ThreadFactory f13938g;

    /* renamed from: h */
    public static final BlockingQueue<Runnable> f13939h;

    /* renamed from: i */
    public static final RejectedExecutionHandler f13940i;

    /* renamed from: j */
    public static final Executor f13941j;

    /* renamed from: a */
    public Result f13942a;

    /* renamed from: b */
    public InterfaceC1751c<Result> f13943b;

    /* renamed from: c */
    public List<InterfaceC1750b<Result>> f13944c = new ArrayList();

    /* renamed from: com.daaw.ir1$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC1749a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f13945a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "VAsyncTask #" + this.f13945a.getAndIncrement());
        }
    }

    /* renamed from: com.daaw.ir1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1750b<Result> {
        /* renamed from: a */
        void mo15140a(Result result, boolean z);
    }

    /* renamed from: com.daaw.ir1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1751c<Result> {
        /* renamed from: a */
        Result mo9328a(ir1<Result> ir1Var);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f13935d = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        f13936e = max;
        int i = (availableProcessors * 2) + 1;
        f13937f = i;
        ThreadFactoryC1749a threadFactoryC1749a = new ThreadFactoryC1749a();
        f13938g = threadFactoryC1749a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f13939h = linkedBlockingQueue;
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        f13940i = callerRunsPolicy;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC1749a, callerRunsPolicy);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13941j = threadPoolExecutor;
    }

    public ir1(InterfaceC1751c<Result> interfaceC1751c) {
        this.f13943b = interfaceC1751c;
    }

    @Override // com.daaw.me0
    /* renamed from: a */
    public void mo8856a(InterfaceC1750b<Result> interfaceC1750b) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            interfaceC1750b.mo15140a(this.f13942a, false);
            return;
        }
        this.f13944c.add(interfaceC1750b);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            execute(null);
        }
    }

    /* renamed from: b */
    public void m19487b(InterfaceC1750b<Result> interfaceC1750b) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            interfaceC1750b.mo15140a(this.f13942a, false);
            return;
        }
        this.f13944c.add(interfaceC1750b);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            executeOnExecutor(f13941j, null);
        }
    }

    @Override // android.os.AsyncTask
    public Result doInBackground(Object... objArr) {
        return this.f13943b.mo9328a(this);
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Result result) {
        this.f13942a = result;
        for (int i = 0; i < this.f13944c.size(); i++) {
            this.f13944c.get(i).mo15140a(null, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Result result) {
        this.f13942a = result;
        for (int i = 0; i < this.f13944c.size(); i++) {
            this.f13944c.get(i).mo15140a(result, false);
        }
    }
}
