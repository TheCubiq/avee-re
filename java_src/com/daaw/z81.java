package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class z81 implements g00<py1> {
    public final a01<Context> a;
    public final a01<ly> b;
    public final a01<s81> c;
    public final a01<cg> d;

    public z81(a01<Context> a01Var, a01<ly> a01Var2, a01<s81> a01Var3, a01<cg> a01Var4) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
        this.d = a01Var4;
    }

    public static z81 a(a01<Context> a01Var, a01<ly> a01Var2, a01<s81> a01Var3, a01<cg> a01Var4) {
        return new z81(a01Var, a01Var2, a01Var3, a01Var4);
    }

    public static py1 c(Context context, ly lyVar, s81 s81Var, cg cgVar) {
        return (py1) qy0.c(y81.a(context, lyVar, s81Var, cgVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public py1 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
