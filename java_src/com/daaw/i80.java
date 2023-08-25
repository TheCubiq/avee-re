package com.daaw;

import com.daaw.ay0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class i80<K extends ay0, V> {

    /* renamed from: a */
    public final C1666a<K, V> f13346a = new C1666a<>();

    /* renamed from: b */
    public final Map<K, C1666a<K, V>> f13347b = new HashMap();

    /* renamed from: com.daaw.i80$a */
    /* loaded from: classes.dex */
    public static class C1666a<K, V> {

        /* renamed from: a */
        public final K f13348a;

        /* renamed from: b */
        public List<V> f13349b;

        /* renamed from: c */
        public C1666a<K, V> f13350c;

        /* renamed from: d */
        public C1666a<K, V> f13351d;

        public C1666a() {
            this(null);
        }

        public C1666a(K k) {
            this.f13351d = this;
            this.f13350c = this;
            this.f13348a = k;
        }

        /* renamed from: b */
        public void m20035b(V v) {
            if (this.f13349b == null) {
                this.f13349b = new ArrayList();
            }
            this.f13349b.add(v);
        }

        /* renamed from: c */
        public V m20034c() {
            int m20033d = m20033d();
            if (m20033d > 0) {
                return this.f13349b.remove(m20033d - 1);
            }
            return null;
        }

        /* renamed from: d */
        public int m20033d() {
            List<V> list = this.f13349b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    /* renamed from: e */
    public static <K, V> void m20039e(C1666a<K, V> c1666a) {
        C1666a<K, V> c1666a2 = c1666a.f13351d;
        c1666a2.f13350c = c1666a.f13350c;
        c1666a.f13350c.f13351d = c1666a2;
    }

    /* renamed from: g */
    public static <K, V> void m20037g(C1666a<K, V> c1666a) {
        c1666a.f13350c.f13351d = c1666a;
        c1666a.f13351d.f13350c = c1666a;
    }

    /* renamed from: a */
    public V m20043a(K k) {
        C1666a<K, V> c1666a = this.f13347b.get(k);
        if (c1666a == null) {
            c1666a = new C1666a<>(k);
            this.f13347b.put(k, c1666a);
        } else {
            k.mo11401a();
        }
        m20042b(c1666a);
        return c1666a.m20034c();
    }

    /* renamed from: b */
    public final void m20042b(C1666a<K, V> c1666a) {
        m20039e(c1666a);
        C1666a<K, V> c1666a2 = this.f13346a;
        c1666a.f13351d = c1666a2;
        c1666a.f13350c = c1666a2.f13350c;
        m20037g(c1666a);
    }

    /* renamed from: c */
    public final void m20041c(C1666a<K, V> c1666a) {
        m20039e(c1666a);
        C1666a<K, V> c1666a2 = this.f13346a;
        c1666a.f13351d = c1666a2.f13351d;
        c1666a.f13350c = c1666a2;
        m20037g(c1666a);
    }

    /* renamed from: d */
    public void m20040d(K k, V v) {
        C1666a<K, V> c1666a = this.f13347b.get(k);
        if (c1666a == null) {
            c1666a = new C1666a<>(k);
            m20041c(c1666a);
            this.f13347b.put(k, c1666a);
        } else {
            k.mo11401a();
        }
        c1666a.m20035b(v);
    }

    /* renamed from: f */
    public V m20038f() {
        C1666a c1666a = this.f13346a;
        while (true) {
            c1666a = c1666a.f13351d;
            if (c1666a.equals(this.f13346a)) {
                return null;
            }
            V v = (V) c1666a.m20034c();
            if (v != null) {
                return v;
            }
            m20039e(c1666a);
            this.f13347b.remove(c1666a.f13348a);
            ((ay0) c1666a.f13348a).mo11401a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1666a c1666a = this.f13346a.f13350c; !c1666a.equals(this.f13346a); c1666a = c1666a.f13350c) {
            z = true;
            sb.append('{');
            sb.append(c1666a.f13348a);
            sb.append(':');
            sb.append(c1666a.m20033d());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
