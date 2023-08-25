package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class hc7 extends df7 {

    /* renamed from: e */
    public static final byte[] f12420e = new byte[0];

    public hc7() {
        super(yk7.class, bl7.class, new fc7(k87.class));
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ ce7 m20842l(int i, int i2, int i3, w87 w87Var, byte[] bArr, int i4) {
        rk7 m10225L = sk7.m10225L();
        dl7 m23390L = el7.m23390L();
        m23390L.m24254t(4);
        m23390L.m24253u(5);
        m23390L.m24255s(yq7.m3424F(bArr));
        el7 el7Var = (el7) m23390L.m22315n();
        um7 m7028L = vm7.m7028L();
        m7028L.m8015t(w87Var.m6341b());
        m7028L.m8014u(yq7.m3424F(w87Var.m6340c()));
        int m6339d = w87Var.m6339d() - 1;
        m7028L.m8016s(m6339d != 0 ? m6339d != 1 ? m6339d != 2 ? zn7.CRUNCHY : zn7.RAW : zn7.LEGACY : zn7.TINK);
        ok7 m13320L = pk7.m13320L();
        m13320L.m14205s((vm7) m7028L.m22315n());
        uk7 m7074M = vk7.m7074M();
        m7074M.m8079t(el7Var);
        m7074M.m8080s((pk7) m13320L.m22315n());
        m7074M.m8078u(i3);
        m10225L.m11210s((vk7) m7074M.m22315n());
        return new ce7((sk7) m10225L.m22315n(), i4);
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new gc7(this, sk7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.ASYMMETRIC_PRIVATE;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return yk7.m3607O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        yk7 yk7Var = (yk7) xt7Var;
        if (yk7Var.m3605Q().m3416h()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        xp7.m4825b(yk7Var.m3610L(), 0);
        tc7.m9305a(yk7Var.m3606P().m26064M());
    }
}
