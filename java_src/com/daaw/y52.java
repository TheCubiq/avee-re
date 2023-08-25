package com.daaw;
/* loaded from: classes.dex */
public abstract class y52 {
    public final m42 a;

    public y52(m42 m42Var) {
        this.a = m42Var;
    }

    public abstract boolean a(ik5 ik5Var);

    public abstract boolean b(ik5 ik5Var, long j);

    public final boolean c(ik5 ik5Var, long j) {
        return a(ik5Var) && b(ik5Var, j);
    }
}
