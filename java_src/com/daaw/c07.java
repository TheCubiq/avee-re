package com.daaw;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class c07 implements Iterator {
    public final Iterator p;
    public final Collection q;
    public final /* synthetic */ d07 r;

    public c07(d07 d07Var) {
        this.r = d07Var;
        Collection collection = d07Var.q;
        this.q = collection;
        this.p = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public c07(d07 d07Var, Iterator it) {
        this.r = d07Var;
        this.q = d07Var.q;
        this.p = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.r.zzb();
        if (this.r.q != this.q) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.p.remove();
        g07.l(this.r.t);
        this.r.e();
    }
}
