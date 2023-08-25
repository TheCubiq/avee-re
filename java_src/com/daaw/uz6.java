package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class uz6 implements Iterator {
    public final Iterator p;
    @CheckForNull
    public Object q;
    @CheckForNull
    public Collection r;
    public Iterator s;
    public final /* synthetic */ g07 t;

    public uz6(g07 g07Var) {
        Map map;
        this.t = g07Var;
        map = g07Var.s;
        this.p = map.entrySet().iterator();
        this.q = null;
        this.r = null;
        this.s = k27.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p.hasNext() || this.s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.s.hasNext()) {
            Map.Entry entry = (Map.Entry) this.p.next();
            this.q = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.r = collection;
            this.s = collection.iterator();
        }
        return this.s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.s.remove();
        Collection collection = this.r;
        collection.getClass();
        if (collection.isEmpty()) {
            this.p.remove();
        }
        g07.l(this.t);
    }
}
