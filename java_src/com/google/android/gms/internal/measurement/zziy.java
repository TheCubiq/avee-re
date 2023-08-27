package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zziy<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzhf zzhfVar, zzix<K, V> zzixVar, K k, V v) throws IOException {
        zzho.zza(zzhfVar, zzixVar.zza, 1, k);
        zzho.zza(zzhfVar, zzixVar.zzc, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzix<K, V> zzixVar, K k, V v) {
        return zzho.zza(zzixVar.zza, 1, k) + zzho.zza(zzixVar.zzc, 2, v);
    }
}
