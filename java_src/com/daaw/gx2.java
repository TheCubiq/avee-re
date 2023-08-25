package com.daaw;
/* loaded from: classes.dex */
public final class gx2 {
    public final rw2 a;
    public final dx2 b;
    public final Object c;
    public final iq2[] d;

    public gx2(rw2 rw2Var, dx2 dx2Var, Object obj, iq2[] iq2VarArr) {
        this.a = rw2Var;
        this.b = dx2Var;
        this.c = obj;
        this.d = iq2VarArr;
    }

    public final boolean a(gx2 gx2Var, int i) {
        return gx2Var != null && pz2.o(this.b.a(i), gx2Var.b.a(i)) && pz2.o(this.d[i], gx2Var.d[i]);
    }
}
