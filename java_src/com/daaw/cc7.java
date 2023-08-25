package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class cc7 {
    public static final String a;
    @Deprecated
    public static final co7 b;
    @Deprecated
    public static final co7 c;

    static {
        new bc7();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        b = co7.M();
        c = co7.M();
        try {
            w97.o(new ec7());
            if (yb7.b()) {
                return;
            }
            w97.n(new bc7(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
