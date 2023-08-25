package com.daaw;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class df2 {

    /* renamed from: a */
    public final Executor f7030a;

    public df2(Handler handler) {
        this.f7030a = new bf2(this, handler);
    }

    /* renamed from: a */
    public final void m24430a(qf2 qf2Var, zf2 zf2Var) {
        qf2Var.zzm("post-error");
        wf2 m6089a = wf2.m6089a(zf2Var);
        Executor executor = this.f7030a;
        ((bf2) executor).f4770p.post(new cf2(qf2Var, m6089a, null));
    }

    /* renamed from: b */
    public final void m24429b(qf2 qf2Var, wf2 wf2Var, Runnable runnable) {
        qf2Var.zzq();
        qf2Var.zzm("post-response");
        Executor executor = this.f7030a;
        ((bf2) executor).f4770p.post(new cf2(qf2Var, wf2Var, runnable));
    }
}
