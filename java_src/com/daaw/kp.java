package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class kp {
    public static final br0 b = new br0();
    public final Map<br0, jp<?, ?>> a = new HashMap();

    public <T, Z> jp<T, Z> a(Class<T> cls, Class<Z> cls2) {
        jp<T, Z> jpVar;
        br0 br0Var = b;
        synchronized (br0Var) {
            br0Var.a(cls, cls2);
            jpVar = (jp<T, Z>) this.a.get(br0Var);
        }
        return jpVar == null ? nw.g() : jpVar;
    }

    public <T, Z> void b(Class<T> cls, Class<Z> cls2, jp<T, Z> jpVar) {
        this.a.put(new br0(cls, cls2), jpVar);
    }
}
