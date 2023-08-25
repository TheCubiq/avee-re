package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class lv7 implements Iterator {
    public int p = -1;
    public boolean q;
    public Iterator r;
    public final /* synthetic */ pv7 s;

    public /* synthetic */ lv7(pv7 pv7Var, kv7 kv7Var) {
        this.s = pv7Var;
    }

    public final Iterator a() {
        Map map;
        if (this.r == null) {
            map = this.s.r;
            this.r = map.entrySet().iterator();
        }
        return this.r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.p + 1;
        list = this.s.q;
        if (i >= list.size()) {
            map = this.s.r;
            return !map.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.q = true;
        int i = this.p + 1;
        this.p = i;
        list = this.s.q;
        if (i < list.size()) {
            list2 = this.s.q;
            next = list2.get(this.p);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.q) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.q = false;
        this.s.n();
        int i = this.p;
        list = this.s.q;
        if (i >= list.size()) {
            a().remove();
            return;
        }
        pv7 pv7Var = this.s;
        int i2 = this.p;
        this.p = i2 - 1;
        pv7Var.l(i2);
    }
}
