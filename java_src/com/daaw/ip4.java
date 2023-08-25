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

    /* renamed from: p */
    public final gr4 f13902p;

    /* renamed from: q */
    public final th6 f13903q;

    /* renamed from: r */
    public final ScheduledExecutorService f13904r;

    /* renamed from: s */
    public final Executor f13905s;

    /* renamed from: u */
    public ScheduledFuture f13907u;

    /* renamed from: t */
    public final o77 f13906t = o77.m14487D();

    /* renamed from: v */
    public final AtomicBoolean f13908v = new AtomicBoolean();

    public ip4(gr4 gr4Var, th6 th6Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f13902p = gr4Var;
        this.f13903q = th6Var;
        this.f13904r = scheduledExecutorService;
        this.f13905s = executor;
    }

    @Override // com.daaw.er4
    /* renamed from: A */
    public final synchronized void mo9178A(zze zzeVar) {
        if (this.f13906t.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f13907u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f13906t.mo14485i(new Exception());
    }

    @Override // com.daaw.lq4
    /* renamed from: T */
    public final void mo5177T() {
    }

    @Override // com.daaw.lq4
    /* renamed from: c */
    public final void mo5175c() {
    }

    /* renamed from: e */
    public final /* synthetic */ void m19530e() {
        synchronized (this) {
            if (this.f13906t.isDone()) {
                return;
            }
            this.f13906t.mo14486h(Boolean.TRUE);
        }
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final void mo6420e0(p03 p03Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10840t9)).booleanValue() && this.f13903q.f27679Z != 2 && p03Var.f22185j && this.f13908v.compareAndSet(false, true)) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.f13902p.zza();
        }
    }

    @Override // com.daaw.lq4
    /* renamed from: m */
    public final void mo5170m(cv3 cv3Var, String str, String str2) {
    }

    @Override // com.daaw.sv4
    public final void zzd() {
    }

    @Override // com.daaw.sv4
    public final synchronized void zze() {
        if (this.f13906t.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f13907u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f13906t.mo14486h(Boolean.TRUE);
    }

    @Override // com.daaw.cy4
    public final void zzf() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10788p1)).booleanValue()) {
            th6 th6Var = this.f13903q;
            if (th6Var.f27679Z == 2) {
                if (th6Var.f27713r == 0) {
                    this.f13902p.zza();
                    return;
                }
                s67.m10625r(this.f13906t, new hp4(this), this.f13905s);
                this.f13907u = this.f13904r.schedule(new Runnable() { // from class: com.daaw.gp4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ip4.this.m19530e();
                    }
                }, this.f13903q.f27713r, TimeUnit.MILLISECONDS);
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
        int i = this.f13903q.f27679Z;
        if (i == 0 || i == 1) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10840t9)).booleanValue()) {
                return;
            }
            this.f13902p.zza();
        }
    }
}
