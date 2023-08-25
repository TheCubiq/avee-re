package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class mz7 implements Iterator {

    /* renamed from: p */
    public int f19310p = 0;

    /* renamed from: q */
    public final /* synthetic */ nz7 f19311q;

    public mz7(nz7 nz7Var) {
        this.f19311q = nz7Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19310p < this.f19311q.f20869p.size() || this.f19311q.f20870q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19310p >= this.f19311q.f20869p.size()) {
            nz7 nz7Var = this.f19311q;
            nz7Var.f20869p.add(nz7Var.f20870q.next());
            return next();
        }
        List list = this.f19311q.f20869p;
        int i = this.f19310p;
        this.f19310p = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
