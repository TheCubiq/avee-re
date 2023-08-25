package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class yf8 implements Iterator {

    /* renamed from: p */
    public int f33635p = -1;

    /* renamed from: q */
    public boolean f33636q;

    /* renamed from: r */
    public Iterator f33637r;

    /* renamed from: s */
    public final /* synthetic */ gg8 f33638s;

    /* renamed from: a */
    public final Iterator m3773a() {
        Map map;
        if (this.f33637r == null) {
            map = this.f33638s.f11235r;
            this.f33637r = map.entrySet().iterator();
        }
        return this.f33637r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f33635p + 1;
        list = this.f33638s.f11234q;
        if (i >= list.size()) {
            map = this.f33638s.f11235r;
            return !map.isEmpty() && m3773a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f33636q = true;
        int i = this.f33635p + 1;
        this.f33635p = i;
        list = this.f33638s.f11234q;
        if (i < list.size()) {
            list2 = this.f33638s.f11234q;
            next = list2.get(this.f33635p);
        } else {
            next = m3773a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f33636q) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f33636q = false;
        this.f33638s.m21643n();
        int i = this.f33635p;
        list = this.f33638s.f11234q;
        if (i >= list.size()) {
            m3773a().remove();
            return;
        }
        gg8 gg8Var = this.f33638s;
        int i2 = this.f33635p;
        this.f33635p = i2 - 1;
        gg8Var.m21645l(i2);
    }
}
