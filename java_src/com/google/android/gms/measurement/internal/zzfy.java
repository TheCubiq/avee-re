package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfy extends Thread {
    private final Object zza;
    private final BlockingQueue<zzfz<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzfu zzd;

    public zzfy(zzfu zzfuVar, String str, BlockingQueue<zzfz<?>> blockingQueue) {
        this.zzd = zzfuVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zza = new Object();
        this.zzb = blockingQueue;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        Semaphore semaphore;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.zzd.zzh;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfz<?> poll = this.zzb.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.zza ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null) {
                            z = this.zzd.zzi;
                            if (!z) {
                                try {
                                    this.zza.wait(30000L);
                                } catch (InterruptedException e2) {
                                    zza(e2);
                                }
                            }
                        }
                    }
                    obj = this.zzd.zzg;
                    synchronized (obj) {
                        if (this.zzb.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.zzd.zzs().zza(zzat.zzbs)) {
                zzb();
            }
        } finally {
            zzb();
        }
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfy zzfyVar;
        zzfy zzfyVar2;
        obj = this.zzd.zzg;
        synchronized (obj) {
            if (!this.zzc) {
                semaphore = this.zzd.zzh;
                semaphore.release();
                obj2 = this.zzd.zzg;
                obj2.notifyAll();
                zzfyVar = this.zzd.zza;
                if (this == zzfyVar) {
                    zzfu.zza(this.zzd, null);
                } else {
                    zzfyVar2 = this.zzd.zzb;
                    if (this == zzfyVar2) {
                        zzfu.zzb(this.zzd, null);
                    } else {
                        this.zzd.zzq().zze().zza("Current scheduler thread is neither worker nor network");
                    }
                }
                this.zzc = true;
            }
        }
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }

    private final void zza(InterruptedException interruptedException) {
        this.zzd.zzq().zzh().zza(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
