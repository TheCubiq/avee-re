package com.daaw;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class q07 extends AbstractSet {

    /* renamed from: p */
    public final /* synthetic */ i17 f23594p;

    public q07(i17 i17Var) {
        this.f23594p = i17Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23594p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int m20175x;
        Map m20185n = this.f23594p.m20185n();
        if (m20185n != null) {
            return m20185n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m20175x = this.f23594p.m20175x(entry.getKey());
            if (m20175x != -1 && ky6.m17316a(i17.m20187l(this.f23594p, m20175x), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i17 i17Var = this.f23594p;
        Map m20185n = i17Var.m20185n();
        return m20185n != null ? m20185n.entrySet().iterator() : new o07(i17Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int m20176w;
        int[] m20199B;
        Object[] m20198a;
        Object[] m20197b;
        Map m20185n = this.f23594p.m20185n();
        if (m20185n != null) {
            return m20185n.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            i17 i17Var = this.f23594p;
            if (i17Var.m20180s()) {
                return false;
            }
            m20176w = i17Var.m20176w();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object m20186m = i17.m20186m(this.f23594p);
            m20199B = this.f23594p.m20199B();
            m20198a = this.f23594p.m20198a();
            m20197b = this.f23594p.m20197b();
            int m19166b = j17.m19166b(key, value, m20176w, m20186m, m20199B, m20198a, m20197b);
            if (m19166b == -1) {
                return false;
            }
            this.f23594p.m20181r(m19166b, m20176w);
            i17.m20195d(this.f23594p);
            this.f23594p.m20183p();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23594p.size();
    }
}
