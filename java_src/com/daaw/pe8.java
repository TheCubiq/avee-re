package com.daaw;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final class pe8 {

    /* renamed from: c */
    public static final pe8 f22878c = new pe8();

    /* renamed from: b */
    public final ConcurrentMap f22880b = new ConcurrentHashMap();

    /* renamed from: a */
    public final xe8 f22879a = new jd8();

    /* renamed from: a */
    public static pe8 m13418a() {
        return f22878c;
    }

    /* renamed from: b */
    public final ve8 m13417b(Class cls) {
        gb8.m21815f(cls, "messageType");
        ve8 ve8Var = (ve8) this.f22880b.get(cls);
        if (ve8Var == null) {
            ve8Var = this.f22879a.mo5168a(cls);
            gb8.m21815f(cls, "messageType");
            gb8.m21815f(ve8Var, "schema");
            ve8 ve8Var2 = (ve8) this.f22880b.putIfAbsent(cls, ve8Var);
            if (ve8Var2 != null) {
                return ve8Var2;
            }
        }
        return ve8Var;
    }
}
