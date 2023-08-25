package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class kt6 {

    /* renamed from: a */
    public final Map f16745a = new HashMap();

    /* renamed from: b */
    public Map f16746b;

    /* renamed from: a */
    public final synchronized Map m17434a() {
        if (this.f16746b == null) {
            this.f16746b = Collections.unmodifiableMap(new HashMap(this.f16745a));
        }
        return this.f16746b;
    }
}
