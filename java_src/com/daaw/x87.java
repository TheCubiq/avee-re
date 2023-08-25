package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class x87 {
    public static w87 a(String str) {
        w87 w87Var = (w87) w97.k().get(str);
        if (w87Var != null) {
            return w87Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
