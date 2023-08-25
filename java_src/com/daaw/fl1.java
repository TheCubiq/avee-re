package com.daaw;
/* loaded from: classes2.dex */
public final class fl1 {
    public final nl a;
    public final Object[] b;
    public final al1<Object>[] c;
    public int d;

    public fl1(nl nlVar, int i) {
        this.a = nlVar;
        this.b = new Object[i];
        this.c = new al1[i];
    }

    public final void a(al1<?> al1Var, Object obj) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = obj;
        al1<Object>[] al1VarArr = this.c;
        this.d = i + 1;
        al1VarArr[i] = al1Var;
    }

    public final void b(nl nlVar) {
        int length = this.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            al1<Object> al1Var = this.c[length];
            ug0.c(al1Var);
            al1Var.u(nlVar, this.b[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
