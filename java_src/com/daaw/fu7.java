package com.daaw;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class fu7 {

    /* renamed from: c */
    public static final fu7 f9981c = new fu7();

    /* renamed from: b */
    public final ConcurrentMap f9983b = new ConcurrentHashMap();

    /* renamed from: a */
    public final dv7 f9982a = new pt7();

    /* renamed from: a */
    public static fu7 m22255a() {
        return f9981c;
    }

    /* renamed from: b */
    public final cv7 m22254b(Class cls) {
        vs7.m6815f(cls, "messageType");
        cv7 cv7Var = (cv7) this.f9983b.get(cls);
        if (cv7Var == null) {
            cv7Var = this.f9982a.mo13148a(cls);
            vs7.m6815f(cls, "messageType");
            vs7.m6815f(cv7Var, "schema");
            cv7 cv7Var2 = (cv7) this.f9983b.putIfAbsent(cls, cv7Var);
            if (cv7Var2 != null) {
                return cv7Var2;
            }
        }
        return cv7Var;
    }
}
