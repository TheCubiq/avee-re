package com.daaw;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class i07 extends AbstractCollection {

    /* renamed from: p */
    public final /* synthetic */ j07 f13144p;

    public i07(j07 j07Var) {
        this.f13144p = j07Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f13144p.zzr();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        for (Collection collection : this.f13144p.mo6567b().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f13144p.mo19179d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f13144p.zzh();
    }
}
