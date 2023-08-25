package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class ki0 {

    /* renamed from: a */
    public final Map<String, String> f16390a = new HashMap();

    /* renamed from: b */
    public final int f16391b;

    /* renamed from: c */
    public final int f16392c;

    public ki0(int i, int i2) {
        this.f16391b = i;
        this.f16392c = i2;
    }

    /* renamed from: c */
    public static String m17732c(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > i ? trim.substring(0, i) : trim;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized Map<String, String> m17734a() {
        return Collections.unmodifiableMap(new HashMap(this.f16390a));
    }

    /* renamed from: b */
    public final String m17733b(String str) {
        if (str != null) {
            return m17732c(str, this.f16392c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public synchronized void m17731d(Map<String, String> map) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m17733b = m17733b(entry.getKey());
            if (this.f16390a.size() >= this.f16391b && !this.f16390a.containsKey(m17733b)) {
                i++;
            }
            String value = entry.getValue();
            this.f16390a.put(m17733b, value == null ? "" : m17732c(value, this.f16392c));
        }
        if (i > 0) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15971k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f16391b);
        }
    }
}
