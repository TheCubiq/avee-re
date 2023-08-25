package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class ia7 extends ee7 {
    public ia7() {
        super(ri7.class, new ga7(pp7.class));
    }

    /* renamed from: l */
    public static final void m19998l(ri7 ri7Var) {
        xp7.m4825b(ri7Var.m11284L(), 0);
        xp7.m4826a(ri7Var.m11278R().mo3411o());
        m19997m(ri7Var.m11279Q());
    }

    /* renamed from: m */
    public static final void m19997m(xi7 xi7Var) {
        if (xi7Var.m5061L() < 12 || xi7Var.m5061L() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new ha7(this, ui7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return ri7.m11280P(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        m19998l((ri7) xt7Var);
    }
}
