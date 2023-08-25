package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class uz6 implements Iterator {

    /* renamed from: p */
    public final Iterator f29695p;
    @CheckForNull

    /* renamed from: q */
    public Object f29696q;
    @CheckForNull

    /* renamed from: r */
    public Collection f29697r;

    /* renamed from: s */
    public Iterator f29698s;

    /* renamed from: t */
    public final /* synthetic */ g07 f29699t;

    public uz6(g07 g07Var) {
        Map map;
        this.f29699t = g07Var;
        map = g07Var.f10130s;
        this.f29695p = map.entrySet().iterator();
        this.f29696q = null;
        this.f29697r = null;
        this.f29698s = k27.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29695p.hasNext() || this.f29698s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f29698s.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f29695p.next();
            this.f29696q = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f29697r = collection;
            this.f29698s = collection.iterator();
        }
        return this.f29698s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f29698s.remove();
        Collection collection = this.f29697r;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f29695p.remove();
        }
        g07.m22113l(this.f29699t);
    }
}
