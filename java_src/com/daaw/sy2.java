package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class sy2 {

    /* renamed from: a */
    public final Map f26808a = new HashMap();

    /* renamed from: b */
    public Map f26809b;

    /* renamed from: a */
    public final synchronized Map m9709a() {
        if (this.f26809b == null) {
            this.f26809b = Collections.unmodifiableMap(new HashMap(this.f26808a));
        }
        return this.f26809b;
    }
}
