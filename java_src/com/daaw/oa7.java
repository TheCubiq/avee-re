package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class oa7 extends ee7 {
    public oa7() {
        super(aj7.class, new ja7(a87.class));
    }

    public static /* bridge */ /* synthetic */ ce7 k(int i, int i2, int i3) {
        cj7 M = dj7.M();
        M.s(i);
        fj7 M2 = gj7.M();
        M2.s(16);
        M.t((gj7) M2.n());
        return new ce7((dj7) M.n(), i3);
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new na7(this, dj7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return aj7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        aj7 aj7Var = (aj7) xt7Var;
        xp7.b(aj7Var.L(), 0);
        xp7.a(aj7Var.Q().o());
        if (aj7Var.P().L() != 12 && aj7Var.P().L() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
