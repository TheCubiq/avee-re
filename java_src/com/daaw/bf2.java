package com.daaw;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class bf2 implements Executor {

    /* renamed from: p */
    public final /* synthetic */ Handler f4770p;

    public bf2(df2 df2Var, Handler handler) {
        this.f4770p = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4770p.post(runnable);
    }
}
