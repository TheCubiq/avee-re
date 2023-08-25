package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class f87 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ ob7 b;

    public f87(ob7 ob7Var, String str) {
        this.b = ob7Var;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.b.p;
        yb8Var.c();
        yb8Var2 = this.b.p;
        return yb8Var2.W().c0(this.a);
    }
}
