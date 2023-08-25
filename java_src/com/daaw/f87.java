package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class f87 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f9234a;

    /* renamed from: b */
    public final /* synthetic */ ob7 f9235b;

    public f87(ob7 ob7Var, String str) {
        this.f9235b = ob7Var;
        this.f9234a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f9235b.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f9235b.f21251p;
        return yb8Var2.m3915W().m8155c0(this.f9234a);
    }
}
