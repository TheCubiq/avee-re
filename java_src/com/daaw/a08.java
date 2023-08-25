package com.daaw;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a08 extends sz7 {
    public static final m08 b = xz7.a(Collections.emptyMap());

    public /* synthetic */ a08(Map map, yz7 yz7Var) {
        super(map);
    }

    public static zz7 b(int i) {
        return new zz7(i, null);
    }

    @Override // com.daaw.m08
    /* renamed from: c */
    public final Map zzb() {
        LinkedHashMap b2 = tz7.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            b2.put(entry.getKey(), ((m08) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(b2);
    }
}
