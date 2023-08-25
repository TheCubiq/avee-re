package com.daaw;

import java.util.LinkedHashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public final class vk0 {
    public static rk0 a(rk0 rk0Var, rk0 rk0Var2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < rk0Var.g() + rk0Var2.g()) {
            Locale d = i < rk0Var.g() ? rk0Var.d(i) : rk0Var2.d(i - rk0Var.g());
            if (d != null) {
                linkedHashSet.add(d);
            }
            i++;
        }
        return rk0.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static rk0 b(rk0 rk0Var, rk0 rk0Var2) {
        return (rk0Var == null || rk0Var.f()) ? rk0.e() : a(rk0Var, rk0Var2);
    }
}
