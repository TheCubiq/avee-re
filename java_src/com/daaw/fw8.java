package com.daaw;
/* loaded from: classes.dex */
public final class fw8 {
    public final int a;
    public final x98[] b;
    public final tv8[] c;
    public final ni4 d;
    public final Object e;

    public fw8(x98[] x98VarArr, tv8[] tv8VarArr, ni4 ni4Var, Object obj) {
        this.b = x98VarArr;
        this.c = (tv8[]) tv8VarArr.clone();
        this.d = ni4Var;
        this.e = obj;
        this.a = x98VarArr.length;
    }

    public final boolean a(fw8 fw8Var, int i) {
        return fw8Var != null && it5.t(this.b[i], fw8Var.b[i]) && it5.t(this.c[i], fw8Var.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
