package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class xc8 implements qo8 {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public gu0 c;

    public xc8(Executor executor, gu0 gu0Var) {
        this.a = executor;
        this.c = gu0Var;
    }

    @Override // com.daaw.qo8
    public final void a(rj1 rj1Var) {
        if (rj1Var.n() || rj1Var.l()) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new t98(this, rj1Var));
        }
    }
}
