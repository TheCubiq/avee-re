package com.daaw;

import java.security.InvalidKeyException;
/* loaded from: classes.dex */
public final class bc7 extends ee7 {
    public bc7() {
        super(yj7.class, new zb7(j87.class));
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new ac7(this, bk7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return yj7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        yj7 yj7Var = (yj7) xt7Var;
        xp7.b(yj7Var.L(), 0);
        if (yj7Var.P().o() == 64) {
            return;
        }
        int o = yj7Var.P().o();
        throw new InvalidKeyException("invalid key size: " + o + ". Valid keys must have 64 bytes.");
    }
}
