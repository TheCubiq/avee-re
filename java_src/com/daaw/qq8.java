package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class qq8 implements zr8, ln8 {
    public final Object a;
    public yr8 b;
    public jn8 c;
    public final /* synthetic */ sq8 d;

    public qq8(sq8 sq8Var, Object obj) {
        this.d = sq8Var;
        this.b = sq8Var.s(null);
        this.c = sq8Var.q(null);
        this.a = obj;
    }

    @Override // com.daaw.zr8
    public final void K(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (k(i, pr8Var)) {
            this.b.k(ar8Var, a(lr8Var));
        }
    }

    @Override // com.daaw.zr8
    public final void N(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
        if (k(i, pr8Var)) {
            this.b.i(ar8Var, a(lr8Var), iOException, z);
        }
    }

    @Override // com.daaw.zr8
    public final void V(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (k(i, pr8Var)) {
            this.b.g(ar8Var, a(lr8Var));
        }
    }

    @Override // com.daaw.zr8
    public final void W(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (k(i, pr8Var)) {
            this.b.e(ar8Var, a(lr8Var));
        }
    }

    public final lr8 a(lr8 lr8Var) {
        sq8 sq8Var = this.d;
        Object obj = this.a;
        long j = lr8Var.c;
        sq8Var.C(obj, j);
        sq8 sq8Var2 = this.d;
        Object obj2 = this.a;
        long j2 = lr8Var.d;
        sq8Var2.C(obj2, j2);
        return (j == lr8Var.c && j2 == lr8Var.d) ? lr8Var : new lr8(1, lr8Var.a, lr8Var.b, 0, null, j, j2);
    }

    @Override // com.daaw.zr8
    public final void d(int i, pr8 pr8Var, lr8 lr8Var) {
        if (k(i, pr8Var)) {
            this.b.c(a(lr8Var));
        }
    }

    public final boolean k(int i, pr8 pr8Var) {
        pr8 pr8Var2;
        if (pr8Var != null) {
            pr8Var2 = this.d.D(this.a, pr8Var);
            if (pr8Var2 == null) {
                return false;
            }
        } else {
            pr8Var2 = null;
        }
        this.d.B(this.a, i);
        yr8 yr8Var = this.b;
        if (yr8Var.a != i || !it5.t(yr8Var.b, pr8Var2)) {
            this.b = this.d.t(i, pr8Var2, 0L);
        }
        jn8 jn8Var = this.c;
        if (jn8Var.a == i && it5.t(jn8Var.b, pr8Var2)) {
            return true;
        }
        this.c = this.d.r(i, pr8Var2);
        return true;
    }
}
