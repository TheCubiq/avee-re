package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class mt1 {
    public final HashMap<String, ht1> a = new HashMap<>();

    public final void a() {
        for (ht1 ht1Var : this.a.values()) {
            ht1Var.a();
        }
        this.a.clear();
    }

    public final ht1 b(String str) {
        return this.a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, ht1 ht1Var) {
        ht1 put = this.a.put(str, ht1Var);
        if (put != null) {
            put.d();
        }
    }
}
