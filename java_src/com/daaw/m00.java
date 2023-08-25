package com.daaw;

import com.daaw.v71;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class m00<K, V> extends v71<K, V> {
    public HashMap<K, v71.c<K, V>> t = new HashMap<>();

    public boolean contains(K k) {
        return this.t.containsKey(k);
    }

    @Override // com.daaw.v71
    public v71.c<K, V> e(K k) {
        return this.t.get(k);
    }

    @Override // com.daaw.v71
    public V k(K k, V v) {
        v71.c<K, V> e = e(k);
        if (e != null) {
            return e.q;
        }
        this.t.put(k, j(k, v));
        return null;
    }

    @Override // com.daaw.v71
    public V m(K k) {
        V v = (V) super.m(k);
        this.t.remove(k);
        return v;
    }

    public Map.Entry<K, V> n(K k) {
        if (contains(k)) {
            return this.t.get(k).s;
        }
        return null;
    }
}
