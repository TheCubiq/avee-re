package com.daaw;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class kh7 implements t97 {

    /* renamed from: a */
    public static final Logger f16387a = Logger.getLogger(kh7.class.getName());

    /* renamed from: b */
    public static final byte[] f16388b = {0};

    @Override // com.daaw.t97
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9420a(s97 s97Var) {
        for (List<o97> list : s97Var.m10487d()) {
            for (o97 o97Var : list) {
                if (o97Var.m14440b() instanceof gh7) {
                    gh7 gh7Var = (gh7) o97Var.m14440b();
                    dq7 m24078b = dq7.m24078b(o97Var.m14436f());
                    if (!m24078b.equals(gh7Var.mo9193c())) {
                        String valueOf = String.valueOf(gh7Var.mo9194b());
                        String obj = gh7Var.mo9193c().toString();
                        String obj2 = m24078b.toString();
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
