package com.daaw;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class hn {
    public final Map<b<?>, Object> a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a extends hn {
        public static final a b = new a();
    }

    /* loaded from: classes.dex */
    public interface b<T> {
    }

    public final Map<b<?>, Object> a() {
        return this.a;
    }
}
