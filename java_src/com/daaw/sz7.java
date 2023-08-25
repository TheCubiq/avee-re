package com.daaw;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class sz7 implements wz7 {
    public final Map a;

    public sz7(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }

    public final Map a() {
        return this.a;
    }
}
