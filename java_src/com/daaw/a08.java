package com.daaw;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a08 extends sz7 {

    /* renamed from: b */
    public static final m08 f2688b = xz7.m4374a(Collections.emptyMap());

    public /* synthetic */ a08(Map map, yz7 yz7Var) {
        super(map);
    }

    /* renamed from: b */
    public static zz7 m27754b(int i) {
        return new zz7(i, null);
    }

    @Override // com.daaw.m08
    /* renamed from: c */
    public final Map zzb() {
        LinkedHashMap m8659b = tz7.m8659b(m9680a().size());
        for (Map.Entry entry : m9680a().entrySet()) {
            m8659b.put(entry.getKey(), ((m08) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(m8659b);
    }
}
