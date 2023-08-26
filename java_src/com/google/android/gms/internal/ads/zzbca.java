package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbca<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzdvj;

    public zzbca(Iterator<Map.Entry<K, Object>> it) {
        this.zzdvj = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzdvj.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zzdvj.next();
        return next.getValue() instanceof zzbbx ? new zzbbz(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzdvj.remove();
    }
}
