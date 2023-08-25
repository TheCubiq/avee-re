package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class rh3 implements zg3 {

    /* renamed from: a */
    public final dh5 f25288a;

    public rh3(dh5 dh5Var) {
        ry0.m10829k(dh5Var, "The Inspector Manager must not be null");
        this.f25288a = dh5Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
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
        this.f25288a.m24402i((String) map.get("extras"), j);
    }
}
