package com.daaw.avee.Common;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class VAsyncTask2<Result> implements Runnable {
    private ResultListener<Result> listener;
    private TaskListener<Result> taskListener;
    private volatile Result doneResult = null;
    private volatile boolean resultReceived = false;

    /* loaded from: classes.dex */
    public interface ResultListener<Result> {
        void onResult(Result result);
    }

    /* loaded from: classes.dex */
    public interface TaskListener<Result> {
        Result onExecuteInBg();
    }

    /* loaded from: classes.dex */
    class ThreadPerTaskExecutor implements Executor {
        ThreadPerTaskExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public VAsyncTask2(TaskListener<Result> taskListener) {
        this.taskListener = taskListener;
    }

    public void Run(ResultListener<Result> resultListener) {
        this.listener = resultListener;
    }

    public void RunParallel(ResultListener<Result> resultListener) {
        VAsyncTask.THREAD_POOL_EXECUTOR_2.execute(this);
        this.listener = resultListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.doneResult = this.taskListener.onExecuteInBg();
        this.resultReceived = true;
        ResultListener<Result> resultListener = this.listener;
        if (resultListener != null) {
            resultListener.onResult(this.doneResult);
        }
    }

    public boolean isDone() {
        return this.resultReceived;
    }

    public Result getResult() {
        return this.doneResult;
    }
}
