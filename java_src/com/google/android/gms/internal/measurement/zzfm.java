package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzfm<K, V> extends zzew<Map.Entry<K, V>> {
    private final /* synthetic */ zzfn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfm(zzfn zzfnVar) {
        this.zza = zzfnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    public final boolean zzg() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzd;
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzd;
        zzdw.zza(i, i2);
        objArr = this.zza.zzb;
        int i3 = i * 2;
        Object obj = objArr[i3];
        objArr2 = this.zza.zzb;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }
}
