package com.daaw;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class ht1 {

    /* renamed from: a */
    public final Map<String, Object> f12914a = new HashMap();

    /* renamed from: b */
    public final Set<Closeable> f12915b = new LinkedHashSet();

    /* renamed from: c */
    public volatile boolean f12916c = false;

    /* renamed from: b */
    public static void m20432b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final void m20433a() {
        this.f12916c = true;
        Map<String, Object> map = this.f12914a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f12914a.values()) {
                    m20432b(obj);
                }
            }
        }
        Set<Closeable> set = this.f12915b;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.f12915b) {
                    m20432b(closeable);
                }
            }
        }
        mo7531d();
    }

    /* renamed from: c */
    public <T> T m20431c(String str) {
        T t;
        Map<String, Object> map = this.f12914a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f12914a.get(str);
        }
        return t;
    }

    /* renamed from: d */
    public void mo7531d() {
    }
}
