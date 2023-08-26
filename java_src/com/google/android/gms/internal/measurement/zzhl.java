package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzhl {
    private static final zzhk<?> zza = new zzhm();
    private static final zzhk<?> zzb = zzc();

    private static zzhk<?> zzc() {
        try {
            return (zzhk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhk<?> zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhk<?> zzb() {
        zzhk<?> zzhkVar = zzb;
        if (zzhkVar != null) {
            return zzhkVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
