package com.daaw;

import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes.dex */
public final class k97 {
    @Deprecated
    /* renamed from: a */
    public static final d97 m17935a(byte[] bArr) {
        try {
            dn7 m24202Q = dn7.m24202Q(bArr, vr7.m6834a());
            for (cn7 cn7Var : m24202Q.m24201R()) {
                if (cn7Var.m25204M().m15033M() == mm7.UNKNOWN_KEYMATERIAL || cn7Var.m25204M().m15033M() == mm7.SYMMETRIC || cn7Var.m25204M().m15033M() == mm7.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return d97.m24591a(m24202Q);
        } catch (xs7 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
