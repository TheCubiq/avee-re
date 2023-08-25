package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class vz6 implements Iterator {
    @CheckForNull

    /* renamed from: p */
    public Map.Entry f30729p;

    /* renamed from: q */
    public final /* synthetic */ Iterator f30730q;

    /* renamed from: r */
    public final /* synthetic */ wz6 f30731r;

    public vz6(wz6 wz6Var, Iterator it) {
        this.f30731r = wz6Var;
        this.f30730q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30730q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f30730q.next();
        this.f30729p = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        sy6.m9700i(this.f30729p != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f30729p.getValue();
        this.f30730q.remove();
        g07.m22111n(this.f30731r.f31698q, collection.size());
        collection.clear();
        this.f30729p = null;
    }
}
