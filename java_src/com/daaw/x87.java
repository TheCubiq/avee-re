package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class x87 {
    /* renamed from: a */
    public static w87 m5428a(String str) {
        w87 w87Var = (w87) w97.m6288k().get(str);
        if (w87Var != null) {
            return w87Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
