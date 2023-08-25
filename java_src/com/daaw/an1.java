package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class an1 {
    public static final br0 b = new br0();
    public final Map<br0, i51<?, ?>> a = new HashMap();

    public <Z, R> i51<Z, R> a(Class<Z> cls, Class<R> cls2) {
        i51<Z, R> i51Var;
        if (cls.equals(cls2)) {
            return mp1.b();
        }
        br0 br0Var = b;
        synchronized (br0Var) {
            br0Var.a(cls, cls2);
            i51Var = (i51<Z, R>) this.a.get(br0Var);
        }
        if (i51Var != null) {
            return i51Var;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    public <Z, R> void b(Class<Z> cls, Class<R> cls2, i51<Z, R> i51Var) {
        this.a.put(new br0(cls, cls2), i51Var);
    }
}
