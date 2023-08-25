package com.daaw;

import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes.dex */
public final class k97 {
    @Deprecated
    public static final d97 a(byte[] bArr) {
        try {
            dn7 Q = dn7.Q(bArr, vr7.a());
            for (cn7 cn7Var : Q.R()) {
                if (cn7Var.M().M() == mm7.UNKNOWN_KEYMATERIAL || cn7Var.M().M() == mm7.SYMMETRIC || cn7Var.M().M() == mm7.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return d97.a(Q);
        } catch (xs7 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
