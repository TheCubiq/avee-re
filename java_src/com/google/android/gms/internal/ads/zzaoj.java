package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public class zzaoj<T> implements zzanz<T> {
    private T mValue;
    private boolean zzbuf;
    private Throwable zzcwf;
    private boolean zzcwg;
    private final Object mLock = new Object();
    private final zzaoa zzcwh = new zzaoa();

    private final boolean zzso() {
        return this.zzcwf != null || this.zzcwg;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (z) {
            synchronized (this.mLock) {
                if (zzso()) {
                    return false;
                }
                this.zzbuf = true;
                this.zzcwg = true;
                this.mLock.notifyAll();
                this.zzcwh.zzsm();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.mLock) {
            if (!zzso()) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.zzcwf != null) {
                throw new ExecutionException(this.zzcwf);
            }
            if (this.zzbuf) {
                throw new CancellationException("SettableFuture was cancelled.");
            }
            t = this.mValue;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.mLock) {
            if (!zzso()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.mLock.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.zzcwf != null) {
                throw new ExecutionException(this.zzcwf);
            }
            if (!this.zzcwg) {
                throw new TimeoutException("SettableFuture timed out.");
            }
            if (this.zzbuf) {
                throw new CancellationException("SettableFuture was cancelled.");
            }
            t = this.mValue;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzbuf;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean zzso;
        synchronized (this.mLock) {
            zzso = zzso();
        }
        return zzso;
    }

    public final void set(T t) {
        synchronized (this.mLock) {
            if (this.zzbuf) {
                return;
            }
            if (zzso()) {
                com.google.android.gms.ads.internal.zzbv.zzeo().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                return;
            }
            this.zzcwg = true;
            this.mValue = t;
            this.mLock.notifyAll();
            this.zzcwh.zzsm();
        }
    }

    public final void setException(Throwable th) {
        synchronized (this.mLock) {
            if (this.zzbuf) {
                return;
            }
            if (zzso()) {
                com.google.android.gms.ads.internal.zzbv.zzeo().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                return;
            }
            this.zzcwf = th;
            this.mLock.notifyAll();
            this.zzcwh.zzsm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(Runnable runnable, Executor executor) {
        this.zzcwh.zza(runnable, executor);
    }
}
