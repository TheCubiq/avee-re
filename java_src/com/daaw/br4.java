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

    /* renamed from: q */
    public final ScheduledExecutorService f5069q;

    /* renamed from: r */
    public ScheduledFuture f5070r;

    /* renamed from: s */
    public boolean f5071s;

    public br4(xq4 xq4Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f5071s = false;
        this.f5069q = scheduledExecutorService;
        m17376n0(xq4Var, executor);
    }

    @Override // com.daaw.pq4
    /* renamed from: b */
    public final void mo4815b(final zze zzeVar) {
        m17378B0(new jw4() { // from class: com.daaw.rq4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((pq4) obj).mo4815b(zze.this);
            }
        });
    }

    @Override // com.daaw.pq4
    /* renamed from: s */
    public final void mo4814s(final b15 b15Var) {
        if (this.f5071s) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f5070r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        m17378B0(new jw4() { // from class: com.daaw.qq4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((pq4) obj).mo4814s(b15.this);
            }
        });
    }

    @Override // com.daaw.pq4
    public final void zzb() {
        m17378B0(new jw4() { // from class: com.daaw.tq4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((pq4) obj).zzb();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            k04.zzg("Timeout waiting for show call succeed to be called.");
            mo4814s(new b15("Timeout for show call succeed."));
            this.f5071s = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f5070r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.f5070r = this.f5069q.schedule(new Runnable() { // from class: com.daaw.sq4
            @Override // java.lang.Runnable
            public final void run() {
                br4.this.zzd();
            }
        }, ((Integer) zzba.zzc().m23658b(g93.f10560T8)).intValue(), TimeUnit.MILLISECONDS);
    }
}
