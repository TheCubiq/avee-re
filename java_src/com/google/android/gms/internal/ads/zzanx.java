package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
@zzadh
/* loaded from: classes2.dex */
final class zzanx<T> implements zzanz<T> {
    private final Throwable cause;
    private final zzaoa zzcvt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanx(Throwable th) {
        this.cause = th;
        zzaoa zzaoaVar = new zzaoa();
        this.zzcvt = zzaoaVar;
        zzaoaVar.zzsm();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException {
        throw new ExecutionException(this.cause);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.cause);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(Runnable runnable, Executor executor) {
        this.zzcvt.zza(runnable, executor);
    }
}
