package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class cy1 implements g00<by1> {

    /* renamed from: a */
    public final a01<Executor> f6266a;

    /* renamed from: b */
    public final a01<InterfaceC2134ly> f6267b;

    /* renamed from: c */
    public final a01<py1> f6268c;

    /* renamed from: d */
    public final a01<ri1> f6269d;

    public cy1(a01<Executor> a01Var, a01<InterfaceC2134ly> a01Var2, a01<py1> a01Var3, a01<ri1> a01Var4) {
        this.f6266a = a01Var;
        this.f6267b = a01Var2;
        this.f6268c = a01Var3;
        this.f6269d = a01Var4;
    }

    /* renamed from: a */
    public static cy1 m24885a(a01<Executor> a01Var, a01<InterfaceC2134ly> a01Var2, a01<py1> a01Var3, a01<ri1> a01Var4) {
        return new cy1(a01Var, a01Var2, a01Var3, a01Var4);
    }

    /* renamed from: c */
    public static by1 m24883c(Executor executor, InterfaceC2134ly interfaceC2134ly, py1 py1Var, ri1 ri1Var) {
        return new by1(executor, interfaceC2134ly, py1Var, ri1Var);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public by1 get() {
        return m24883c(this.f6266a.get(), this.f6267b.get(), this.f6268c.get(), this.f6269d.get());
    }
}
