package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzku implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzks zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzku(zzks zzksVar) {
        zzin zzinVar;
        this.zzb = zzksVar;
        zzinVar = this.zzb.zza;
        this.zza = zzinVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }
}
