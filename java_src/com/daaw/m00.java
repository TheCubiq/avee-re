package com.daaw;

import com.daaw.v71;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class m00<K, V> extends v71<K, V> {

    /* renamed from: t */
    public HashMap<K, v71.C3310c<K, V>> f17954t = new HashMap<>();

    public boolean contains(K k) {
        return this.f17954t.containsKey(k);
    }

    @Override // com.daaw.v71
    /* renamed from: e */
    public v71.C3310c<K, V> mo7374e(K k) {
        return this.f17954t.get(k);
    }

    @Override // com.daaw.v71
    /* renamed from: k */
    public V mo7370k(K k, V v) {
        v71.C3310c<K, V> mo7374e = mo7374e(k);
        if (mo7374e != null) {
            return mo7374e.f29981q;
        }
        this.f17954t.put(k, m7371j(k, v));
        return null;
    }

    @Override // com.daaw.v71
    /* renamed from: m */
    public V mo7369m(K k) {
        V v = (V) super.mo7369m(k);
        this.f17954t.remove(k);
        return v;
    }

    /* renamed from: n */
    public Map.Entry<K, V> m16339n(K k) {
        if (contains(k)) {
            return this.f17954t.get(k).f29983s;
        }
        return null;
    }
}
