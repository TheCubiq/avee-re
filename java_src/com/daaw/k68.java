package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class k68 implements qo8 {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public cu0 c;

    public k68(Executor executor, cu0 cu0Var) {
        this.a = executor;
        this.c = cu0Var;
    }

    @Override // com.daaw.qo8
    public final void a(rj1 rj1Var) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new e38(this, rj1Var));
        }
    }
}
