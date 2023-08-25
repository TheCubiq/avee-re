package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class kd7 extends ee7 {
    public kd7() {
        super(im7.class, new jd7(l87.class));
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.ASYMMETRIC_PUBLIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return im7.m19634Q(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        im7 im7Var = (im7) xt7Var;
        xp7.m4825b(im7Var.m19639L(), 0);
        if (!im7Var.m19629V()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        ld7.m17039a(im7Var.m19638M());
    }
}
