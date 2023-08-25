package com.daaw;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class kh7 implements t97 {
    public static final Logger a = Logger.getLogger(kh7.class.getName());
    public static final byte[] b = {0};

    @Override // com.daaw.t97
    public final /* bridge */ /* synthetic */ Object a(s97 s97Var) {
        for (List<o97> list : s97Var.d()) {
            for (o97 o97Var : list) {
                if (o97Var.b() instanceof gh7) {
                    gh7 gh7Var = (gh7) o97Var.b();
                    dq7 b2 = dq7.b(o97Var.f());
                    if (!b2.equals(gh7Var.c())) {
                        String valueOf = String.valueOf(gh7Var.b());
                        String obj = gh7Var.c().toString();
                        String obj2 = b2.toString();
                        throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + obj + ") instead of (" + obj2 + ")");
                    }
                }
            }
        }
        return new jh7(s97Var, null);
    }

    @Override // com.daaw.t97
    public final Class zza() {
        return g97.class;
    }

    @Override // com.daaw.t97
    public final Class zzb() {
        return g97.class;
    }
}
