package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class ip4 implements lq4, cy4, sv4, er4, q03 {
    public final gr4 p;
    public final th6 q;
    public final ScheduledExecutorService r;
    public final Executor s;
    public ScheduledFuture u;
    public final o77 t = o77.D();
    public final AtomicBoolean v = new AtomicBoolean();

    public ip4(gr4 gr4Var, th6 th6Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.p = gr4Var;
        this.q = th6Var;
        this.r = scheduledExecutorService;
        this.s = executor;
    }

    @Override // com.daaw.er4
    public final synchronized void A(zze zzeVar) {
        if (this.t.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.t.i(new Exception());
    }

    @Override // com.daaw.lq4
    public final void T() {
    }

    @Override // com.daaw.lq4
    public final void c() {
    }

    public final /* synthetic */ void e() {
        synchronized (this) {
            if (this.t.isDone()) {
                return;
            }
            this.t.h(Boolean.TRUE);
        }
    }

    @Override // com.daaw.q03
    public final void e0(p03 p03Var) {
        if (((Boolean) zzba.zzc().b(g93.t9)).booleanValue() && this.q.Z != 2 && p03Var.j && this.v.compareAndSet(false, true)) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.p.zza();
        }
    }

    @Override // com.daaw.lq4
    public final void m(cv3 cv3Var, String str, String str2) {
    }

    @Override // com.daaw.sv4
    public final void zzd() {
    }

    @Override // com.daaw.sv4
    public final synchronized void zze() {
        if (this.t.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.t.h(Boolean.TRUE);
    }

    @Override // com.daaw.cy4
    public final void zzf() {
        if (((Boolean) zzba.zzc().b(g93.p1)).booleanValue()) {
            th6 th6Var = this.q;
            if (th6Var.Z == 2) {
                if (th6Var.r == 0) {
                    this.p.zza();
                    return;
                }
                s67.r(this.t, new hp4(this), this.s);
                this.u = this.r.schedule(new Runnable() { // from class: com.daaw.gp4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ip4.this.e();
                    }
                }, this.q.r, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.daaw.cy4
    public final void zzg() {
    }

    @Override // com.daaw.lq4
    public final void zzj() {
    }

    @Override // com.daaw.lq4
    public final void zzm() {
    }

    @Override // com.daaw.lq4
    public final void zzo() {
        int i = this.q.Z;
        if (i == 0 || i == 1) {
            if (((Boolean) zzba.zzc().b(g93.t9)).booleanValue()) {
                return;
            }
            this.p.zza();
        }
    }
}
