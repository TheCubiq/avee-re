package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class ti1 implements r81 {
    public static final String q = ll0.f("SystemAlarmScheduler");
    public final Context p;

    public ti1(Context context) {
        this.p = context.getApplicationContext();
    }

    @Override // com.daaw.r81
    public boolean a() {
        return true;
    }

    public final void b(qy1 qy1Var) {
        ll0.c().a(q, String.format("Scheduling work with workSpecId %s", qy1Var.a), new Throwable[0]);
        this.p.startService(androidx.work.impl.background.systemalarm.a.f(this.p, qy1Var.a));
    }

    @Override // com.daaw.r81
    public void d(String str) {
        this.p.startService(androidx.work.impl.background.systemalarm.a.g(this.p, str));
    }

    @Override // com.daaw.r81
    public void e(qy1... qy1VarArr) {
        for (qy1 qy1Var : qy1VarArr) {
            b(qy1Var);
        }
    }
}
