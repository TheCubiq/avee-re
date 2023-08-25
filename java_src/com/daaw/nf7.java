package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class nf7 {

    /* renamed from: a */
    public final Map f20092a;

    /* renamed from: b */
    public final Map f20093b;

    /* renamed from: c */
    public final Map f20094c;

    /* renamed from: d */
    public final Map f20095d;

    public /* synthetic */ nf7(hf7 hf7Var, mf7 mf7Var) {
        this.f20092a = new HashMap(hf7.m20823f(hf7Var));
        this.f20093b = new HashMap(hf7.m20824e(hf7Var));
        this.f20094c = new HashMap(hf7.m20821h(hf7Var));
        this.f20095d = new HashMap(hf7.m20822g(hf7Var));
    }

    /* renamed from: a */
    public final m87 m15192a(gf7 gf7Var, @Nullable x97 x97Var) {
        jf7 jf7Var = new jf7(gf7Var.getClass(), gf7Var.zzd(), null);
        if (this.f20093b.containsKey(jf7Var)) {
            return ((xd7) this.f20093b.get(jf7Var)).mo5203a(gf7Var, x97Var);
        }
        String obj = jf7Var.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }
}
