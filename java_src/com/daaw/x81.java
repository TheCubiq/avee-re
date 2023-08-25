package com.daaw;
/* loaded from: classes.dex */
public final class x81 implements g00<s81> {
    public final a01<cg> a;

    public x81(a01<cg> a01Var) {
        this.a = a01Var;
    }

    public static s81 a(cg cgVar) {
        return (s81) qy0.c(w81.a(cgVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static x81 b(a01<cg> a01Var) {
        return new x81(a01Var);
    }

    @Override // com.daaw.a01
    /* renamed from: c */
    public s81 get() {
        return a(this.a.get());
    }
}
