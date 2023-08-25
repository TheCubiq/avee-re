package com.daaw;

import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public class rz7 {
    public final LinkedHashMap a;

    public rz7(int i) {
        this.a = tz7.b(i);
    }

    public final rz7 a(Object obj, m08 m08Var) {
        LinkedHashMap linkedHashMap = this.a;
        e08.a(obj, "key");
        e08.a(m08Var, "provider");
        linkedHashMap.put(obj, m08Var);
        return this;
    }
}
