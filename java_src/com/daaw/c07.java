package com.daaw;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class c07 implements Iterator {

    /* renamed from: p */
    public final Iterator f5357p;

    /* renamed from: q */
    public final Collection f5358q;

    /* renamed from: r */
    public final /* synthetic */ d07 f5359r;

    public c07(d07 d07Var) {
        this.f5359r = d07Var;
        Collection collection = d07Var.f6352q;
        this.f5358q = collection;
        this.f5357p = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public c07(d07 d07Var, Iterator it) {
        this.f5359r = d07Var;
        this.f5358q = d07Var.f6352q;
        this.f5357p = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m25693a() {
        this.f5359r.zzb();
        if (this.f5359r.f6352q != this.f5358q) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m25693a();
        return this.f5357p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m25693a();
        return this.f5357p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5357p.remove();
        g07.m22113l(this.f5359r.f6355t);
        this.f5359r.m24804e();
    }
}
