package com.daaw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class w37 extends v37 implements SortedSet {
    public w37(SortedSet sortedSet, ty6 ty6Var) {
        super(sortedSet, ty6Var);
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return ((SortedSet) this.f16939p).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f16939p.iterator();
        ty6 ty6Var = this.f16940q;
        Objects.requireNonNull(it);
        Objects.requireNonNull(ty6Var);
        while (it.hasNext()) {
            Object next = it.next();
            if (ty6Var.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new w37(((SortedSet) this.f16939p).headSet(obj), this.f16940q);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f16939p;
        while (true) {
            Object last = sortedSet.last();
            if (this.f16940q.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new w37(((SortedSet) this.f16939p).subSet(obj, obj2), this.f16940q);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new w37(((SortedSet) this.f16939p).tailSet(obj), this.f16940q);
    }
}
