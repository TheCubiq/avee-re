package com.daaw;
/* loaded from: classes2.dex */
public class i60 implements mf1 {
    public final tj1<String> a;

    public i60(tj1<String> tj1Var) {
        this.a = tj1Var;
    }

    @Override // com.daaw.mf1
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.daaw.mf1
    public boolean b(kw0 kw0Var) {
        if (kw0Var.l() || kw0Var.k() || kw0Var.i()) {
            this.a.e(kw0Var.d());
            return true;
        }
        return false;
    }
}
