package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class db7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ eb7 f6901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db7(eb7 eb7Var, Class cls) {
        super(cls);
        this.f6901b = eb7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        qn7 m11140M = rn7.m11140M();
        m11140M.m12320s((xn7) xt7Var);
        m11140M.m12319t(0);
        return (rn7) m11140M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return xn7.m4941O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        xn7 xn7Var = (xn7) xt7Var;
        if (xn7Var.m4940P().isEmpty() || !xn7Var.m4939Q()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
