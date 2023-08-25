package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class kd7 extends ee7 {
    public kd7() {
        super(im7.class, new jd7(l87.class));
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.ASYMMETRIC_PUBLIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return im7.Q(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        im7 im7Var = (im7) xt7Var;
        xp7.b(im7Var.L(), 0);
        if (!im7Var.V()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        ld7.a(im7Var.M());
    }
}
