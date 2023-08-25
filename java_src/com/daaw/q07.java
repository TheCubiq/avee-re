package com.daaw;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class q07 extends AbstractSet {
    public final /* synthetic */ i17 p;

    public q07(i17 i17Var) {
        this.p = i17Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int x;
        Map n = this.p.n();
        if (n != null) {
            return n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            x = this.p.x(entry.getKey());
            if (x != -1 && ky6.a(i17.l(this.p, x), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i17 i17Var = this.p;
        Map n = i17Var.n();
        return n != null ? n.entrySet().iterator() : new o07(i17Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int w;
        int[] B;
        Object[] a;
        Object[] b;
        Map n = this.p.n();
        if (n != null) {
            return n.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            i17 i17Var = this.p;
            if (i17Var.s()) {
                return false;
            }
            w = i17Var.w();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object m = i17.m(this.p);
            B = this.p.B();
            a = this.p.a();
            b = this.p.b();
            int b2 = j17.b(key, value, w, m, B, a, b);
            if (b2 == -1) {
                return false;
            }
            this.p.r(b2, w);
            i17.d(this.p);
            this.p.p();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.p.size();
    }
}
