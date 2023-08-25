package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class fh7 {
    @Deprecated
    public static final co7 a;
    @Deprecated
    public static final co7 b;
    @Deprecated
    public static final co7 c;

    static {
        new qg7();
        co7 M = co7.M();
        a = M;
        b = M;
        c = M;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        w97.o(new kh7());
        w97.n(new qg7(), true);
        bh7.a();
        if (yb7.b()) {
            return;
        }
        w97.n(new wf7(), true);
        jg7.a();
    }
}
