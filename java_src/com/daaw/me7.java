package com.daaw;

import java.security.GeneralSecurityException;
import java.util.List;
/* loaded from: classes.dex */
public final class me7 {

    /* renamed from: a */
    public static final ph7 f18845a = new le7(null);

    /* renamed from: a */
    public static vh7 m16048a(s97 s97Var) {
        v87 v87Var;
        rh7 rh7Var = new rh7();
        rh7Var.m11303b(s97Var.m10489b());
        for (List<o97> list : s97Var.m10487d()) {
            for (o97 o97Var : list) {
                int m14435g = o97Var.m14435g() - 2;
                if (m14435g == 1) {
                    v87Var = v87.f30036b;
                } else if (m14435g == 2) {
                    v87Var = v87.f30037c;
                } else if (m14435g != 3) {
                    throw new IllegalStateException("Unknown key status");
                } else {
                    v87Var = v87.f30038d;
                }
                rh7Var.m11304a(v87Var, o97Var.m14441a(), o97Var.m14439c());
            }
        }
        if (s97Var.m10490a() != null) {
            rh7Var.m11302c(s97Var.m10490a().m14441a());
        }
        try {
            return rh7Var.m11301d();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
