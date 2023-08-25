package com.daaw;

import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class f27 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f9049p;

    /* renamed from: q */
    public final /* synthetic */ ob7 f9050q;

    public f27(ob7 ob7Var, zzq zzqVar) {
        this.f9050q = ob7Var;
        this.f9049p = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f9050q.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f9050q.f21251p;
        zzq zzqVar = this.f9049p;
        yb8Var2.mo3882r().mo6991f();
        yb8Var2.m3903e();
        ry0.m10834f(zzqVar.f37092p);
        cd2 m25430b = cd2.m25430b(zzqVar.f37089K);
        cd2 m3916V = yb8Var2.m3916V(zzqVar.f37092p);
        yb8Var2.mo3895i().m14156v().m20651c("Setting consent, package, consent", zzqVar.f37092p, m25430b);
        yb8Var2.m3937A(zzqVar.f37092p, m25430b);
        if (m25430b.m25421k(m3916V)) {
            yb8Var2.m3878v(zzqVar);
        }
    }
}
