package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class gn implements g00<fn> {
    public final a01<Context> a;
    public final a01<cg> b;
    public final a01<cg> c;

    public gn(a01<Context> a01Var, a01<cg> a01Var2, a01<cg> a01Var3) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
    }

    public static gn a(a01<Context> a01Var, a01<cg> a01Var2, a01<cg> a01Var3) {
        return new gn(a01Var, a01Var2, a01Var3);
    }

    public static fn c(Context context, cg cgVar, cg cgVar2) {
        return new fn(context, cgVar, cgVar2);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public fn get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
