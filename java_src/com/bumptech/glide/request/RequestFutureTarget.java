package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class RequestFutureTarget<T, R> implements FutureTarget<R>, Runnable {
    private static final Waiter DEFAULT_WAITER = new Waiter();
    private final boolean assertBackgroundThread;
    private Exception exception;
    private boolean exceptionReceived;
    private final int height;
    private boolean isCancelled;
    private final Handler mainHandler;
    private Request request;
    private R resource;
    private boolean resultReceived;
    private final Waiter waiter;
    private final int width;

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    public RequestFutureTarget(Handler handler, int i, int i2) {
        this(handler, i, i2, true, DEFAULT_WAITER);
    }

    RequestFutureTarget(Handler handler, int i, int i2, boolean z, Waiter waiter) {
        this.mainHandler = handler;
        this.width = i;
        this.height = i2;
        this.assertBackgroundThread = z;
        this.waiter = waiter;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        if (this.isCancelled) {
            return true;
        }
        boolean z2 = !isDone();
        if (z2) {
            this.isCancelled = true;
            if (z) {
                clear();
            }
            this.waiter.notifyAll(this);
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.isCancelled;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.isCancelled) {
            z = this.resultReceived;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return doGet(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return doGet(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.width, this.height);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void setRequest(Request request) {
        this.request = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public Request getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(Exception exc, Drawable drawable) {
        this.exceptionReceived = true;
        this.exception = exc;
        this.waiter.notifyAll(this);
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(R r, GlideAnimation<? super R> glideAnimation) {
        this.resultReceived = true;
        this.resource = r;
        this.waiter.notifyAll(this);
    }

    private synchronized R doGet(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.assertBackgroundThread) {
            Util.assertBackgroundThread();
        }
        if (this.isCancelled) {
            throw new CancellationException();
        }
        if (this.exceptionReceived) {
            throw new ExecutionException(this.exception);
        }
        if (this.resultReceived) {
            return this.resource;
        }
        if (l == null) {
            this.waiter.waitForTimeout(this, 0L);
        } else if (l.longValue() > 0) {
            this.waiter.waitForTimeout(this, l.longValue());
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.exceptionReceived) {
            throw new ExecutionException(this.exception);
        }
        if (this.isCancelled) {
            throw new CancellationException();
        }
        if (!this.resultReceived) {
            throw new TimeoutException();
        }
        return this.resource;
    }

    @Override // java.lang.Runnable
    public void run() {
        Request request = this.request;
        if (request != null) {
            request.clear();
            cancel(false);
        }
    }

    @Override // com.bumptech.glide.request.FutureTarget
    public void clear() {
        this.mainHandler.post(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Waiter {
        Waiter() {
        }

        public void waitForTimeout(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        public void notifyAll(Object obj) {
            obj.notifyAll();
        }
    }
}
