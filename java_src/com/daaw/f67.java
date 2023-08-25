package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class f67 extends o57 {
    @CheckForNull

    /* renamed from: E */
    public e67 f9201E;

    public f67(t17 t17Var, boolean z, Executor executor, Callable callable) {
        super(t17Var, z, false);
        this.f9201E = new d67(this, callable, executor);
        m14544S();
    }

    @Override // com.daaw.o57
    /* renamed from: Q */
    public final void mo14546Q(int i, @CheckForNull Object obj) {
    }

    @Override // com.daaw.o57
    /* renamed from: R */
    public final void mo14545R() {
        e67 e67Var = this.f9201E;
        if (e67Var != null) {
            e67Var.m23697i();
        }
    }

    @Override // com.daaw.o57
    /* renamed from: V */
    public final void mo14541V(int i) {
        super.mo14541V(i);
        if (i == 1) {
            this.f9201E = null;
        }
    }

    @Override // com.daaw.c57
    /* renamed from: u */
    public final void mo22880u() {
        e67 e67Var = this.f9201E;
        if (e67Var != null) {
            e67Var.m23672g();
        }
    }
}
