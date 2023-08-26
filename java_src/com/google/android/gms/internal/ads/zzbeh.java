package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class zzbeh extends AbstractList<String> implements zzbcd, RandomAccess {
    private final zzbcd zzdyz;

    public zzbeh(zzbcd zzbcdVar) {
        this.zzdyz = zzbcdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zzdyz.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzbej(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzbei(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzdyz.size();
    }

    @Override // com.google.android.gms.internal.ads.zzbcd
    public final List<?> zzadw() {
        return this.zzdyz.zzadw();
    }

    @Override // com.google.android.gms.internal.ads.zzbcd
    public final zzbcd zzadx() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbcd
    public final void zzap(zzbah zzbahVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzbcd
    public final Object zzcp(int i) {
        return this.zzdyz.zzcp(i);
    }
}
