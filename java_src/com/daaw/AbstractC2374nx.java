package com.daaw;
/* renamed from: com.daaw.nx */
/* loaded from: classes.dex */
public abstract class AbstractC2374nx<T> extends mc1 {
    public AbstractC2374nx(b61 b61Var) {
        super(b61Var);
    }

    /* renamed from: g */
    public abstract void mo3081g(ni1 ni1Var, T t);

    /* renamed from: h */
    public final void m14752h(T t) {
        ni1 m16094a = m16094a();
        try {
            mo3081g(m16094a, t);
            m16094a.mo15166S();
        } finally {
            m16090f(m16094a);
        }
    }
}
