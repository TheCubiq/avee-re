package com.daaw;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class y97 {

    /* renamed from: a */
    public static final Charset f33440a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static in7 m3982a(dn7 dn7Var) {
        fn7 m19591L = in7.m19591L();
        m19591L.m22475t(dn7Var.m24206M());
        for (cn7 cn7Var : dn7Var.m24201R()) {
            gn7 m20612L = hn7.m20612L();
            m20612L.m21430u(cn7Var.m25204M().m15029Q());
            m20612L.m21429v(cn7Var.m25196U());
            m20612L.m21431t(cn7Var.m25201P());
            m20612L.m21432s(cn7Var.m25205L());
            m19591L.m22476s((hn7) m20612L.m22315n());
        }
        return (in7) m19591L.m22315n();
    }

    /* renamed from: b */
    public static void m3981b(dn7 dn7Var) {
        int m24206M = dn7Var.m24206M();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (cn7 cn7Var : dn7Var.m24201R()) {
            if (cn7Var.m25196U() == 3) {
                if (!cn7Var.m25197T()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cn7Var.m25205L())));
                }
                if (cn7Var.m25201P() == zn7.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cn7Var.m25205L())));
                }
                if (cn7Var.m25196U() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cn7Var.m25205L())));
                }
                if (cn7Var.m25205L() == m24206M) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= cn7Var.m25204M().m15033M() == mm7.ASYMMETRIC_PUBLIC;
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
