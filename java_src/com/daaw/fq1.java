package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class fq1 implements g00<eq1> {

    /* renamed from: a */
    public final a01<Context> f9772a;

    /* renamed from: b */
    public final a01<InterfaceC0828ba> f9773b;

    /* renamed from: c */
    public final a01<InterfaceC2134ly> f9774c;

    /* renamed from: d */
    public final a01<py1> f9775d;

    /* renamed from: e */
    public final a01<Executor> f9776e;

    /* renamed from: f */
    public final a01<ri1> f9777f;

    /* renamed from: g */
    public final a01<InterfaceC0951cg> f9778g;

    /* renamed from: h */
    public final a01<InterfaceC0951cg> f9779h;

    /* renamed from: i */
    public final a01<InterfaceC3072tf> f9780i;

    public fq1(a01<Context> a01Var, a01<InterfaceC0828ba> a01Var2, a01<InterfaceC2134ly> a01Var3, a01<py1> a01Var4, a01<Executor> a01Var5, a01<ri1> a01Var6, a01<InterfaceC0951cg> a01Var7, a01<InterfaceC0951cg> a01Var8, a01<InterfaceC3072tf> a01Var9) {
        this.f9772a = a01Var;
        this.f9773b = a01Var2;
        this.f9774c = a01Var3;
        this.f9775d = a01Var4;
        this.f9776e = a01Var5;
        this.f9777f = a01Var6;
        this.f9778g = a01Var7;
        this.f9779h = a01Var8;
        this.f9780i = a01Var9;
    }

    /* renamed from: a */
    public static fq1 m22417a(a01<Context> a01Var, a01<InterfaceC0828ba> a01Var2, a01<InterfaceC2134ly> a01Var3, a01<py1> a01Var4, a01<Executor> a01Var5, a01<ri1> a01Var6, a01<InterfaceC0951cg> a01Var7, a01<InterfaceC0951cg> a01Var8, a01<InterfaceC3072tf> a01Var9) {
        return new fq1(a01Var, a01Var2, a01Var3, a01Var4, a01Var5, a01Var6, a01Var7, a01Var8, a01Var9);
    }

    /* renamed from: c */
    public static eq1 m22415c(Context context, InterfaceC0828ba interfaceC0828ba, InterfaceC2134ly interfaceC2134ly, py1 py1Var, Executor executor, ri1 ri1Var, InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, InterfaceC3072tf interfaceC3072tf) {
        return new eq1(context, interfaceC0828ba, interfaceC2134ly, py1Var, executor, ri1Var, interfaceC0951cg, interfaceC0951cg2, interfaceC3072tf);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public eq1 get() {
        return m22415c(this.f9772a.get(), this.f9773b.get(), this.f9774c.get(), this.f9775d.get(), this.f9776e.get(), this.f9777f.get(), this.f9778g.get(), this.f9779h.get(), this.f9780i.get());
    }
}
