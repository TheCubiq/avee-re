package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzap implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzam zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(zzam zzamVar) {
        Bundle bundle;
        this.zzb = zzamVar;
        bundle = this.zzb.zza;
        this.zza = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }
}
