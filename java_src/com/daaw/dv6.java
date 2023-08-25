package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class dv6 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ob7 d;

    public dv6(ob7 ob7Var, String str, String str2, String str3) {
        this.d = ob7Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.d.p;
        yb8Var.c();
        yb8Var2 = this.d.p;
        return yb8Var2.W().d0(this.a, this.b, this.c);
    }
}
