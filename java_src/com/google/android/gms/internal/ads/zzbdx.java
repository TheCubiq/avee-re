package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes2.dex */
final class zzbdx<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzdyp;
    private final /* synthetic */ zzbdp zzdyq;
    private boolean zzdyu;

    private zzbdx(zzbdp zzbdpVar) {
        this.zzdyq = zzbdpVar;
        this.pos = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbdx(zzbdp zzbdpVar, zzbdq zzbdqVar) {
        this(zzbdpVar);
    }

    private final Iterator<Map.Entry<K, V>> zzafx() {
        Map map;
        if (this.zzdyp == null) {
            map = this.zzdyq.zzdyl;
            this.zzdyp = map.entrySet().iterator();
        }
        return this.zzdyp;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzdyq.zzdyk;
        if (i >= list.size()) {
            map = this.zzdyq.zzdyl;
            if (map.isEmpty() || !zzafx().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Map.Entry<K, V> next;
        List list2;
        this.zzdyu = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzdyq.zzdyk;
        if (i < list.size()) {
            list2 = this.zzdyq.zzdyk;
            next = (Map.Entry<K, V>) list2.get(this.pos);
        } else {
            next = zzafx().next();
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzdyu) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzdyu = false;
        this.zzdyq.zzafv();
        int i = this.pos;
        list = this.zzdyq.zzdyk;
        if (i >= list.size()) {
            zzafx().remove();
            return;
        }
        zzbdp zzbdpVar = this.zzdyq;
        int i2 = this.pos;
        this.pos = i2 - 1;
        zzbdpVar.zzcz(i2);
    }
}
