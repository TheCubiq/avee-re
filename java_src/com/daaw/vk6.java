package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfkz;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class vk6 {
    public final HashMap a = new HashMap();

    public final uk6 a(jk6 jk6Var, Context context, bk6 bk6Var, bl6 bl6Var) {
        uk6 uk6Var = (uk6) this.a.get(jk6Var);
        if (uk6Var == null) {
            gk6 gk6Var = new gk6(zzfkz.h(jk6Var, context));
            uk6 uk6Var2 = new uk6(gk6Var, new dl6(gk6Var, bk6Var, bl6Var));
            this.a.put(jk6Var, uk6Var2);
            return uk6Var2;
        }
        return uk6Var;
    }
}
