package com.daaw;
/* loaded from: classes2.dex */
public final class a33 implements b43 {
    public final w07 a;
    public final String b;

    public a33(w07 w07Var, String str) {
        this.a = w07Var;
        this.b = str;
    }

    @Override // com.daaw.b43
    public final w07 a(gl2 gl2Var) {
        w07 a = this.a.a();
        a.e(this.b, gl2Var);
        return a;
    }
}
