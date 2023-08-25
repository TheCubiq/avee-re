package com.daaw;

import android.content.Context;
import androidx.work.impl.background.systemalarm.C0527a;
/* loaded from: classes.dex */
public class ti1 implements r81 {

    /* renamed from: q */
    public static final String f27762q = ll0.m16883f("SystemAlarmScheduler");

    /* renamed from: p */
    public final Context f27763p;

    public ti1(Context context) {
        this.f27763p = context.getApplicationContext();
    }

    @Override // com.daaw.r81
    /* renamed from: a */
    public boolean mo9090a() {
        return true;
    }

    /* renamed from: b */
    public final void m9089b(qy1 qy1Var) {
        ll0.m16885c().mo16882a(f27762q, String.format("Scheduling work with workSpecId %s", qy1Var.f24624a), new Throwable[0]);
        this.f27763p.startService(C0527a.m27927f(this.f27763p, qy1Var.f24624a));
    }

    @Override // com.daaw.r81
    /* renamed from: d */
    public void mo9088d(String str) {
        this.f27763p.startService(C0527a.m27926g(this.f27763p, str));
    }

    @Override // com.daaw.r81
    /* renamed from: e */
    public void mo9087e(qy1... qy1VarArr) {
        for (qy1 qy1Var : qy1VarArr) {
            m9089b(qy1Var);
        }
    }
}
