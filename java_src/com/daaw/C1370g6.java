package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: com.daaw.g6 */
/* loaded from: classes.dex */
public class C1370g6<K, V> extends cd1<K, V> implements Map<K, V> {

    /* renamed from: w */
    public ym0<K, V> f10294w;

    /* renamed from: com.daaw.g6$a */
    /* loaded from: classes.dex */
    public class C1371a extends ym0<K, V> {
        public C1371a() {
        }

        @Override // com.daaw.ym0
        /* renamed from: a */
        public void mo3535a() {
            C1370g6.this.clear();
        }

        @Override // com.daaw.ym0
        /* renamed from: b */
        public Object mo3534b(int i, int i2) {
            return C1370g6.this.f5738q[(i << 1) + i2];
        }

        @Override // com.daaw.ym0
        /* renamed from: c */
        public Map<K, V> mo3533c() {
            return C1370g6.this;
        }

        @Override // com.daaw.ym0
        /* renamed from: d */
        public int mo3532d() {
            return C1370g6.this.f5739r;
        }

        @Override // com.daaw.ym0
        /* renamed from: e */
        public int mo3531e(Object obj) {
            return C1370g6.this.m25439f(obj);
        }

        @Override // com.daaw.ym0
        /* renamed from: f */
        public int mo3530f(Object obj) {
            return C1370g6.this.m25437h(obj);
        }

        @Override // com.daaw.ym0
        /* renamed from: g */
        public void mo3529g(K k, V v) {
            C1370g6.this.put(k, v);
        }

        @Override // com.daaw.ym0
        /* renamed from: h */
        public void mo3528h(int i) {
            C1370g6.this.m25434k(i);
        }

        @Override // com.daaw.ym0
        /* renamed from: i */
        public V mo3527i(int i, V v) {
            return C1370g6.this.m25433l(i, v);
        }
    }

    public C1370g6() {
    }

    public C1370g6(int i) {
        super(i);
    }

    public C1370g6(cd1 cd1Var) {
        super(cd1Var);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m21906n().m3524l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m21906n().m3523m();
    }

    /* renamed from: n */
    public final ym0<K, V> m21906n() {
        if (this.f10294w == null) {
            this.f10294w = new C1371a();
        }
        return this.f10294w;
    }

    /* renamed from: o */
    public boolean m21905o(Collection<?> collection) {
        return ym0.m3520p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m25442c(this.f5739r + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m21906n().m3522n();
    }
}
