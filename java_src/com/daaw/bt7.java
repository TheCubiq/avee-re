package com.daaw;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class bt7 extends iq7 implements RandomAccess, ct7 {

    /* renamed from: r */
    public static final bt7 f5171r;

    /* renamed from: s */
    public static final ct7 f5172s;

    /* renamed from: q */
    public final List f5173q;

    static {
        bt7 bt7Var = new bt7(10);
        f5171r = bt7Var;
        bt7Var.zzb();
        f5172s = bt7Var;
    }

    public bt7() {
        this(10);
    }

    public bt7(int i) {
        this.f5173q = new ArrayList(i);
    }

    public bt7(ArrayList arrayList) {
        this.f5173q = arrayList;
    }

    /* renamed from: f */
    public static String m25833f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof yq7 ? ((yq7) obj).m3419d(vs7.f30558b) : vs7.m6814g((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m19489d();
        this.f5173q.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m19489d();
        if (collection instanceof ct7) {
            collection = ((ct7) collection).zzh();
        }
        boolean addAll = this.f5173q.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.daaw.us7
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ us7 mo7741b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f5173q);
            return new bt7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m19489d();
        this.f5173q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f5173q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof yq7) {
            yq7 yq7Var = (yq7) obj;
            String m3419d = yq7Var.m3419d(vs7.f30558b);
            if (yq7Var.mo3400z()) {
                this.f5173q.set(i, m3419d);
            }
            return m3419d;
        }
        byte[] bArr = (byte[]) obj;
        String m6814g = vs7.m6814g(bArr);
        if (vs7.m6813h(bArr)) {
            this.f5173q.set(i, m6814g);
        }
        return m6814g;
    }

    @Override // com.daaw.ct7
    /* renamed from: l */
    public final void mo24979l(yq7 yq7Var) {
        m19489d();
        this.f5173q.add(yq7Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m19489d();
        Object remove = this.f5173q.remove(i);
        ((AbstractList) this).modCount++;
        return m25833f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m19489d();
        return m25833f(this.f5173q.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5173q.size();
    }

    @Override // com.daaw.ct7
    public final ct7 zze() {
        return zzc() ? new bw7(this) : this;
    }

    @Override // com.daaw.ct7
    public final Object zzf(int i) {
        return this.f5173q.get(i);
    }

    @Override // com.daaw.ct7
    public final List zzh() {
        return Collections.unmodifiableList(this.f5173q);
    }
}
