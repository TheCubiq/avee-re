package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@zzadh
/* loaded from: classes2.dex */
public final class zzano {
    public static <V> zzanz<V> zza(zzanz<V> zzanzVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final zzaoj zzaojVar = new zzaoj();
        zza((zzanz) zzaojVar, (Future) zzanzVar);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(zzaojVar) { // from class: com.google.android.gms.internal.ads.zzans
            private final zzaoj zzbnu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbnu = zzaojVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbnu.setException(new TimeoutException());
            }
        }, j, timeUnit);
        zza((zzanz) zzanzVar, zzaojVar);
        zzaojVar.zza(new Runnable(schedule) { // from class: com.google.android.gms.internal.ads.zzant
            private final Future zzcvo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcvo = schedule;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Future future = this.zzcvo;
                if (future.isDone()) {
                    return;
                }
                future.cancel(true);
            }
        }, zzaoe.zzcvz);
        return zzaojVar;
    }

    public static <A, B> zzanz<B> zza(final zzanz<A> zzanzVar, final zzanj<? super A, ? extends B> zzanjVar, Executor executor) {
        final zzaoj zzaojVar = new zzaoj();
        zzanzVar.zza(new Runnable(zzaojVar, zzanjVar, zzanzVar) { // from class: com.google.android.gms.internal.ads.zzanr
            private final zzaoj zzbnu;
            private final zzanz zzcvm;
            private final zzanj zzcvn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbnu = zzaojVar;
                this.zzcvn = zzanjVar;
                this.zzcvm = zzanzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzano.zza(this.zzbnu, this.zzcvn, this.zzcvm);
            }
        }, executor);
        zza((zzanz) zzaojVar, (Future) zzanzVar);
        return zzaojVar;
    }

    public static <A, B> zzanz<B> zza(final zzanz<A> zzanzVar, final zzank<A, B> zzankVar, Executor executor) {
        final zzaoj zzaojVar = new zzaoj();
        zzanzVar.zza(new Runnable(zzaojVar, zzankVar, zzanzVar) { // from class: com.google.android.gms.internal.ads.zzanq
            private final zzaoj zzbnu;
            private final zzank zzcvl;
            private final zzanz zzcvm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbnu = zzaojVar;
                this.zzcvl = zzankVar;
                this.zzcvm = zzanzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzaoj zzaojVar2 = this.zzbnu;
                try {
                    zzaojVar2.set(this.zzcvl.apply(this.zzcvm.get()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    zzaojVar2.setException(e);
                } catch (CancellationException unused) {
                    zzaojVar2.cancel(true);
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzaojVar2.setException(e);
                } catch (Exception e3) {
                    zzaojVar2.setException(e3);
                }
            }
        }, executor);
        zza((zzanz) zzaojVar, (Future) zzanzVar);
        return zzaojVar;
    }

    public static <V, X extends Throwable> zzanz<V> zza(final zzanz<? extends V> zzanzVar, final Class<X> cls, final zzanj<? super X, ? extends V> zzanjVar, final Executor executor) {
        final zzaoj zzaojVar = new zzaoj();
        zza((zzanz) zzaojVar, (Future) zzanzVar);
        zzanzVar.zza(new Runnable(zzaojVar, zzanzVar, cls, zzanjVar, executor) { // from class: com.google.android.gms.internal.ads.zzanu
            private final zzaoj zzbnu;
            private final zzanz zzcvk;
            private final Class zzcvp;
            private final zzanj zzcvq;
            private final Executor zzcvr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbnu = zzaojVar;
                this.zzcvk = zzanzVar;
                this.zzcvp = cls;
                this.zzcvq = zzanjVar;
                this.zzcvr = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzano.zza(this.zzbnu, this.zzcvk, this.zzcvp, this.zzcvq, this.zzcvr);
            }
        }, zzaoe.zzcvz);
        return zzaojVar;
    }

    public static <T> T zza(Future<T> future, T t) {
        try {
            return future.get(((Long) zzkb.zzik().zzd(zznk.zzbam)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            zzakb.zzc("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            com.google.android.gms.ads.internal.zzbv.zzeo().zzb(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            zzakb.zzb("Error waiting for future.", e);
            com.google.android.gms.ads.internal.zzbv.zzeo().zzb(e, "Futures.resolveFuture");
            return t;
        }
    }

    public static <T> T zza(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            zzakb.zzc("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            zzakb.zzb("Error waiting for future.", e);
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "Futures.resolveFuture");
            return t;
        }
    }

    public static <V> void zza(final zzanz<V> zzanzVar, final zzanl<V> zzanlVar, Executor executor) {
        zzanzVar.zza(new Runnable(zzanlVar, zzanzVar) { // from class: com.google.android.gms.internal.ads.zzanp
            private final zzanl zzcvj;
            private final zzanz zzcvk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcvj = zzanlVar;
                this.zzcvk = zzanzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzanl zzanlVar2 = this.zzcvj;
                try {
                    zzanlVar2.zzh(this.zzcvk.get());
                } catch (InterruptedException e) {
                    e = e;
                    Thread.currentThread().interrupt();
                    zzanlVar2.zzb(e);
                } catch (ExecutionException e2) {
                    e = e2.getCause();
                    zzanlVar2.zzb(e);
                } catch (Exception e3) {
                    e = e3;
                    zzanlVar2.zzb(e);
                }
            }
        }, executor);
    }

    private static <V> void zza(final zzanz<? extends V> zzanzVar, final zzaoj<V> zzaojVar) {
        zza((zzanz) zzaojVar, (Future) zzanzVar);
        zzanzVar.zza(new Runnable(zzaojVar, zzanzVar) { // from class: com.google.android.gms.internal.ads.zzanv
            private final zzaoj zzbnu;
            private final zzanz zzcvk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbnu = zzaojVar;
                this.zzcvk = zzanzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Throwable e;
                zzaoj zzaojVar2 = this.zzbnu;
                try {
                    zzaojVar2.set(this.zzcvk.get());
                } catch (InterruptedException e2) {
                    e = e2;
                    Thread.currentThread().interrupt();
                    zzaojVar2.setException(e);
                } catch (ExecutionException e3) {
                    e = e3.getCause();
                    zzaojVar2.setException(e);
                } catch (Exception e4) {
                    zzaojVar2.setException(e4);
                }
            }
        }, zzaoe.zzcvz);
    }

    private static <A, B> void zza(final zzanz<A> zzanzVar, final Future<B> future) {
        zzanzVar.zza(new Runnable(zzanzVar, future) { // from class: com.google.android.gms.internal.ads.zzanw
            private final Future zzbnv;
            private final zzanz zzcvs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcvs = zzanzVar;
                this.zzbnv = future;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzanz zzanzVar2 = this.zzcvs;
                Future future2 = this.zzbnv;
                if (zzanzVar2.isCancelled()) {
                    future2.cancel(true);
                }
            }
        }, zzaoe.zzcvz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzaoj zzaojVar, zzanj zzanjVar, zzanz zzanzVar) {
        if (zzaojVar.isCancelled()) {
            return;
        }
        try {
            zza(zzanjVar.zzc(zzanzVar.get()), zzaojVar);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zzaojVar.setException(e);
        } catch (CancellationException unused) {
            zzaojVar.cancel(true);
        } catch (ExecutionException e2) {
            zzaojVar.setException(e2.getCause());
        } catch (Exception e3) {
            zzaojVar.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void zza(zzaoj zzaojVar, zzanz zzanzVar, Class cls, zzanj zzanjVar, Executor executor) {
        try {
            zzaojVar.set(zzanzVar.get());
        } catch (InterruptedException e) {
            e = e;
            Thread.currentThread().interrupt();
            if (cls.isInstance(e)) {
                zza(zza(zzi(e), zzanjVar, executor), zzaojVar);
            } else {
                zzaojVar.setException(e);
            }
        } catch (ExecutionException e2) {
            e = e2.getCause();
            if (cls.isInstance(e)) {
            }
        } catch (Exception e3) {
            e = e3;
            if (cls.isInstance(e)) {
            }
        }
    }

    public static <T> zzanx<T> zzd(Throwable th) {
        return new zzanx<>(th);
    }

    public static <T> zzany<T> zzi(T t) {
        return new zzany<>(t);
    }
}
