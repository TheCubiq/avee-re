package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class br4 extends kw4 implements pq4 {
    public final ScheduledExecutorService q;
    public ScheduledFuture r;
    public boolean s;

    public br4(xq4 xq4Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.s = false;
        this.q = scheduledExecutorService;
        n0(xq4Var, executor);
    }

    @Override // com.daaw.pq4
    public final void b(final zze zzeVar) {
        B0(new jw4() { // from class: com.daaw.rq4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((pq4) obj).b(zze.this);
            }
        });
    }

    @Override // com.daaw.pq4
    public final void s(final b15 b15Var) {
        if (this.s) {
            return;
        }
        ScheduledFuture scheduledFuture = this.r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        B0(new jw4() { // from class: com.daaw.qq4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((pq4) obj).s(b15.this);
            }
        });
    }

    @Override // com.daaw.pq4
    public final void zzb() {
        B0(new jw4() { // from class: com.daaw.tq4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((pq4) obj).zzb();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            k04.zzg("Timeout waiting for show call succeed to be called.");
            s(new b15("Timeout for show call succeed."));
            this.s = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.r = this.q.schedule(new Runnable() { // from class: com.daaw.sq4
            @Override // java.lang.Runnable
            public final void run() {
                br4.this.zzd();
            }
        }, ((Integer) zzba.zzc().b(g93.T8)).intValue(), TimeUnit.MILLISECONDS);
    }
}
