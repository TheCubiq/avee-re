package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class g6<K, V> extends cd1<K, V> implements Map<K, V> {
    public ym0<K, V> w;

    /* loaded from: classes.dex */
    public class a extends ym0<K, V> {
        public a() {
        }

        @Override // com.daaw.ym0
        public void a() {
            g6.this.clear();
        }

        @Override // com.daaw.ym0
        public Object b(int i, int i2) {
            return g6.this.q[(i << 1) + i2];
        }

        @Override // com.daaw.ym0
        public Map<K, V> c() {
            return g6.this;
        }

        @Override // com.daaw.ym0
        public int d() {
            return g6.this.r;
        }

        @Override // com.daaw.ym0
        public int e(Object obj) {
            return g6.this.f(obj);
        }

        @Override // com.daaw.ym0
        public int f(Object obj) {
            return g6.this.h(obj);
        }

        @Override // com.daaw.ym0
        public void g(K k, V v) {
            g6.this.put(k, v);
        }

        @Override // com.daaw.ym0
        public void h(int i) {
            g6.this.k(i);
        }

        @Override // com.daaw.ym0
        public V i(int i, V v) {
            return g6.this.l(i, v);
        }
    }

    public g6() {
    }

    public g6(int i) {
        super(i);
    }

    public g6(cd1 cd1Var) {
        super(cd1Var);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return n().m();
    }

    public final ym0<K, V> n() {
        if (this.w == null) {
            this.w = new a();
        }
        return this.w;
    }

    public boolean o(Collection<?> collection) {
        return ym0.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.r + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return n().n();
    }
}
