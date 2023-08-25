package com.daaw;
/* loaded from: classes.dex */
public final class s71 implements g00<r71> {

    /* renamed from: a */
    public final a01<InterfaceC0951cg> f25954a;

    /* renamed from: b */
    public final a01<InterfaceC0951cg> f25955b;

    /* renamed from: c */
    public final a01<AbstractC2223my> f25956c;

    /* renamed from: d */
    public final a01<f91> f25957d;

    /* renamed from: e */
    public final a01<String> f25958e;

    public s71(a01<InterfaceC0951cg> a01Var, a01<InterfaceC0951cg> a01Var2, a01<AbstractC2223my> a01Var3, a01<f91> a01Var4, a01<String> a01Var5) {
        this.f25954a = a01Var;
        this.f25955b = a01Var2;
        this.f25956c = a01Var3;
        this.f25957d = a01Var4;
        this.f25958e = a01Var5;
    }

    /* renamed from: a */
    public static s71 m10599a(a01<InterfaceC0951cg> a01Var, a01<InterfaceC0951cg> a01Var2, a01<AbstractC2223my> a01Var3, a01<f91> a01Var4, a01<String> a01Var5) {
        return new s71(a01Var, a01Var2, a01Var3, a01Var4, a01Var5);
    }

    /* renamed from: c */
    public static r71 m10597c(InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, Object obj, Object obj2, a01<String> a01Var) {
        return new r71(interfaceC0951cg, interfaceC0951cg2, (AbstractC2223my) obj, (f91) obj2, a01Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public r71 get() {
        return m10597c(this.f25954a.get(), this.f25955b.get(), this.f25956c.get(), this.f25957d.get(), this.f25958e);
    }
}
