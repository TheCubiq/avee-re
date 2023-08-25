package com.daaw;
/* loaded from: classes.dex */
public final class xm1 {
    public final int a;
    public final c41[] b;
    public final um1 c;
    public final Object d;

    public xm1(c41[] c41VarArr, com.google.android.exoplayer2.trackselection.c[] cVarArr, Object obj) {
        this.b = c41VarArr;
        this.c = new um1(cVarArr);
        this.d = obj;
        this.a = c41VarArr.length;
    }

    public boolean a(xm1 xm1Var) {
        if (xm1Var == null || xm1Var.c.a != this.c.a) {
            return false;
        }
        for (int i = 0; i < this.c.a; i++) {
            if (!b(xm1Var, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(xm1 xm1Var, int i) {
        return xm1Var != null && sq1.b(this.b[i], xm1Var.b[i]) && sq1.b(this.c.a(i), xm1Var.c.a(i));
    }

    public boolean c(int i) {
        return this.b[i] != null;
    }
}
