package com.daaw;
/* loaded from: classes.dex */
public final class s71 implements g00<r71> {
    public final a01<cg> a;
    public final a01<cg> b;
    public final a01<my> c;
    public final a01<f91> d;
    public final a01<String> e;

    public s71(a01<cg> a01Var, a01<cg> a01Var2, a01<my> a01Var3, a01<f91> a01Var4, a01<String> a01Var5) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
        this.d = a01Var4;
        this.e = a01Var5;
    }

    public static s71 a(a01<cg> a01Var, a01<cg> a01Var2, a01<my> a01Var3, a01<f91> a01Var4, a01<String> a01Var5) {
        return new s71(a01Var, a01Var2, a01Var3, a01Var4, a01Var5);
    }

    public static r71 c(cg cgVar, cg cgVar2, Object obj, Object obj2, a01<String> a01Var) {
        return new r71(cgVar, cgVar2, (my) obj, (f91) obj2, a01Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public r71 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
