package com.daaw;

import java.io.File;
/* loaded from: classes.dex */
public class cf<A, T, Z, R> implements ik0<A, T, Z, R>, Cloneable {
    public final ik0<A, T, Z, R> p;
    public d51<File, Z> q;
    public d51<T, Z> r;
    public e51<Z> s;
    public i51<Z, R> t;
    public zw<T> u;

    public cf(ik0<A, T, Z, R> ik0Var) {
        this.p = ik0Var;
    }

    @Override // com.daaw.jp
    public zw<T> a() {
        zw<T> zwVar = this.u;
        return zwVar != null ? zwVar : this.p.a();
    }

    @Override // com.daaw.ik0
    public i51<Z, R> b() {
        i51<Z, R> i51Var = this.t;
        return i51Var != null ? i51Var : this.p.b();
    }

    @Override // com.daaw.jp
    public e51<Z> c() {
        e51<Z> e51Var = this.s;
        return e51Var != null ? e51Var : this.p.c();
    }

    @Override // com.daaw.jp
    public d51<T, Z> d() {
        d51<T, Z> d51Var = this.r;
        return d51Var != null ? d51Var : this.p.d();
    }

    @Override // com.daaw.jp
    public d51<File, Z> e() {
        d51<File, Z> d51Var = this.q;
        return d51Var != null ? d51Var : this.p.e();
    }

    @Override // com.daaw.ik0
    public mq0<A, T> f() {
        return this.p.f();
    }

    /* renamed from: i */
    public cf<A, T, Z, R> clone() {
        try {
            return (cf) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void j(d51<T, Z> d51Var) {
        this.r = d51Var;
    }

    public void k(zw<T> zwVar) {
        this.u = zwVar;
    }
}
