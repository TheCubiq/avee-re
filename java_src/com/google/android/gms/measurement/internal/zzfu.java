package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfu extends zzgx {
    private static final AtomicLong zzj = new AtomicLong(Long.MIN_VALUE);
    private zzfy zza;
    private zzfy zzb;
    private final PriorityBlockingQueue<zzfz<?>> zzc;
    private final BlockingQueue<zzfz<?>> zzd;
    private final Thread.UncaughtExceptionHandler zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Object zzg;
    private final Semaphore zzh;
    private volatile boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfu(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzg = new Object();
        this.zzh = new Semaphore(2);
        this.zzc = new PriorityBlockingQueue<>();
        this.zzd = new LinkedBlockingQueue();
        this.zze = new zzfw(this, "Thread death: Uncaught exception on worker thread");
        this.zzf = new zzfw(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final void zzc() {
        if (Thread.currentThread() != this.zza) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final void zzb() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final boolean zzf() {
        return Thread.currentThread() == this.zza;
    }

    public final <V> Future<V> zza(Callable<V> callable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(callable);
        zzfz<?> zzfzVar = new zzfz<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zza) {
            if (!this.zzc.isEmpty()) {
                zzq().zzh().zza("Callable skipped the worker queue.");
            }
            zzfzVar.run();
        } else {
            zza(zzfzVar);
        }
        return zzfzVar;
    }

    public final <V> Future<V> zzb(Callable<V> callable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(callable);
        zzfz<?> zzfzVar = new zzfz<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zza) {
            zzfzVar.run();
        } else {
            zza(zzfzVar);
        }
        return zzfzVar;
    }

    public final void zza(Runnable runnable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(runnable);
        zza(new zzfz<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T zza(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzp().zza(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzez zzh = zzq().zzh();
                String valueOf = String.valueOf(str);
                zzh.zza(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzez zzh2 = zzq().zzh();
            String valueOf2 = String.valueOf(str);
            zzh2.zza(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final void zzb(Runnable runnable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(runnable);
        zza(new zzfz<>(this, runnable, true, "Task exception on worker thread"));
    }

    private final void zza(zzfz<?> zzfzVar) {
        synchronized (this.zzg) {
            this.zzc.add(zzfzVar);
            if (this.zza == null) {
                zzfy zzfyVar = new zzfy(this, "Measurement Worker", this.zzc);
                this.zza = zzfyVar;
                zzfyVar.setUncaughtExceptionHandler(this.zze);
                this.zza.start();
            } else {
                this.zza.zza();
            }
        }
    }

    public final void zzc(Runnable runnable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(runnable);
        zzfz<?> zzfzVar = new zzfz<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzg) {
            this.zzd.add(zzfzVar);
            if (this.zzb == null) {
                zzfy zzfyVar = new zzfy(this, "Measurement Network", this.zzd);
                this.zzb = zzfyVar;
                zzfyVar.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                this.zzb.zza();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzal zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Clock zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzev zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzfu zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzex zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzy zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfy zza(zzfu zzfuVar, zzfy zzfyVar) {
        zzfuVar.zza = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfy zzb(zzfu zzfuVar, zzfy zzfyVar) {
        zzfuVar.zzb = null;
        return null;
    }
}
