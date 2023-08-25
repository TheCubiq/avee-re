package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class f67 extends o57 {
    @CheckForNull
    public e67 E;

    public f67(t17 t17Var, boolean z, Executor executor, Callable callable) {
        super(t17Var, z, false);
        this.E = new d67(this, callable, executor);
        S();
    }

    @Override // com.daaw.o57
    public final void Q(int i, @CheckForNull Object obj) {
    }

    @Override // com.daaw.o57
    public final void R() {
        e67 e67Var = this.E;
        if (e67Var != null) {
            e67Var.i();
        }
    }

    @Override // com.daaw.o57
    public final void V(int i) {
        super.V(i);
        if (i == 1) {
            this.E = null;
        }
    }

    @Override // com.daaw.c57
    public final void u() {
        e67 e67Var = this.E;
        if (e67Var != null) {
            e67Var.g();
        }
    }
}
