package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class zzbai implements Iterator {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzbah zzdps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbai(zzbah zzbahVar) {
        this.zzdps = zzbahVar;
        this.limit = this.zzdps.size();
    }

    private final byte nextByte() {
        try {
            zzbah zzbahVar = this.zzdps;
            int i = this.position;
            this.position = i + 1;
            return zzbahVar.zzbn(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
