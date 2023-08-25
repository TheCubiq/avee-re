package com.daaw;

import java.util.concurrent.Executor;
/* renamed from: com.daaw.vr */
/* loaded from: classes.dex */
public final class C3362vr implements g00<C3252ur> {

    /* renamed from: a */
    public final a01<Executor> f30488a;

    /* renamed from: b */
    public final a01<InterfaceC0828ba> f30489b;

    /* renamed from: c */
    public final a01<py1> f30490c;

    /* renamed from: d */
    public final a01<InterfaceC2134ly> f30491d;

    /* renamed from: e */
    public final a01<ri1> f30492e;

    public C3362vr(a01<Executor> a01Var, a01<InterfaceC0828ba> a01Var2, a01<py1> a01Var3, a01<InterfaceC2134ly> a01Var4, a01<ri1> a01Var5) {
        this.f30488a = a01Var;
        this.f30489b = a01Var2;
        this.f30490c = a01Var3;
        this.f30491d = a01Var4;
        this.f30492e = a01Var5;
    }

    /* renamed from: a */
    public static C3362vr m6902a(a01<Executor> a01Var, a01<InterfaceC0828ba> a01Var2, a01<py1> a01Var3, a01<InterfaceC2134ly> a01Var4, a01<ri1> a01Var5) {
        return new C3362vr(a01Var, a01Var2, a01Var3, a01Var4, a01Var5);
    }

    /* renamed from: c */
    public static C3252ur m6900c(Executor executor, InterfaceC0828ba interfaceC0828ba, py1 py1Var, InterfaceC2134ly interfaceC2134ly, ri1 ri1Var) {
        return new C3252ur(executor, interfaceC0828ba, py1Var, interfaceC2134ly, ri1Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public C3252ur get() {
        return m6900c(this.f30488a.get(), this.f30489b.get(), this.f30490c.get(), this.f30491d.get(), this.f30492e.get());
    }
}
