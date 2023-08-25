package com.daaw;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final class pe8 {
    public static final pe8 c = new pe8();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final xe8 a = new jd8();

    public static pe8 a() {
        return c;
    }

    public final ve8 b(Class cls) {
        gb8.f(cls, "messageType");
        ve8 ve8Var = (ve8) this.b.get(cls);
        if (ve8Var == null) {
            ve8Var = this.a.a(cls);
            gb8.f(cls, "messageType");
            gb8.f(ve8Var, "schema");
            ve8 ve8Var2 = (ve8) this.b.putIfAbsent(cls, ve8Var);
            if (ve8Var2 != null) {
                return ve8Var2;
            }
        }
        return ve8Var;
    }
}
