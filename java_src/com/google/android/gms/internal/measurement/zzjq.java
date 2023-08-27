package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzjq {
    private static final zzjo zza = zzc();
    private static final zzjo zzb = new zzjn();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjo zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjo zzb() {
        return zzb;
    }

    private static zzjo zzc() {
        try {
            return (zzjo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
