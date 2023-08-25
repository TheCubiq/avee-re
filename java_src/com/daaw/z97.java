package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class z97 {
    public static final String a;
    public static final String b;
    @Deprecated
    public static final co7 c;
    @Deprecated
    public static final co7 d;
    @Deprecated
    public static final co7 e;

    static {
        new fa7();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new ra7();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new ua7();
        new oa7();
        new ab7();
        new eb7();
        new xa7();
        new hb7();
        co7 M = co7.M();
        c = M;
        d = M;
        e = M;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        w97.o(new ca7());
        fh7.a();
        w97.n(new fa7(), true);
        w97.n(new ra7(), true);
        if (yb7.b()) {
            return;
        }
        w97.n(new oa7(), true);
        ua7.k(true);
        w97.n(new xa7(), true);
        w97.n(new ab7(), true);
        w97.n(new eb7(), true);
        w97.n(new hb7(), true);
    }
}
