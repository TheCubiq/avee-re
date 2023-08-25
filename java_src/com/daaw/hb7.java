package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class hb7 extends ee7 {
    public hb7() {
        super(fo7.class, new fb7(a87.class));
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new gb7(this, io7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return fo7.m22440O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        fo7 fo7Var = (fo7) xt7Var;
        xp7.m4825b(fo7Var.m22443L(), 0);
        if (fo7Var.m22439P().mo3411o() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
