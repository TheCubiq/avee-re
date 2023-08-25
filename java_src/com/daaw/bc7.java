package com.daaw;

import java.security.InvalidKeyException;
/* loaded from: classes.dex */
public final class bc7 extends ee7 {
    public bc7() {
        super(yj7.class, new zb7(j87.class));
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new ac7(this, bk7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return yj7.m3639O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        yj7 yj7Var = (yj7) xt7Var;
        xp7.m4825b(yj7Var.m3642L(), 0);
        if (yj7Var.m3638P().mo3411o() == 64) {
            return;
        }
        int mo3411o = yj7Var.m3638P().mo3411o();
        throw new InvalidKeyException("invalid key size: " + mo3411o + ". Valid keys must have 64 bytes.");
    }
}
