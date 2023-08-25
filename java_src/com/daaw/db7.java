package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class db7 extends de7 {
    public final /* synthetic */ eb7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db7(eb7 eb7Var, Class cls) {
        super(cls);
        this.b = eb7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        qn7 M = rn7.M();
        M.s((xn7) xt7Var);
        M.t(0);
        return (rn7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return xn7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ void d(xt7 xt7Var) {
        xn7 xn7Var = (xn7) xt7Var;
        if (xn7Var.P().isEmpty() || !xn7Var.Q()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
