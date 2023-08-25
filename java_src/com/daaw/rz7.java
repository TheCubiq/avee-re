package com.daaw;

import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public class rz7 {

    /* renamed from: a */
    public final LinkedHashMap f25733a;

    public rz7(int i) {
        this.f25733a = tz7.m8659b(i);
    }

    /* renamed from: a */
    public final rz7 m10813a(Object obj, m08 m08Var) {
        LinkedHashMap linkedHashMap = this.f25733a;
        e08.m23802a(obj, "key");
        e08.m23802a(m08Var, "provider");
        linkedHashMap.put(obj, m08Var);
        return this;
    }
}
