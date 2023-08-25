package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class nh8 implements qo8 {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public ku0 c;

    public nh8(Executor executor, ku0 ku0Var) {
        this.a = executor;
        this.c = ku0Var;
    }

    @Override // com.daaw.qo8
    public final void a(rj1 rj1Var) {
        if (rj1Var.n()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new bf8(this, rj1Var));
            }
        }
    }
}
