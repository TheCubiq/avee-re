package com.daaw;

import java.io.File;
/* renamed from: com.daaw.cf */
/* loaded from: classes.dex */
public class C0950cf<A, T, Z, R> implements ik0<A, T, Z, R>, Cloneable {

    /* renamed from: p */
    public final ik0<A, T, Z, R> f5771p;

    /* renamed from: q */
    public d51<File, Z> f5772q;

    /* renamed from: r */
    public d51<T, Z> f5773r;

    /* renamed from: s */
    public e51<Z> f5774s;

    /* renamed from: t */
    public i51<Z, R> f5775t;

    /* renamed from: u */
    public InterfaceC3911zw<T> f5776u;

    public C0950cf(ik0<A, T, Z, R> ik0Var) {
        this.f5771p = ik0Var;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<T> mo6618a() {
        InterfaceC3911zw<T> interfaceC3911zw = this.f5776u;
        return interfaceC3911zw != null ? interfaceC3911zw : this.f5771p.mo6618a();
    }

    @Override // com.daaw.ik0
    /* renamed from: b */
    public i51<Z, R> mo18073b() {
        i51<Z, R> i51Var = this.f5775t;
        return i51Var != null ? i51Var : this.f5771p.mo18073b();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<Z> mo6617c() {
        e51<Z> e51Var = this.f5774s;
        return e51Var != null ? e51Var : this.f5771p.mo6617c();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<T, Z> mo6616d() {
        d51<T, Z> d51Var = this.f5773r;
        return d51Var != null ? d51Var : this.f5771p.mo6616d();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, Z> mo6615e() {
        d51<File, Z> d51Var = this.f5772q;
        return d51Var != null ? d51Var : this.f5771p.mo6615e();
    }

    @Override // com.daaw.ik0
    /* renamed from: f */
    public mq0<A, T> mo18072f() {
        return this.f5771p.mo18072f();
    }

    /* renamed from: i */
    public C0950cf<A, T, Z, R> clone() {
        try {
            return (C0950cf) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public void m25406j(d51<T, Z> d51Var) {
        this.f5773r = d51Var;
    }

    /* renamed from: k */
    public void m25405k(InterfaceC3911zw<T> interfaceC3911zw) {
        this.f5776u = interfaceC3911zw;
    }
}
