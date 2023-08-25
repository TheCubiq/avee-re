package com.daaw;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class bt7 extends iq7 implements RandomAccess, ct7 {
    public static final bt7 r;
    public static final ct7 s;
    public final List q;

    static {
        bt7 bt7Var = new bt7(10);
        r = bt7Var;
        bt7Var.zzb();
        s = bt7Var;
    }

    public bt7() {
        this(10);
    }

    public bt7(int i) {
        this.q = new ArrayList(i);
    }

    public bt7(ArrayList arrayList) {
        this.q = arrayList;
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof yq7 ? ((yq7) obj).d(vs7.b) : vs7.g((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        d();
        this.q.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        d();
        if (collection instanceof ct7) {
            collection = ((ct7) collection).zzh();
        }
        boolean addAll = this.q.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.daaw.us7
    public final /* bridge */ /* synthetic */ us7 b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.q);
            return new bt7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        if (obj instanceof yq7) {
            yq7 yq7Var = (yq7) obj;
            String d = yq7Var.d(vs7.b);
            if (yq7Var.z()) {
                this.q.set(i, d);
            }
            return d;
        }
        byte[] bArr = (byte[]) obj;
        String g = vs7.g(bArr);
        if (vs7.h(bArr)) {
            this.q.set(i, g);
        }
        return g;
    }

    @Override // com.daaw.ct7
    public final void l(yq7 yq7Var) {
        d();
        this.q.add(yq7Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
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

    @Override // com.daaw.ct7
    public final ct7 zze() {
        return zzc() ? new bw7(this) : this;
    }

    @Override // com.daaw.ct7
    public final Object zzf(int i) {
        return this.q.get(i);
    }

    @Override // com.daaw.ct7
    public final List zzh() {
        return Collections.unmodifiableList(this.q);
    }
}
