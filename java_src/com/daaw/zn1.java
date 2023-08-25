package com.daaw;
/* loaded from: classes.dex */
public final class zn1 implements g00<xn1> {

    /* renamed from: a */
    public final a01<InterfaceC0951cg> f35251a;

    /* renamed from: b */
    public final a01<InterfaceC0951cg> f35252b;

    /* renamed from: c */
    public final a01<q81> f35253c;

    /* renamed from: d */
    public final a01<eq1> f35254d;

    /* renamed from: e */
    public final a01<by1> f35255e;

    public zn1(a01<InterfaceC0951cg> a01Var, a01<InterfaceC0951cg> a01Var2, a01<q81> a01Var3, a01<eq1> a01Var4, a01<by1> a01Var5) {
        this.f35251a = a01Var;
        this.f35252b = a01Var2;
        this.f35253c = a01Var3;
        this.f35254d = a01Var4;
        this.f35255e = a01Var5;
    }

    /* renamed from: a */
    public static zn1 m2102a(a01<InterfaceC0951cg> a01Var, a01<InterfaceC0951cg> a01Var2, a01<q81> a01Var3, a01<eq1> a01Var4, a01<by1> a01Var5) {
        return new zn1(a01Var, a01Var2, a01Var3, a01Var4, a01Var5);
    }

    /* renamed from: c */
    public static xn1 m2100c(InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, q81 q81Var, eq1 eq1Var, by1 by1Var) {
        return new xn1(interfaceC0951cg, interfaceC0951cg2, q81Var, eq1Var, by1Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public xn1 get() {
        return m2100c(this.f35251a.get(), this.f35252b.get(), this.f35253c.get(), this.f35254d.get(), this.f35255e.get());
    }
}
