package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes2.dex */
final class zzbdr<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzdyp;
    private final /* synthetic */ zzbdp zzdyq;

    private zzbdr(zzbdp zzbdpVar) {
        List list;
        this.zzdyq = zzbdpVar;
        list = this.zzdyq.zzdyk;
        this.pos = list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbdr(zzbdp zzbdpVar, zzbdq zzbdqVar) {
        this(zzbdpVar);
    }

    private final Iterator<Map.Entry<K, V>> zzafx() {
        Map map;
        if (this.zzdyp == null) {
            map = this.zzdyq.zzdyn;
            this.zzdyp = map.entrySet().iterator();
        }
        return this.zzdyp;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzdyq.zzdyk;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzafx().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Map.Entry<K, V> entry;
        if (zzafx().hasNext()) {
            entry = zzafx().next();
        } else {
            list = this.zzdyq.zzdyk;
            int i = this.pos - 1;
            this.pos = i;
            entry = (Map.Entry<K, V>) list.get(i);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
