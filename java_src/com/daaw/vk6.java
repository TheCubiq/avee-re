package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfkz;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class vk6 {

    /* renamed from: a */
    public final HashMap f30290a = new HashMap();

    /* renamed from: a */
    public final uk6 m7076a(jk6 jk6Var, Context context, bk6 bk6Var, bl6 bl6Var) {
        uk6 uk6Var = (uk6) this.f30290a.get(jk6Var);
        if (uk6Var == null) {
            gk6 gk6Var = new gk6(zzfkz.m1092h(jk6Var, context));
            uk6 uk6Var2 = new uk6(gk6Var, new dl6(gk6Var, bk6Var, bl6Var));
            this.f30290a.put(jk6Var, uk6Var2);
            return uk6Var2;
        }
        return uk6Var;
    }
}
