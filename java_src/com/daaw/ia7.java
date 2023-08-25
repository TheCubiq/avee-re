package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class ia7 extends ee7 {
    public ia7() {
        super(ri7.class, new ga7(pp7.class));
    }

    public static final void l(ri7 ri7Var) {
        xp7.b(ri7Var.L(), 0);
        xp7.a(ri7Var.R().o());
        m(ri7Var.Q());
    }

    public static final void m(xi7 xi7Var) {
        if (xi7Var.L() < 12 || xi7Var.L() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new ha7(this, ui7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return ri7.P(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        l((ri7) xt7Var);
    }
}
