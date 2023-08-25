package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class wf7 extends ee7 {
    public wf7() {
        super(zh7.class, new uf7(g97.class));
    }

    public static void m(ii7 ii7Var) {
        if (ii7Var.L() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (ii7Var.L() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void n(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new vf7(this, ci7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return zh7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        zh7 zh7Var = (zh7) xt7Var;
        xp7.b(zh7Var.L(), 0);
        n(zh7Var.Q().o());
        m(zh7Var.P());
    }
}
