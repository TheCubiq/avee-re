package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class kc7 {
    @Deprecated
    public static final co7 a;
    @Deprecated
    public static final co7 b;
    @Deprecated
    public static final co7 c;

    static {
        new jc7();
        new hc7();
        a = co7.M();
        b = co7.M();
        c = co7.M();
        try {
            w97.o(new mc7());
            w97.o(new pc7());
            z97.a();
            if (yb7.b()) {
                return;
            }
            w97.l(new hc7(), new jc7(), true);
            w97.l(new id7(), new kd7(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
