package com.daaw;
/* loaded from: classes.dex */
public final class zn1 implements g00<xn1> {
    public final a01<cg> a;
    public final a01<cg> b;
    public final a01<q81> c;
    public final a01<eq1> d;
    public final a01<by1> e;

    public zn1(a01<cg> a01Var, a01<cg> a01Var2, a01<q81> a01Var3, a01<eq1> a01Var4, a01<by1> a01Var5) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
        this.d = a01Var4;
        this.e = a01Var5;
    }

    public static zn1 a(a01<cg> a01Var, a01<cg> a01Var2, a01<q81> a01Var3, a01<eq1> a01Var4, a01<by1> a01Var5) {
        return new zn1(a01Var, a01Var2, a01Var3, a01Var4, a01Var5);
    }

    public static xn1 c(cg cgVar, cg cgVar2, q81 q81Var, eq1 eq1Var, by1 by1Var) {
        return new xn1(cgVar, cgVar2, q81Var, eq1Var, by1Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public xn1 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
