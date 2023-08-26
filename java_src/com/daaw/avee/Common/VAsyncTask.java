package com.daaw.avee.Common;

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
public class VAsyncTask<Result> extends AsyncTask<Object, Integer, Result> implements IVAsyncTask<Result> {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static final Executor THREAD_POOL_EXECUTOR_2;
    private static final RejectedExecutionHandler rejectedPolicy;
    private static final BlockingQueue<Runnable> sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private List<ResultListener<Result>> listener = new ArrayList();
    private Result result;
    private TaskListener<Result> taskListener;

    /* loaded from: classes.dex */
    public interface ResultListener<Result> {
        void onResult(Result result, boolean z);
    }

    /* loaded from: classes.dex */
    public interface TaskListener<Result> {
        Result onExecuteInBg(VAsyncTask<Result> vAsyncTask);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
        MAXIMUM_POOL_SIZE = (CPU_COUNT * 2) + 1;
        sThreadFactory = new ThreadFactory() { // from class: com.daaw.avee.Common.VAsyncTask.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "VAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sPoolWorkQueue = new LinkedBlockingQueue(128);
        rejectedPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory, rejectedPolicy);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        THREAD_POOL_EXECUTOR_2 = threadPoolExecutor;
    }

    public static void CancelTaskSafe(VAsyncTask vAsyncTask) {
        if (vAsyncTask != null) {
            vAsyncTask.cancel(true);
        }
    }

    public VAsyncTask(TaskListener<Result> taskListener) {
        this.taskListener = taskListener;
    }

    @Override // com.daaw.avee.Common.IVAsyncTask
    public void Run(ResultListener<Result> resultListener) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            resultListener.onResult(this.result, false);
            return;
        }
        this.listener.add(resultListener);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            execute(null);
        }
    }

    public void RunParallel(ResultListener<Result> resultListener) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            resultListener.onResult(this.result, false);
            return;
        }
        this.listener.add(resultListener);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            executeOnExecutor(THREAD_POOL_EXECUTOR_2, null);
        }
    }

    @Override // android.os.AsyncTask
    protected Result doInBackground(Object... objArr) {
        return this.taskListener.onExecuteInBg(this);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Result result) {
        this.result = result;
        for (int i = 0; i < this.listener.size(); i++) {
            this.listener.get(i).onResult(result, false);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled(Result result) {
        this.result = result;
        for (int i = 0; i < this.listener.size(); i++) {
            this.listener.get(i).onResult(null, true);
        }
    }
}
