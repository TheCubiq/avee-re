package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class h68 {
    public final Map a = new HashMap();

    public final void a(String str, Callable callable) {
        this.a.put(str, callable);
    }
}
