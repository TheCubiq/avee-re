package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class sz6 implements Iterator {
    public final Iterator p;
    @CheckForNull
    public Collection q;
    public final /* synthetic */ tz6 r;

    public sz6(tz6 tz6Var) {
        this.r = tz6Var;
        this.p = tz6Var.r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.p.next();
        this.q = (Collection) entry.getValue();
        return this.r.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        sy6.i(this.q != null, "no calls to next() since the last call to remove()");
        this.p.remove();
        g07.n(this.r.s, this.q.size());
        this.q.clear();
        this.q = null;
    }
}
