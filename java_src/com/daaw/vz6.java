package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class vz6 implements Iterator {
    @CheckForNull
    public Map.Entry p;
    public final /* synthetic */ Iterator q;
    public final /* synthetic */ wz6 r;

    public vz6(wz6 wz6Var, Iterator it) {
        this.r = wz6Var;
        this.q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.q.next();
        this.p = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        sy6.i(this.p != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.p.getValue();
        this.q.remove();
        g07.n(this.r.q, collection.size());
        collection.clear();
        this.p = null;
    }
}
