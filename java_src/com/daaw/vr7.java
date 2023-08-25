package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class vr7 {
    public static volatile vr7 b;
    public static final vr7 c = new vr7(true);
    public final Map a;

    public vr7() {
        this.a = new HashMap();
    }

    public vr7(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static vr7 a() {
        return c;
    }

    public static vr7 b() {
        vr7 vr7Var = b;
        if (vr7Var != null) {
            return vr7Var;
        }
        synchronized (vr7.class) {
            vr7 vr7Var2 = b;
            if (vr7Var2 != null) {
                return vr7Var2;
            }
            vr7 b2 = ds7.b(vr7.class);
            b = b2;
            return b2;
        }
    }

    public final ks7 c(xt7 xt7Var, int i) {
        return (ks7) this.a.get(new ur7(xt7Var, i));
    }
}
