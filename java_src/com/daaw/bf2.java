package com.daaw;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class bf2 implements Executor {
    public final /* synthetic */ Handler p;

    public bf2(df2 df2Var, Handler handler) {
        this.p = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.p.post(runnable);
    }
}
