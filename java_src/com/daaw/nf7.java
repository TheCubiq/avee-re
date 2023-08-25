package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class nf7 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public /* synthetic */ nf7(hf7 hf7Var, mf7 mf7Var) {
        this.a = new HashMap(hf7.f(hf7Var));
        this.b = new HashMap(hf7.e(hf7Var));
        this.c = new HashMap(hf7.h(hf7Var));
        this.d = new HashMap(hf7.g(hf7Var));
    }

    public final m87 a(gf7 gf7Var, @Nullable x97 x97Var) {
        jf7 jf7Var = new jf7(gf7Var.getClass(), gf7Var.zzd(), null);
        if (this.b.containsKey(jf7Var)) {
            return ((xd7) this.b.get(jf7Var)).a(gf7Var, x97Var);
        }
        String obj = jf7Var.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }
}
