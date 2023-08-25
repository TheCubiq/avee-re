package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class rh3 implements zg3 {
    public final dh5 a;

    public rh3(dh5 dh5Var) {
        ry0.k(dh5Var, "The Inspector Manager must not be null");
        this.a = dh5Var;
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.a.i((String) map.get("extras"), j);
    }
}
