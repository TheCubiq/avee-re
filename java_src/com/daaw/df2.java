package com.daaw;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class df2 {
    public final Executor a;

    public df2(Handler handler) {
        this.a = new bf2(this, handler);
    }

    public final void a(qf2 qf2Var, zf2 zf2Var) {
        qf2Var.zzm("post-error");
        wf2 a = wf2.a(zf2Var);
        Executor executor = this.a;
        ((bf2) executor).p.post(new cf2(qf2Var, a, null));
    }

    public final void b(qf2 qf2Var, wf2 wf2Var, Runnable runnable) {
        qf2Var.zzq();
        qf2Var.zzm("post-response");
        Executor executor = this.a;
        ((bf2) executor).p.post(new cf2(qf2Var, wf2Var, runnable));
    }
}
