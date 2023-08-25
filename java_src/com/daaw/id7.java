package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class id7 extends df7 {
    public id7() {
        super(fm7.class, im7.class, new gd7(k87.class));
    }

    public static /* bridge */ /* synthetic */ ce7 k(int i, int i2, int i3, int i4) {
        bm7 L = cm7.L();
        L.u(i);
        L.t(i2);
        L.s(i3);
        yl7 L2 = zl7.L();
        L2.s((cm7) L.n());
        return new ce7((zl7) L2.n(), i4);
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new hd7(this, zl7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.ASYMMETRIC_PRIVATE;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return fm7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        fm7 fm7Var = (fm7) xt7Var;
        if (fm7Var.Q().h()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!fm7Var.U()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        xp7.b(fm7Var.L(), 0);
        ld7.a(fm7Var.P().M());
    }
}
