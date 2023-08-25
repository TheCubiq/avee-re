package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class vr implements g00<ur> {
    public final a01<Executor> a;
    public final a01<ba> b;
    public final a01<py1> c;
    public final a01<ly> d;
    public final a01<ri1> e;

    public vr(a01<Executor> a01Var, a01<ba> a01Var2, a01<py1> a01Var3, a01<ly> a01Var4, a01<ri1> a01Var5) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
        this.d = a01Var4;
        this.e = a01Var5;
    }

    public static vr a(a01<Executor> a01Var, a01<ba> a01Var2, a01<py1> a01Var3, a01<ly> a01Var4, a01<ri1> a01Var5) {
        return new vr(a01Var, a01Var2, a01Var3, a01Var4, a01Var5);
    }

    public static ur c(Executor executor, ba baVar, py1 py1Var, ly lyVar, ri1 ri1Var) {
        return new ur(executor, baVar, py1Var, lyVar, ri1Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public ur get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
