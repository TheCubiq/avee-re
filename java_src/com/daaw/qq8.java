package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class qq8 implements zr8, ln8 {

    /* renamed from: a */
    public final Object f24264a;

    /* renamed from: b */
    public yr8 f24265b;

    /* renamed from: c */
    public jn8 f24266c;

    /* renamed from: d */
    public final /* synthetic */ sq8 f24267d;

    public qq8(sq8 sq8Var, Object obj) {
        this.f24267d = sq8Var;
        this.f24265b = sq8Var.m16641s(null);
        this.f24266c = sq8Var.m16643q(null);
        this.f24264a = obj;
    }

    @Override // com.daaw.zr8
    /* renamed from: K */
    public final void mo1961K(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (m12275k(i, pr8Var)) {
            this.f24265b.m3362k(ar8Var, m12276a(lr8Var));
        }
    }

    @Override // com.daaw.zr8
    /* renamed from: N */
    public final void mo1960N(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
        if (m12275k(i, pr8Var)) {
            this.f24265b.m3364i(ar8Var, m12276a(lr8Var), iOException, z);
        }
    }

    @Override // com.daaw.zr8
    /* renamed from: V */
    public final void mo1959V(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (m12275k(i, pr8Var)) {
            this.f24265b.m3366g(ar8Var, m12276a(lr8Var));
        }
    }

    @Override // com.daaw.zr8
    /* renamed from: W */
    public final void mo1958W(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (m12275k(i, pr8Var)) {
            this.f24265b.m3368e(ar8Var, m12276a(lr8Var));
        }
    }

    /* renamed from: a */
    public final lr8 m12276a(lr8 lr8Var) {
        sq8 sq8Var = this.f24267d;
        Object obj = this.f24264a;
        long j = lr8Var.f17672c;
        sq8Var.mo9986C(obj, j);
        sq8 sq8Var2 = this.f24267d;
        Object obj2 = this.f24264a;
        long j2 = lr8Var.f17673d;
        sq8Var2.mo9986C(obj2, j2);
        return (j == lr8Var.f17672c && j2 == lr8Var.f17673d) ? lr8Var : new lr8(1, lr8Var.f17670a, lr8Var.f17671b, 0, null, j, j2);
    }

    @Override // com.daaw.zr8
    /* renamed from: d */
    public final void mo1957d(int i, pr8 pr8Var, lr8 lr8Var) {
        if (m12275k(i, pr8Var)) {
            this.f24265b.m3370c(m12276a(lr8Var));
        }
    }

    /* renamed from: k */
    public final boolean m12275k(int i, pr8 pr8Var) {
        pr8 pr8Var2;
        if (pr8Var != null) {
            pr8Var2 = this.f24267d.mo9985D(this.f24264a, pr8Var);
            if (pr8Var2 == null) {
                return false;
            }
        } else {
            pr8Var2 = null;
        }
        this.f24267d.mo9987B(this.f24264a, i);
        yr8 yr8Var = this.f24265b;
        if (yr8Var.f33991a != i || !it5.m19376t(yr8Var.f33992b, pr8Var2)) {
            this.f24265b = this.f24267d.m16640t(i, pr8Var2, 0L);
        }
        jn8 jn8Var = this.f24266c;
        if (jn8Var.f15251a == i && it5.m19376t(jn8Var.f15252b, pr8Var2)) {
            return true;
        }
        this.f24266c = this.f24267d.m16642r(i, pr8Var2);
        return true;
    }
}
