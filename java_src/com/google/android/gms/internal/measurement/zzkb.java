package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzkb extends zzkh {
    private final /* synthetic */ zzka zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzkb(zzka zzkaVar) {
        super(zzkaVar, null);
        this.zza = zzkaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzkc(this.zza, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkb(zzka zzkaVar, zzjz zzjzVar) {
        this(zzkaVar);
    }
}
