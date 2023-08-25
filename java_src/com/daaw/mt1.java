package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class mt1 {

    /* renamed from: a */
    public final HashMap<String, ht1> f19140a = new HashMap<>();

    /* renamed from: a */
    public final void m15778a() {
        for (ht1 ht1Var : this.f19140a.values()) {
            ht1Var.m20433a();
        }
        this.f19140a.clear();
    }

    /* renamed from: b */
    public final ht1 m15777b(String str) {
        return this.f19140a.get(str);
    }

    /* renamed from: c */
    public Set<String> m15776c() {
        return new HashSet(this.f19140a.keySet());
    }

    /* renamed from: d */
    public final void m15775d(String str, ht1 ht1Var) {
        ht1 put = this.f19140a.put(str, ht1Var);
        if (put != null) {
            put.mo7531d();
        }
    }
}
