package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class og7 extends cf7 {
    public og7(Class cls) {
        super(cls);
    }

    @Override // com.daaw.cf7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2495a(xt7 xt7Var) {
        ll7 ll7Var = (ll7) xt7Var;
        int m8026Q = ll7Var.m16853Q().m8026Q();
        SecretKeySpec secretKeySpec = new SecretKeySpec(ll7Var.m16852R().m3415j(), "HMAC");
        int m8031L = ll7Var.m16853Q().m8031L();
        int i = m8026Q - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new tp7(new sp7("HMACSHA224", secretKeySpec), m8031L);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new tp7(new sp7("HMACSHA512", secretKeySpec), m8031L);
                }
                return new tp7(new sp7("HMACSHA256", secretKeySpec), m8031L);
            }
            return new tp7(new sp7("HMACSHA384", secretKeySpec), m8031L);
        }
        return new tp7(new sp7("HMACSHA1", secretKeySpec), m8031L);
    }
}
