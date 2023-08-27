package com.google.android.gms.internal.measurement;
/* JADX INFO: Add missing generic type declarations: [K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzek<K> extends zzeo<K> {
    private final /* synthetic */ zzel zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzel zzelVar) {
        super(zzelVar, null);
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final K zza(int i) {
        return (K) this.zza.zzb[i];
    }
}
