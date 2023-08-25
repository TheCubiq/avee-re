package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class hb7 extends ee7 {
    public hb7() {
        super(fo7.class, new fb7(a87.class));
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new gb7(this, io7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return fo7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        fo7 fo7Var = (fo7) xt7Var;
        xp7.b(fo7Var.L(), 0);
        if (fo7Var.P().o() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
