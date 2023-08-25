package com.daaw;

import android.content.Context;
/* renamed from: com.daaw.gn */
/* loaded from: classes.dex */
public final class C1448gn implements g00<C1307fn> {

    /* renamed from: a */
    public final a01<Context> f11447a;

    /* renamed from: b */
    public final a01<InterfaceC0951cg> f11448b;

    /* renamed from: c */
    public final a01<InterfaceC0951cg> f11449c;

    public C1448gn(a01<Context> a01Var, a01<InterfaceC0951cg> a01Var2, a01<InterfaceC0951cg> a01Var3) {
        this.f11447a = a01Var;
        this.f11448b = a01Var2;
        this.f11449c = a01Var3;
    }

    /* renamed from: a */
    public static C1448gn m21486a(a01<Context> a01Var, a01<InterfaceC0951cg> a01Var2, a01<InterfaceC0951cg> a01Var3) {
        return new C1448gn(a01Var, a01Var2, a01Var3);
    }

    /* renamed from: c */
    public static C1307fn m21484c(Context context, InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2) {
        return new C1307fn(context, interfaceC0951cg, interfaceC0951cg2);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public C1307fn get() {
        return m21484c(this.f11447a.get(), this.f11448b.get(), this.f11449c.get());
    }
}
