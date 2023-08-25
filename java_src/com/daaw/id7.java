package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class id7 extends df7 {
    public id7() {
        super(fm7.class, im7.class, new gd7(k87.class));
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ ce7 m19912k(int i, int i2, int i3, int i4) {
        bm7 m25240L = cm7.m25240L();
        m25240L.m25991u(i);
        m25240L.m25992t(i2);
        m25240L.m25993s(i3);
        yl7 m2124L = zl7.m2124L();
        m2124L.m3571s((cm7) m25240L.m22315n());
        return new ce7((zl7) m2124L.m22315n(), i4);
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new hd7(this, zl7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.ASYMMETRIC_PRIVATE;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return fm7.m22490O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        fm7 fm7Var = (fm7) xt7Var;
        if (fm7Var.m22488Q().m3416h()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!fm7Var.m22484U()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        xp7.m4825b(fm7Var.m22493L(), 0);
        ld7.m17039a(fm7Var.m22489P().m19638M());
    }
}
