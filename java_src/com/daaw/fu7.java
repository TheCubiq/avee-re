package com.daaw;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class fu7 {
    public static final fu7 c = new fu7();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final dv7 a = new pt7();

    public static fu7 a() {
        return c;
    }

    public final cv7 b(Class cls) {
        vs7.f(cls, "messageType");
        cv7 cv7Var = (cv7) this.b.get(cls);
        if (cv7Var == null) {
            cv7Var = this.a.a(cls);
            vs7.f(cls, "messageType");
            vs7.f(cv7Var, "schema");
            cv7 cv7Var2 = (cv7) this.b.putIfAbsent(cls, cv7Var);
            if (cv7Var2 != null) {
                return cv7Var2;
            }
        }
        return cv7Var;
    }
}
