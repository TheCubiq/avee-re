package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class r67 {
    public final boolean a;
    public final y17 b;

    public /* synthetic */ r67(boolean z, y17 y17Var, q67 q67Var) {
        this.a = z;
        this.b = y17Var;
    }

    public final f77 a(Callable callable, Executor executor) {
        return new f67(this.b, this.a, executor, callable);
    }
}
