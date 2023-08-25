package com.daaw;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class xb8 extends z48 implements RandomAccess, ac8 {
    public static final xb8 r;
    public static final ac8 s;
    public final List q;

    static {
        xb8 xb8Var = new xb8(10);
        r = xb8Var;
        xb8Var.zzb();
        s = xb8Var;
    }

    public xb8() {
        this(10);
    }

    public xb8(int i) {
        this.q = new ArrayList(i);
    }

    public xb8(ArrayList arrayList) {
        this.q = arrayList;
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof y68 ? ((y68) obj).s(gb8.b) : gb8.g((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        d();
        this.q.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        d();
        if (collection instanceof ac8) {
            collection = ((ac8) collection).zzh();
        }
        boolean addAll = this.q.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.daaw.db8
    public final /* bridge */ /* synthetic */ db8 b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.q);
            return new xb8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof y68) {
            y68 y68Var = (y68) obj;
            String s2 = y68Var.s(gb8.b);
            if (y68Var.n()) {
                this.q.set(i, s2);
            }
            return s2;
        }
        byte[] bArr = (byte[]) obj;
        String g = gb8.g(bArr);
        if (gb8.h(bArr)) {
            this.q.set(i, g);
        }
        return g;
    }

    @Override // com.daaw.ac8
    public final void g(y68 y68Var) {
        d();
        this.q.add(y68Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        Object remove = this.q.remove(i);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        d();
        return f(this.q.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q.size();
    }

    @Override // com.daaw.ac8
    public final ac8 zze() {
        return zzc() ? new yg8(this) : this;
    }

    @Override // com.daaw.ac8
    public final Object zzf(int i) {
        return this.q.get(i);
    }

    @Override // com.daaw.ac8
    public final List zzh() {
        return Collections.unmodifiableList(this.q);
    }
}
