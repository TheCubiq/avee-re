package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* loaded from: classes2.dex */
final class zzbej implements Iterator<String> {
    private final /* synthetic */ zzbeh zzdzc;
    private Iterator<String> zzdzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbej(zzbeh zzbehVar) {
        zzbcd zzbcdVar;
        this.zzdzc = zzbehVar;
        zzbcdVar = this.zzdzc.zzdyz;
        this.zzdzd = zzbcdVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzdzd.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzdzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
