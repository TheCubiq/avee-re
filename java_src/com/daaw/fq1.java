package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class fq1 implements g00<eq1> {
    public final a01<Context> a;
    public final a01<ba> b;
    public final a01<ly> c;
    public final a01<py1> d;
    public final a01<Executor> e;
    public final a01<ri1> f;
    public final a01<cg> g;
    public final a01<cg> h;
    public final a01<tf> i;

    public fq1(a01<Context> a01Var, a01<ba> a01Var2, a01<ly> a01Var3, a01<py1> a01Var4, a01<Executor> a01Var5, a01<ri1> a01Var6, a01<cg> a01Var7, a01<cg> a01Var8, a01<tf> a01Var9) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
        this.d = a01Var4;
        this.e = a01Var5;
        this.f = a01Var6;
        this.g = a01Var7;
        this.h = a01Var8;
        this.i = a01Var9;
    }

    public static fq1 a(a01<Context> a01Var, a01<ba> a01Var2, a01<ly> a01Var3, a01<py1> a01Var4, a01<Executor> a01Var5, a01<ri1> a01Var6, a01<cg> a01Var7, a01<cg> a01Var8, a01<tf> a01Var9) {
        return new fq1(a01Var, a01Var2, a01Var3, a01Var4, a01Var5, a01Var6, a01Var7, a01Var8, a01Var9);
    }

    public static eq1 c(Context context, ba baVar, ly lyVar, py1 py1Var, Executor executor, ri1 ri1Var, cg cgVar, cg cgVar2, tf tfVar) {
        return new eq1(context, baVar, lyVar, py1Var, executor, ri1Var, cgVar, cgVar2, tfVar);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public eq1 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
