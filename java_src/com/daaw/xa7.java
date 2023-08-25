package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class xa7 extends ee7 {
    public xa7() {
        super(ek7.class, new va7(a87.class));
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new wa7(this, hk7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return ek7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        ek7 ek7Var = (ek7) xt7Var;
        xp7.b(ek7Var.L(), 0);
        if (ek7Var.P().o() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
