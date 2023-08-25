package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class dd2 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ f01 b;
    public final /* synthetic */ rb c;

    public dd2(rb rbVar, String str, f01 f01Var) {
        this.c = rbVar;
        this.a = str;
        this.b = f01Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n63 A = rb.A(this.c, this.a);
        if (A.b() != null) {
            this.b.c(A.a(), A.b());
            return null;
        }
        this.b.c(A.a(), rt8.r());
        return null;
    }
}
