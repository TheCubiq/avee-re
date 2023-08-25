package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class lv7 implements Iterator {

    /* renamed from: p */
    public int f17824p = -1;

    /* renamed from: q */
    public boolean f17825q;

    /* renamed from: r */
    public Iterator f17826r;

    /* renamed from: s */
    public final /* synthetic */ pv7 f17827s;

    public /* synthetic */ lv7(pv7 pv7Var, kv7 kv7Var) {
        this.f17827s = pv7Var;
    }

    /* renamed from: a */
    public final Iterator m16474a() {
        Map map;
        if (this.f17826r == null) {
            map = this.f17827s.f23420r;
            this.f17826r = map.entrySet().iterator();
        }
        return this.f17826r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f17824p + 1;
        list = this.f17827s.f23419q;
        if (i >= list.size()) {
            map = this.f17827s.f23420r;
            return !map.isEmpty() && m16474a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f17825q = true;
        int i = this.f17824p + 1;
        this.f17824p = i;
        list = this.f17827s.f23419q;
        if (i < list.size()) {
            list2 = this.f17827s.f23419q;
            next = list2.get(this.f17824p);
        } else {
            next = m16474a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f17825q) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f17825q = false;
        this.f17827s.m13002n();
        int i = this.f17824p;
        list = this.f17827s.f23419q;
        if (i >= list.size()) {
            m16474a().remove();
            return;
        }
        pv7 pv7Var = this.f17827s;
        int i2 = this.f17824p;
        this.f17824p = i2 - 1;
        pv7Var.m13004l(i2);
    }
}
