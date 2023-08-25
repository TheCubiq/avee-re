package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class wf7 extends ee7 {
    public wf7() {
        super(zh7.class, new uf7(g97.class));
    }

    /* renamed from: m */
    public static void m6083m(ii7 ii7Var) {
        if (ii7Var.m19764L() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (ii7Var.m19764L() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: n */
    public static void m6082n(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new vf7(this, ci7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return zh7.m2291O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        zh7 zh7Var = (zh7) xt7Var;
        xp7.m4825b(zh7Var.m2294L(), 0);
        m6082n(zh7Var.m2289Q().mo3411o());
        m6083m(zh7Var.m2290P());
    }
}
