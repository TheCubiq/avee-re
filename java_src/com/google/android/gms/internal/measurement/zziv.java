package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zziv implements zzjd {
    private zzjd[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(zzjd... zzjdVarArr) {
        this.zza = zzjdVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean zza(Class<?> cls) {
        for (zzjd zzjdVar : this.zza) {
            if (zzjdVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final zzje zzb(Class<?> cls) {
        zzjd[] zzjdVarArr;
        for (zzjd zzjdVar : this.zza) {
            if (zzjdVar.zza(cls)) {
                return zzjdVar.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
