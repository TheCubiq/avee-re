package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class l88 {
    public static volatile l88 b;
    public static final l88 c = new l88(true);
    public final Map a;

    public l88() {
        this.a = new HashMap();
    }

    public l88(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static l88 a() {
        l88 l88Var = b;
        if (l88Var != null) {
            return l88Var;
        }
        synchronized (l88.class) {
            l88 l88Var2 = b;
            if (l88Var2 != null) {
                return l88Var2;
            }
            l88 b2 = j98.b(l88.class);
            b = b2;
            return b2;
        }
    }

    public final ea8 b(zd8 zd8Var, int i) {
        return (ea8) this.a.get(new i88(zd8Var, i));
    }
}
