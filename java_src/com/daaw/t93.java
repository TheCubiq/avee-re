package com.daaw;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class t93 {
    public final Map a = new HashMap();
    public final v93 b;

    public t93(v93 v93Var) {
        this.b = v93Var;
    }

    public final v93 a() {
        return this.b;
    }

    public final void b(String str, s93 s93Var) {
        this.a.put(str, s93Var);
    }

    public final void c(String str, String str2, long j) {
        v93 v93Var = this.b;
        s93 s93Var = (s93) this.a.get(str2);
        String[] strArr = {str};
        if (s93Var != null) {
            v93Var.e(s93Var, j, strArr);
        }
        this.a.put(str, new s93(j, null, null));
    }
}
