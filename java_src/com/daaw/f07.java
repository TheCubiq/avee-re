package com.daaw;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class f07 extends d07 implements List {

    /* renamed from: u */
    public final /* synthetic */ g07 f8986u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f07(g07 g07Var, Object obj, @CheckForNull List list, d07 d07Var) {
        super(g07Var, obj, list, d07Var);
        this.f8986u = g07Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f6352q.isEmpty();
        ((List) this.f6352q).add(i, obj);
        g07.m22114k(this.f8986u);
        if (isEmpty) {
            m24805d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f6352q).addAll(i, collection);
        if (addAll) {
            g07.m22112m(this.f8986u, this.f6352q.size() - size);
            if (size == 0) {
                m24805d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f6352q).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f6352q).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f6352q).lastIndexOf(obj);
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
        Object remove = ((List) this.f6352q).remove(i);
        g07.m22113l(this.f8986u);
        m24804e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f6352q).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        g07 g07Var = this.f8986u;
        Object obj = this.f6351p;
        List subList = ((List) this.f6352q).subList(i, i2);
        d07 d07Var = this.f6353r;
        if (d07Var == null) {
            d07Var = this;
        }
        return g07Var.m22110o(obj, subList, d07Var);
    }
}
