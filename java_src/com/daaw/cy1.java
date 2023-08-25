package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class cy1 implements g00<by1> {
    public final a01<Executor> a;
    public final a01<ly> b;
    public final a01<py1> c;
    public final a01<ri1> d;

    public cy1(a01<Executor> a01Var, a01<ly> a01Var2, a01<py1> a01Var3, a01<ri1> a01Var4) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
        this.d = a01Var4;
    }

    public static cy1 a(a01<Executor> a01Var, a01<ly> a01Var2, a01<py1> a01Var3, a01<ri1> a01Var4) {
        return new cy1(a01Var, a01Var2, a01Var3, a01Var4);
    }

    public static by1 c(Executor executor, ly lyVar, py1 py1Var, ri1 ri1Var) {
        return new by1(executor, lyVar, py1Var, ri1Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public by1 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
