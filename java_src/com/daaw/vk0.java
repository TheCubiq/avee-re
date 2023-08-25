package com.daaw;

import java.util.LinkedHashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public final class vk0 {
    /* renamed from: a */
    public static rk0 m7098a(rk0 rk0Var, rk0 rk0Var2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < rk0Var.m11221g() + rk0Var2.m11221g()) {
            Locale m11224d = i < rk0Var.m11221g() ? rk0Var.m11224d(i) : rk0Var2.m11224d(i - rk0Var.m11221g());
            if (m11224d != null) {
                linkedHashSet.add(m11224d);
            }
            i++;
        }
        return rk0.m11227a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: b */
    public static rk0 m7097b(rk0 rk0Var, rk0 rk0Var2) {
        return (rk0Var == null || rk0Var.m11222f()) ? rk0.m11223e() : m7098a(rk0Var, rk0Var2);
    }
}
