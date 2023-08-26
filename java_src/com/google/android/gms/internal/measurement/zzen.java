package com.google.android.gms.internal.measurement;

import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzen<K, V> extends zzeo<Map.Entry<K, V>> {
    private final /* synthetic */ zzel zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzel zzelVar) {
        super(zzelVar, null);
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final /* synthetic */ Object zza(int i) {
        return new zzeq(this.zza, i);
    }
}
