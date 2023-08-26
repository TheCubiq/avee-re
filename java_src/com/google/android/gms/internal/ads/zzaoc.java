package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
@zzadh
/* loaded from: classes.dex */
final class zzaoc<V> extends FutureTask<V> implements zzanz<V> {
    private final zzaoa zzcvt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoc(Runnable runnable, @Nullable V v) {
        super(runnable, v);
        this.zzcvt = new zzaoa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoc(Callable<V> callable) {
        super(callable);
        this.zzcvt = new zzaoa();
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        this.zzcvt.zzsm();
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(Runnable runnable, Executor executor) {
        this.zzcvt.zza(runnable, executor);
    }
}
