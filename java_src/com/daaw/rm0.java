package com.daaw;
/* loaded from: classes2.dex */
public abstract class rm0 extends AbstractC2557pl {
    /* renamed from: W */
    public abstract rm0 mo11184W();

    /* renamed from: X */
    public final String m11183X() {
        rm0 rm0Var;
        rm0 m21230b = C1470gu.m21230b();
        if (this == m21230b) {
            return "Dispatchers.Main";
        }
        try {
            rm0Var = m21230b.mo11184W();
        } catch (UnsupportedOperationException unused) {
            rm0Var = null;
        }
        if (this == rm0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // com.daaw.AbstractC2557pl
    public String toString() {
        String m11183X = m11183X();
        if (m11183X == null) {
            return C0666aq.m27227a(this) + '@' + C0666aq.m27226b(this);
        }
        return m11183X;
    }
}
