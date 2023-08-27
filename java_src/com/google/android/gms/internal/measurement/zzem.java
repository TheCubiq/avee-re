package com.google.android.gms.internal.measurement;
/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzem<V> extends zzeo<V> {
    private final /* synthetic */ zzel zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzel zzelVar) {
        super(zzelVar, null);
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final V zza(int i) {
        return (V) this.zza.zzc[i];
    }
}
