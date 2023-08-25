package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class ki0 {
    public final Map<String, String> a = new HashMap();
    public final int b;
    public final int c;

    public ki0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static String c(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > i ? trim.substring(0, i) : trim;
        }
        return str;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized void d(Map<String, String> map) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b = b(entry.getKey());
            if (this.a.size() >= this.b && !this.a.containsKey(b)) {
                i++;
            }
            String value = entry.getValue();
            this.a.put(b, value == null ? "" : c(value, this.c));
        }
        if (i > 0) {
            ml0 f = ml0.f();
            f.k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
        }
    }
}
