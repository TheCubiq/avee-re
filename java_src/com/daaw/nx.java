package com.daaw;
/* loaded from: classes.dex */
public abstract class nx<T> extends mc1 {
    public nx(b61 b61Var) {
        super(b61Var);
    }

    public abstract void g(ni1 ni1Var, T t);

    public final void h(T t) {
        ni1 a = a();
        try {
            g(a, t);
            a.S();
        } finally {
            f(a);
        }
    }
}
