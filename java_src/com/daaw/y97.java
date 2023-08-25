package com.daaw;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class y97 {
    public static final Charset a = Charset.forName("UTF-8");

    public static in7 a(dn7 dn7Var) {
        fn7 L = in7.L();
        L.t(dn7Var.M());
        for (cn7 cn7Var : dn7Var.R()) {
            gn7 L2 = hn7.L();
            L2.u(cn7Var.M().Q());
            L2.v(cn7Var.U());
            L2.t(cn7Var.P());
            L2.s(cn7Var.L());
            L.s((hn7) L2.n());
        }
        return (in7) L.n();
    }

    public static void b(dn7 dn7Var) {
        int M = dn7Var.M();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (cn7 cn7Var : dn7Var.R()) {
            if (cn7Var.U() == 3) {
                if (!cn7Var.T()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cn7Var.L())));
                }
                if (cn7Var.P() == zn7.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cn7Var.L())));
                }
                if (cn7Var.U() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cn7Var.L())));
                }
                if (cn7Var.L() == M) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= cn7Var.M().M() == mm7.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
