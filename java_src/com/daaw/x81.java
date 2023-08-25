package com.daaw;
/* loaded from: classes.dex */
public final class x81 implements g00<s81> {

    /* renamed from: a */
    public final a01<InterfaceC0951cg> f32181a;

    public x81(a01<InterfaceC0951cg> a01Var) {
        this.f32181a = a01Var;
    }

    /* renamed from: a */
    public static s81 m5445a(InterfaceC0951cg interfaceC0951cg) {
        return (s81) qy0.m11939c(w81.m6344a(interfaceC0951cg), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static x81 m5444b(a01<InterfaceC0951cg> a01Var) {
        return new x81(a01Var);
    }

    @Override // com.daaw.a01
    /* renamed from: c */
    public s81 get() {
        return m5445a(this.f32181a.get());
    }
}
