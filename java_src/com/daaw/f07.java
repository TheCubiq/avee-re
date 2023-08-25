package com.daaw;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class f07 extends d07 implements List {
    public final /* synthetic */ g07 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f07(g07 g07Var, Object obj, @CheckForNull List list, d07 d07Var) {
        super(g07Var, obj, list, d07Var);
        this.u = g07Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.q.isEmpty();
        ((List) this.q).add(i, obj);
        g07.k(this.u);
        if (isEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.q).addAll(i, collection);
        if (addAll) {
            g07.m(this.u, this.q.size() - size);
            if (size == 0) {
                d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.q).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.q).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.q).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new e07(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new e07(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.q).remove(i);
        g07.l(this.u);
        e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.q).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        g07 g07Var = this.u;
        Object obj = this.p;
        List subList = ((List) this.q).subList(i, i2);
        d07 d07Var = this.r;
        if (d07Var == null) {
            d07Var = this;
        }
        return g07Var.o(obj, subList, d07Var);
    }
}
