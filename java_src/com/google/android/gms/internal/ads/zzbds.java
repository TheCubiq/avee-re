package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbds extends zzbdy {
    private final /* synthetic */ zzbdp zzdyq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzbds(zzbdp zzbdpVar) {
        super(zzbdpVar, null);
        this.zzdyq = zzbdpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbds(zzbdp zzbdpVar, zzbdq zzbdqVar) {
        this(zzbdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzbdr(this.zzdyq, null);
    }
}
