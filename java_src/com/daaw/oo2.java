package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class oo2 {

    /* renamed from: a */
    public final Map f21781a = new HashMap();

    /* renamed from: a */
    public final AtomicReference m14116a(String str) {
        synchronized (this) {
            if (!this.f21781a.containsKey(str)) {
                this.f21781a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f21781a.get(str);
    }
}
