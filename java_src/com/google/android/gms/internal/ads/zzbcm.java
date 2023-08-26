package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbcm<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzbcn<K, V> zzbcnVar, K k, V v) {
        return zzbbg.zza(zzbcnVar.zzdvy, 1, k) + zzbbg.zza(zzbcnVar.zzdwa, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzbav zzbavVar, zzbcn<K, V> zzbcnVar, K k, V v) throws IOException {
        zzbbg.zza(zzbavVar, zzbcnVar.zzdvy, 1, k);
        zzbbg.zza(zzbavVar, zzbcnVar.zzdwa, 2, v);
    }
}
