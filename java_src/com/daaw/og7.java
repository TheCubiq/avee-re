package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class og7 extends cf7 {
    public og7(Class cls) {
        super(cls);
    }

    @Override // com.daaw.cf7
    public final /* bridge */ /* synthetic */ Object a(xt7 xt7Var) {
        ll7 ll7Var = (ll7) xt7Var;
        int Q = ll7Var.Q().Q();
        SecretKeySpec secretKeySpec = new SecretKeySpec(ll7Var.R().j(), "HMAC");
        int L = ll7Var.Q().L();
        int i = Q - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new tp7(new sp7("HMACSHA224", secretKeySpec), L);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new tp7(new sp7("HMACSHA512", secretKeySpec), L);
                }
                return new tp7(new sp7("HMACSHA256", secretKeySpec), L);
            }
            return new tp7(new sp7("HMACSHA384", secretKeySpec), L);
        }
        return new tp7(new sp7("HMACSHA1", secretKeySpec), L);
    }
}
