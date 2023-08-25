package com.daaw;

import java.security.GeneralSecurityException;
import java.util.List;
/* loaded from: classes.dex */
public final class me7 {
    public static final ph7 a = new le7(null);

    public static vh7 a(s97 s97Var) {
        v87 v87Var;
        rh7 rh7Var = new rh7();
        rh7Var.b(s97Var.b());
        for (List<o97> list : s97Var.d()) {
            for (o97 o97Var : list) {
                int g = o97Var.g() - 2;
                if (g == 1) {
                    v87Var = v87.b;
                } else if (g == 2) {
                    v87Var = v87.c;
                } else if (g != 3) {
                    throw new IllegalStateException("Unknown key status");
                } else {
                    v87Var = v87.d;
                }
                rh7Var.a(v87Var, o97Var.a(), o97Var.c());
            }
        }
        if (s97Var.a() != null) {
            rh7Var.c(s97Var.a().a());
        }
        try {
            return rh7Var.d();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
