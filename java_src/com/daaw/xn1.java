package com.daaw;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class xn1 implements wn1 {

    /* renamed from: e */
    public static volatile yn1 f32825e;

    /* renamed from: a */
    public final InterfaceC0951cg f32826a;

    /* renamed from: b */
    public final InterfaceC0951cg f32827b;

    /* renamed from: c */
    public final q81 f32828c;

    /* renamed from: d */
    public final eq1 f32829d;

    public xn1(InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, q81 q81Var, eq1 eq1Var, by1 by1Var) {
        this.f32826a = interfaceC0951cg;
        this.f32827b = interfaceC0951cg2;
        this.f32828c = q81Var;
        this.f32829d = eq1Var;
        by1Var.m25737c();
    }

    /* renamed from: c */
    public static xn1 m4949c() {
        yn1 yn1Var = f32825e;
        if (yn1Var != null) {
            return yn1Var.mo3484n();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<C0892bx> m4948d(InterfaceC2115lt interfaceC2115lt) {
        return interfaceC2115lt instanceof InterfaceC3380vw ? Collections.unmodifiableSet(((InterfaceC3380vw) interfaceC2115lt).mo6705b()) : Collections.singleton(C0892bx.m25779b("proto"));
    }

    /* renamed from: f */
    public static void m4946f(Context context) {
        if (f32825e == null) {
            synchronized (xn1.class) {
                if (f32825e == null) {
                    f32825e = C3247uo.m7887q().mo3482b(context).mo3483a();
                }
            }
        }
    }

    @Override // com.daaw.wn1
    /* renamed from: a */
    public void mo4951a(db1 db1Var, ao1 ao1Var) {
        this.f32828c.mo7798a(db1Var.mo13578f().m10149f(db1Var.mo13580c().mo4417c()), m4950b(db1Var), ao1Var);
    }

    /* renamed from: b */
    public final AbstractC0896by m4950b(db1 db1Var) {
        return AbstractC0896by.m25748a().mo25495i(this.f32826a.mo21345a()).mo25493k(this.f32827b.mo21345a()).mo25494j(db1Var.mo13577g()).mo25496h(new C3475ww(db1Var.mo13581b(), db1Var.m24570d())).mo25497g(db1Var.mo13580c().mo4419a()).mo25500d();
    }

    /* renamed from: e */
    public eq1 m4947e() {
        return this.f32829d;
    }

    /* renamed from: g */
    public tn1 m4945g(InterfaceC2115lt interfaceC2115lt) {
        return new un1(m4948d(interfaceC2115lt), sn1.m10151a().mo6332b(interfaceC2115lt.mo16572a()).mo6331c(interfaceC2115lt.getExtras()).mo6333a(), this);
    }
}
