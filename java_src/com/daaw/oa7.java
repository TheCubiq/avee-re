package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class oa7 extends ee7 {
    public oa7() {
        super(aj7.class, new ja7(a87.class));
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ ce7 m14429k(int i, int i2, int i3) {
        cj7 m24338M = dj7.m24338M();
        m24338M.m25311s(i);
        fj7 m21556M = gj7.m21556M();
        m21556M.m22531s(16);
        m24338M.m25310t((gj7) m21556M.m22315n());
        return new ce7((dj7) m24338M.m22315n(), i3);
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new na7(this, dj7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return aj7.m27435O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        aj7 aj7Var = (aj7) xt7Var;
        xp7.m4825b(aj7Var.m27438L(), 0);
        xp7.m4826a(aj7Var.m27433Q().mo3411o());
        if (aj7Var.m27434P().m21557L() != 12 && aj7Var.m27434P().m21557L() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
