package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class r67 {

    /* renamed from: a */
    public final boolean f24900a;

    /* renamed from: b */
    public final y17 f24901b;

    public /* synthetic */ r67(boolean z, y17 y17Var, q67 q67Var) {
        this.f24900a = z;
        this.f24901b = y17Var;
    }

    /* renamed from: a */
    public final f77 m11710a(Callable callable, Executor executor) {
        return new f67(this.f24901b, this.f24900a, executor, callable);
    }
}
