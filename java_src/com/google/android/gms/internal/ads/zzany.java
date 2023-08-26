package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
@zzadh
/* loaded from: classes2.dex */
public final class zzany<T> implements zzanz<T> {
    private final T value;
    private final zzaoa zzcvt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzany(T t) {
        this.value = t;
        zzaoa zzaoaVar = new zzaoa();
        this.zzcvt = zzaoaVar;
        zzaoaVar.zzsm();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.value;
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
