package com.daaw;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class xb8 extends z48 implements RandomAccess, ac8 {

    /* renamed from: r */
    public static final xb8 f32343r;

    /* renamed from: s */
    public static final ac8 f32344s;

    /* renamed from: q */
    public final List f32345q;

    static {
        xb8 xb8Var = new xb8(10);
        f32343r = xb8Var;
        xb8Var.zzb();
        f32344s = xb8Var;
    }

    public xb8() {
        this(10);
    }

    public xb8(int i) {
        this.f32345q = new ArrayList(i);
    }

    public xb8(ArrayList arrayList) {
        this.f32345q = arrayList;
    }

    /* renamed from: f */
    public static String m5293f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof y68 ? ((y68) obj).m4061s(gb8.f11017b) : gb8.m21814g((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m2816d();
        this.f32345q.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2816d();
        if (collection instanceof ac8) {
            collection = ((ac8) collection).zzh();
        }
        boolean addAll = this.f32345q.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.daaw.db8
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ db8 mo5295b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f32345q);
            return new xb8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2816d();
        this.f32345q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f32345q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof y68) {
            y68 y68Var = (y68) obj;
            String m4061s = y68Var.m4061s(gb8.f11017b);
            if (y68Var.mo4066n()) {
                this.f32345q.set(i, m4061s);
            }
            return m4061s;
        }
        byte[] bArr = (byte[]) obj;
        String m21814g = gb8.m21814g(bArr);
        if (gb8.m21813h(bArr)) {
            this.f32345q.set(i, m21814g);
        }
        return m21814g;
    }

    @Override // com.daaw.ac8
    /* renamed from: g */
    public final void mo3754g(y68 y68Var) {
        m2816d();
        this.f32345q.add(y68Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m2816d();
        Object remove = this.f32345q.remove(i);
        ((AbstractList) this).modCount++;
        return m5293f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m2816d();
        return m5293f(this.f32345q.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32345q.size();
    }

    @Override // com.daaw.ac8
    public final ac8 zze() {
        return zzc() ? new yg8(this) : this;
    }

    @Override // com.daaw.ac8
    public final Object zzf(int i) {
        return this.f32345q.get(i);
    }

    @Override // com.daaw.ac8
    public final List zzh() {
        return Collections.unmodifiableList(this.f32345q);
    }
}
