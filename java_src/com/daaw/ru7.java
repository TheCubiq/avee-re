package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ru7 implements qo8 {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public zt0 c;

    public ru7(Executor executor, zt0 zt0Var) {
        this.a = executor;
        this.c = zt0Var;
    }

    @Override // com.daaw.qo8
    public final void a(rj1 rj1Var) {
        if (rj1Var.l()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new y07(this));
            }
        }
    }
}
