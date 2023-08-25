package com.daaw;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class ht1 {
    public final Map<String, Object> a = new HashMap();
    public final Set<Closeable> b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void a() {
        this.c = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.a.values()) {
                    b(obj);
                }
            }
        }
        Set<Closeable> set = this.b;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.b) {
                    b(closeable);
                }
            }
        }
        d();
    }

    public <T> T c(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    public void d() {
    }
}
