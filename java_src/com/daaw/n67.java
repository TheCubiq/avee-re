package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class n67 extends l67 implements f77 {
    public abstract f77 c();

    @Override // com.daaw.f77
    public final void f(Runnable runnable, Executor executor) {
        c().f(runnable, executor);
    }
}
