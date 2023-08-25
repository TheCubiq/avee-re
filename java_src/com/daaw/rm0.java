package com.daaw;
/* loaded from: classes2.dex */
public abstract class rm0 extends pl {
    public abstract rm0 W();

    public final String X() {
        rm0 rm0Var;
        rm0 b = gu.b();
        if (this == b) {
            return "Dispatchers.Main";
        }
        try {
            rm0Var = b.W();
        } catch (UnsupportedOperationException unused) {
            rm0Var = null;
        }
        if (this == rm0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // com.daaw.pl
    public String toString() {
        String X = X();
        if (X == null) {
            return aq.a(this) + '@' + aq.b(this);
        }
        return X;
    }
}
