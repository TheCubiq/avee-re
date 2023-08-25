package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class z81 implements g00<py1> {

    /* renamed from: a */
    public final a01<Context> f34584a;

    /* renamed from: b */
    public final a01<InterfaceC2134ly> f34585b;

    /* renamed from: c */
    public final a01<s81> f34586c;

    /* renamed from: d */
    public final a01<InterfaceC0951cg> f34587d;

    public z81(a01<Context> a01Var, a01<InterfaceC2134ly> a01Var2, a01<s81> a01Var3, a01<InterfaceC0951cg> a01Var4) {
        this.f34584a = a01Var;
        this.f34585b = a01Var2;
        this.f34586c = a01Var3;
        this.f34587d = a01Var4;
    }

    /* renamed from: a */
    public static z81 m2635a(a01<Context> a01Var, a01<InterfaceC2134ly> a01Var2, a01<s81> a01Var3, a01<InterfaceC0951cg> a01Var4) {
        return new z81(a01Var, a01Var2, a01Var3, a01Var4);
    }

    /* renamed from: c */
    public static py1 m2633c(Context context, InterfaceC2134ly interfaceC2134ly, s81 s81Var, InterfaceC0951cg interfaceC0951cg) {
        return (py1) qy0.m11939c(y81.m4017a(context, interfaceC2134ly, s81Var, interfaceC0951cg), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public py1 get() {
        return m2633c(this.f34584a.get(), this.f34585b.get(), this.f34586c.get(), this.f34587d.get());
    }
}
