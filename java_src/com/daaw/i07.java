package com.daaw;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class i07 extends AbstractCollection {
    public final /* synthetic */ j07 p;

    public i07(j07 j07Var) {
        this.p = j07Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.p.zzr();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        for (Collection collection : this.p.b().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.p.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.p.zzh();
    }
}
