package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class hc7 extends df7 {
    public static final byte[] e = new byte[0];

    public hc7() {
        super(yk7.class, bl7.class, new fc7(k87.class));
    }

    public static /* bridge */ /* synthetic */ ce7 l(int i, int i2, int i3, w87 w87Var, byte[] bArr, int i4) {
        rk7 L = sk7.L();
        dl7 L2 = el7.L();
        L2.t(4);
        L2.u(5);
        L2.s(yq7.F(bArr));
        el7 el7Var = (el7) L2.n();
        um7 L3 = vm7.L();
        L3.t(w87Var.b());
        L3.u(yq7.F(w87Var.c()));
        int d = w87Var.d() - 1;
        L3.s(d != 0 ? d != 1 ? d != 2 ? zn7.CRUNCHY : zn7.RAW : zn7.LEGACY : zn7.TINK);
        ok7 L4 = pk7.L();
        L4.s((vm7) L3.n());
        uk7 M = vk7.M();
        M.t(el7Var);
        M.s((pk7) L4.n());
        M.u(i3);
        L.s((vk7) M.n());
        return new ce7((sk7) L.n(), i4);
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new gc7(this, sk7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.ASYMMETRIC_PRIVATE;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return yk7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        yk7 yk7Var = (yk7) xt7Var;
        if (yk7Var.Q().h()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        xp7.b(yk7Var.L(), 0);
        tc7.a(yk7Var.P().M());
    }
}
