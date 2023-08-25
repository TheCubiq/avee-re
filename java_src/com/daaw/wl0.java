package com.daaw;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class wl0<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f31309a;

    /* renamed from: b */
    public int f31310b;

    /* renamed from: c */
    public int f31311c;

    /* renamed from: d */
    public int f31312d;

    /* renamed from: e */
    public int f31313e;

    /* renamed from: f */
    public int f31314f;

    /* renamed from: g */
    public int f31315g;

    /* renamed from: h */
    public int f31316h;

    public wl0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f31311c = i;
        this.f31309a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: a */
    public V mo5204a(K k) {
        return null;
    }

    /* renamed from: b */
    public void m6024b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final V m6023c(K k) {
        V put;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f31309a.get(k);
            if (v != null) {
                this.f31315g++;
                return v;
            }
            this.f31316h++;
            V mo5204a = mo5204a(k);
            if (mo5204a == null) {
                return null;
            }
            synchronized (this) {
                this.f31313e++;
                put = this.f31309a.put(k, mo5204a);
                if (put != null) {
                    this.f31309a.put(k, put);
                } else {
                    this.f31310b += m6020f(k, mo5204a);
                }
            }
            if (put != null) {
                m6024b(false, k, mo5204a, put);
                return put;
            }
            m6017i(this.f31311c);
            return mo5204a;
        }
    }

    /* renamed from: d */
    public final V m6022d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f31312d++;
            this.f31310b += m6020f(k, v);
            put = this.f31309a.put(k, v);
            if (put != null) {
                this.f31310b -= m6020f(k, put);
            }
        }
        if (put != null) {
            m6024b(false, k, put, v);
        }
        m6017i(this.f31311c);
        return put;
    }

    /* renamed from: e */
    public final V m6021e(K k) {
        V remove;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            remove = this.f31309a.remove(k);
            if (remove != null) {
                this.f31310b -= m6020f(k, remove);
            }
        }
        if (remove != null) {
            m6024b(false, k, remove, null);
        }
        return remove;
    }

    /* renamed from: f */
    public final int m6020f(K k, V v) {
        int m6019g = m6019g(k, v);
        if (m6019g >= 0) {
            return m6019g;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: g */
    public int m6019g(K k, V v) {
        return 1;
    }

    /* renamed from: h */
    public final synchronized Map<K, V> m6018h() {
        return new LinkedHashMap(this.f31309a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6017i(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f31310b >= 0 && (!this.f31309a.isEmpty() || this.f31310b == 0)) {
                    if (this.f31310b <= i || this.f31309a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f31309a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f31309a.remove(key);
                    this.f31310b -= m6020f(key, value);
                    this.f31314f++;
                } else {
                    break;
                }
            }
            m6024b(true, key, value, null);
        }
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f31315g;
        i2 = this.f31316h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f31311c), Integer.valueOf(this.f31315g), Integer.valueOf(this.f31316h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
