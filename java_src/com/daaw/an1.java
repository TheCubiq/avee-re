package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class an1 {

    /* renamed from: b */
    public static final br0 f3330b = new br0();

    /* renamed from: a */
    public final Map<br0, i51<?, ?>> f3331a = new HashMap();

    /* renamed from: a */
    public <Z, R> i51<Z, R> m27332a(Class<Z> cls, Class<R> cls2) {
        i51<Z, R> i51Var;
        if (cls.equals(cls2)) {
            return mp1.m15863b();
        }
        br0 br0Var = f3330b;
        synchronized (br0Var) {
            br0Var.m25917a(cls, cls2);
            i51Var = (i51<Z, R>) this.f3331a.get(br0Var);
        }
        if (i51Var != null) {
            return i51Var;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    /* renamed from: b */
    public <Z, R> void m27331b(Class<Z> cls, Class<R> cls2, i51<Z, R> i51Var) {
        this.f3331a.put(new br0(cls, cls2), i51Var);
    }
}
